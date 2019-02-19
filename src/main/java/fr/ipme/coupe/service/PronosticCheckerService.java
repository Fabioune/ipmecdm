package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Pronostic;
import fr.ipme.coupe.model.User;
import fr.ipme.coupe.repository.MatchRepository;
import fr.ipme.coupe.repository.PronosticRepository;
import fr.ipme.coupe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class PronosticCheckerService {

    @Autowired
    protected MatchRepository matchRepository;

    @Autowired
    protected UserRepository userRepository;

    @Autowired
    protected PronosticRepository pronosticRepository;

    public List<User> asignPronosticPointsByMatch(Match match)
    {
        List<User> listFiltered = this.getUserWithGoodPronosticByMatch(match);

        for (int i = 0; i < listFiltered.size(); i++) {
            int currentPointForUser = listFiltered.get(i).getPronosticPoints();
            listFiltered.get(i).setPronosticPoints(currentPointForUser);

            // save points for user if good prediction
            userRepository.save(listFiltered.get(i));
        }

        return listFiltered;
    }

    public List<User> getUserWithGoodPronosticByMatch(Match match)
    {
        List<User> listFiltered = new ArrayList<>();
        List<User> userWithPro = matchRepository.getUserWhoMadePronosticsByMatch(match);

        for (int i = 0; i < userWithPro.size(); i++) {
            List<Pronostic> pronostic = pronosticRepository.findByUserAndMatch(userWithPro.get(i), match);
            for (int j = 0; j < pronostic.size(); j++) {
                if ((pronostic.get(j).getbScore() > match.getaScore() && pronostic.get(j).getaScore() > match.getbScore())
                || (pronostic.get(j).getbScore() < match.getaScore() && pronostic.get(j).getaScore() < match.getbScore())
                || (pronostic.get(j).getbScore() == match.getaScore() && pronostic.get(j).getaScore() == match.getbScore())) {
                    listFiltered.add(userWithPro.get(i));
                }
            }
        }

        return listFiltered;
    }
}

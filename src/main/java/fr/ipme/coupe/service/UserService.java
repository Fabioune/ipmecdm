package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Pronostic;
import fr.ipme.coupe.model.User;
import fr.ipme.coupe.repository.PronosticRepository;
import fr.ipme.coupe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    protected PronosticRepository pronosticRepository;

    /**
     * This function SHOULD get scoreA and scoreB
     * But for test reasons, let just get random score
     *
     * @param user
     * @param match
     * @return Pronostic
     */
    public Pronostic generateRandomPronosticForMatch(User user, Match match)
    {
        Pronostic pronostic = new Pronostic();
        pronostic.setUser(user);
        pronostic.setMatch(match);
        pronostic.setaScore((int) (Math.random() * 5));
        pronostic.setbScore((int) (Math.random() * 5));

        pronosticRepository.save(pronostic);

        return pronostic;
    }
}

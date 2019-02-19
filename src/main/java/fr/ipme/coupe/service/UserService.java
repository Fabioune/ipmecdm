package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Pronostic;
import fr.ipme.coupe.model.User;
import fr.ipme.coupe.repository.PronosticRepository;
import fr.ipme.coupe.repository.UserRepository;

import java.util.List;

public class UserService {

    protected UserRepository userRepository;
    protected PronosticRepository pronosticRepository;

    public List<Pronostic> getAllPronosticsByUser(User user)
    {
        return pronosticRepository.findByUser(user);
    }

    public List<Pronostic> getPronosticsByMatch(Match match)
    {
        return pronosticRepository.findByMatch(match);
    }

    public List<Pronostic> getPronosticsByUserAndMatch(User user, Match match)
    {
        return pronosticRepository.findByUserAndMatch(user, match);
    }

}

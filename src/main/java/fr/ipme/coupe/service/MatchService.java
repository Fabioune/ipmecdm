package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    @Autowired
    UserRepository userRepository;

    public void simulateMatch()
    {

    }

    public void play(Match match)
    {
        System.out.println("le match est lancé");
    }
}

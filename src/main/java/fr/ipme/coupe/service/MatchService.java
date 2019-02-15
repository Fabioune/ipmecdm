package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Pronostic;
import fr.ipme.coupe.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    @Autowired
    MatchRepository matchRepository;

    /**
     * Launch a simulation of a game with a change of scoring
     * for each team every minute depending of ATK and DEF
     *
     * @param match
     */
    public void play(Match match)
    {
        System.out.println("le match est lancé");
    }
}

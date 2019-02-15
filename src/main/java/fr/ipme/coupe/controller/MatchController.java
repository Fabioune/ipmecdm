package fr.ipme.coupe.controller;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.repository.MatchRepository;
import fr.ipme.coupe.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/matchs")
@RestController
public class MatchController {

    @Autowired
    MatchRepository matchRepository;

    public void list() {}
    public void get() {}
    public void update() {}
    public void create() {}
    public void delete() {}

    /**
     * nPoint to launch a game
     */
    @GetMapping(value="/play")
    public void play()
    {
        Match match = new Match();
        MatchService matchService = new MatchService();
        matchService.play(match);
    }
}


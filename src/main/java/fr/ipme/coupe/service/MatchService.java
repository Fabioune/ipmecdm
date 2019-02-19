package fr.ipme.coupe.service;

import fr.ipme.coupe.core.MatchInterface;
import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Pronostic;
import fr.ipme.coupe.model.User;
import fr.ipme.coupe.repository.MatchRepository;
import fr.ipme.coupe.repository.PronosticRepository;
import fr.ipme.coupe.repository.TeamRepository;
import fr.ipme.coupe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class MatchService {

    @Autowired
    MatchRepository matchRepository;

    @Autowired
    protected UserService userService;

    @Autowired
    protected TeamRepository teamRepository;

    @Autowired
    protected UserRepository userRepository;

    @Autowired
    protected PronosticRepository pronosticRepository;

    @Autowired
    protected fr.ipme.coupe.service.PronosticCheckerService pronosticCheckerService;

}

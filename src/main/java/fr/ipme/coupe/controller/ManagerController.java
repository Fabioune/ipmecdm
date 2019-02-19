package fr.ipme.coupe.controller;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.repository.*;
import fr.ipme.coupe.service.GroupService;
import fr.ipme.coupe.service.MatchPouleService;
import fr.ipme.coupe.service.RandomGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/manager")
public class ManagerController {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private PronosticRepository pronosticsRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomGeneratorService randomGeneratorService;
    @Autowired
    private GroupService groupService;

    /**
     * nPoint to reset all app data
     */
    @GetMapping("/reset")
    public void reset()
    {
        // Flush all users, pronostics and teams
        userRepository.deleteAll();
        pronosticsRepository.deleteAll();
        teamRepository.deleteAll();

        // recreate team from list of countries and assign them random Atk and Def
        randomGeneratorService.randomTeamGroupsAndStats(groupRepository.findAll(), countryRepository.findAll());

        // recreate basic set of users and one admin
        randomGeneratorService.generateRandomsUsers();

    }

    @GetMapping("/poules")
    public void launchPoules()
    {
        groupService.launchPool();
    }
}

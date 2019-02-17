package fr.ipme.coupe.controller;

import fr.ipme.coupe.model.Group;
import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.repository.CountryRepository;
import fr.ipme.coupe.repository.GroupRepository;
import fr.ipme.coupe.repository.MatchRepository;
import fr.ipme.coupe.repository.TeamRepository;
import fr.ipme.coupe.service.MatchService;
import fr.ipme.coupe.service.RandomGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/matchs")
@RestController
public class MatchController {



    public void list() {}
    public void get() {}
    public void update() {}
    public void create() {}
    public void delete() {}


}


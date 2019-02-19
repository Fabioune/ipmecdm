package fr.ipme.coupe.controller;

import fr.ipme.coupe.core.CrudService;
import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.repository.MatchRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/matchs")
@RestController
public class MatchController extends CrudService<Match, MatchRepository> {

}

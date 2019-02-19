package fr.ipme.coupe.controller;

import fr.ipme.coupe.service.CrudService;
import fr.ipme.coupe.model.Team;
import fr.ipme.coupe.repository.TeamRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/teams")
@RestController
public class TeamController extends CrudService<Team, TeamRepository> {

}

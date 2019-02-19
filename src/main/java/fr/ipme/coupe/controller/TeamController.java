package fr.ipme.coupe.controller;

import fr.ipme.coupe.core.CrudService;
import fr.ipme.coupe.model.Team;
import fr.ipme.coupe.repository.TeamRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/teams")
@RestController
public class TeamController extends CrudService<TeamRepository> {

    @PutMapping(value="/{id}")
    public Team update(@PathVariable(name = "id") long id, @RequestBody Team targetModel)
    {
        targetModel.setId(id);

        return this.getRepo().save(targetModel);
    }
}

package fr.ipme.coupe.controller;

import fr.ipme.coupe.core.CrudService;
import fr.ipme.coupe.model.Group;
import fr.ipme.coupe.repository.GroupRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/groups")
@RestController
public class GroupController extends CrudService<GroupRepository> {

    @PutMapping(value="/{id}")
    public Group update(@PathVariable(name = "id") long id, @RequestBody Group targetModel)
    {
        targetModel.setId(id);

        return this.getRepo().save(targetModel);
    }
}

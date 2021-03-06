package fr.ipme.coupe.controller;

import fr.ipme.coupe.service.CrudService;
import fr.ipme.coupe.model.Group;
import fr.ipme.coupe.repository.GroupRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/groups")
@RestController
public class GroupController extends CrudService<Group, GroupRepository> {

}

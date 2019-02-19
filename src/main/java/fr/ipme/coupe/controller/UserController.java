package fr.ipme.coupe.controller;

import fr.ipme.coupe.core.CrudService;
import fr.ipme.coupe.model.User;
import fr.ipme.coupe.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/users")
@RestController
public class UserController extends CrudService<User, UserRepository> {

}

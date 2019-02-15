package fr.ipme.coupe.controller;

import fr.ipme.coupe.model.User;
import fr.ipme.coupe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/users")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> list()
    {
        return userRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public User get(@PathVariable long id) {

        return userRepository.getOne(id);
    }

    @PostMapping
    public User create(@RequestBody User user)
    {
        return userRepository.save(user);
    }

    /**
     * Peut avoir name=truc pour remplacer la key
     * @param id
     * @param user
     */
    @PutMapping(value="/{id}")
    public User update(@PathVariable(name = "id") long id, @RequestBody User user)
    {
        user.setId(id);

        return userRepository.save(user);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable long id)
    {
        userRepository.deleteById(id);
    }
}

package fr.ipme.coupe.core;

import fr.ipme.coupe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CrudService<M, T extends JpaRepository> {
    private M model;
    private T repo;

    @GetMapping
    public List<M> list()
    {
        return repo.findAll();
    }

    @GetMapping(value="/{id}")
    public Object get(@PathVariable long id) {
        return repo.getOne(id);
    }

    @PostMapping
    public Object create(@RequestBody User user)
    {
        return repo.save(user);
    }

    /**
     * Peut avoir name=truc pour remplacer la key
     * @param id
     * @param targetModel
     */
    @PutMapping(value="/{id}")
    public Object update(@PathVariable(name = "id") long id, @RequestBody M targetModel)
    {
//        targetModel.setId(id);

        return repo.save(targetModel);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable long id)
    {
        repo.deleteById(id);
    }
}

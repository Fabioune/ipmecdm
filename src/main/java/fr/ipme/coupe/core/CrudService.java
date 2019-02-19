package fr.ipme.coupe.core;

import fr.ipme.coupe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class CrudService<T extends JpaRepository> {

    private T repo;

    @GetMapping
    public Object list()
    {
        return this.getRepo().findAll();
    }

    @GetMapping("/{id}")
    public Object get(@PathVariable long id)
    {
        return this.getRepo().getOne(id);
    }

    @PostMapping
    public Object create(@RequestBody User user)
    {
        return this.getRepo().save(user);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable long id)
    {
        repo.deleteById(id);
    }

    protected T getRepo()
    {
        return repo;
    }
}

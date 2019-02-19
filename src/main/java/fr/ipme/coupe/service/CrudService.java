package fr.ipme.coupe.service;

import fr.ipme.coupe.core.ModelInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public abstract class CrudService<M extends ModelInterface, T extends JpaRepository>
{
    private M model;

    @Autowired
    private T repo;

    @GetMapping
    public List<M> list()
    {
        return this.getRepo().findAll();
    }

    @GetMapping("/{id}")
    public Object get(@PathVariable long id)
    {
        return this.getRepo().getOne(id);
    }

    @PostMapping
    public Object create(@RequestBody M body)
    {
        return this.getRepo().save(body);
    }

    @PutMapping(value="/{id}")
    public Object update(@PathVariable(name = "id") long id, @RequestBody M targetModel)
    {
        targetModel.setId(id);

        return this.getRepo().save(targetModel);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable long id)
    {
        this.getRepo().deleteById(id);
    }

    protected T getRepo()
    {
        return repo;
    }
}

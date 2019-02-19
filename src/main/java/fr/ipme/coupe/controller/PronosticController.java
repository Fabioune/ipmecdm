package fr.ipme.coupe.controller;


import fr.ipme.coupe.core.CrudService;
import fr.ipme.coupe.model.Pronostic;
import fr.ipme.coupe.repository.PronosticRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/pronostics")
@RestController
public class PronosticController extends CrudService<PronosticRepository> {

    @PutMapping(value="/{id}")
    public Object update(@PathVariable(name = "id") long id, @RequestBody Pronostic targetModel)
    {
        targetModel.setId(id);

        return this.getRepo().save(targetModel);
    }
}

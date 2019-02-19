package fr.ipme.coupe.controller;


import fr.ipme.coupe.service.CrudService;
import fr.ipme.coupe.model.Pronostic;
import fr.ipme.coupe.repository.PronosticRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/pronostics")
@RestController
public class PronosticController extends CrudService<Pronostic, PronosticRepository> {



}

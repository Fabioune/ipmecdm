package fr.ipme.coupe.repository;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Pronostic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PronosticRepository extends JpaRepository <Pronostic, Long> {

}

package fr.ipme.coupe.repository;

import fr.ipme.coupe.model.Pronostic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PronosticRepository extends JpaRepository <Pronostic, Long> {

}

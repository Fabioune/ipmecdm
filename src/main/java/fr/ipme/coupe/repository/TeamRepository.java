package fr.ipme.coupe.repository;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository <Team, Long> {

}

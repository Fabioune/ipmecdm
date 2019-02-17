package fr.ipme.coupe.repository;

import fr.ipme.coupe.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository <Team, Long> {

}

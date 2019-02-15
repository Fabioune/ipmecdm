package fr.ipme.coupe.repository;

import fr.ipme.coupe.model.Group;
import fr.ipme.coupe.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository <Group, Long> {

}

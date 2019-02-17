package fr.ipme.coupe.repository;

import fr.ipme.coupe.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository <Group, Long> {

}

package fr.ipme.coupe.repository;

import fr.ipme.coupe.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository <Match, Long>
{

}

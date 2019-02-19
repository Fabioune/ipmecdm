package fr.ipme.coupe.repository;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Pronostic;
import fr.ipme.coupe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PronosticRepository extends JpaRepository <Pronostic, Long> {
    public List<Pronostic> findByUser(User user);
    public List<Pronostic> findByMatch(Match match);
    public List<Pronostic> findByUserAndMatch(User user, Match match);
}

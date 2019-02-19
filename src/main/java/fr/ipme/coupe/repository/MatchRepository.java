package fr.ipme.coupe.repository;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository <Match, Long> {
    @Query ("SELECT u FROM Pronostic p left join p.user u WHERE match_id = :match")
    public List<User> getUserWhoMadePronosticsByMatch(Match match);
}

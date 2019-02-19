package fr.ipme.coupe.repository;
import fr.ipme.coupe.model.Group;
import fr.ipme.coupe.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository <Group, Long> {

    @Query ("SELECT t FROM Team t WHERE group_id = :id ")
    public List<Team> findTeamsByGroup(long id);

    @Query ("SELECT t FROM Team t ORDER BY group_id, point_group_team")
    public List<Team> getRankings();
}
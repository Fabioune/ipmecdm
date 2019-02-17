package fr.ipme.coupe.repository;

import fr.ipme.coupe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    List<User> findByName(String name);

    @Query ("SELECT u FROM User u WHERE u.name = :name")
    List<User> findByNameJPQL(String name);
}

package bd.ac.bauet.alumni;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface AlumniRepository extends JpaRepository<Alumni, Long> {

    @Query("SELECT a FROM Alumni a WHERE a.email = ?1")
    Optional<Alumni> findAlumniByEmail(String email);

}

package bd.ac.bauet.alumni;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AlumniRepository extends JpaRepository<Alumni, Long> {

}

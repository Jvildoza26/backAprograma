package back.backAp.Repository;

import back.backAp.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona,Long> {
}
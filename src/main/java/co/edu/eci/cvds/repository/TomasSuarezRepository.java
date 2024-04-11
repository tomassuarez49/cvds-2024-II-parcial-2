package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.TomasSuarez;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TomasSuarezRepository extends JpaRepository<TomasSuarez, String> {
    List<TomasSuarez> findByPregunta(String pregunta);
}

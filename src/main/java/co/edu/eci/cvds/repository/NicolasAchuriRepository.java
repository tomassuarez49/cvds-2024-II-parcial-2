package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.NicolasAchuri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NicolasAchuriRepository extends JpaRepository<NicolasAchuri, Integer> {
    List<NicolasAchuri> findByPregunta(String pregunta);
}
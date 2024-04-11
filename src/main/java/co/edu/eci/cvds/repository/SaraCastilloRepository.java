package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.SaraCastillo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
 
@Repository
public interface SaraCastilloRepository extends JpaRepository<SaraCastillo, Integer> {
    List<SaraCastillo> findByPregunta(String pregunta);
}
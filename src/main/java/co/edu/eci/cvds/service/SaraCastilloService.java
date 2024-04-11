package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.SaraCastillo;
import co.edu.eci.cvds.repository.SaraCastilloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaraCastilloService {

    private final SaraCastilloRepository saraCastilloRepository;

    @Autowired
    public SaraCastilloService(SaraCastilloRepository saraCastilloRepository) {
        this.saraCastilloRepository = saraCastilloRepository;
    }

    public SaraCastillo agregarRespuestaParcial(SaraCastillo respuesta) {
        return saraCastilloRepository.save(respuesta);
    }

    public List<SaraCastillo> obtenerRespuestasParcial() {
        return saraCastilloRepository.findAll();
    }
}

package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.NicolasAchuri;
import co.edu.eci.cvds.repository.NicolasAchuriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NicolasAchuriService {

    private final NicolasAchuriRepository nicolasAchuriRepository;

    @Autowired
    public NicolasAchuriService(NicolasAchuriRepository nicolasAchuriRepository) {
        this.nicolasAchuriRepository = nicolasAchuriRepository;
    }

    public List<NicolasAchuri> getAllRespuestas() {
        return nicolasAchuriRepository.findAll();
    }

    public Optional<NicolasAchuri> getRespuestaById(Integer id) {
        return nicolasAchuriRepository.findById(id);
    }

    public List<NicolasAchuri> getRespuestasByPregunta(String pregunta) {
        return nicolasAchuriRepository.findByPregunta(pregunta);
    }

    public NicolasAchuri addRespuesta(NicolasAchuri respuesta) {
        return nicolasAchuriRepository.save(respuesta);
    }

    public NicolasAchuri updateRespuesta(Integer id, NicolasAchuri respuesta) {
        Optional<NicolasAchuri> respuestaActual = nicolasAchuriRepository.findById(id);
        if (respuestaActual.isPresent()) {
            respuesta.setId(id);
            return nicolasAchuriRepository.save(respuesta);
        } else {
            return null; // O podrías lanzar una excepción o manejarlo de otra forma según tu aplicación
        }
    }

    public void deleteRespuesta(Integer id) {
        nicolasAchuriRepository.deleteById(id);
    }
    
}

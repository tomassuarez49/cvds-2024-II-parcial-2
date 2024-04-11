package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.TomasSuarez;
import co.edu.eci.cvds.repository.TomasSuarezRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TomasSuarezService {
    private final TomasSuarezRepository tomasSuarezRepository;

    @Autowired
    public TomasSuarezService(TomasSuarezRepository tomasSuarezRepository) {
        this.tomasSuarezRepository = tomasSuarezRepository;
    }

    public TomasSuarez agregarRespuesta(TomasSuarez tomasSuarez) {
        return tomasSuarezRepository.save(tomasSuarez);
    }

    public TomasSuarez obtenerRespuesta(String pregunta) {
        return tomasSuarezRepository.findByPregunta(pregunta).get(0);
    }

    public List<TomasSuarez> obtenerRespuestas() {
        return tomasSuarezRepository.findAll();
    }

    public TomasSuarez actualizarRespuesta(TomasSuarez tomasSuarez) {
        if (tomasSuarezRepository.findByPregunta(tomasSuarez.getPregunta()).isEmpty()) {
            return tomasSuarezRepository.save(tomasSuarez);
        }
        return null;
    }

    public void eliminarRespuesta(String pregunta) {
        tomasSuarezRepository.deleteById(pregunta);
    }
}

package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.TomasSuarez;
import co.edu.eci.cvds.service.TomasSuarezService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/tomas-suarez")
public class TomasSuarezController {

    private final TomasSuarezService tomasSuarezService;

    @Autowired
    public TomasSuarezController(TomasSuarezService tomasSuarezService) {
        this.tomasSuarezService = tomasSuarezService;
    }

    @GetMapping("/respuestas")
    public String mostrarRespuestas(Model model) {
        List<TomasSuarez> respuestas = tomasSuarezService.obtenerRespuestas();
        model.addAttribute("respuestas", respuestas);
        return "respuestas";
    }

    @GetMapping("/respuestas/api")
    public String mostrarRespuestasApi() {
        return "respuestas-api";
    }

    @GetMapping("/respuestas/api/respuestas")
    @ResponseBody
    public List<TomasSuarez> obtenerRespuestasApi() {
        return tomasSuarezService.obtenerRespuestas();
    }

    @PostMapping("/respuestas/api/respuestas")
    @ResponseBody
    public List<TomasSuarez> agregarRespuestaApi(@RequestBody TomasSuarez tomasSuarez) {
        tomasSuarezService.agregarRespuesta(tomasSuarez);
        return tomasSuarezService.obtenerRespuestas();
    }
}

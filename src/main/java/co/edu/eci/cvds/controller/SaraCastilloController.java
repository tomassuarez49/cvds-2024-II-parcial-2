package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.SaraCastillo;
import co.edu.eci.cvds.service.SaraCastilloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/sara-castillo")
public class SaraCastilloController {

    private final SaraCastilloService saraCastilloService;

    @Autowired
    public SaraCastilloController(SaraCastilloService saraCastilloService) {
        this.saraCastilloService = saraCastilloService;
    }

    @GetMapping("/respuestas")
    public String mostrarRespuestas(Model model) {
        List<SaraCastillo> respuestas = saraCastilloService.obtenerRespuestasParcial();
        model.addAttribute("respuestas", respuestas);
        return "respuestas"; // Suponiendo que tienes una vista llamada "respuestas"
    }

    @PostMapping("/respuestas")
    public String agregarRespuesta(@ModelAttribute SaraCastillo respuesta) {
        saraCastilloService.agregarRespuestaParcial(respuesta);
        return "redirect:/sara-castillo/respuestas"; // Redirige a la página de respuestas después de agregar una nueva respuesta
    }
}

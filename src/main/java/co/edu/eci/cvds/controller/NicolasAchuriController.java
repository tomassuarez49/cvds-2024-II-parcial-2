package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.NicolasAchuri;
import co.edu.eci.cvds.service.NicolasAchuriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/nicolasachuri")
public class NicolasAchuriController {

    private final NicolasAchuriService nicolasAchuriService;

    @Autowired
    public NicolasAchuriController(NicolasAchuriService nicolasAchuriService) {
        this.nicolasAchuriService = nicolasAchuriService;
    }

    @GetMapping("/respuestas")
    public String listarRespuestas(Model model) {
        List<NicolasAchuri> respuestas = nicolasAchuriService.getAllRespuestas();
        model.addAttribute("respuestas", respuestas);
        return "respuestas";
    }


}

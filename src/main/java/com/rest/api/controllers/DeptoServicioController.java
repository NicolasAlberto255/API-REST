package com.rest.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.DeptoServicio;
import com.rest.api.services.DeptoServicioService;

@RestController
@RequestMapping("deptoServicio/")
public class DeptoServicioController {
    
    @Autowired
    DeptoServicioService deptoServicioService;

    @GetMapping("deptoServicios")
    public List<DeptoServicio> getDeptoServicios() {
        return deptoServicioService.getDeptoServicios();
    }

    @GetMapping("deptoServicioByIdDepartamentos")
    public List<DeptoServicio> getDeptoServicioByIdDepto(@RequestParam int id) {
        return deptoServicioService.getDeptoServicioByIdDepto(id);
    }

    @GetMapping("deptoServicioByIdServicios")
    public List<DeptoServicio> getDeptoServicioByIdServicios(@RequestParam int id) {
        return deptoServicioService.getDeptoServicioByIdServicios(id);
    }
}

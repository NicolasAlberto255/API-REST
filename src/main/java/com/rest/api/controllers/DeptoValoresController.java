package com.rest.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.api.services.DeptoZonasService;
import com.rest.api.models.DeptoGanancias;
import com.rest.api.models.DeptoZonas;
import com.rest.api.services.DeptoGananciasService;

@RestController
@RequestMapping("deptoValores/")
public class DeptoValoresController {
    @Autowired
    DeptoZonasService deptoZonasService;

    @Autowired
    DeptoGananciasService deptoGananciasService;

    @PostMapping("saveGananciaZona")
    public String postZona(@RequestBody DeptoZonas deptoZonas) {
        deptoZonasService.postZona(deptoZonas);
        return "Zona guardada";
    }

    @PutMapping("updateGananciaZona")
    public String updateZona(@RequestBody DeptoZonas deptoZonas) {
        deptoZonasService.updateZona(deptoZonas);
        return "Zona actualizada";
    }

    @GetMapping("sumaValorZona")
    public Object getSumaByNombreZonas(){
        Map<Object, Object> map = new HashMap<>();
        List<String> list = deptoZonasService.getSumaByNombreZonas();

        for (String s : list) {
            String[] split = s.split(",");
            map.put(split[0], split[1]);
        }
        return map;
    }

    @PostMapping("saveGanancias")
    public String saveGanancias(@RequestBody DeptoGanancias deptoGanancias) {
        
        int valorTotal = deptoGanancias.getGananciaDepto();
        deptoGanancias.setGananciaDepto(valorTotal);
        deptoGananciasService.saveGanancias(deptoGanancias);
            
        return "Ganancias actualizadas";
    }

    @GetMapping("sumaGananciasDepto")
    public Object getSumaGananciaByIdDepto() {
        Map<Object,Object> map = new HashMap<>();
        List<String> list = deptoGananciasService.getSumaGananciaByIdDepto();
        
        for (String s : list) {
            String[] split = s.split(",");
            map.put(split[0], split[1]);
        }
        return map;
    }
}

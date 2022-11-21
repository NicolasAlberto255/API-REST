package com.rest.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.InventarioDepto;
import com.rest.api.services.InventarioDeptoService;

@RestController
@RequestMapping("inventarioDepto/")
public class InventarioDeptoController {

    @Autowired
    InventarioDeptoService inventarioDeptoService;

    @GetMapping("inventarioDeptos")
    public List<InventarioDepto> getInventarioDepto() {
        return inventarioDeptoService.getInventarioDepto();
    }

    @GetMapping("inventarioDeptoGet/{id}")
    public InventarioDepto findById(@PathVariable("id") int id) {
        return this.inventarioDeptoService.findById(id);
    }

    @PostMapping("inventarioDeptoSave")
    public String saveInventarioDepto(@RequestBody InventarioDepto inventarioDepto) {
        this.inventarioDeptoService.saveInventarioDepto(inventarioDepto);
        return "Inventario Guardado";
    }

    @PutMapping("inventarioDeptoUpdate/{id}")
    public String updateInventarioDepto(@PathVariable("id") int id, @RequestBody InventarioDepto inventarioDepto) {
        InventarioDepto inventarioDeptoUpdate = inventarioDeptoService.findById(id);
        inventarioDeptoUpdate.setCntSillas(inventarioDepto.getCntSillas());
        inventarioDeptoUpdate.setCntMesas(inventarioDepto.getCntMesas());
        inventarioDeptoUpdate.setCntSofas(inventarioDepto.getCntSofas());
        inventarioDeptoUpdate.setCntCamas(inventarioDepto.getCntCamas());
        inventarioDeptoUpdate.setCntCojines(inventarioDepto.getCntCojines());
        inventarioDeptoUpdate.setCntLamparas(inventarioDepto.getCntLamparas());
        inventarioDeptoUpdate.setCntCortinas(inventarioDepto.getCntCortinas());
        inventarioDeptoUpdate.setCntMuebles(inventarioDepto.getCntMuebles());
        inventarioDeptoUpdate.setCntCloset(inventarioDepto.getCntCloset());
        inventarioDeptoUpdate.setCntCuadros(inventarioDepto.getCntCuadros());
        inventarioDeptoUpdate.setCntSobreMesas(inventarioDepto.getCntSobreMesas());
        inventarioDeptoUpdate.setCntEspejos(inventarioDepto.getCntEspejos());
        inventarioDeptoUpdate.setCntPlantas(inventarioDepto.getCntPlantas());
        inventarioDeptoUpdate.setCntTV(inventarioDepto.getCntTV());
        inventarioDeptoUpdate.setCntLavadoras(inventarioDepto.getCntLavadoras());
        inventarioDeptoUpdate.setCntMicroondas(inventarioDepto.getCntMicroondas());
        inventarioDeptoUpdate.setCntRefrigeradores(inventarioDepto.getCntRefrigeradores());
        inventarioDeptoUpdate.setCntEstufas(inventarioDepto.getCntEstufas());
        inventarioDeptoUpdate.setCntCocinas(inventarioDepto.getCntCocinas());
        inventarioDeptoUpdate.setCntLavaplatos(inventarioDepto.getCntLavaplatos());
        inventarioDeptoUpdate.setCntSecadoras(inventarioDepto.getCntSecadoras());
        inventarioDeptoUpdate.setCntCafeteras(inventarioDepto.getCntCafeteras());
        inventarioDeptoUpdate.setCntHornos(inventarioDepto.getCntHornos());
        inventarioDeptoUpdate.setCntTenedores(inventarioDepto.getCntTenedores());
        inventarioDeptoUpdate.setCntCucharas(inventarioDepto.getCntCucharas());
        inventarioDeptoUpdate.setCntCuchillos(inventarioDepto.getCntCuchillos());
        inventarioDeptoUpdate.setCntPlatos(inventarioDepto.getCntPlatos());
        inventarioDeptoUpdate.setCntTazas(inventarioDepto.getCntTazas());
        inventarioDeptoUpdate.setCntVasos(inventarioDepto.getCntVasos());
        inventarioDeptoUpdate.setCntAlfombras(inventarioDepto.getCntAlfombras());
        inventarioDeptoUpdate.setCntBaneras(inventarioDepto.getCntBaneras());
        inventarioDeptoUpdate.setCntDuchas(inventarioDepto.getCntDuchas());
        inventarioDeptoUpdate.setCntJacuzzis(inventarioDepto.getCntJacuzzis());
        inventarioDeptoService.saveInventarioDepto(inventarioDeptoUpdate);
        return "Inventario actualizada";
    }

    @DeleteMapping("inventarioDeptoDelete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        boolean ok = this.inventarioDeptoService.deleteInventarioDepto(id);
        if (ok) {
            return "Se eliminó el Inventario con id " + id;
        } else {
            return "No se pudo eliminar el Inventario con id " + id;
        }
    }
}
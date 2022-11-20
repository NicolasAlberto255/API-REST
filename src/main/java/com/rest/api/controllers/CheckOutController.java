package com.rest.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.CheckOut;
import com.rest.api.services.CheckOutService;

@RestController
@RequestMapping("checkout/")
public class CheckOutController {

    @Autowired
    CheckOutService checkOutService;

    @GetMapping("checkouts")
    public List<CheckOut> getUser() {
        return checkOutService.getCheckOut();
    }

    @GetMapping("checkoutGet/{id}")
    public CheckOut fOutdById(@PathVariable("id") int id) {
        return this.checkOutService.findById(id);
    }

    @PostMapping("checkoutSave")
    public String saveCheckOut(@RequestBody CheckOut checkOut) {
        this.checkOutService.saveCheckOut(checkOut);
        return "Check Out Guardado";
    }

    @PutMapping("checkOutUpdate/{id}")
    public String updateCheckOut(@PathVariable("id") int id, @RequestBody CheckOut checkOut) {
        CheckOut checkOutUpdate = checkOutService.findById(id);
        checkOutUpdate.setFechaCheckOut(checkOut.getFechaCheckOut());
        checkOutUpdate.setEstadoDepartamento(checkOut.getEstadoDepartamento());
        checkOutUpdate.setPagoCostoReparaciones(checkOut.getPagoCostoReparaciones());
        checkOutService.saveCheckOut(checkOutUpdate);
        return "Check Out actualizado";
    }

    @DeleteMapping("checkOutDelete/{id}")
    public String deleteCheckOut(@PathVariable("id") int id) {
        boolean ok = this.checkOutService.deleteCheckOut(id);
        if (ok) {
            return "Check Out eliminado";
        } else {
            return "Error al eliminar Check Out";
        }
    }
}
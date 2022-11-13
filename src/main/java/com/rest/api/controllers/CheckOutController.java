package com.rest.api.controllers;

import java.util.ArrayList;
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
    public ArrayList<CheckOut> getUser() {
        return checkOutService.getCheckOut();
    }

    @GetMapping("checkoutGet/{id}")
    public CheckOut fOutdById(@PathVariable("id") Integer id) {
        return this.checkOutService.findById(id);
    }

    @PostMapping("checkoutSave")
    public String saveCheckOut(@RequestBody CheckOut checkOut) {
        this.checkOutService.saveCheckOut(checkOut);
        return "Check Out Guardado";
    }

    @PutMapping("checkOutUpdate/{id}")
    public String updateCheckOut(@PathVariable("id") Integer id, @RequestBody CheckOut checkOut) {
        CheckOut checkOutUpdate = checkOutService.findById(id);
        checkOutUpdate.setFechaCheckOut(checkOut.getFechaCheckOut());
        checkOutUpdate.setEstadoDepartamento(checkOut.getEstadoDepartamento());
        checkOutUpdate.setPagoCostoReparaciones(checkOut.getPagoCostoReparaciones());
        checkOutService.saveCheckOut(checkOutUpdate);
        return "Check Out actualizado";
    }
}
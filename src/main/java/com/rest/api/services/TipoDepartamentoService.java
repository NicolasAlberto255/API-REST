package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.TipoDepartamento;
import com.rest.api.models.TipoDepartamentoImagen;
import com.rest.api.repositories.TipoDepartamentoImagenRepository;
import com.rest.api.repositories.TipoDepartamentoRepository;
import com.rest.api.reservaRequests.TipoDepartamentoRequest;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipoDepartamentoService {
    @Autowired
    TipoDepartamentoRepository tipoDepartamentoRepository;

    @Autowired
    TipoDepartamentoImagenRepository tipoDepartamentoImagenRepository;

    public List<TipoDepartamento> getTipoDepartamento() {
        return (List<TipoDepartamento>) tipoDepartamentoRepository.findAll();
    }

    public TipoDepartamento saveTipoDepartamento(TipoDepartamento tipoInventario) {
        return tipoDepartamentoRepository.save(tipoInventario);
    }

    public TipoDepartamento addTipoDepartamento(TipoDepartamentoRequest tipoDepartamentoRequest) {
        TipoDepartamento tipoDepartamento = new TipoDepartamento();
        tipoDepartamento.setIdTipoDepartamento(tipoDepartamentoRequest.id);
        tipoDepartamento.setNombreTipo(tipoDepartamentoRequest.nombreTipo);
        tipoDepartamento.setTipoDepartamentoImagen(tipoDepartamentoRequest.tipoDepartamentoImagen.stream().map(tipoDepartamentoImagen -> {
            TipoDepartamentoImagen tipoDepartamentoContents = tipoDepartamentoImagen;
            if(tipoDepartamentoContents.getIdImagen() > 0) {
                tipoDepartamentoContents = tipoDepartamentoImagenRepository.findByIdImagen(tipoDepartamentoImagen.getIdImagen());
            }
            tipoDepartamentoContents.addTipoDepartamento(tipoDepartamento);
            return tipoDepartamentoContents;
        }).collect(Collectors.toSet()));

        return tipoDepartamentoRepository.save(tipoDepartamento);
    }

    public TipoDepartamento findById(Integer id) {
        return tipoDepartamentoRepository.findById(id).get();
    }

    public boolean deleteTipoDepartamento(Integer id) {
        try {
            tipoDepartamentoRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
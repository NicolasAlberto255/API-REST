package com.rest.api.services;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.rest.api.models.TipoDepartamentoImagen;
import com.rest.api.repositories.TipoDepartamentoImagenRepository;

@Service
public class TipoDepartamentoImagenService {
    
    @Autowired
    private TipoDepartamentoImagenRepository tipoDepartamentoImagenRepository;

    public TipoDepartamentoImagen uploadImagen(MultipartFile imagen) throws IOException {
        String nombreImagen = StringUtils.cleanPath(imagen.getOriginalFilename());
        TipoDepartamentoImagen imagenData = new TipoDepartamentoImagen(nombreImagen, imagen.getContentType(), imagen.getBytes());

        return tipoDepartamentoImagenRepository.save(imagenData);
    }

    public TipoDepartamentoImagen getImagenById(int idImagen) {
        return tipoDepartamentoImagenRepository.findById(idImagen).get();
    }

    public Stream<TipoDepartamentoImagen> getAllFiles() {
        return tipoDepartamentoImagenRepository.findAll().stream();
    }

    public byte[] downloadImagen(String nombreImagen) {
        Optional<TipoDepartamentoImagen> imagenData = tipoDepartamentoImagenRepository.findByNombre(nombreImagen);
        return imagenData.get().getData();
    }

    public TipoDepartamentoImagen getImagenByNombre(String nombreImagen) {
        return tipoDepartamentoImagenRepository.findByNombre(nombreImagen).get();
    }
}

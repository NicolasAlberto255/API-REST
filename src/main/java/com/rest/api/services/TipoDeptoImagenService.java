package com.rest.api.services;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.rest.api.models.TipoDepartamento;
import com.rest.api.models.TipoDeptoImagen;
import com.rest.api.repositories.TipoDeptoImagenRepository;

@Service
public class TipoDeptoImagenService {
    
    @Autowired
    private TipoDeptoImagenRepository tipoDeptoImagenRepository;

    public TipoDeptoImagen uploadImagen(MultipartFile imagen, TipoDepartamento idTipoDepartamento) throws IOException {
        String nombreImagen = StringUtils.cleanPath(imagen.getOriginalFilename());
        TipoDeptoImagen tipoDepartamentoImagen = new TipoDeptoImagen(nombreImagen, imagen.getContentType(), imagen.getBytes(), idTipoDepartamento);

        return tipoDeptoImagenRepository.save(tipoDepartamentoImagen);
    }

    public TipoDeptoImagen getImagenById(int idImagen) {
        return tipoDeptoImagenRepository.findById(idImagen).get();
    }

    public Stream<TipoDeptoImagen> getAllFiles() {
        return tipoDeptoImagenRepository.findAll().stream();
    }

    public byte[] downloadImagen(String nombreImagen) {
        Optional<TipoDeptoImagen> imagenData = tipoDeptoImagenRepository.findByNombre(nombreImagen);
        return imagenData.get().getData();
    }

    public TipoDeptoImagen getImagenByNombre(String nombreImagen) {
        return tipoDeptoImagenRepository.findByNombre(nombreImagen).get();
    }
}

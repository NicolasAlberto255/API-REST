package com.rest.api.services;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.rest.api.models.InventarioDepto;
import com.rest.api.models.InvDeptoImagen;
import com.rest.api.repositories.InvDeptoImagenRepository;

@Service
public class InvDeptoImagenService {
    @Autowired
    private InvDeptoImagenRepository InvDeptoImagenRepository;

    public InvDeptoImagen uploadImagen(MultipartFile imagen, InventarioDepto idInventarioDepto) throws IOException {
        String nombreImagen = StringUtils.cleanPath(imagen.getOriginalFilename());
        InvDeptoImagen deptoImagen = new InvDeptoImagen(nombreImagen, imagen.getContentType(), imagen.getBytes(), idInventarioDepto);

        return InvDeptoImagenRepository.save(deptoImagen);
    }

    public InvDeptoImagen getImagenById(int idImagen) {
        return InvDeptoImagenRepository.findById(idImagen).get();
    }

    public Stream<InvDeptoImagen> getAllFiles() {
        return InvDeptoImagenRepository.findAll().stream();
    }

    public byte[] downloadImagen(String nombreImagen) {
        Optional<InvDeptoImagen> imagenData = InvDeptoImagenRepository.findByNombre(nombreImagen);
        return imagenData.get().getData();
    }

    public InvDeptoImagen getImagenByNombre(String nombreImagen) {
        return InvDeptoImagenRepository.findByNombre(nombreImagen).get();
    }
}

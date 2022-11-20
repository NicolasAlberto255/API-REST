package com.rest.api.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.rest.api.models.Departamentos;
import com.rest.api.models.DeptoImagen;
import com.rest.api.repositories.DeptoImagenRepository;

@Service
public class DeptoImagenService {
    @Autowired
    private DeptoImagenRepository deptoImagenRepository;

    public DeptoImagen uploadImagen(MultipartFile imagen, Departamentos idDepartamentos) throws IOException {
        String nombreImagen = StringUtils.cleanPath(imagen.getOriginalFilename());
        DeptoImagen deptoImagen = new DeptoImagen(nombreImagen, imagen.getContentType(), imagen.getBytes(), idDepartamentos);

        return deptoImagenRepository.save(deptoImagen);
    }

    public DeptoImagen getImagenById(int idImagen) {
        return deptoImagenRepository.findById(idImagen).get();
    }

    public Stream<DeptoImagen> getAllFiles() {
        return deptoImagenRepository.findAll().stream();
    }

    public byte[] downloadImagen(String nombreImagen) {
        Optional<DeptoImagen> imagenData = deptoImagenRepository.findByNombre(nombreImagen);
        return imagenData.get().getData();
    }

    public DeptoImagen getImagenByNombre(String nombreImagen) {
        return deptoImagenRepository.findByNombre(nombreImagen).get();
    }

    public List<DeptoImagen> getImagenesByIdDepartamento(int idDepartamento) {
        return deptoImagenRepository.getImagenesByIdDepartamento(idDepartamento);
    }

    public void deleteImagenByNombre(String nombreImagen) {
        deptoImagenRepository.deleteImagenByNombre(nombreImagen);
    }
}

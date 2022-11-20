package com.rest.api.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.rest.api.models.Servicios;
import com.rest.api.models.ServiciosImagenes;
import com.rest.api.repositories.ServiciosImagenesRepository;

@Service
public class ServicioImagenService {
    @Autowired
    private ServiciosImagenesRepository serviciosImagenesRepository;

    public ServiciosImagenes uploadImagen(MultipartFile imagen, Servicios idServicios) throws IOException {
        String nombreImagen = StringUtils.cleanPath(imagen.getOriginalFilename());
        ServiciosImagenes deptoImagen = new ServiciosImagenes(nombreImagen, imagen.getContentType(), imagen.getBytes(), idServicios);

        return serviciosImagenesRepository.save(deptoImagen);
    }

    public ServiciosImagenes getImagenById(int idImagen) {
        return serviciosImagenesRepository.findById(idImagen).get();
    }

    public Stream<ServiciosImagenes> getAllFiles() {
        return serviciosImagenesRepository.findAll().stream();
    }

    public byte[] downloadImagen(String nombreImagen) {
        Optional<ServiciosImagenes> imagenData = serviciosImagenesRepository.findByNombre(nombreImagen);
        return imagenData.get().getData();
    }

    public ServiciosImagenes getImagenByNombre(String nombreImagen) {
        return serviciosImagenesRepository.findByNombre(nombreImagen).get();
    }

    public List<ServiciosImagenes> getImagenesByIdDepartamento(int idDepartamento) {
        return serviciosImagenesRepository.getImagenesByIdServicio(idDepartamento);
    }

    public void deleteImagenByNombre(String nombreImagen) {
        serviciosImagenesRepository.deleteImagenByNombre(nombreImagen);
    }
}

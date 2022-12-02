package com.rest.api.repositories;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.rest.api.models.Reportes;

@Repository
@Transactional
public interface ReportesRepository extends JpaRepository<Reportes, Integer>{
    public Optional<Reportes> findByNombreReporte(String nombreReporte);

    public Reportes findByIdReporte(int idReporte);

    public void deleteReporteByNombreReporte(String nombreReporte);
}

package com.rest.api.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.rest.api.models.ReportesPdf;

@Repository
public interface ReportesPdfRepository extends JpaRepository<ReportesPdf, Integer>{
    public Optional<ReportesPdf> findByNombreReporte(String nombreReporte);

    public ReportesPdf findByIdReporte(int idReporte);

    public void deleteReporteByNombreReporte(String nombreReporte);
}

package com.rest.api.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.rest.api.models.Reportes;

@Repository
@Transactional
public interface ReportesRepository extends JpaRepository<Reportes, Integer>{
    
}

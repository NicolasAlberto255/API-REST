package com.rest.api.repositories;

import java.sql.Date;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rest.api.models.CheckIn;

@Repository
@Transactional
public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
    
    @Query(value = "SELECT * FROM checkIn WHERE fechaCheckIn = :fechaCheckIn", nativeQuery = true)
    CheckIn findByFechaCheckIn(@Param("fechaCheckIn") Date fechaCheckIn);
}
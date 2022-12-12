package com.rest.api.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.api.models.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {

    public Region findById(int id);

    public List<Region> findByNombreRegion(String nombreRegion);
}

package com.rest.api.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.api.models.CheckOut;

@Repository
@Transactional
public interface CheckOutRepository extends JpaRepository<CheckOut, Integer> {
}
package com.vigileye.rescuehub_api.repository;

import com.vigileye.rescuehub_api.entity.Hospital;
import com.vigileye.rescuehub_api.entity.PoliceStation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Police_StationRepository extends JpaRepository<PoliceStation,Long> {


    Optional<Hospital> findByEmail(String email);   // used by login

    boolean existsByEmail(String email);
}

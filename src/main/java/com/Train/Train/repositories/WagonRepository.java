package com.Train.Train.repositories;

import com.Train.Train.models.Train;
import com.Train.Train.models.Wagon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WagonRepository extends JpaRepository<Wagon,Integer> {
}

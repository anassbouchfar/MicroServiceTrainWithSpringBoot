package com.Train.Train.repositories;

import com.Train.Train.models.Place;
import com.Train.Train.models.Wagon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place,Integer> {
}

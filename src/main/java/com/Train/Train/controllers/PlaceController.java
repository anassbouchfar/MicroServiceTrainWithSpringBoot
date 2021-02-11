package com.Train.Train.controllers;

import com.Train.Train.models.Place;
import com.Train.Train.models.Place;
import com.Train.Train.repositories.PlaceRepository;
import com.Train.Train.repositories.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Places")
public class PlaceController {
    @Autowired
    private PlaceRepository placeRepository;

    @GetMapping("")
    public List<Place> getAllPlaces(){
        return placeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Place getPlace(@PathVariable int id){
        return placeRepository.findById(id).get();
    }

    @PostMapping("")
    public Place createPlace(@RequestBody Place Place) {
        return placeRepository.save(Place);
    }

    @PutMapping("")
    public Place updatePlace(@RequestBody Place Place)
    {
        return placeRepository.save(Place);
    }

    @DeleteMapping("/{id}")
    public void deletePlace(@PathVariable int id)
    {
        placeRepository.delete(placeRepository.findById(id).get());
    }
    
}

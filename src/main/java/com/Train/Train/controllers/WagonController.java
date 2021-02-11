package com.Train.Train.controllers;


import com.Train.Train.models.Wagon;
import com.Train.Train.repositories.TrainRepository;
import com.Train.Train.repositories.WagonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Wagons")
public class WagonController {
    @Autowired
    private WagonRepository wagonRepository;
    @Autowired
    private TrainRepository trainRepository;

    @GetMapping("")
    public List<Wagon> getAllWagons(){
        return wagonRepository.findAll();
    }


    @GetMapping("/{id}")
    public Wagon getWagon(@PathVariable int id){
        return wagonRepository.findById(id).get();
    }
    
    @PostMapping("")
    public Wagon createWagon(@RequestBody Wagon Wagon) {
        return wagonRepository.save(Wagon);
    }

    @PutMapping("")
    public Wagon updateWagon(@RequestBody Wagon Wagon)
    {
        return wagonRepository.save(Wagon);
    }

    @DeleteMapping("/{id}")
    public void deleteWagon(@PathVariable int id)
    {
        wagonRepository.delete(wagonRepository.findById(id).get());
    }


}

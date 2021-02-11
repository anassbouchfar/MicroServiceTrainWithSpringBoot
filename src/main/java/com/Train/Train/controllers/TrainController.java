package com.Train.Train.controllers;

import com.Train.Train.models.Station;
import com.Train.Train.models.StationsList;
import com.Train.Train.models.Train;
import com.Train.Train.repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/Trains")
public class TrainController {
    @Autowired
    private TrainRepository trainRepository;
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/test")
    public List<Station> test(){
       StationsList stations= restTemplate.getForObject("http://station-service/stations", StationsList.class);
       return  stations.getStations();
    }

    @GetMapping("/{id}")
    public Train getTrain(@PathVariable int id){
        return trainRepository.findById(id).get();
    }

    @GetMapping("")
    public List<Train> getAllTrains(){
        return trainRepository.findAll();
    }

    @PostMapping("" )
    public Train createTrain(@RequestBody Train Train) {
        return trainRepository.save(Train);
    }

    @PutMapping("")
    public Train updateTrain(@RequestBody Train Train)
    {
        return trainRepository.save(Train);
    }

    @DeleteMapping("/{id}")
    public void deleteTrain(@PathVariable int id)
    {
        trainRepository.delete(trainRepository.findById(id).get());
    }
    
}

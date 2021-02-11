package com.Train.Train.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Wagon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private int num_Wagon;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="train_id")
    private Train train;

    @OneToMany(mappedBy="wagon")
    private List<Place> palces;

    public Wagon() {
    }

    public List<Place> getPalces() {
        return palces;
    }

    public int getId() {
        return id;
    }

    public int getNum_Wagon() {
        return num_Wagon;
    }

    public Train getTrain() {
        return train;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNum_Wagon(int num_Wagon) {
        this.num_Wagon = num_Wagon;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public void setPalces(List<Place> palces) {
        this.palces = palces;
    }
}

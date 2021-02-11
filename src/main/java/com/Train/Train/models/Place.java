package com.Train.Train.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(unique = true)
    int num_place;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="wagon_id")
    private Wagon wagon;

    public Place() {
    }

    public int getId() {
        return id;
    }

    public int getNum_place() {
        return num_place;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNum_place(int num_place) {
        this.num_place = num_place;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }
}

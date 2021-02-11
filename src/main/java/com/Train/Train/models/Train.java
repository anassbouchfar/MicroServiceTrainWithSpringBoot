package com.Train.Train.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private long num_train;
    @OneToMany(mappedBy="train")
    private List<Wagon> wagons;

    public Train() {
    }

    public int getId() {
        return id;
    }

    public long getNum_train() {
        return num_train;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNum_train(long num_train) {
        this.num_train = num_train;
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }
}

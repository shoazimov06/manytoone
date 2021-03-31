package uz.rixo.many_to_one.controllers;

import javax.persistence.*;
import java.util.List;

@Entity
public class LocationController {

    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy="location")
    private List<UserController> users;
}

package uz.rixo.many_to_one.controllers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class UserController {

    @Id
    private int id;
    private String firstName;
    private String lastName;

    @ManyToOne
    private LocationController location;
    private String email;

    @OneToMany(mappedBy="user")
    private List<PostController> posts;
}

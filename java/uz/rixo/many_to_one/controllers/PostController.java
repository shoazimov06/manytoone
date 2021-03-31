package uz.rixo.many_to_one.controllers;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class PostController {

    @Id
    private int id;
    private String postDate;

    @ManyToOne
    private UserController user;
    private String details;
}

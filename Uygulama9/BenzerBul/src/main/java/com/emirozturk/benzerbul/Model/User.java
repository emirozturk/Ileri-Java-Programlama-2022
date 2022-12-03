package com.emirozturk.benzerbul.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "username")
    String username;
    @Column(name = "password")
    String password;
    @ManyToMany
    List<Music> musics;
}

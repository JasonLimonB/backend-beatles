package com.app.beatles.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table (name = "albumes")
@Data
public class MAlbums {

    @Id
    @Column( name = "id_album", nullable = false, unique = true )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false,length = 100)
    private String name;

    @Column(length = 10, nullable = false)
    private String fechaLanzamineto;
    @Column(nullable = false)
    private Integer numCanciones;
    @Column(nullable = false)
    private String urlImage;

}

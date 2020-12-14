package com.app.beatles.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "canciones")
@Data
public class MCanciones {

    @Id
    @Column(name = "id_cancion", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCancion;

    @Column(name = "nombre_album",nullable = false, length = 100)
    private String nombreAlbum;

    @Column(name = "nombre_cancion",nullable = false, length = 100)
    private String nombreCancion;

    @Column( nullable = false, length = 300)
    private String descripcion;

    private Boolean top_diez;

    private Boolean top_uno;

    private Boolean johnLennon;
    private Boolean paulMccartney;
    private Boolean ringoStark;
    private Boolean georgeHarrison;

}

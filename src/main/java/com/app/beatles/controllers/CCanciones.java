package com.app.beatles.controllers;

import com.app.beatles.models.MCanciones;
import com.app.beatles.services.ImplCancionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CCanciones {

    Logger log = LoggerFactory.getLogger(CCanciones.class);
    ImplCancionService cancionService;

    @Autowired
    public CCanciones(ImplCancionService cancionService) {
        this.cancionService = cancionService;
    }

    @RequestMapping(value = "/nueva_cancion", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.POST})
    public MCanciones addNewSong(@RequestBody MCanciones cancion){
        return cancionService.addCancion(cancion);
    }

    @RequestMapping(value = "/canciones", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<MCanciones>> getAllSongs(){
        return ResponseEntity.ok(cancionService.getAllSong());
    }

}

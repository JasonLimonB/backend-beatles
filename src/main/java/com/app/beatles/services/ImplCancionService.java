package com.app.beatles.services;

import com.app.beatles.models.MCanciones;
import com.app.beatles.repository.ICancionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplCancionService {

    ICancionRepository cancionRepository;

    @Autowired
    public ImplCancionService(ICancionRepository cancionRepository) {
        this.cancionRepository = cancionRepository;
    }

    public MCanciones addCancion( MCanciones canciones ){
        return cancionRepository.save(canciones);
    }

    public List<MCanciones> getAllSong(){
        return (List<MCanciones>) cancionRepository.findAll();
    }

}

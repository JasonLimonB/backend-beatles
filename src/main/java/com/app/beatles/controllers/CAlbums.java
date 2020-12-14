package com.app.beatles.controllers;

import com.app.beatles.models.MAlbums;
import com.app.beatles.services.ImplAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CAlbums {

    ImplAlbumService albumService;

    @Autowired
    public CAlbums(ImplAlbumService albumService) {
        this.albumService = albumService;
    }

    @RequestMapping(value = "/35aqa", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.POST})
    public MAlbums nuevoAlbum(@RequestBody MAlbums album){
        return albumService.addAlbum(album);
    }

    @RequestMapping(value = "/albumes", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<MAlbums> getAlmbums(){
        return albumService.getAllAlmbums();
    }

}

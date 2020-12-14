package com.app.beatles.services;

import com.app.beatles.models.MAlbums;
import com.app.beatles.repository.IAlbumRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ImplAlbumService {

    IAlbumRespository albumRespository;

    @Autowired
    public ImplAlbumService(IAlbumRespository albumRespository) {
        this.albumRespository = albumRespository;
    }

    public MAlbums addAlbum( MAlbums album ){
        return albumRespository.save(album);
    }

    public List<MAlbums> getAllAlmbums(){
        return (List<MAlbums>) albumRespository.findAll();
    }

}

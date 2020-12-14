package com.app.beatles.repository;

import com.app.beatles.models.MAlbums;
import org.springframework.data.repository.CrudRepository;

public interface IAlbumRespository extends CrudRepository<MAlbums, Long> {
}

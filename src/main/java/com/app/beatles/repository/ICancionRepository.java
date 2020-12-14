package com.app.beatles.repository;

import com.app.beatles.models.MCanciones;
import org.springframework.data.repository.CrudRepository;

public interface  ICancionRepository extends CrudRepository<MCanciones, Long> {
}

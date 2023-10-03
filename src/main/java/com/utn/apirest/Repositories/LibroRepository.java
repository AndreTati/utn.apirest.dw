package com.utn.apirest.Repositories;

import com.utn.apirest.Entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {
}

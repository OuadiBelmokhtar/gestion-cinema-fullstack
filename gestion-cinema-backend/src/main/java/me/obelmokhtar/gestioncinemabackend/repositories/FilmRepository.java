package me.obelmokhtar.gestioncinemabackend.repositories;

import me.obelmokhtar.gestioncinemabackend.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FilmRepository extends JpaRepository<Film, Long> {

}

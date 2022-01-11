package fr.maxime.springData.repository;

import fr.maxime.springData.domain.Music;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MusicRepository extends CrudRepository<Music,Long> {
    List<Music> findByTitle(String title);

    Music findById(long id);
}

package fr.flavien.demo.repository;

import fr.flavien.demo.domain.Music;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "list_music", path = "music")
public interface MusicRepository extends MongoRepository<Music, String>{

    List<Music> findByTitle(@Param("title") String title);
}

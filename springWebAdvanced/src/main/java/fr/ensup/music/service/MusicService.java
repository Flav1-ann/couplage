package fr.ensup.music.service;

import fr.ensup.music.domain.Music;
import fr.ensup.music.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public List<Music> listAll() {
        return musicRepository.findAll();
    }

    public void save(Music music) {
        musicRepository.save(music);
    }

    public Music get(long id) {
        Optional<Music> optionalMusic = musicRepository.findById(id);
        return optionalMusic.orElse(null);

    }

    public void delete(long id) {
        musicRepository.deleteById(id);
    }
}
package fr.maxime.springData;

import fr.maxime.springData.domain.Music;
import fr.maxime.springData.repository.MusicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringDataApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(MusicRepository repository){
		return (args) -> {
			repository.save(new Music("la kiffance", "naps"));
			repository.save(new Music("billie jean", "MJ"));
			repository.save(new Music("bohemian rhapsody", "Queen"));
			repository.save(new Music("Allumer le feu", "Johnny Halliday"));
			repository.save(new Music("Lune de fiel", "joker"));
			// fetch all Musics
			log.info("Musics found with findAll():");
			log.info("-------------------------------");
			for (Music music : repository.findAll()) {
				log.info(music.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Music music = repository.findById(1L);
			log.info("Musics found with findById(1L):");
			log.info("--------------------------------");
			log.info(music.toString());
			log.info("");

			// fetch musics by last name
			log.info("Music found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByTitle("la kiffance").forEach(naps -> {
				log.info(naps.toString());
			});
			// for (Music bauer : repository.findByLastName("Bauer")) {
			//  log.info(bauer.toString());
			// }
			log.info("");

		};
	}

}

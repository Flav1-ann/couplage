package eu.ensup.beansXml.container;

import eu.ensup.beansXml.dao.MusiqueDao;
import eu.ensup.beansXml.dao.MusiqueDaoAlt;
import eu.ensup.beansXml.services.MusiqueService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean(initMethod = "initialisation", destroyMethod = "destruction")
    public MusiqueService musiqueService() {
        return new MusiqueService(musiqueDaoJpa());
    }

    @Bean(initMethod = "initialisation", destroyMethod = "destruction")
    public MusiqueDao musiqueDao() {
        return new MusiqueDao();
    }

    @Bean(initMethod = "initialisation", destroyMethod = "destruction")
    public MusiqueDaoAlt musiqueDaoJpa() {
        return new MusiqueDaoAlt();
    }

}

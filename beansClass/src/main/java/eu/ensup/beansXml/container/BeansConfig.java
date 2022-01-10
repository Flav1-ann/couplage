package eu.ensup.beansXml.container;

import eu.ensup.beansXml.dao.MusiqueDao;
import eu.ensup.beansXml.dao.MusiqueDaoAlt;
import eu.ensup.beansXml.services.MusiqueService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean(initMethod = "initialisation", destroyMethod = "destruction")
    public MusiqueService MusiqueService() {
        return new MusiqueService(MusiqueDaoJpa());
    }

    @Bean(initMethod = "initialisation", destroyMethod = "destruction")
    public MusiqueDao MusiqueDao() {
        return new MusiqueDao();
    }

    @Bean(initMethod = "initialisation", destroyMethod = "destruction")
    public MusiqueDaoAlt MusiqueDaoJpa() {
        return new MusiqueDaoAlt();
    }

}

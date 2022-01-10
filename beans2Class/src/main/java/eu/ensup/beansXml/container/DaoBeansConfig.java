package eu.ensup.beansXml.container;

import eu.ensup.beansXml.dao.MusiqueDao;
import eu.ensup.beansXml.dao.MusiqueDaoAlt;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoBeansConfig {

    @Bean(initMethod = "initialisation", destroyMethod = "destruction")
    public MusiqueDao musiqueDao() {
        return new MusiqueDao();
    }

    @Bean(initMethod = "initialisation", destroyMethod = "destruction")
    public MusiqueDaoAlt musiqueDaoAlt() {
        return new MusiqueDaoAlt();
    }

}

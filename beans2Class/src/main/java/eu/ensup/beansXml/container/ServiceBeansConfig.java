package eu.ensup.beansXml.container;

import eu.ensup.beansXml.dao.MusiqueDao;
import eu.ensup.beansXml.dao.MusiqueDaoAlt;
import eu.ensup.beansXml.services.MusiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DaoBeansConfig.class)
public class ServiceBeansConfig {

    @Autowired
    private MusiqueDaoAlt musiqueDaoAlt;

    @Autowired
    private MusiqueDao musiqueDao;

    @Bean(initMethod = "initialisation", destroyMethod = "destruction")
    public MusiqueService musiqueService() {
        return new MusiqueService(musiqueDaoAlt);
    }


}

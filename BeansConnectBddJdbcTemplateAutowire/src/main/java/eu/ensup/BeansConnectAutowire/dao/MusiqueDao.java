package eu.ensup.BeansConnectAutowire.dao;

import eu.ensup.BeansConnectAutowire.domaine.Musique;
import eu.ensup.BeansConnectAutowire.mapper.MusiqueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;
import java.util.List;

@Repository
public class MusiqueDao implements IDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Musique getMusiqueById(int id) {
        String query = "select * from musique where id=" + id;
        return jdbcTemplate.queryForObject(query, new MusiqueMapper());
    }

    @Override
    public void createMusique(Musique musique) {
        Object[] arguments = new Object[3];
        arguments[0] =musique.getAuteur();
        arguments[1] = musique.getProducteur();
        arguments[2] = musique.getTitre();
        jdbcTemplate.update("INSERT INTO `musique`( `auteur`, `producteur`, `titre`) VALUES (?,?,?) ", arguments);
    }

    @Override
    public Musique updateMusique(Musique musique) {
        System.out.println("Musique modifiée: "+musique.toString());
        return musique;
    }

    @Override
    public void deleteMusique(Musique musique) {
        System.out.println("Compte supprimée: "+musique.toString());
    }

    @Override
    public List<Musique> getAllMusique() {
        String query = "select * from musique";
        return  jdbcTemplate.query(query, new MusiqueMapper());
    }

    @PostConstruct
    private void initialisation() {
        System.out.println("DAO : INIT");
    }

    @PreDestroy
    private void destruction() {
        System.out.println("DAO : DESTRUCT");
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}

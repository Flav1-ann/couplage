package eu.ensup.beansXml.dao;

import eu.ensup.beansXml.domaine.Musique;
import eu.ensup.beansXml.mapper.MusiqueMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MusiqueDao implements IDao{

    private DataSource dataSourceMF;
    private JdbcTemplate jdbcTemplate;

    public DataSource getDataSourceMF() {
        return dataSourceMF;
    }

    public void setDataSourceMF(DataSource dataSourceMF) {
        this.dataSourceMF = dataSourceMF;
    }

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

    private void initialisation() {
        System.out.println("DAO : INIT");
    }

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

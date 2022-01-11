package eu.ensup.beansXml.mapper;

import eu.ensup.beansXml.domaine.Musique;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MusiqueMapper implements RowMapper<Musique> {
    @Override
    public Musique mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Musique(rs.getInt("id"), rs.getString("auteur"), rs.getString("producteur"),
                rs.getString("titre"));
    }
}

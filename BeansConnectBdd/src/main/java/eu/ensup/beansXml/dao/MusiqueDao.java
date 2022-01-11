package eu.ensup.beansXml.dao;

import eu.ensup.beansXml.domaine.Musique;

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

    public DataSource getDataSourceMF() {
        return dataSourceMF;
    }

    public void setDataSourceMF(DataSource dataSourceMF) {
        this.dataSourceMF = dataSourceMF;
    }

    @Override
    public Musique getMusiqueById(int id) {
        // Information d'acc�s � la base de donn�es
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {

            // Etape 1 : Chargement du driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Etape 2 : r�cup�ration de la connexion
            cn = dataSourceMF.getConnection();

            // Etape 3 : Cr�ation d'un statement
            st = cn.createStatement();

            String sql = "SELECT * FROM musique WHERE id=" + id;

            // Etape 4 : ex�cution requ�te
            rs = st.executeQuery(sql);

            // Si r�cup donn�es alors �tapes 5 (parcours Resultset)

            while (rs.next()) {
                return new Musique(rs.getInt("id"), rs.getString("auteur"), rs.getString("producteur"),
                        rs.getString("titre"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                // Etape 6 : lib�rer ressources de la m�moire.
                cn.close();
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public void createMusique(Musique musique) {
        System.out.println("Musique créée: "+musique.toString());
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
    public Set<Musique> getAllMusique() {
        System.out.println("Récupération de toutes les ziks");
        return null;
    }

    private void initialisation() {
        System.out.println("DAO : INIT");
    }

    private void destruction() {
        System.out.println("DAO : DESTRUCT");
    }
}

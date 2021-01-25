package Repository;

import Model.Beneficiu;
import Model.Categorie;

import javax.xml.crypto.Data;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategorieRepository {

    public void adaugaCatetegorie(Categorie categorieNoua){

        if (categorieNoua == null) {
            return;
        }

        Connection conn = DatabaseUtils.getConnection();

        if (conn == null) {
            return;
        }

        try (Statement stmt = conn.createStatement()) {

            String text = String.format("INSERT INTO categorii(denumire)" +
                    "VALUES('%s')", categorieNoua.getDenumire());

            stmt.executeUpdate(text);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void stergeCategorieByDenumire(String denumire) {

        if (denumire.isEmpty()) {
            return;
        }

        Connection conn = DatabaseUtils.getConnection();

        if (conn == null) {
            return;
        }

        try (Statement stmt = conn.createStatement()) {
            String text = String.format("DELETE FROM categorii WHERE denumire = %s", denumire);

            stmt.executeUpdate(text);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void modificareCategorie(String denumireVeche, String denumireNoua){

        if(denumireVeche.isEmpty() || denumireNoua.isEmpty()){

            return;
        }

        Connection conn = DatabaseUtils.getConnection();

        if(conn == null){

            return;
        }

        try(Statement stmt = conn.createStatement()){

            String text = String.format("UPDATE categorii SET denumire = '%s' WHERE denumire = '%s'", denumireNoua , denumireVeche);
            stmt.executeUpdate(text);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Categorie> getListaCategorii(){

       List<Categorie> listaCategorii = new ArrayList<>();

        Connection conn = DatabaseUtils.getConnection();

        if (conn == null) {
            return null;
        }

        try(Statement stmt = conn.createStatement()){

            try(ResultSet rs = stmt.executeQuery("SELECT * FROM categorii")){

                while (rs.next()){

                    Categorie categorie = new Categorie(rs.getString(1));
                    listaCategorii.add(categorie);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaCategorii;
    }
}


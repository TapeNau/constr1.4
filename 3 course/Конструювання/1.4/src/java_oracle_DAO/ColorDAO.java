package java_oracle_DAO;

import java_oracle_DTO.ColorDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ColorDAO extends AbstractDAO{

    public void addRow(ColorDTO dto){
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);

            String sql = "INSERT INTO colorrgb (name, red, green, blue) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, dto.getName());
            statement.setInt(2, dto.getRed());
            statement.setInt(3, dto.getGreen());
            statement.setInt(4, dto.getBlue());

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("A row has been inserted.");
            }

            connection.close();
        } catch (
                SQLException e) {
            System.out.println("Opps, error:");
            e.printStackTrace();
        }
    }

    public void updateRow (ColorDTO dto, int id){
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);

            String sql = "update colorrgb set name = ?, red = ?, green = ?, blue = ? where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, dto.getName());
            statement.setInt(2, dto.getRed());
            statement.setInt(3, dto.getGreen());
            statement.setInt(4, dto.getBlue());
            statement.setInt(5, id);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("A row has been changed.");
            }

            connection.close();
        } catch (
                SQLException e) {
            System.out.println("Opps, error:");
            e.printStackTrace();
        }
    }

    public void deleteRow (int id){
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);

            String sql = "DELETE FROM colorrgb WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("A row has been deleted.");
            }

            connection.close();
        } catch (
                SQLException e) {
            System.out.println("Opps, error:");
            e.printStackTrace();
        }
    }
}

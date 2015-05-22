/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imobilizado.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Leonardo
 */
public class CriaConexao {
    public Connection getConnection() {
    try {
        return DriverManager.getConnection("jdbc:mysql://localhost/imobilizado", "root", "root");
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    }
    
    public static void main(String [] args) throws SQLException
    {
        Connection con = new CriaConexao().getConnection();
        System.out.println("Conexao efetuada com sucesso");
        con.close();
    }
    
}

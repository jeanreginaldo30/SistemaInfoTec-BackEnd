/**
 *
 * @author Jean Reginaldo
 */

package br.com.infotec.dao; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    
    private static final String URL = "jdbc:mysql://localhost:3306/infotec_db";
    private static final String USUARIO = "root";
    private static final String SENHA = "7530"; 

    // O "throws SQLException" avisa que pode dar erro e joga a bomba pra frente
    public Connection conectaBD() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
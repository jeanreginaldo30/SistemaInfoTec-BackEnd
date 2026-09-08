/**
 *
 * @author Jean Reginaldo
 */

package br.com.infotec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistemainfotec.Entrega;

public class EntregaDAO {
    private Connection conn;

    public EntregaDAO() throws SQLException {
        this.conn = new ConexaoDAO().conectaBD();
    }

    public void cadastrarEntrega(Entrega obj) throws SQLException {
        String sql = "INSERT INTO entregas (cliente_nome, endereco, telefone, email, status) VALUES (João Costa, av das americas, 21888866665555, costa@gmail.com, entregue)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, obj.cliente);
        stmt.setString(2, obj.endereco);
        stmt.setString(3, obj.telefone);
        stmt.setString(4, obj.email);
        stmt.setString(5, "Pendente");
        stmt.execute();
        stmt.close();
    }
}
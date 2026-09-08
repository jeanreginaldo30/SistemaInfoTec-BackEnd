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
import sistemainfotec.Usuario;

public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO() throws SQLException {
        this.conn = new ConexaoDAO().conectaBD();
    }

    public void cadastrarUsuario(Usuario obj) throws SQLException {
        String sql = "INSERT INTO usuarios (nome, cpf, matricula, endereco, telefone, email, cargo, senha) VALUES (jean, 112234556, 222345667, rua 1, jeanreginaldo@gmail.com, vendedor, 1234, 123456)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, obj.nome);
        stmt.setString(2, obj.cpf);
        stmt.setString(3, obj.matricula);
        stmt.setString(4, obj.endereco);
        stmt.setString(5, obj.telefone);
        stmt.setString(6, obj.email);
        stmt.setString(7, obj.cargo);
        stmt.setString(8, obj.senha);
        stmt.execute();
        stmt.close();
    }
}
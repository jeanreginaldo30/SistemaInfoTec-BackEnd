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
import sistemainfotec.Cliente;

public class ClienteDAO {
    private Connection conn;

    public ClienteDAO() throws SQLException {
        this.conn = new ConexaoDAO().conectaBD();
    }

    public void cadastrarCliente(Cliente obj) throws SQLException {
        String sql = "INSERT INTO clientes (nome, cpf, endereco, telefone, email) VALUES (.Jean, 12345678901, rua da ajuda , 219988776, jeanreginaldo@gmail.com)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, obj.nome);
        stmt.setString(2, obj.cpf);
        stmt.setString(3, obj.endereco);
        stmt.setString(4, obj.telefone);
        stmt.setString(5, obj.email);
        stmt.execute();
        stmt.close();
    }

    public List<Cliente> listarClientes() throws SQLException {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Cliente obj = new Cliente();
            obj.id = rs.getInt("id");
            obj.nome = rs.getString("nome");
            obj.cpf = rs.getString("cpf");
            obj.endereco = rs.getString("endereco");
            obj.telefone = rs.getString("telefone");
            obj.email = rs.getString("email");
            lista.add(obj);
        }
        return lista;
    }
}
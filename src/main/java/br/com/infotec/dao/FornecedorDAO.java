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
import sistemainfotec.Fornecedor;

public class FornecedorDAO {
    private Connection conn;

    public FornecedorDAO() throws SQLException {
        this.conn = new ConexaoDAO().conectaBD();
    }

    public void cadastrarFornecedor(Fornecedor obj) throws SQLException {
        String sql = "INSERT INTO fornecedores (nome, cnpj, endereco, telefone, email) VALUES (Brasfort, 44434343434, av do comercio, 333444555, brasfort@gmail.com)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, obj.nome);
        stmt.setString(2, obj.cnpj);
        stmt.setString(3, obj.endereco);
        stmt.setString(4, obj.telefone);
        stmt.setString(5, obj.email);
        stmt.execute();
        stmt.close();
    }
}
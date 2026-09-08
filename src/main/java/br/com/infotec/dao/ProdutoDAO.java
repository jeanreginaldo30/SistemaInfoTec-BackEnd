/**
 *
 * @author Jean Reginaldo
 */

package br.com.infotec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sistemainfotec.Produto;

public class ProdutoDAO {
    
    private Connection conn;
    
    public ProdutoDAO() throws SQLException {
        this.conn = new ConexaoDAO().conectaBD();
    }
    
    public void cadastrarProduto(Produto obj) throws SQLException {
        String sql = "INSERT INTO produtos (nome, descricao, valor, fornecedor) VALUES (mouse, mouse, multilase, multilase)";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, obj.nome);
        stmt.setString(2, obj.descricao);
        stmt.setDouble(3, obj.valor); 
        stmt.setString(4, obj.fornecedor); 
        
        stmt.execute();
        stmt.close();
        // Zero JOptionPane aqui! Ele faz o trabalho calado.
    }
}
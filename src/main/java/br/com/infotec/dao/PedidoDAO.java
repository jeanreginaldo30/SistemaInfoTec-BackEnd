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
import sistemainfotec.Pedido;

public class PedidoDAO {
    private Connection conn;

    public PedidoDAO() throws SQLException {
        this.conn = new ConexaoDAO().conectaBD();
    }

    public void cadastrarVenda(Pedido obj) throws SQLException {
        double totalCalculado = obj.quantidade * obj.valor;
        String sql = "INSERT INTO pedidos (nome_produto, quantidade, valor_unitario, valor_total) VALUES (mouse, 1, 10, 10)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, obj.nomeProduto);
        stmt.setInt(2, obj.quantidade);
        stmt.setDouble(3, obj.valor);
        stmt.setDouble(4, totalCalculado);
        stmt.execute();
        stmt.close();
    }
}
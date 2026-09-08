/**
 *
 * @author Jean Reginaldo
 */

package br.com.infotec.service;

import sistemainfotec.Pedido;
import br.com.infotec.dao.PedidoDAO;

public class PedidoService {
    public void salvarPedido(Pedido p) throws Exception {
        if (p.nomeProduto == null || p.nomeProduto.trim().isEmpty()) {
            throw new Exception("Erro: O nome do produto no pedido é obrigatório!");
        }
        if (p.quantidade <= 0) {
            throw new Exception("Erro: A quantidade deve ser maior que zero!");
        }
        if (p.valor <= 0) {
            throw new Exception("Erro: O valor unitário deve ser maior que zero!");
        }

        PedidoDAO dao = new PedidoDAO();
        dao.cadastrarVenda(p);
    }
}
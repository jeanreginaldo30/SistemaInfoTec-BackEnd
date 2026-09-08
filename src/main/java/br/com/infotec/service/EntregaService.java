/**
 *
 * @author Jean Reginaldo
 */

package br.com.infotec.service;

import sistemainfotec.Entrega;
import br.com.infotec.dao.EntregaDAO;

public class EntregaService {
    public void salvarEntrega(Entrega e) throws Exception {
        if (e.cliente == null || e.cliente.trim().isEmpty()) {
            throw new Exception("Erro: O nome do cliente para entrega é obrigatório!");
        }
        if (e.endereco == null || e.endereco.trim().isEmpty()) {
            throw new Exception("Erro: O endereço de entrega é obrigatório!");
        }

        EntregaDAO dao = new EntregaDAO();
        dao.cadastrarEntrega(e);
    }
}
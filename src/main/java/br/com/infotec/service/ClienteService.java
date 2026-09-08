/**
 *
 * @author Jean Reginaldo
 */

package br.com.infotec.service;

import sistemainfotec.Cliente;
import br.com.infotec.dao.ClienteDAO;

public class ClienteService {
    public void salvarCliente(Cliente c) throws Exception {
        if (c.nome == null || c.nome.trim().isEmpty()) {
            throw new Exception("Erro: O nome do cliente é obrigatório!");
        }
        if (c.cpf == null || c.cpf.trim().isEmpty()) {
            throw new Exception("Erro: O CPF do cliente é obrigatório!");
        }

        ClienteDAO dao = new ClienteDAO();
        dao.cadastrarCliente(c); 
    }
}
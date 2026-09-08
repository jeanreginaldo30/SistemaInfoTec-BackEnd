/**
 *
 * @author Jean Reginaldo
 */

package br.com.infotec.service;

import sistemainfotec.Fornecedor;
import br.com.infotec.dao.FornecedorDAO;

public class FornecedorService {
    public void salvarFornecedor(Fornecedor f) throws Exception {
        if (f.nome == null || f.nome.trim().isEmpty()) {
            throw new Exception("Erro: O nome do fornecedor é obrigatório!");
        }
        if (f.cnpj == null || f.cnpj.trim().isEmpty()) {
            throw new Exception("Erro: O CNPJ é obrigatório!");
        }

        FornecedorDAO dao = new FornecedorDAO();
        dao.cadastrarFornecedor(f);
    }
}
/**
 *
 * @author Jean Reginaldo
 */

package br.com.infotec.service;

import sistemainfotec.Produto;
import br.com.infotec.dao.ProdutoDAO;

public class ProdutoService {
    
   
    public void salvarProduto(Produto p) throws Exception {
        
       
        if (p.nome == null || p.nome.trim().isEmpty()) {
            throw new Exception("Erro: O nome do produto é obrigatório!");
        }
        
       
        if (p.valor <= 0) {
            throw new Exception("Erro: O valor deve ser maior que zero!");
        }
        
        
        ProdutoDAO dao = new ProdutoDAO();
        dao.cadastrarProduto(p);
    }
}
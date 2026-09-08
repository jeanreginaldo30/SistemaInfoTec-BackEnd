/**
 *
 * @author Jean Reginaldo
 */

package br.com.infotec.service;

import sistemainfotec.Usuario;
import br.com.infotec.dao.UsuarioDAO;

public class UsuarioService {
    public void salvarUsuario(Usuario u) throws Exception {
        if (u.nome == null || u.nome.trim().isEmpty()) {
            throw new Exception("Erro: O nome do usuário é obrigatório!");
        }
        if (u.senha == null || u.senha.trim().isEmpty()) {
            throw new Exception("Erro: A senha do usuário é obrigatória!");
        }
        if (u.matricula == null || u.matricula.trim().isEmpty()) {
            throw new Exception("Erro: A matrícula do usuário é obrigatória!");
        }

        UsuarioDAO dao = new UsuarioDAO();
        dao.cadastrarUsuario(u);
    }
}
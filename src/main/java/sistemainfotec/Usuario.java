/**
 *
 * @author Jean Reginaldo
 */

package sistemainfotec;

public class Usuario {
    
    
    public String nome;
    public String cpf;
    public int id;
    public String matricula;
    public String endereco;
    public String telefone;
    public String email;
    public String cargo; 
    public String senha;

    
public Usuario() {
    
}
    public Usuario(String nome, String cpf, String matricula, String endereco, 
                   String telefone, String email, String cargo, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cargo = cargo;
        this.senha = senha;
    }
}
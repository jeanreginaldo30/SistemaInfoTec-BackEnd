/**
 *
 * @author Jean Reginaldo
 */

package sistemainfotec;

public class Cliente {
    
    
    public int id;
    public String nome;
    public String cpf;
    public String endereco;
    public String telefone;
    public String email;

    
    public Cliente() {
    }

  
    public Cliente(String nome, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
  
}
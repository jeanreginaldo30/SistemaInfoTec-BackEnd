/**
 *
 * @author Jean Reginaldo
 */

package sistemainfotec;

public class Fornecedor {
    
    
    public int id;
    
  
    public String nome;
    public String cnpj;
    public String endereco;
    public String telefone;
    public String email;

    
    public Fornecedor() {
    }

    
    public Fornecedor(String nome, String cnpj, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
}
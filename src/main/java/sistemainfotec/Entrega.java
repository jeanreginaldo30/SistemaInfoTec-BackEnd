/**
 *
 * @author Jean Reginaldo
 */

package sistemainfotec;

public class Entrega {
    
    
    public int id;
    
    
    public String cliente;   
    public String endereco;  
    public String telefone;
    public String email;
    public String status;    

    
    public Entrega() {
    }

    
    public Entrega(String cliente, String endereco, String telefone, String email, String status) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.status = status;
    }
}
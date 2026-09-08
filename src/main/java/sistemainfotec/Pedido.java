/**
 *
 * @author Jean Reginaldo
 */

package sistemainfotec;

public class Pedido {

   
    public int id;

    
    public String nomeProduto;
    public int quantidade;
    public double valor; 
    public double total; 
    public String dataVenda; 

    
    public Pedido() {
    }

    
    public Pedido(String nomeProduto, int quantidade, double valor) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valor = valor;
        this.total = quantidade * valor; 
    }
}
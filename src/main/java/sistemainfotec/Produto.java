/**
 *
 * @author Jean Reginaldo
 */

package sistemainfotec;

public class Produto {
    
   
    public int id;
    public String nome;
    public String descricao;
    public double valor; 
    public String fornecedor;

    
    public Produto() {
    }

    
    public Produto(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
}
/**
 *
 * @author Jean Reginaldo
 */

package sistemainfotec;

import java.util.ArrayList;

public class Dados {
   
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    public static ArrayList<Produto> listaProdutos = new ArrayList<>();
    public static ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();
    public static ArrayList<Entrega> listaEntregas = new ArrayList<>();
    public static Usuario usuarioLogado = null;
    
    
    public static ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public static void inicializar() {
        
        Usuario admin = new Usuario(
            "Administrador",      
            "000.000.000-00",     
            "admin",              
            "Rua da Empresa",     
            "0000-0000",          
            "admin@email.com",    
            "Gerente",            
            "1234"                
        );
        listaUsuarios.add(admin);

        
        listaClientes.add(new Cliente(
            "Maria Teste", 
            "111.222.333-44", 
            "Rua de Teste, 100", 
            "9999-8888", 
            "maria@email.com"
        ));
    }
}
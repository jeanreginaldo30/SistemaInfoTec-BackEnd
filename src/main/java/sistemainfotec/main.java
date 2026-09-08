/**
 *
 * @author Jean Reginaldo
 */

package sistemainfotec;

import br.com.infotec.service.*;

public class main {

    public static void main(String[] args) {
        System.out.println("--- INICIANDO TESTES DO BACK-END (ETAPA 6) ---\n");

        
        try {
            System.out.println("Salvando um Cliente válido...");
            Cliente c = new Cliente("João da Silva", "111.222.333-44", "Rua Principal, 10", "9999-8888", "joao@email.com");
            
            ClienteService clienteService = new ClienteService();
            clienteService.salvarCliente(c);
            System.out.println("[SUCESSO] Cliente validado e enviado para o Banco de Dados!");
            
        } catch (Exception e) {
            System.out.println("[FALHA] " + e.getMessage());
        }

        
        try {
            System.out.println("\nTentando salvar um Fornecedor sem nome...");
            Fornecedor f = new Fornecedor("", "12.345.678/0001-90", "Rua B", "8888-7777", "fornecedor@email.com");
            
            FornecedorService fornecedorService = new FornecedorService();
            fornecedorService.salvarFornecedor(f); 
            
            
            System.out.println("[FALHA] O sistema deixou salvar com nome vazio. Algo está errado!");
            
        } catch (Exception e) {
            System.out.println("[SUCESSO ESPERADO - ERRO BARRADO] A regra funcionou: " + e.getMessage());
        }
        
        System.out.println("\n--- TESTES FINALIZADOS ---");
    }
}
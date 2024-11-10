import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {

        // Entrada do serviço a ser verificado
        String servico = "tv";

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = "Fatima,tv,radio,internet";

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        for(int i = 0; i < partes.length; i++) {
	  System.out.println(String.format("i=%d part=%s servico=%s", i, partes[i], servico));
          if(partes[i].equals(servico)) {
	    System.out.println("Encontrado!");
            contratado = true;
          }
        }
        String message = contratado ? "Sim" : "Nao";
        System.out.println(message);
    }
}

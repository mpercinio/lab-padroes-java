package subsistema2.cep;

import java.util.Scanner;

public class Cep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o CEP: ");
        String cep = scanner.nextLine();
        
        CepApi api = CepApi.getInstancia();
        String cidade = api.recuperarCidade(cep);
        String estado = api.recuperarEstado(cep);

        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);

        scanner.close();
    }
}

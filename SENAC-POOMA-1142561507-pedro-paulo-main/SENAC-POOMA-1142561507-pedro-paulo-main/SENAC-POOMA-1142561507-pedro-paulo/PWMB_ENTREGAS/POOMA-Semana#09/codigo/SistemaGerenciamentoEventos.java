import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SistemaGerenciamentoEventos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Evento> eventos = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar evento");
            System.out.println("2. Listar eventos");
            System.out.println("3. Editar evento");
            System.out.println("4. Remover evento");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (escolha) {
                case 1:
                    criarEvento(scanner, eventos, dateFormat);
                    break;
                case 2:
                    listarEventos(eventos);
                    break;
                case 3:
                    editarEvento(scanner, eventos, dateFormat);
                    break;
                case 4:
                    removerEvento(scanner, eventos);
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
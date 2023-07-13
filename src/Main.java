import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Person> Pessoal = new ArrayList<Person>();
boolean sair = true;
        while (sair) {
            Person Pessoa = new Person();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome da pessoa");
            Pessoa.nome = scanner.nextLine();
            Pessoal.add(Pessoa);

            System.out.println("Deseja cadastrar mais uma pessoa? S/SIM N/NÃO ");
            String option = scanner.nextLine();
            if (option.equals("N")) {
    sair = false;
            }

        }
    }
}

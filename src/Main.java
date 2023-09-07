import java.util.*;

class MainMdT {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<MeiosDeTransporte> mdts = new ArrayList<>();

        for(int i = 0; i < 2; i++) {

            System.out.println("--------------- Navio " + i + 1 + " ---------------");
            Navio mdtNavio = new Navio();
            mdtNavio.setCapacidadeTanque(validarInteiro(scanner, "Insira a capacidade do tanque do navio: "));
            mdtNavio.setNumeroPassageiros(validarInteiro(scanner, "Insira o número de passageiros do navio: "));
            mdtNavio.setPreco(validarFloat(scanner, "Insira o preço do navio: "));
            mdtNavio.setNumeroTripulantes(validarInteiro(scanner, "Insira o número de tripulantes do navio: "));

            scanner.nextLine();

            System.out.print("Insira o nome do navio: ");
            mdtNavio.setNome(scanner.nextLine());

            System.out.print("Insira a data de lançamento do navio: ");
            mdtNavio.setDataLancamento(scanner.nextLine());


            //Inserindo aviões
            System.out.println("--------------- Avião " + i + 1 + " ---------------");
            Aviao mdtAviao = new Aviao();
            mdtAviao.setCapacidadeTanque(validarInteiro(scanner, "Insira a capacidade do tanque do avião: "));
            mdtAviao.setNumeroPassageiros(validarInteiro(scanner, "Insira o número de passageiros do avião: "));
            mdtAviao.setPreco(validarFloat(scanner, "Insira o preço do avião: "));

            scanner.nextLine();

            System.out.print("Insira o prefixo do aviao: ");
            mdtAviao.setPrefixo(scanner.nextLine());

            System.out.print("Insira a data de lançamento do avião: ");
            mdtAviao.setDataRevisao(scanner.nextLine());

            mdts.add(mdtAviao);
            mdts.add(mdtNavio);

        }

        for (int i = 0; i < mdts.size(); i++) {
            mdts.get(i).imprimir();
        }


        scanner.close();
    }

    private static int validarInteiro(Scanner scanner, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                int num = scanner.nextInt();
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Insira um número válido!");
                scanner.nextLine();
            }
        }
    }

    private static float validarFloat(Scanner scanner, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                float num = scanner.nextFloat();
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Insira um número válido!");
                scanner.nextLine();
            }
        }
    }
}

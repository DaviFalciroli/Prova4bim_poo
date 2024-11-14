public class Main {
    public static void main(String[] args) {

        try {

            PessoaTrabalhadoraEstudante pessoa1 = new PessoaTrabalhadoraEstudante("João", 25, 3000.0);
            pessoa1.setNota(9);
            pessoa1.mostrarInfo();
            pessoa1.trabalhar();
            pessoa1.estudar();
            pessoa1.tirarNota();
            pessoa1.tirarNota("Muito bom!");


            PessoaTrabalhadoraEstudante pessoa2 = new PessoaTrabalhadoraEstudante("Jo", 30, 4000.0); 
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {

            PessoaTrabalhadoraEstudante pessoa3 = new PessoaTrabalhadoraEstudante("Maria", -5, 5000.0); 
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {

            PessoaTrabalhadoraEstudante pessoa4 = new PessoaTrabalhadoraEstudante("Pedro", 20, 3500.0);
            pessoa4.setNota(12);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

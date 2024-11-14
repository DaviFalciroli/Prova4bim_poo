public class PessoaTrabalhadoraEstudante extends Pessoa implements Trabalhador, Estudante {

    private double salario;
    private int nota;


    public PessoaTrabalhadoraEstudante(String nome, int idade, double salario) {
        super(nome, idade);  // Chama o construtor da classe Pessoa
        this.salario = salario;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando.");
    }

    @Override
    public double receberSalario() {
        return salario;
    }

    @Override
    public void estudar() {
        System.out.println(getNome() + " está estudando.");
    }

    @Override
    public int tirarNota() {
        return nota;
    }


    public void tirarNota(String comentario) {
        System.out.println(getNome() + " obteve a nota " + nota + ". Comentário: " + comentario);
    }


    public void setNota(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + ", Salário: " + salario);
    }
}

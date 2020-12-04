package trabalho_prova;

public class Professor extends Pessoa {

    private String disciplina;
    private int numdeaulas;
    private double salarioporaula;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getNumdeaulas() {
        return numdeaulas;
    }

    public void setNumdeaulas(int numdeaulas) {
        this.numdeaulas = numdeaulas;
    }

    public double getSalarioporaula() {
        return salarioporaula;
    }

    public void setSalarioporaula(double salarioporaula) {
        this.salarioporaula = salarioporaula;
    }

    @Override
    public String dados() {
        return ("Professor:" + (super.nome));
    }

    void mostrarProfessor() {
        System.out.println("Professor(a):" + this.nome);
        System.out.println("Disciplina:" + this.disciplina);
        System.out.println("Numero de aulas:" + this.numdeaulas);
        System.out.println("Salario por aula:" + this.salarioporaula);
        System.out.println("");
    }

    double calcularSalario() {
        System.out.print("Salario do professor: ");
        double salario = numdeaulas * salarioporaula;
        return salario;
    }
}

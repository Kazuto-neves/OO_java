package trabalho_prova;

public class Aluno extends Pessoa {

    private String matricula;
    private double not1;
    private double not2;
    private double media;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNot1() {
        return not1;
    }

    public void setNot1(double not1) {
        this.not1 = not1;
    }

    public double getNot2() {
        return not2;
    }

    public void setNot2(double not2) {
        this.not2 = not2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String dados() {
        return ("Aluno:" + (super.nome));
    }

    void mostrarAluno() {
        System.out.println("Aluno: " + this.nome);
        System.out.println("Matricula:" + this.matricula);
        System.out.println("1° Nota:" + this.not1);
        System.out.println("2° Nota:" + this.not2);
        System.out.println("");
    }

    double calcularMedia() {
        System.out.print("Calculo da media: ");
        media = (not1 + not2) / 2;
        return media;
    }
    
}

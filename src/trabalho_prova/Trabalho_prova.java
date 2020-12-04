package trabalho_prova;

public class Trabalho_prova {

    public static void main(String[] args) {

        Pessoa P = new Pessoa();
        Aluno A = new Aluno();
        Professor Pr = new Professor();
        Funcionario F = new Funcionario();

        P.setCodigo(40028922);
        P.setNome("Epaminondas Souza");
        P.setCpf("132.375.827-61");
        P.mostrarPessoa();
        System.out.println("");

        Pr.setNome("Patricia");
        Pr.setDisciplina("Programação");
        Pr.setNumdeaulas(10);
        Pr.setSalarioporaula(100);
        Pr.mostrarProfessor();
        System.out.println(Pr.calcularSalario());
        System.out.println("----------------");
        System.out.println("");

        A.setNome("João de Barro");
        A.setNot1(8);
        A.setNot2(10);
        A.setMatricula("00021-2018");
        A.mostrarAluno();
        System.out.println(A.calcularMedia());
        System.out.println("----------------");
        System.out.println("");

        F.setNome("Christian");
        F.setDepartamento("Estoque");
        F.setSalario(1200);
        F.mostrarFuncionario();
        System.out.println("");
        F.mudarDepartamento("Este agora trabalha na Portaria");
        F.setSalario(1500);
        F.mostrarFuncionario();
        System.out.println("----------------");
        System.out.println("");

        System.out.println("***" + A.dados());
        System.out.println("***" + P.dados());
        System.out.println("***" + Pr.dados());
        System.out.println("***" + F.dados());
        System.out.println("_________________");
    }

}

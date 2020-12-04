package trabalho_prova;

public class Funcionario extends Pessoa {

    private String departamento;
    private double salario;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     
    @Override
    public String dados() {
        return ("Funcionario:" + (super.nome));
    }
    
    public void mudarDepartamento(String departamento){
        this.departamento = departamento;
    }

    void mostrarFuncionario() {
        System.out.println("Funcionario:" + this.nome);
        System.out.println("Departamento:" + this.departamento);
        System.out.println("Salario:" + this.salario);
        
    }
}


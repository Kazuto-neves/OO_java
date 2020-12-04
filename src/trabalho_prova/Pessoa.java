package trabalho_prova;

public class Pessoa {

    private String cpf;
    String nome;
    private int codigo;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String dados() {
        return ("Pessoa: " + (this.nome));
    }

    void mostrarPessoa() {
        System.out.println("Codigo da Pessoa:" + this.codigo);
        System.out.println("Nome:" + this.nome);
        System.out.println("CPF:" + this.cpf);
        System.out.println("----------------");
    }

}

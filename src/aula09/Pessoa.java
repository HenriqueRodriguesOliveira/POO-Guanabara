package aula09;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniver() {
        this.idade++;
    }

    public Pessoa(String no, int id, String se) {
        this.nome = no;
        this.idade = id;
        this.sexo = se;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String se) {
        this.sexo = se;
    }

    public void Status(){
        System.out.println("");
    }
}

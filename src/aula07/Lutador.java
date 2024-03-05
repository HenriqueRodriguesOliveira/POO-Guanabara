package aula07;

public class Lutador {
    // Atributos;
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String sexo;
    private String categoria;
    private int vitorias, derrotas, empates;

    // Métodos Públicos
    public void apresentar() {
        System.out.println("---------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador" + getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + "m");
        System.out.println("pesando " + this.getPeso() + " Kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas e");
        System.out.println(this.getEmpates() + " empates!");
    }

    public void status() {
        System.out.println(getNome() + " é um peso " + this.getCategoria());
        System.out.println("é um peso " + getCategoria());
        System.out.println("Ganhou " + getVitorias() + " vezes");
        System.out.println("Perdeu " + getDerrotas() + " vezes");
        System.out.println("Empatou " + getEmpates() + " vezes");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Métodos Especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public void setPeso(float pe) {
        this.peso = pe;

        this.setCategoria();
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "inválido";
        }
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
}

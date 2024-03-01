package testeGetterSetter;

public class Teste {
    private String nomeCarro;
    private String placa;
    private float km;
    private String cor;
    private String modelo;

    public Teste(String n, String p, float k, String c, String m) {
        this.nomeCarro = n;
        this.placa = p;
        this.km = k;
        this.cor = c;
        this.modelo = m;
    }

    public String getNomeCarro() {
        return this.nomeCarro;
    }

    public void setNomeCarro(String n) {
        this.nomeCarro = n;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String p) {
        this.placa = p;
    }

    public float getKm() {
        return this.km;
    }

    public void setKm(float k) {
        this.km = k;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public void status() {
        System.out.println("Nome do carro " + this.nomeCarro);
        System.out.println("Placa do carro: " + this.placa);
        System.out.println("KM do carro: " + this.km);
        System.out.println("Cor do carro: " + this.cor);
        System.out.println("Modelo do carro: " + this.modelo);
    }
}

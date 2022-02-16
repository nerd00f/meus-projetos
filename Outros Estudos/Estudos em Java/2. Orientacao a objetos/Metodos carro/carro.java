class carro {

    private String marca;
    private String modelo;
    private String cor;
    private String combustivel;

    carro(String marca, String modelo, String cor, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
    }

    public void ligar() {
        System.out.println("Iniciando motores...");
    }

    public void acelerar() {
        System.out.println("Aumentando a velocidade...");
    }

    public void frear() {
        System.out.println("Ativando os freios...");
    }
}

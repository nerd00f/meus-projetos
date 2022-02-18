class carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private int capCombustivel;
    private double consumoCombustivel;

    carro(String marca, String modelo, int numPassageiros, int capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public void exibirAutonomia() {
        System.out.println(
                "O valor de autonomia do " + marca + " " + modelo + " é: " + capCombustivel * consumoCombustivel);
    }

}

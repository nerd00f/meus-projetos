class Main {
    public static void main(String[] args) {

        carro A = new carro("Ford", "Fiesta", "branco", "gasolina");
        carro B = new carro("Mitsubishi", "L-200", "azul royal", "diesel");

        System.out.println("Carro A:");
        A.ligar();
        A.acelerar();
        A.frear();

        System.out.println();
        System.out.println("Carro B");
        B.ligar();
        B.acelerar();
        B.frear();
    }
}

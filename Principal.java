public class Principal {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Diesel", 2000, 200);

        System.out.println(carro);

        CarroPasseio carroPasseio = new CarroPasseio("Gasolina", 4000, 150);
        CarroEsportivo carroEsportivo = new CarroEsportivo("Diesel", 5000, 300);



        //carroEsportivo.ligar();
        carroEsportivo.turbinar();
        //carroPasseio.ligar();
        carroPasseio.passear();
        carroEsportivo.frear();
    }
}

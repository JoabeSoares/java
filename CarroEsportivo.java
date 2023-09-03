public class CarroEsportivo extends Carro{
    
    public CarroEsportivo(String tipoCombustivel, int quilometragem, int velocidadeMaxima) {
        super(tipoCombustivel, quilometragem, velocidadeMaxima);
        //TODO Auto-generated constructor stub
    }

    public void turbinar(){
        System.out.println("Carro Turbinado!");
    }

    public void frear(){
        System.out.println("Freio esportivo!");
    }
}

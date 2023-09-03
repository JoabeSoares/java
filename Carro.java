public class Carro {

    private String tipoCombustivel;
    private int quilometragem;
    private int velocidadeMaxima;
    

    
    public Carro(String tipoCombustivel, int quilometragem, int velocidadeMaxima) {
        this.tipoCombustivel = tipoCombustivel;
        this.quilometragem = quilometragem;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void andar(){
        System.out.println("VRUMMM!!");
    }

    public void frear(){
        System.out.println("Freia.");
    }

    public void ligar(String dono){
        System.out.println("Ligou com " +dono);
    }

    public void ligar(int hora, int minuto){
        if (hora==12 && minuto==00) {
            System.out.println("Ligou na hora correta");

        }
    }

    public void desligar(){
        System.out.println("Desligou.");
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public int getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Carro [tipoCombustivel=" + tipoCombustivel + ", quilometragem=" + quilometragem + ", velocidadeMaxima="
                + velocidadeMaxima + "]";
    }
    
    


    
}

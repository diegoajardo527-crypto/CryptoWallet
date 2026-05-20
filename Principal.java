
public class Principal {
    public static void main(String[] args) {
        Carteira minhaCarteira = new Carteira("diego");
        minhaCarteira.depositar(0.5);
        System.out.println("Saldo de bitcoin: " + minhaCarteira.saldoBitcoin);
    
    }
}

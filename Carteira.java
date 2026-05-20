public  class Carteira {
    String dono;
    double saldoBitcoin;
    String senhaAcesso;
    
    public Carteira(String dono) {
    this.dono = dono;
    this.saldoBitcoin = 0.1;
    this.senhaAcesso = senhaAcesso; 
    }
    
    public void depositar(double qtd) {
       this.saldoBitcoin += qtd; 
    }
}

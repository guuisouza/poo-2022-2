package projeto2.exe1;
public final class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private double saldo;
    
    public Cliente(){
        
    }
    
    public Cliente(String numeroConta, String numeroAgencia, String nome, double saldo){
       this.setNumeroConta(numeroConta);
       this.setNumeroAgencia(numeroAgencia);
       this.setNome(nome);
       this.setSaldo(saldo);
    }
    
    public void setNumeroConta(String numeroConta){
        if(numeroConta.length() == 8){
            if (numeroConta.charAt(6) == '-'){
                this.numeroConta = numeroConta;
            }
            else System.out.println("Dígito verificado ausente ou em posição errada");
        }
        else System.out.println("Tamanho inválido");
    }
    
    public void setNumeroAgencia(String numeroAgencia){
        if(numeroAgencia.length() == 6){
            if (numeroAgencia.charAt(4) == '-'){
                this.numeroAgencia = numeroAgencia;
            }
            else System.out.println("Dígito verificado ausente ou em posição errada");
        }
        else System.out.println("Tamanho inválido");
    }
    
    public void setNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("Tamanho invalido");
    }
    
    public void setSaldo (double saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else System.out.println("Saldo não pode ser negativo");
    }
    
    public String getNumeroConta(){
        return this.numeroConta;
    }
    
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void realizarDeposito(double x){
        this.saldo = this.saldo + x;
    }
    
    public void realizarSaque(double x){
        this.setSaldo(this.saldo - x);
    }

    public void mostrar(){
        System.out.println("Número da conta: " + this.numeroConta + " Número da agência: " +
                this.numeroAgencia + " Nome do cliente: " + this.nome + " Saldo Atual: " + this.saldo);
    }
}

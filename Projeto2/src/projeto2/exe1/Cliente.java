package projeto2.exe1;
//Definindo as variaveis já em modo private 
public final class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private double saldo;
    
    //Definindo o metodo construtor vazio
    public Cliente(){
        
    }
    
    //Definindo o outro metodo construtor inicializando as variaveis definidas
    public Cliente(String numeroConta, String numeroAgencia, String nome, double saldo){
       this.setNumeroConta(numeroConta);
       this.setNumeroAgencia(numeroAgencia);
       this.setNome(nome);
       this.setSaldo(saldo);
    }
    
    public void setNumeroConta(String numeroConta){//Definindo o metedo setter
        if(numeroConta.length() == 8){ //Fará a verificação pra ver se o tamanho é 8 caracteres
            if (numeroConta.charAt(6) == '-'){//Verificar se tem o traço identificador
                this.numeroConta = numeroConta;
            }
            else System.out.println("Dígito verificado ausente ou em posição errada"); //Se estiver errado retornará esta mensagem
        }
        else System.out.println("Tamanho inválido");//Se estiver errado retornará esta mensagem
    }
    
    public void setNumeroAgencia(String numeroAgencia){//Definindo mais um metodo setter
        if(numeroAgencia.length() == 6){//Verifica se tem tamanho 6
            if (numeroAgencia.charAt(4) == '-'){//Verifica também se tem o traço identificador
                this.numeroAgencia = numeroAgencia;
            }
            else System.out.println("Dígito verificado ausente ou em posição errada");
        }
        else System.out.println("Tamanho inválido");
    }
    
    public void setNome(String nome){//Definindo metodo setter
        if (nome.length() <= 30){//Verificando se não tem mais de 30 caracteres
            this.nome = nome;
        }
        else System.out.println("Tamanho invalido");
    }
    
    public void setSaldo (double saldo){//Definindo metodo sett
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else System.out.println("Saldo não pode ser negativo");
    }
    
    public String getNumeroConta(){//Definindo getter para exibição
        return this.numeroConta;
    }
    
    public String getNumeroAgencia(){//Definindo getter para exibição
        return this.numeroAgencia;
    }
    
    public String getNome(){//Definindo getter para exibição
        return this.nome;
    }
    
    public double getSaldo(){//Definindo getter para exibição
        return this.saldo;
    }
    
    public void realizarDeposito(double x){//metodo de função/acão
        this.saldo = this.saldo + x;//Forma tradicional de fazer
    }
    
    public void realizarSaque(double x){//metodo de função/acão
        this.setSaldo(this.saldo - x);////Dessa forma você altera diretamente no metodo setter o valor
    }

    public void mostrar(){
        System.out.println("Número da conta: " + this.numeroConta + " Número da agência: " +
                this.numeroAgencia + " Nome do cliente: " + this.nome + " Saldo Atual: " + this.saldo);
    }
}

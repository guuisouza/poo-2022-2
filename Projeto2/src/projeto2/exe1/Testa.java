package projeto2.exe1;

import java.util.HashSet;
import java.util.Set;

public class Testa {

    public static void main(String[] args) {
        Cliente cli1 = new Cliente("123456-7", "1234-5", "Fulano", 0);
        System.out.println("Dados da primeira conta");
        cli1.realizarDeposito(1000);
        cli1.realizarSaque(400);
        cli1.mostrar();
        

        Cliente cli2 = new Cliente();
        System.out.println("Dados da segunda conta");
        cli2.setNome("Tulio");
        cli2.setNumeroAgencia("12364-14");//Aqui avisará o erro pois entrará sem seguir as regras
        cli2.setNumeroConta("1477-45");//Aqui avisará o erro pois entrará sem seguir as regras
        cli2.setSaldo(15000);
        cli2.realizarSaque(2000);
        cli2.mostrar();
        
        
    }
    
}

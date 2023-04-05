import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();
        c1.setSaldo(0.0);
        c1.deposita(100.0);
        c1.setNumero(123);
        ContaCorrente c2 = new ContaCorrente();
        c2.setSaldo(0.0);
        c2.deposita(200.0);
        c2.setNumero(456);
        Cliente cliente = new Cliente();
        cliente.setNome("Gustavo");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Gabriel");
        c1.setCliente(cliente);
        c2.setCliente(cliente2);

        List contas = new ArrayList();

        contas.add(c1);
        contas.add(c2);

        System.out.println(contas.size());

        for (int i = 0; i < contas.size();i++){
            ContaCorrente cc = (ContaCorrente) contas.get(i);
            System.out.println("A conta numero " + cc.getNumero() + " do cliente " + cc.getCliente().getNome() + " possui um saldo de " + cc.getSaldo());
        }







    }
}

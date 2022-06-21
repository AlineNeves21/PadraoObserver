import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void deveNotificarUmCliente() {
        Peca peca = new Peca(852, "Blusa morticia");
        Cliente cliente = new Cliente("Izadora");
        cliente.cadastrar(peca);
        peca.lancarPeca();
        assertEquals("Izadora, o que você tanto esperava chegou!! Venha comprar a Peça{código da peça=852, peça='Blusa morticia'}", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientes() {
        Peca peca = new Peca(147, "Estante de teia de aranha");
        Cliente cliente1 = new Cliente("Eliane");
        Cliente cliente2 = new Cliente("Carol");
        cliente1.cadastrar(peca);
        cliente2.cadastrar(peca);
        peca.lancarPeca();
        assertEquals("Eliane, o que você tanto esperava chegou!! Venha comprar a Peça{código da peça=147, peça='Estante de teia de aranha'}", cliente1.getUltimaNotificacao());
        assertEquals("Carol, o que você tanto esperava chegou!! Venha comprar a Peça{código da peça=147, peça='Estante de teia de aranha'}", cliente2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        Peca peca = new Peca(789, "Bota kali");
        Cliente cliente = new Cliente("Sara");
        peca.lancarPeca();
        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClienteSapato() {
        Peca peca1 = new Peca(123, "Sapato doll");
        Peca peca2 = new Peca(456, "Saia underground");
        Cliente cliente1 = new Cliente("Aline");
        Cliente cliente2 = new Cliente("Laura");
        cliente1.cadastrar(peca1);
        cliente2.cadastrar(peca2);
        peca1.lancarPeca();
        assertEquals("Aline, o que você tanto esperava chegou!! Venha comprar a Peça{código da peça=123, peça='Sapato doll'}", cliente1.getUltimaNotificacao());
        assertEquals(null, cliente2.getUltimaNotificacao());
    }
}

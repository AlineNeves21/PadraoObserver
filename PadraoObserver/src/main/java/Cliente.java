import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer{
    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void cadastrar(Peca peca) {
        peca.addObserver(this);
    }

    public void update(Observable peca, Object arg1) {
        this.ultimaNotificacao = this.nome + ", o que você tanto esperava chegou!! Venha comprar a " + peca.toString();
    }
}

import java.util.Observable;

public class Peca extends Observable {

    private Integer cod;
    private String nomePeca;

    public Peca(Integer cod, String nomePeca) {
        this.cod = cod;
        this.nomePeca = nomePeca;
    }

    public void lancarPeca() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Peça{" +
                "código da peça=" + cod +
                ", peça='" + nomePeca + '\'' +
                '}';
    }
}

package Model;

// Informações da Instituição e Ambientes
public class Zoologico {
    String nomeDoZoo;
    int precoDaEntrada;
    int animaisTotais;

    Ambiente ambiente;

    public Zoologico(String nomeDoZoo, int precoDaEntrada, int animaisTotais, Ambiente ambiente) {
        this.nomeDoZoo = nomeDoZoo;
        this.precoDaEntrada = precoDaEntrada;
        this.animaisTotais = animaisTotais;
        this.ambiente = ambiente;
    }

    public int getPrecoDaEntrada() {
        return precoDaEntrada;
    }

    public void setPrecoDaEntrada(int precoDaEntrada) {
        this.precoDaEntrada = precoDaEntrada;
    }

    public int getAnimaisTotais() {
        return animaisTotais;
    }

    public void setAnimaisTotais(int animaisTotais) {
        this.animaisTotais = animaisTotais;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    @Override
    public String toString() {
        return "" + nomeDoZoo +
                "Preco do Ingresso de entrada: " + precoDaEntrada +
                "\nAnimais disponiveis para visitar: " + animaisTotais + "\n\n";

    }
}

package Model;

public class Capivara extends AnimalModel {

    boolean melhorAmigo;

    public Capivara(String nomeDoAnimal, String genero, String reino, String classe, boolean melhorAmigo, double pesoDoAnimal, String nomeDoAmbiente) {
        super(nomeDoAnimal, genero, reino, classe, pesoDoAnimal, nomeDoAmbiente);
        this.melhorAmigo = melhorAmigo;
    }

    public boolean isMelhorAmigo() {
        return melhorAmigo;
    }

    public void setMelhorAmigo(boolean melhorAmigo) {
        this.melhorAmigo = melhorAmigo;
    }

    @Override
    public String getGenero() {
        return super.getGenero();
    }

    @Override
    public String getNomeDoAnimal() {
        return super.getNomeDoAnimal();
    }

    @Override
    public String getReino() {
        return super.getReino();
    }

    @Override
    public String getClasse() {
        return super.getClasse();
    }
}
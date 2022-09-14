package Model;

// Macaco e suas caracteristicas
public class Macaco extends AnimalModel {

    boolean comeBanana;
    boolean riMuito;

    public Macaco(String nomeDoAnimal, String genero, String reino, String classe, boolean comeBanana, boolean riMuito, double pesoDoAnimal, String nomeDoAmbiente) {
        super(nomeDoAnimal, genero, reino, classe, pesoDoAnimal, nomeDoAmbiente);
        this.comeBanana = comeBanana;
        this.riMuito = riMuito;
    }

    public boolean isComeBanana() {
        return comeBanana;
    }

    public void setComeBanana(boolean comeBanana) {
        this.comeBanana = comeBanana;
    }

    public boolean isRiMuito() {
        return riMuito;
    }

    public void setRiMuito(boolean riMuito) {
        this.riMuito = riMuito;
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

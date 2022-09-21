package Model;

import Interface.IAnimalLeao;

public class Leao extends AnimalModel implements IAnimalLeao {


    boolean reiDaSelva;

    public Leao(String nomeDoAnimal, String genero, String reino, String classe, boolean reiDaSelva, double pesoDoAnimal, String nomeDoAmbiente) {
        super(nomeDoAnimal, genero, reino, classe, pesoDoAnimal, nomeDoAmbiente);
        this.reiDaSelva = reiDaSelva;
    }

    public boolean isReiDaSelva() {
        return reiDaSelva;
    }

    public void setReiDaSelva(boolean reiDaSelva) {
        this.reiDaSelva = reiDaSelva;
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

    @Override
    public void domesticado() {
        System.out.println("Ele eh domesticado.");
    }

    @Override
    public void naoEhDomesticado() {
        System.out.println("Ele nao eh domesticado.");
    }

    @Override
    public void comer(int massa) {
        System.out.printf("Ele come %dkg de massa.%n", massa);
    }
}


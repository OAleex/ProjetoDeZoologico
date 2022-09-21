package Model;

import Interface.IAnimalCapivara;

public class Capivara extends AnimalModel implements IAnimalCapivara {

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

    @Override
    public void tempoEmBaixoDaAgua(int tempo) {
        System.out.printf("Ele fica %d minutos em baixo d'agua!%n", tempo);
    }

    @Override
    public void consegueCorrer() {
        System.out.println("Esse corre, eh ligeiro!");

    }

    @Override
    public void naoConsegueCorrer() {
        System.out.println("Ele nao corre!");
    }
}
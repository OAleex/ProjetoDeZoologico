package Model;

// Classe Modelo para Construir a base de outros animais.
public class AnimalModel {

    String nomeDoAnimal;
    String genero;
    String reino;
    String classe;
    double pesoDoAnimal;
    String nomeDoAmbiente;

    public AnimalModel(String nomeDoAnimal, String genero, String reino, String classe, double pesoDoAnimal, String nomeDoAmbiente) {
        this.nomeDoAnimal = nomeDoAnimal;
        this.genero = genero;
        this.reino = reino;
        this.classe = classe;
        this.pesoDoAnimal = pesoDoAnimal;
        this.nomeDoAmbiente = nomeDoAmbiente;
    }

    public String getGenero() {
        return genero;
    }

    public double getPesoDoAnimal() {
        return pesoDoAnimal;
    }

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }


    @Override
    public String toString() {
        return "Nome: " + nomeDoAnimal + "\n" +
                "Genero: " + genero +
                "Reino:" + reino +
                "Classe: " + classe +
                "Peso: " + pesoDoAnimal +
                "\nNome do Ambiente: " + nomeDoAmbiente + "\n";
    }
}

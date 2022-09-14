package Model;

// Ambiente onde o mesmo é habitado por animais.
public class Ambiente {

    AnimalModel[] listaDeAnimais;

    public Ambiente(int tamanhoDoAmbiente) {
        listaDeAnimais = new AnimalModel[tamanhoDoAmbiente];
    }

    public void getlistaDeAnimais() {
        for (int i = 0; i < this.listaDeAnimais.length; i++) {
            System.out.println(listaDeAnimais[i]);
        }
    }

    public void setListaDeAnimais(int posicao, AnimalModel animalmodel) {
        this.listaDeAnimais[posicao] = animalmodel;
    }

    @Override
    public String toString() {
        this.getlistaDeAnimais();
        return "Encerrado . . .";
    }
}

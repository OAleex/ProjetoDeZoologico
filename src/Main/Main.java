package Main;

import Model.*;
import Model.Leao;
import Model.Macaco;
import Model.Capivara;


public class Main {

    public static void main(String[] args) {
        // Zoologico
        Ambiente ambiente = new Ambiente(6);
        // Leão 1
        Leao leao1 = new Leao(
                "\n[Leao 01] - Simbinha",
                "Macho\n",
                "Animalia\n",
                "Carnivoro\n",
                true,
                80.9);
        // Leão 2
        Leao leao2 = new Leao(
                "\n[Leao 02] - Jason",
                "Macho\n",
                "Animalia\n",
                "Carnivoro\n",
                true,
                90);

        // Macaco 1
        Macaco macaco1 = new Macaco(
                "\n[Macaco 01] - Grillz",
                "Macho\n",
                "Animalia\n",
                "Mammalia\n",
                true,
                true,
                88.4);

        // Macaco 2
        Macaco macaco2 = new Macaco(
                "\n[Macaco 02] - Flower",
                "Femea\n",
                "Animalia\n",
                "Mammalia\n",
                true,
                true,
                81.7);

        // Capivara 1

        Capivara capivara1 = new Capivara(
                "\n[Capivara 01] - Cheetos",
                "Macho\n",
                "Animalia\n",
                "Mammalia\n",
                true,
                84.7);

        // Capivara 2
        Capivara capivara2 = new Capivara(
                "\n[Capivara 02] - Elinis",
                "Femea\n",
                "Animalia\n",
                "Mammalia\n",
                true,
                84.7);

        ambiente.setListaDeAnimais(0, leao1);
        ambiente.setListaDeAnimais(1,leao2);

        ambiente.setListaDeAnimais(2, macaco1);
        ambiente.setListaDeAnimais(3, macaco2);

        ambiente.setListaDeAnimais(4, capivara1);
        ambiente.setListaDeAnimais(5, capivara2);

        Zoologico zoologico = new Zoologico(
                "[Zoologico - ZooNimals]\n",
                1500,
                6,
                ambiente);


        System.out.print(zoologico);
        System.out.println(zoologico.getAmbiente());
    }
}

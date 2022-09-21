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
                80.9,
                "Savanas\n"

        );

        // Leão 2
        Leao leao2 = new Leao(
                "\n[Leao 02] - Jason",
                "Macho\n",
                "Animalia\n",
                "Carnivoro\n",
                true,
                90,
                "Savanas\n");

        // Macaco 1
        Macaco macaco1 = new Macaco(
                "\n[Macaco 01] - Grillz",
                "Macho\n",
                "Animalia\n",
                "Mammalia\n",
                true,
                true,
                88.4,
                "Tropical\n");

        // Macaco 2
        Macaco macaco2 = new Macaco(
                "\n[Macaco 02] - Flower",
                "Femea\n",
                "Animalia\n",
                "Mammalia\n",
                true,
                true,
                81.7,
                "Tropical\n");

        // Capivara 1

        Capivara capivara1 = new Capivara(
                "\n[Capivara 01] - Cheetos",
                "Macho\n",
                "Animalia\n",
                "Mammalia\n",
                true,
                84.7,
                "Aquatico\n");

        // Capivara 2
        Capivara capivara2 = new Capivara(
                "\n[Capivara 02] - Elinis",
                "Femea\n",
                "Animalia\n",
                "Mammalia\n",
                true,
                84.7,
                "Aquatico");

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

        // Interfaces
        // Leao1
        System.out.println("\n\n[Interfaces]");
        System.out.println("\n[Leão Simbinha]");
        leao1.domesticado();
        leao1.comer(5);

        // Leao2
        System.out.println("\n[Leão Jason]");
        leao2.naoEhDomesticado();
        leao2.comer(4);

        // Macaco1
        System.out.println("\n[Macaco Grillz]");
        macaco1.fazCambalhota();
        macaco1.tamanhoDoSalto(3);

        // Macaco2
        System.out.println("\n[Macaco Flower]");
        macaco2.naoFazCambalhota();
        macaco2.tamanhoDoSalto(6);

        // Capivara1
        System.out.println("\n[Capivara Cheetos]");
        capivara1.tempoEmBaixoDaAgua(4);
        capivara1.consegueCorrer();

        // Capivara2
        System.out.println("\n[Capivara Elinis]");
        capivara1.tempoEmBaixoDaAgua(5);
        capivara1.naoConsegueCorrer();
         }
    }
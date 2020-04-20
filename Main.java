import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
            ArrayList<Equipe> listaEquipes = new ArrayList<>();
            ArrayList<Equipe> grupoA = new ArrayList<>();
            ArrayList<Equipe> grupoB = new ArrayList<>();
            ArrayDeque<Equipe> mata_mata = new ArrayDeque<>();
            Stack<Equipe> mata_mata_f = new Stack<>();
            Scanner scanner = new Scanner(System.in);

            //Inserir equipes no torneio
            System.out.println("Insira 8 equipes para o torneio, juntamente com seus respectivos atributos. ");
            for (int i = 0; i < 8; i++) {
                System.out.println("Insira o nome da equipe: ");
                String nome = scanner.nextLine();
                System.out.println("Insira os atributos de ataque (0 a 10): ");
                int ataque = scanner.nextInt();
                while (ataque < 0 || ataque > 10) {
                    System.out.println("Insira um número de 0 a 10! ");
                    ataque = scanner.nextInt();
                }

                System.out.println("Insira os atributos de meio-campo (0 a 10): ");
                int meioCampo = scanner.nextInt();
                while (meioCampo < 0 || meioCampo > 10) {
                    System.out.println("Insira um número de 0 a 10! ");
                    meioCampo = scanner.nextInt();
                }
                System.out.println("Insira os atributos de defesa (0 a 10): ");
                int defesa = scanner.nextInt();
                while (defesa < 0 || defesa > 10) {
                    System.out.println("Insira um número de 0 a 10! ");
                    defesa = scanner.nextInt();
                }
                Equipe equipe = new Equipe(nome, ataque, meioCampo, defesa);
                listaEquipes.add(equipe);
                scanner.nextLine();
            }


            //Sortear grupos
            int i = 0;
            while (!listaEquipes.isEmpty()) {
                Random random = new Random();
                int numero = random.nextInt(listaEquipes.size());
                Equipe equipe = listaEquipes.get(numero);
                if (i >= 0 && i < 4) {
                    grupoA.add(equipe);
                }
                else if (i >= 4 && i < 8) {
                    grupoB.add(equipe);
                }
                listaEquipes.remove(equipe);
                i++;
            }

            
             System.out.println("");
             System.out.println("");
            //Fase de grupos (Grupo A)
                Equipe equipe1 = grupoA.get(0);
                Equipe equipe2 = grupoA.get(1);
                Equipe equipe3 = grupoA.get(2);
                Equipe equipe4 = grupoA.get(3);
                System.out.println("Grupo A");
                System.out.println(equipe1.getNome());
                System.out.println(equipe2.getNome());
                System.out.println(equipe3.getNome());
                System.out.println(equipe4.getNome());
                int sg1 = 0;
                int sg2 = 0;
                int sg3 = 0;
                int sg4 = 0;
                int pt1 = 0;
                int pt2 = 0;
                int pt3 = 0;
                int pt4 = 0;
                Partida partida1 = new Partida(equipe1, equipe2);
                sg1 += partida1.getNumGolsEquipe1() - partida1.getNumGolsEquipe2();
                sg2 += partida1.getNumGolsEquipe2() - partida1.getNumGolsEquipe2();
                int resultado = partida1.resultado();
                if(resultado == 0){
                    pt1 += 1;
                    pt2 += 1;
                }
                else if(resultado==1){
                    pt1 += 3;
                }
                else
                    pt2 += 3;
                System.out.println(partida1);
                Partida partida2 = new Partida(equipe1, equipe3);
                sg1 += partida2.getNumGolsEquipe1() - partida2.getNumGolsEquipe2();
                sg3 += partida2.getNumGolsEquipe2() - partida2.getNumGolsEquipe2();
                resultado = partida2.resultado();
                if(resultado==0){
                    pt1 += 1;
                    pt3 += 1;
                }
                else if(resultado==1){
                    pt1 += 3;
                }
                else
                    pt3 += 3;
                System.out.println(partida2);
                Partida partida3 = new Partida(equipe1, equipe4);
                sg1 += partida3.getNumGolsEquipe1() - partida3.getNumGolsEquipe2();
                sg4 += partida3.getNumGolsEquipe2() - partida3.getNumGolsEquipe2();
                resultado = partida3.resultado();
                if(resultado==0){
                    pt1 += 1;
                    pt4 += 1;
                }
                else if(resultado==1){
                    pt1 += 3;
                }
                else
                    pt4 += 3;
                System.out.println(partida3);
                Partida partida4 = new Partida(equipe2, equipe3);
                sg2 += partida4.getNumGolsEquipe1() - partida4.getNumGolsEquipe2();
                sg3 += partida4.getNumGolsEquipe2() - partida4.getNumGolsEquipe2();
                resultado = partida4.resultado();
                if(resultado==0){
                    pt2 += 1;
                    pt3 += 1;
                }
                else if(resultado==1){
                    pt2 += 3;
                }
                else
                    pt3 += 3;
                System.out.println(partida4);
                Partida partida5 = new Partida(equipe2, equipe4);
                sg2 += partida5.getNumGolsEquipe1() - partida5.getNumGolsEquipe2();
                sg4 += partida5.getNumGolsEquipe2() - partida5.getNumGolsEquipe2();
                resultado = partida5.resultado();
                if(resultado==0){
                    pt2 += 1;
                    pt4 += 1;
                }
                else if(resultado==1){
                    pt2 += 3;
                }
                else
                    pt4 += 3;
                System.out.println(partida5);
                Partida partida6 = new Partida(equipe3, equipe4);
                sg3+= partida6.getNumGolsEquipe1() - partida6.getNumGolsEquipe2();
                sg4 += partida6.getNumGolsEquipe2() - partida6.getNumGolsEquipe1();
                resultado = partida6.resultado();
                if(resultado==0){
                    pt3 += 1;
                    pt4 += 1;
                }
                else if(resultado==1){
                    pt3 += 3;
                }
                else
                    pt4 += 3;
                System.out.println(partida6);

                System.out.println("");
                System.out.println("");
                
                equipe1.setNumPontos(pt1);
                equipe2.setNumPontos(pt2);
                equipe3.setNumPontos(pt3);
                equipe4.setNumPontos(pt4);
                equipe1.setSaldoGols(sg1);
                equipe2.setSaldoGols(sg2);
                equipe3.setSaldoGols(sg3);
                equipe4.setSaldoGols(sg4);
                
                Equipe primeiroA = null;
                Equipe segundoA = null;
                
                int[] classificacaoA = new int[4];
                int res_equipe1 = (equipe1.getNumPontos() * 3) + equipe1.getSaldoGols();
                int res_equipe2 = (equipe2.getNumPontos() * 3) + equipe2.getSaldoGols();
                int res_equipe3 = (equipe3.getNumPontos() * 3) + equipe3.getSaldoGols();
                int res_equipe4 = (equipe4.getNumPontos() * 3) + equipe4.getSaldoGols();
                classificacaoA[0] = res_equipe1;
                classificacaoA[1] = res_equipe2;
                classificacaoA[2] = res_equipe3;
                classificacaoA[3] = res_equipe4;
                
                Arrays.sort(classificacaoA);
                if (classificacaoA[3] == res_equipe1) {
                    primeiroA = equipe1;
                    res_equipe1 = -1;
                }
                if (classificacaoA[3] == res_equipe2) {
                    primeiroA = equipe2;
                    res_equipe2 = -1;
                }
                if (classificacaoA[3] == res_equipe3) {
                    primeiroA = equipe3;
                    res_equipe3 = -1;
                }
                if (classificacaoA[3] == res_equipe4) {
                    primeiroA = equipe4;
                    res_equipe4 = -1;
                }
                
                if (classificacaoA[2] == res_equipe1) {
                    segundoA = equipe1;
                }
                if (classificacaoA[2] == res_equipe2) {
                    segundoA = equipe2;
                }
                if (classificacaoA[2] == res_equipe3) {
                    segundoA = equipe3;
                }
                if (classificacaoA[2] == res_equipe4) {
                    segundoA = equipe4;
                }
                
                System.out.println("Grupo A");
                System.out.println("1º " + primeiroA.getNome() + ": " + primeiroA.getNumPontos() + " pontos");
                System.out.println("2º " + segundoA.getNome() + ": " + segundoA.getNumPontos() + " pontos");
                

                
                //Fase de grupos (Grupo B)
                Equipe equipe5 = grupoB.get(0);
                Equipe equipe6 = grupoB.get(1);
                Equipe equipe7 = grupoB.get(2);
                Equipe equipe8 = grupoB.get(3);
                int sg5 = 0;
                int sg6 = 0;
                int sg7 = 0;
                int sg8 = 0;
                int pt5 = 0;
                int pt6 = 0;
                int pt7 = 0;
                int pt8 = 0;
                
                System.out.println("Grupo B");
                System.out.println(equipe5.getNome());
                System.out.println(equipe6.getNome());
                System.out.println(equipe7.getNome());
                System.out.println(equipe8.getNome());
                
                Partida partida7 = new Partida(equipe5, equipe6);
                sg5 += partida7.getNumGolsEquipe1() - partida7.getNumGolsEquipe2();
                sg6 += partida7.getNumGolsEquipe2() - partida7.getNumGolsEquipe2();
                resultado = partida7.resultado();
                if(resultado==0){
                    pt5 += 1;
                    pt6 += 1;
                }
                else if(resultado==1){
                    pt5 += 3;
                }
                else
                    pt6 += 3;
                System.out.println(partida7);
                Partida partida8 = new Partida(equipe5, equipe7);
                sg5 += partida8.getNumGolsEquipe1() - partida8.getNumGolsEquipe2();
                sg7 += partida8.getNumGolsEquipe2() - partida8.getNumGolsEquipe2();
                resultado = partida8.resultado();
                if(resultado==0){
                    pt5 += 1;
                    pt7 += 1;
                }
                else if(resultado==1){
                    pt5 += 3;
                }
                else
                    pt7 += 3;
                System.out.println(partida8);
                Partida partida9 = new Partida(equipe5, equipe8);
                sg5 += partida9.getNumGolsEquipe1() - partida9.getNumGolsEquipe2();
                sg8 += partida9.getNumGolsEquipe2() - partida9.getNumGolsEquipe2();
                resultado = partida9.resultado();
                if(resultado==0){
                    pt5 += 1;
                    pt8 += 1;
                }
                else if(resultado==1){
                    pt5 += 3;
                }
                else
                    pt8 += 3;
                System.out.println(partida9);
                Partida partida10 = new Partida(equipe6, equipe7);
                sg6 += partida10.getNumGolsEquipe1() - partida10.getNumGolsEquipe2();
                sg7 += partida10.getNumGolsEquipe2() - partida10.getNumGolsEquipe2();
                resultado = partida10.resultado();
                if(resultado ==0){
                    pt6 += 1;
                    pt7 += 1;
                }
                else if(resultado==1){
                    pt6 += 3;
                }
                else
                    pt7 += 3;
                System.out.println(partida10);
                Partida partida11 = new Partida(equipe6, equipe8);
                sg6 += partida11.getNumGolsEquipe1() - partida11.getNumGolsEquipe2();
                sg8 += partida11.getNumGolsEquipe2() - partida11.getNumGolsEquipe2();
                resultado = partida11.resultado();
                if(resultado==0){
                    pt6 += 1;
                    pt8 += 1;
                }
                else if(resultado==1){
                    pt6 += 3;
                }
                else
                    pt8 += 3;
                System.out.println(partida11);
                Partida partida12 = new Partida(equipe7, equipe8);
                sg7 += partida12.getNumGolsEquipe1() - partida12.getNumGolsEquipe2();
                sg8 += partida12.getNumGolsEquipe2() - partida12.getNumGolsEquipe2();
                resultado = partida12.resultado();
                if(resultado==0){
                    pt7 += 1;
                    pt8 += 1;
                }
                else if(resultado==1){
                    pt7 += 3;
                }
                else
                    pt8 += 3;
                System.out.println(partida12);
                
                System.out.println("");
                System.out.println("");
                
                
                equipe5.setNumPontos(pt5);
                equipe6.setNumPontos(pt6);
                equipe7.setNumPontos(pt7);
                equipe8.setNumPontos(pt8);
                equipe5.setSaldoGols(sg5);
                equipe6.setSaldoGols(sg6);
                equipe7.setSaldoGols(sg7);
                equipe8.setSaldoGols(sg8);
                
                Equipe primeiroB = null;
                Equipe segundoB = null;
                
                int[] classificacaoB = new int[4];
                int res_equipe5 = (equipe5.getNumPontos() * 3) + equipe5.getSaldoGols();
                int res_equipe6 = (equipe6.getNumPontos() * 3) + equipe6.getSaldoGols();
                int res_equipe7 = (equipe7.getNumPontos() * 3) + equipe7.getSaldoGols();
                int res_equipe8 = (equipe8.getNumPontos() * 3) + equipe8.getSaldoGols();
                classificacaoB[0] = (equipe5.getNumPontos() * 3) + equipe5.getSaldoGols();
                classificacaoB[1] = (equipe6.getNumPontos() * 3) + equipe6.getSaldoGols();
                classificacaoB[2] = (equipe7.getNumPontos() * 3) + equipe7.getSaldoGols();
                classificacaoB[3] = (equipe8.getNumPontos() * 3) + equipe8.getSaldoGols();
                
                Arrays.sort(classificacaoB);
                if (classificacaoB[3] == res_equipe5) {
                    primeiroB = equipe5;
                    res_equipe5 = -1;
                }
                if (classificacaoB[3] == res_equipe6) {
                    primeiroB = equipe6;
                    res_equipe6 = -1;
                }
                if (classificacaoB[3] == res_equipe7) {
                    primeiroB = equipe7;
                    res_equipe7 = -1;
                }
                if (classificacaoB[3] == res_equipe8) {
                    primeiroB = equipe8;
                    res_equipe8 = -1;
                }
                
                
                if (classificacaoB[2] == res_equipe5) {
                    segundoB = equipe5;
                }
                if (classificacaoB[2] == res_equipe6) {
                    segundoB = equipe6;
                }
                if (classificacaoB[2] == res_equipe7) {
                    segundoB = equipe7;
                }
                if (classificacaoB[2] == res_equipe8) {
                    segundoB = equipe8;
                }
                
                System.out.println("Grupo B");
                System.out.println("1º " + primeiroB.getNome() + ": " + primeiroB.getNumPontos() + " pontos");
                System.out.println("2º " + segundoB.getNome() + ": " + segundoB.getNumPontos() + " pontos");

                System.out.println("Semifinal 1: " + primeiroA.getNome() + " x " + segundoB.getNome());
                System.out.println("Semifinal 2: " + primeiroB.getNome() + " x " + segundoA.getNome());
                
                //Semi-final
                mata_mata.addLast(primeiroA);
                mata_mata.addLast(segundoB);
                mata_mata.addLast(primeiroB);
                mata_mata.addLast(segundoA);
                
                System.out.println("Primeira semifinal");
              
                
                equipe1 = mata_mata.peek();
                mata_mata.removeFirst();
                equipe2 = mata_mata.peek();
                mata_mata.removeFirst();
                
                Partida sf1 = new Partida(equipe1, equipe2);
                resultado = sf1.resultado();
                if (resultado == 1) {
                    mata_mata_f.push(equipe1);
                    System.out.println(sf1);
                }
                else if (resultado == 0) {
                    Random random = new Random();
                    if (random.nextInt(1) == 1) {
                        mata_mata_f.push(equipe2);
                        System.out.println(sf1);
                        System.out.println(equipe2.getNome() + " VENCEU NOS PÊNALTIS ");
                    }
                    else {
                        mata_mata_f.push(equipe1);
                        System.out.println(sf1);
                        System.out.println(equipe1.getNome() + " VENCEU NOS PÊNALTIS ");
                    }  
                }
                else {
                   mata_mata_f.push(equipe2);
                   System.out.println(sf1); 
                }
                
               System.out.println("Segunda semifinal"); 
                equipe3 = mata_mata.peek();
                mata_mata.removeFirst();
                equipe4 = mata_mata.peek();
                mata_mata.removeFirst();
                
                System.out.println("Tamanho da fila: " + mata_mata.size());
                
                Partida sf2 = new Partida(equipe3, equipe4);
                resultado = sf2.resultado();
                if (resultado == 1) {
                    mata_mata_f.push(equipe3);
                    System.out.println(sf2);
                }
                else if (resultado == 0) {
                    Random random = new Random();
                    if (random.nextInt(1) == 1) {
                        mata_mata_f.push(equipe4);
                        System.out.println(sf2);
                        System.out.println(equipe2.getNome() + " VENCEU NOS PÊNALTIS ");
                    }
                    else {
                        mata_mata_f.push(equipe3);
                        System.out.println(sf2);
                        System.out.println(equipe1.getNome() + " VENCEU NOS PÊNALTIS ");
                    }  
                }
                else {
                   mata_mata_f.push(equipe4);
                   System.out.println(sf2); 
                }
                
                
                //Final
                Equipe finalista1 = mata_mata_f.pop();
                Equipe finalista2 = mata_mata_f.pop();
                
                
                System.out.println("Final: " + finalista1.getNome() + " x " + finalista2.getNome());
                Partida f = new Partida(finalista1, finalista2);
                resultado = f.resultado();
                if (resultado == 1) {
                    mata_mata_f.push(finalista1);
                    System.out.println(f);
                }
                else if (resultado == 0) {
                    Random random = new Random();
                    if (random.nextInt(1) == 1) {
                        mata_mata_f.push(finalista2);
                        System.out.println(f);
                        System.out.println(finalista2.getNome() + " VENCEU NOS PÊNALTIS ");
                    }
                    else {
                        mata_mata_f.push(finalista1);
                        System.out.println(f);
                        System.out.println(finalista1.getNome() + " VENCEU NOS PÊNALTIS ");
                    }  
                }
                else {
                   mata_mata_f.push(finalista2);
                   System.out.println(f); 
                }
                
                System.out.println("Campeão: " + mata_mata_f.peek().getNome());
    }
 }

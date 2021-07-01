package Cinema;

import java.util.*;
public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int alphaa = 24;
        int alphab = 24;
        int AlphaC = 23;
        int alphad = 23;
        int alphae = 23;
        int alphaf = 23;
        
        
        int alphatot = alphaa + alphab + AlphaC + alphad + alphae + alphaf;
        
       
        int alphapcd = 2;
        int alphabpcd = 2;
        int alphacpdc = 2;
        int alphadpcd = 2;
        int alphaepcd = 2;
        int alphafPcD = 2;
        
        
        int alphapcdtot = alphapcd + alphabpcd + alphacpdc + alphadpcd + alphaepcd + alphafPcD;

        
        int betaa = 24;
        int betab = 24;
        int betac = 24;
        int betad = 24;
        int betae = 24;

       
        int betatot = betaa + betab + betac + betad + betae;

        
        int betaapcd = 2;
        int betabpcd = 1;
        int betacpcd = 1;
        int betadpcd = 1;
        int betaepcd = 1;

        
        int betaepcdtot = betaapcd + betabpcd + betacpcd + betadpcd + betaepcd ;

        int qtd, sala, assento, fila;

        String nome;

        System.out.println("Salve caro espectador, qual o seu nome?");
        nome = sc.next();

        System.out.println(nome+", que nome bunito \nBem aqui temos dois filmes para você escolher nas salas \nAlpha com o filme AS BRANQUELAS e Beta com A Chegada \nDigite o número da sala e filme desejados: ");
        sala = sc.nextInt();

        
        if(sala == 1){
            System.out.println("Agora nós temos os seguintes tipos de assentos: \n1. Assento comum \n2. Assento para pessoas com Deficiência \nDigite o número do tipo de assento: ");
            assento = sc.nextInt();
           
            if (assento == 1){
                System.out.println("Assento comum. Temos "+ alphatot +" ingressos.\nDigite o número da fila desejada:");
                fila = sc.nextInt();

                System.out.println("E quantos ingressos você deseja?");
                qtd = sc.nextInt();
                switch (fila){
                    case 1:
                    if ((qtd > 0) && (qtd <= alphaa)){
                        alphaa = alphaa - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+alphaa);
                        sc.close();
                    }
                    break;

                    case 2:
                    if ((qtd > 0) && (qtd <= alphab)){
                        alphab = alphab - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+alphab);
                        sc.close();
                    }
                    break;

                    case 3:
                    if ((qtd > 0) && (qtd <= AlphaC)){
                        AlphaC = AlphaC - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+AlphaC);
                        sc.close();
                    }
                    break;

                    case 4:
                    if ((qtd > 0) && (qtd <= alphad)){
                        alphad = alphad - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+alphad);
                        sc.close();
                    }
                    break;

                    case 5:
                    if ((qtd > 0) && (qtd <= alphae)){
                        alphae = alphae - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+alphae);
                        sc.close();
                    }
                    break;

                    case 6:
                    if ((qtd > 0) && (qtd <= alphaf)){
                        alphaf = alphaf - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+alphaf);
                        sc.close();
                    }
                    break;

                    default:
                    System.out.print("Nãooo amigueee, é só um número entre 1 e 6.");
                    break;
                }
            }
          
            else if (assento == 2){
                System.out.println("Tabom na área do Pcd então aqui temos "+ alphapcdtot +" ingressos.\nDigite o número da fila desejada:");
                fila = sc.nextInt();

                System.out.println("Quantos ingressos você deseja?");
                qtd = sc.nextInt();
                switch (fila){
                    case 1:
                    if ((qtd > 0) && (qtd <= alphapcd)){
                        alphapcd = alphapcd - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+alphapcd);
                        sc.close();
                    }
                    break;

                    case 2:
                    if ((qtd > 0) && (qtd <= alphabpcd)){
                        alphabpcd = alphabpcd - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+alphabpcd);
                        sc.close();
                    }
                    break;

                    case 3:
                    if ((qtd > 0) && (qtd <= alphacpdc)){
                        alphacpdc = alphacpdc - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+alphacpdc);
                        sc.close();
                    }
                    break;

                    case 4:
                    if ((qtd > 0) && (qtd <= alphadpcd)){
                        alphadpcd = alphadpcd - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+alphadpcd);
                        sc.close();
                    }
                    break;

                    case 5:
                    if ((qtd > 0) && (qtd <= alphaepcd)){
                        alphaepcd = alphaepcd - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+alphaepcd);
                        sc.close();
                    }
                    break;

                    case 6:
                    if ((qtd > 0) && (qtd <= alphafPcD)){
                        alphafPcD = alphafPcD - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+alphafPcD);
                        sc.close();
                    }
                    break;

                    default:
                    System.out.print("Nãoooo amigues é só um número entre 1 e 6.");
                    break;
                }
            }
          
            else{
                System.out.print("Erro: Digite 1 ou 2");
            }
        }
       
        else if(sala == 2){
            System.out.println("Agora temos os seguintes tipos de assentos: \n1. Assento comum \n2. Assento para pessoas com Deficiência \nDigite o número correspondente ao tipo de assento desejado: ");
            assento = sc.nextInt();

            
             if (assento == 1){
                System.out.println("Okay nós temos "+betatot+" ingressos.\nDigite o número correspondente a fila desejada:");
                fila = sc.nextInt();

                System.out.println("Quase lá, quantos ingressos você deseja?");
                qtd = sc.nextInt();
                switch (fila){
                    case 1:
                    if ((qtd > 0) && (qtd <= betaa)){
                        betaa = betaa - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+betaa);
                        sc.close();
                    }
                    break;

                    case 2:
                    if ((qtd > 0) && (qtd <= betab)){
                        betab = betab - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+betab);
                        sc.close();
                    }
                    break;

                    case 3:
                    if ((qtd > 0) && (qtd <= betac)){
                        betac = betac - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+betac);
                        sc.close();
                    }
                    break;

                    case 4:
                    if ((qtd > 0) && (qtd <= betad)){
                        betad = betad - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+betad);
                        sc.close();
                    }
                    break;

                    case 5:
                    if ((qtd > 0) && (qtd <= betae)){
                        betae = betae - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+betae);
                        sc.close();
                    }
                    break;

                    default:
                    System.out.print("Nãoooo amigues é só um número entre 1 e 5.");
                    break;
                }
             }
             //Assento PcD
             else if(assento == 2){
                System.out.println("Okay nós temos "+ betaepcdtot+" ingressos.\n5. fila E: "+betaepcd+"\nDigite o número da fila desejada:");
                fila = sc.nextInt();

                System.out.println("Quantos ingressos você deseja?");
                qtd = sc.nextInt();
                switch (fila){
                    case 1:
                    if ((qtd > 0) && (qtd <= betaapcd)){
                        betaapcd = betaapcd - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+betaapcd);
                        sc.close();
                    }
                    break;

                    case 2:
                    if ((qtd > 0) && (qtd <= betabpcd)){
                        betabpcd = betabpcd - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+betabpcd);
                        sc.close();
                    }
                    break;

                    case 3:
                    if ((qtd > 0) && (qtd <= betacpcd)){
                        betacpcd = betacpcd - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+betacpcd);
                        sc.close();
                    }
                    break;

                    case 4:
                    if ((qtd > 0) && (qtd <= betadpcd)){
                        betadpcd = betadpcd - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+betadpcd);
                        sc.close();
                    }
                    break;

                    case 5:
                    if ((qtd > 0) && (qtd <= betaepcd)){
                        betaepcd = betaepcd - qtd;
                        System.out.print(nome+" muito top seus ingressos foram comprado. Isso é tão cringeee, aproveite o filme!.");
                        sc.close();
                    }
                    else{
                        System.out.print("Epa selecione uma quantidade de ingressos entre 1 e "+betaepcd);
                        sc.close();
                    }
                    break;

                    default:
                    System.out.print("Nãoooo amigues é só um número entre 1 e 5.");
                    break;
                }
             }
            
             else{
                 System.out.print("No pode, apenas digite 1 ou 2");
             }
        }
     
        else{
            System.out.print("No pode, apenas digite 1 ou 2.");
        }
    }
}

//Não tive muito tempo para fazer minha própria lógica nessa atividade, queria muito ter usado minha própria lógica, mas não tive tempo 
//então utiliei a lógica de meus colegas que me ajudaram na lição

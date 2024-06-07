import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado = 0;
        double base = 0;
        double altura = 0;
        double raio = 0;
        double area = 0;
        double volume = 0;

        String roxo = "\033[1;35;20m";
        String ciano = "\033[1;35;36m";
        String branco = "\033[1;35;39m";
        String reset = "\033[0m";
        String vermelho = "\033[1;35;31m";
        String verde = "\033[1;35;32m";
        String amarelo = "\033[1;35;33m";

        System.out.println(verde + "\n" +
                "█▀▀ ▄▀█ █░░ █▀▀ █░█ █░░ ▄▀█ █▀▄ █▀█ █▀█ ▄▀█   █▀▀ █▀▀ █▀█ █▀▄▀█ █▀▀ ▀█▀ █▀█ █ █▀▀ ▄▀█\n" +
                "█▄▄ █▀█ █▄▄ █▄▄ █▄█ █▄▄ █▀█ █▄▀ █▄█ █▀▄ █▀█   █▄█ ██▄ █▄█ █░▀░█ ██▄ ░█░ █▀▄ █ █▄▄ █▀█" + reset);

        System.out.print(verde + "\uD835\uDC46\uD835\uDC52\uD835\uDC57\uD835\uDC4E \uD835\uDC4F\uD835\uDC52\uD835\uDC5A-\uD835\uDC63\uD835\uDC56\uD835\uDC5B\uD835\uDC51@!" + reset);
        System.out.print("\n\n⚘ Qual seu nome? ");
        String nomeUser = sc.nextLine();
        int tipoFiguras = 0;
        int figura = 0;

        while (true) {
            try {
                System.out.printf("\n\n✿ %s deseja trabalhar com quais figuras? Insira o índice.", nomeUser);
                System.out.println(ciano + "\n✿ 1 - Figuras planas"+ reset);
                System.out.println( roxo + "✿ 2 - Figuras espaciais"+ reset);
                System.out.println(vermelho + "✿ 0 - Sair"+ reset);
                tipoFiguras = sc.nextInt();


            } catch (Exception e ) {
                System.out.println(vermelho +"Caractere inválido!" + reset);
                continue;
            }
            if (tipoFiguras == 1 ){
            try {
                System.out.printf(ciano + "\n\n❀ Vamos trabalhar com figuras planas! %s escolha a figura: \n", nomeUser);
                System.out.println(branco + "❀ 1 - Quadradro");
                System.out.println("❀ 2 - Retângulo");
                System.out.println("❀ 3 - Triângulo equilátero");
                System.out.println("❀ 4 - Hexagono Regular");
                System.out.println("❀ 5 - Círculo" + reset);
                System.out.println(vermelho + "❀ 0 - Sair"+ reset);
                figura = sc.nextInt();
            } catch (Exception e) {
                System.out.println(vermelho + "Caractere inválido!" + reset);
                System.exit(0);
                }

            switch (figura) {
                case 0:
                    System.out.println(vermelho + "Saindo..." + reset);
                    System.exit(0);
                case 1:
                    System.out.printf("\n\n⚘ %s insira o valor dos lados do quadrado:\n", nomeUser);
                    lado = sc.nextDouble();
                    Quadrado quadrado = new Quadrado(lado);

                    System.out.println(branco + "\n\n✽ O que deseja calcular do quadrado? ");
                    System.out.println(ciano + "✽ 1 - Área");
                    System.out.println(roxo+ "✽ 2 - Perímetro"+reset);
                    int escolhaUser = sc.nextInt();

                    switch (escolhaUser) {
                        case 1:
                            area = quadrado.calculoArea();
                            String fraseFinal = String.format("o cálculo da área do quadrado de lado %.02f é igual a %.02f", lado, area);
                            if (area%2==0){
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                        case 2:
                            double perimetro = quadrado.calculoPerimetro();
                            fraseFinal = String.format("o cálculo do perímetro do quadrado de lado %.02f é igual a %.02f", lado, perimetro);
                            if (perimetro%2==0){
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                        }
                        break;
                case 2:
                    System.out.printf("\n\n⚘ %s Insira a base do retângulo: ", nomeUser);
                    base = sc.nextDouble();
                    System.out.printf("\n⚘ %s insira a altura do retângulo: ", nomeUser);
                    altura = sc.nextDouble();
                    Retangulo retangulo = new Retangulo(base, altura);

                    System.out.println("\n\n✽ O que deseja calcular do retângulo?");
                    System.out.println(verde + "✽ 1 - Área");
                    System.out.println(amarelo + "✽ 2 - Perímetro" + reset);
                    escolhaUser = sc.nextInt();

                    switch (escolhaUser){
                        case 1:
                            area = retangulo.calculoArea();
                            String fraseFinal = String.format("o cálculo da área do retângulo de base %.02f e altura %.02f é igual a %.02f", base, altura, area);
                            if (area % 2 == 0 ){
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                        case 2:
                            double perimetro = retangulo.calculoPerimetro();
                            fraseFinal = String.format("o cálculo do perímetro do retângulo de base %.02f e altura %.02f é igual a %.02f", base, altura, perimetro);
                            if (perimetro % 2 == 0) {
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                    }
                    break;

                case 3:
                    System.out.printf("\n\n⚘ %s insira o valor dos lados do triângulo: ", nomeUser);
                    lado = sc.nextInt();
                    Triangulo triangulo = new Triangulo(lado);

                    System.out.println("\n\n✾ O que deseja calcular do triângulo:");
                    System.out.println(ciano + "✾ 1 - Área");
                    System.out.println(roxo + "✾ 2 - Perímetro" + reset);
                    escolhaUser = sc.nextInt();

                    switch (escolhaUser){
                        case 1:
                            area = triangulo.calculoArea();
                            String fraseFinal = String.format("A área do triângulo de lado %.02f é igual a %.02f", lado, area);
                            if (area % 2 == 0) {
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;

                        case 2:
                            double perimetro = triangulo.calculoPerimetro();
                            fraseFinal = String.format ("o perímetro do triângulo de lado %.02f é igual a %.02f", lado, perimetro);
                            if (perimetro % 2 == 0) {
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.printf("\n\n⚘ %s insira o lado do hexagono: ");
                    lado = sc.nextInt();
                    Hexagono hexagono = new Hexagono(lado);

                    System.out.println("❁ O que deseja calcular:");
                    System.out.println("❁ 1 - Área");
                    System.out.println("❁ 2 - Perímetro");
                    escolhaUser = sc.nextInt();

                    switch (escolhaUser){
                        case 1:
                            area = hexagono.calculoArea();
                            String fraseFinal = String.format("a área do hexagono de lado %f.02 é igual a %.02f", lado, area);
                            if (area % 2 == 0) {
                                System.out.println(fraseFinal.toUpperCase());
                            }else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                        case 2:
                            double perimetro = hexagono.calculoPerimetro();
                            fraseFinal = String.format("o perímetro do hexagono de lado %f.02 é igual a %.02f",area, perimetro);
                            if ( perimetro % 2 == 0 ){
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                    }
                    break;

                case 5:
                    System.out.printf("\n\n⚘ %s insira o raio do círculo:", nomeUser);
                    raio = sc.nextDouble();
                    Circulo circulo = new Circulo(raio);

                    System.out.println("❋ Insira o que deseja calcular do raio:");
                    System.out.println("❋ 1 - Área");
                    System.out.println("❋ 2 - Perímetro");
                    escolhaUser = sc.nextInt();

                    switch (escolhaUser){
                        case 1:
                            area = circulo.calculoArea();
                            String fraseFinal = String.format("a área do circulo de raio %f.02 é igual a %.02f", raio, area);
                            if (area % 2 == 0) {
                                System.out.println(fraseFinal.toUpperCase());
                            }else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                        case 2:
                            double perimetro = circulo.calculoPerimetro();
                            fraseFinal = String.format("o perímetro do circulo de raio %f.02 é igual a %.02f",raio, perimetro);
                            if ( perimetro % 2 == 0 ){
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                    }
                    break;
            }
        }else if (tipoFiguras == 2 ){
            try {
                System.out.printf(roxo + "\n\n❀ Vamos trabalhar com figuras espáciais! %s escolha a figura: \n", nomeUser);
                System.out.println(reset + "❀ 1 - Cubo ");
                System.out.println("❀ 2 - Paralelepípedo");
                System.out.println("❀ 3 - Cilindro");
                System.out.println("❀ 4 - Cone");
                System.out.println("❀ 5 - Pirâmide de base Quadrada");
                System.out.println("❀ 6 - Esfera");
                System.out.println(vermelho + "❀ 0 - Sair"+ reset);
                figura = sc.nextInt();
            } catch (Exception e) {
                System.out.println(vermelho + "Caractere inválido!" + reset);
            }

            switch (figura) {
                case 0: {
                    System.out.println(vermelho + "Saindo..." + reset);
                    System.exit(0);
                }
                case 1:
                    System.out.printf("\n\n⚘ %s insira o valor do lado do cubo: ", nomeUser);
                    lado = sc.nextDouble();
                    Cubo cubo = new Cubo(lado);

                    System.out.println("\n ❀ Insira o que deseja calcular:");
                    System.out.println("❀ 1 - volume");
                    System.out.println("❀ 2 - área superficial");
                    int escolhaUser = sc.nextInt();

                    switch (escolhaUser){
                        case 1:
                            volume = cubo.calculoVolume();
                            String fraseFinal = String.format("o volume do cubo de lado %.02f é igual a %.02f",lado,volume);
                            if (volume % 2 == 0){
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                        case 2:
                            area = cubo.areaSuperficial();
                            fraseFinal = String.format("a área superficial do cubo de lado %.02f é igual a %.02f",lado,area);
                            if (area % 2 == 0 ){
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.printf("\n\n⚘ %s Insira a altura do paralelepípedo:", nomeUser);
                    altura = sc.nextDouble();

                    System.out.printf("⚘ %s Insira o comprimento do paralelepípedo:", nomeUser);
                    double comprimento = sc.nextDouble();

                    System.out.printf("\n\n⚘ %s Insira a largura do paralelepípedo:", nomeUser);
                    double largura = sc.nextDouble();

                    Paralelepipedo paralelepipedo = new Paralelepipedo(comprimento, altura, largura);

                    System.out.println("✿ Agora insira o que deseja calcular:");
                    System.out.println("✿ 1 - Volume");
                    System.out.println("✿ 2 - Área superficial");
                    escolhaUser = sc.nextInt();

                    switch (escolhaUser) {
                        case 1:
                           volume = paralelepipedo.calculoVolume();
                            String fraseFinal = String.format("O volume do paralelepípedo de altura %.2f, largura %.2f e comprimento %.2f é igual a %.2f.", altura,largura,comprimento,volume);
                            if (volume % 2 == 0 ) {
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                        case 2:
                            double areaSuperficial = paralelepipedo.calculoArea();
                            fraseFinal = String.format("A área superficial do paralelepípedo de altura %.2f, largura %.2f e comprimento %.2f é igual a %.2f.", altura,largura,comprimento,areaSuperficial);
                            if (areaSuperficial % 2 == 0 ) {
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                    }

                    break;

                case 3:
                    System.out.printf("⚘ %s insira o raio do cilindro: ", nomeUser);
                    raio = sc.nextDouble();
                    System.out.printf("⚘ %s insira a altura do cilindro: ", nomeUser);
                    altura = sc.nextDouble();

                    Cilindro cilindro = new Cilindro(raio, altura);
                    System.out.println("✿ Agora insira o que deseja calcular:");
                    System.out.println("✿ 1 - Volume");
                    System.out.println("✿ 2 - Área Superficial");
                    escolhaUser = sc.nextInt();

                    switch (escolhaUser){
                        case 1:
                            volume = cilindro.calculoVolume();
                            String fraseFinal = String.format("O volume do cilindro de altura %.2f e raio %.2f é igual a %.2f", altura, raio,volume);
                            if (volume % 2 == 0 ){
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                        case 2:
                            area = cilindro.calculoArea();
                            fraseFinal = String.format("A área do cilindro de altura %.2f e raio %.2f é igual a %.2f", altura, raio,area);
                            if (area % 2 ==0){
                                System.out.println(fraseFinal.toUpperCase());
                            } else  {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                    }
                    break;

                case 4:
                    System.out.printf("⚘ %s insira a geratriz do cone:", nomeUser);
                    double geratriz = sc.nextDouble();
                    System.out.printf("⚘ %s insira a altura do cone:", nomeUser);
                    altura = sc.nextDouble();
                    System.out.printf("⚘ %s insira o raio do cone:", nomeUser);
                    raio = sc.nextDouble();
                    Cone cone = new Cone(altura, geratriz,raio);

                    System.out.println("✿ Agora insira o que deseja calcular:");
                    System.out.println("✿ 1 - Volume");
                    System.out.println("✿ 2 - Área Superficial");
                    escolhaUser = sc.nextInt();

                    switch (escolhaUser){
                        case 1:
                            volume = cone.calculoVolume();
                            String fraseFinal = String.format("O volume do cone com o raio %.02f, altura %.2f e geratriz %.2f é igual a %.02f. ", raio, altura, geratriz, volume);
                            if (volume % 2 == 0) {
                                System.out.println(fraseFinal.toUpperCase());
                        } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                        case 2:
                            area = cone.calculoArea();
                            fraseFinal = String.format("A área do cone com o raio %.02f, altura %.2f e geratriz %.2f é igual a %.02f. ", raio, altura, geratriz, area);
                            if (volume % 2 == 0) {
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                    } break;

                case 5:
                    System.out.printf("⚘ %s insira a altura da pirâmide:", nomeUser);
                    altura = sc.nextDouble();

                    System.out.printf("⚘ %s insira a apótema da pirâmide:", nomeUser);
                    double apotema = sc.nextDouble();

                    System.out.printf("⚘ %s insira a aresta da base da pirâmide:", nomeUser);
                    double aresta = sc.nextDouble();

                    Piramide piramide = new Piramide(altura, apotema, aresta);

                    System.out.println("✿ Agora insira o que deseja calcular:");
                    System.out.println("✿ 1 - Volume");
                    System.out.println("✿ 2 - Área Superficial");
                    escolhaUser = sc.nextInt();

                    switch (escolhaUser) {
                        case 1:
                            volume = piramide.calculoVolume();
                            String fraseFinal = String.format("O volume da pirâmide de base quadrada com altura de %.2f, apótema de %.2f e aresta da base %.2f é igual a %.2f.", altura, apotema, aresta, volume);
                            if (volume % 2 == 0 ) {
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                        case 2:
                            area = piramide.calculoArea();
                            fraseFinal = String.format("A área superficial da pirâmide de base quadrada com altura de %.2f, apótema de %.2f e aresta da base %.2f é igual a %.2f.", altura, apotema, aresta, area);

                            if (area % 2 == 0){
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                    }
                    break;
                case 6:
                    System.out.printf("⚘ %s insira o raio da esfera:", nomeUser);
                    raio = sc.nextDouble();

                    Esfera esfera = new Esfera(raio);
                    System.out.println("✿ Agora insira o que deseja calcular:");
                    System.out.println("✿ 1 - Volume");
                    System.out.println("✿ 2 - Área Superficial");
                    escolhaUser = sc.nextInt();

                    switch (escolhaUser) {
                        case 1:
                            volume = esfera.calculoVolume;
                            String fraseFinal = String.format("O volume da esfera de raio %.2f é igual a %.2f.", raio, volume);

                            if (volume % 2 == 0) {
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                        case 2:
                            area = esfera.calculoArea();
                            fraseFinal = String.format("A área superficial da esfera de raio %.2f é igual a %.2f.", raio, area);

                            if (area % 2 == 0 ) {
                                System.out.println(fraseFinal.toUpperCase());
                            } else {
                                System.out.println(fraseFinal.toLowerCase());
                            }
                            break;
                    }
                break;
            }
        } else if (tipoFiguras == 0){
                System.out.println(vermelho + "\n\nSaindo..."+reset);
                System.exit(0);

            } else {
            System.out.println(vermelho + "Tente novamente..." +reset);
            }
        }
    }
}
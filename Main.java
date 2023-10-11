public class Main {
    public static void atividade1(String nome) {
        System.out.println("Meu nome é: " + nome);
    }

    public static void atividade2(double num1, double num2) {
        double soma = num1 + num2;
        double subtracao = num1 - num2;

        double divisao = num1 / num2;
        double restoDivisao = num1 % num2;

        System.out.println("\nSoma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da Divisão: " + restoDivisao);
    }

    public static void atividade3(int idade){
        if(idade >= 16){
            System.out.println("\nVocê pode realizar o pedido!!");
        } else {
            System.out.println("\nVocê não pode efetuar a compra");
        }
    }
    public static void atividade4(String bairro) {
        if (bairro == "Sao Paulo") {
            System.out.println("\nfrete grátis");
        } else if(bairro == "Rio de janeiro") {
            System.out.println("\nvalor de frete = 14.00 R$");
        } else if (bairro == "Mina Gerais") {
            System.out.println("\nvalor de frete = 10.00 R$");
        } else{
            System.out.println("\nEntrega não disponivel para seu estado");
        }
    }

    public static void atividade5(String veiculo){
        double valor;
        double entrada;
        double parcelas;
        if (veiculo == "corsa"){
            valor = 100000.00;
            entrada = 0.3 * valor;
            parcelas = (0.7 * valor) /12;
            System.out.println("O veiculo: " + veiculo +
                    "\n O valor do veiculo é " + valor
                    + "\n A entrada é " + entrada +
                    "\n O valor da parcela em 12x é de " + parcelas);
        } else if (veiculo == "uno") {
            valor = 120000.00;
            entrada = 0.3 * valor;
            parcelas = (0.7 * valor) /12;
            System.out.println("\n O veiculo: " + veiculo +
                    "\nO valor do veiculo é R$" + valor
                    + "\nA entrada é R$" + entrada +
                    "\nO valor da parcela em 12x é de R$" + parcelas);

        } else{
            System.out.println("veiculo não disponivel");
        }


    }
    public static void atividade6 (int pessoas, int peixes){
        int peixesExtras;
        int entrada = pessoas * 14;
        int total = entrada + peixes;
        System.out.println("\nValor de entrada por pessoas deu R$" + entrada);
        if(peixes <= 0){
            System.out.println("sem peixes extras");
        } else{
            peixesExtras = peixes * 12;
            System.out.println("o valor dos peixes extras pedidos deu: RS$" + peixesExtras);
        }
        System.out.println("valor total é de: R$" + total);
    }

    public static void atividade7(int pesoCachorro, int pesoRacao) {

        int pesoRacaoKG = pesoRacao * 1000;
        int calculaRacaoGrama = (pesoCachorro * 11) + 70;
        float racaoDia = pesoRacaoKG / calculaRacaoGrama;
        if(pesoCachorro <= 1){
            System.out.println("seu cachorro está muito novo para comer ração");
        } else{
            System.out.println("\nseu cachorro tem " + pesoCachorro + "kg, portanto ele come " +
                    calculaRacaoGrama + "g de ração por dia, então essa ração vai durar por " +
                    racaoDia + " dias" );
        }
    }

        public static void main (String[]args){
            String nome = "Rodrigo";
            atividade1(nome);

            atividade2(10, 5);

            atividade3(17);
            atividade4("Sao Paulo");
            // tem que digitar: Sao paulo || Minas gerais || Rio de janeiro
            // vai aparecer que a cidade não esta disponivel se n for uma dessas

            atividade5("uno");
            // veiculos: uno || corsa
            // outro: veiculo não disponivel

            atividade6(4, 0);

            atividade7(4, 2);
            /*peso ração por kg*/
        }
    }
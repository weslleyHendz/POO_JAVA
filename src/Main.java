import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // descomente as linhas abaixo para conferir os métodos
        // calcDesconto();  //1
        // calcITBI();      //2
        // notaFinal();     //3
        // aposentadoria(); //4
        // circuito();      //6
        // checkLogin();    //7
        // tabuada();       //8
    }
    public static void calcDesconto () {
        System.out.println("Exercício 1 " +
                "\nUsando a classe Scanner para entrada de dados, crie uma classe que receba o valor de um produto e a porcentagem de desconto," +
                "\ncalcule e mostre o valor do desconto e o valor do produto com o desconto. " +
                "\nObservação: o valor do desconto é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de desconto / 100");

        Scanner inputs = new Scanner(System.in);

        System.out.println("\nDigite o valor do produto: ");
        float productAmount = inputs.nextFloat();

        System.out.println("\nDigite um valor percentual para calcular o desconto: ");
        float percentDiscountAmount = inputs.nextFloat();

        float calculateAmount = productAmount * percentDiscountAmount / 100;

        System.out.println("\nO produto recebeu desconto de: R$ " + calculateAmount);
        System.out.println("O valor final do produto é de: R$ "  + (productAmount - calculateAmount));
    };
    public static void calcITBI () {
        JOptionPane.showMessageDialog( null, "Exercício 2 " +
                "Imposto sobre a Transmissão de Bens Móveis (ITBI) é aplicado sobre o valor de um imóvel a ser negociado. " +
                "\nA base de cálculo do ITBI (o valor a ser considerado no cálculo) será o maior valor entre o valor de transação (o valor negociado) e o valor venal de referência (fornecido pela Prefeitura). " +
                "\nCom base nisso, elabore uma classe que receba o valor da transação, o valor venal e o percentual de imposto. " +
                "\nApós isso, encontre o maior valor e aplique o percentual sobre ele. Ao final, apresente o valor do imposto a ser pago. " +
                "\nObservação: o valor do imposto a ser pago é calculado por meio da fórmula: valor do imposto = maior valor * percentual / 100. " +
                "\nPara entrada e saída de dados utilize a classe JOptionPane.");

            String initText = JOptionPane.showInputDialog("Qual o valor da venda?");
            float saleAmount = Float.parseFloat(initText);

            String inputAmountVenal = JOptionPane.showInputDialog("Qual o valor venal da propriedade?");
            float valorVenal = Float.parseFloat(inputAmountVenal);

            String inputPercentualITBI = JOptionPane.showInputDialog("Qual o percentual de ITBI a ser aplicado?");
            float percentualITBI = Float.parseFloat(inputPercentualITBI);

            if (saleAmount >= valorVenal) {
                JOptionPane.showMessageDialog(null,"O valor de imposto foi calculado sobre o valor da venda. " +
                        "\nO valor é de: R$" + saleAmount * percentualITBI / 100);
            } else {
                JOptionPane.showMessageDialog(null,"O valor de imposto foi calculado sobre o valor venal" +
                        "\nO valor é de: R$" + valorVenal * percentualITBI / 100);
            }
        };
    public static void notaFinal () {
        JOptionPane.showMessageDialog( null, "Exercício 3 " +
                "\nUsando a classe JOptionPane para entrada de dados, elabore uma classe que receba a nota de duas provas e de um trabalho." +
                "\nCalcule e mostre a média e o resultado final (aprovado ou reprovado). " +
                "\nPara calcular a média utilize a fórmula seguinte: média = (nota da prova 1 + nota da prova 2 + nota do trabalho) / 3. " +
                "\nConsidere que a média mínima para aprovação é 6. ");

        String textTest1 = JOptionPane.showInputDialog("Digite a nota da prova 1: ");
        float valueTest1 = Float.parseFloat(textTest1);

        String textTest2 = JOptionPane.showInputDialog("Digite a nota da prova 2: ");
        float valueTest2 = Float.parseFloat(textTest2);

        String textTest3 = JOptionPane.showInputDialog("Digite a nota do trabalho: ");
        float valueTest3 = Float.parseFloat(textTest3);

        float finalNote = (valueTest1 + valueTest2 + valueTest3) / 3 ;

//        JOptionPane.showMessageDialog( null, "Média final. " +finalNote);
        if(finalNote > 6){
            JOptionPane.showMessageDialog( null, "Média final. " +finalNote + " você está APROVADO");
        }else{
            JOptionPane.showMessageDialog( null, "Média final. " +finalNote + " você está REPROVADO");
        }
    };
    public static void aposentadoria () {
        JOptionPane.showMessageDialog( null, "Exercício 4 " +
                "\nConsidere a seguinte informação a respeito do cálculo da aposentadoria. " +
                "\nPara se aposentar por idade, as mulheres precisam ter atingido 60 anos de idade e os homens, 65. " +
                "\nJá na aposentadoria por tempo de contribuição, o tempo mínimo exigido é de 30 anos para as mulheres e de 35 anos para os homens. " +
                "\nCom base nessas informações, elabore uma classe que receba a idade de uma pessoa, seu sexo e a quantidade de anos de contribuição. " +
                "\nA seguir, calcule a quantidade de anos que falta de contribuição para se aposentar, ou então emita a mensagem: “você já tem o direito a aposentadoria”. ");

        String yearsOld = JOptionPane.showInputDialog("Digite a sua idade: ");
        float valueTest1 = Float.parseFloat(yearsOld);

        int sexo = JOptionPane.showOptionDialog(
                null,
                "Informe seu sexo:",
                "Escolha uma opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                new String[] {"Masculino", "Feminino"}, 0
        );

        String contribuition = JOptionPane.showInputDialog("Digite o tempo de contribuição: ");
        float valueTest3 = Float.parseFloat(contribuition);

        if(sexo  == 0){
            float timeMasc = Float.sum(35, - valueTest3 );
            if(timeMasc <= 0){
                JOptionPane.showMessageDialog( null, "Você já tem o direito a aposentadoria!");
            } else{
                JOptionPane.showMessageDialog( null, "Faltam " + timeMasc + " anos para você se aposentar!");
            }
        }else if( sexo == 1){
            float timeFem = Float.sum(30, - valueTest3 );
            if(timeFem <= 0){
                JOptionPane.showMessageDialog( null, "Você já tem o direito a aposentadoria!");
            } else{
                JOptionPane.showMessageDialog( null, "Faltam " + timeFem + " anos para você se aposentar!");
            }
        }
    };
    public static void circuito () {
        JOptionPane.showMessageDialog(null,"Exercício 6");

        float resistenciaEquivalente = 0;

        float menorRessitencia = 0;

        float maiorResistencia = 0;

        for (int i = 0; i < 4; i++) {
            float resistenciaAtual = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da resistência\n"));

            resistenciaEquivalente = resistenciaAtual + resistenciaEquivalente;

            if (i == 0) {
                menorRessitencia = resistenciaAtual;
                maiorResistencia = resistenciaAtual;
            }
            if (maiorResistencia < resistenciaAtual) {
                maiorResistencia = resistenciaAtual;
            }
            if (menorRessitencia > resistenciaAtual) {
                menorRessitencia = resistenciaAtual;
            }
        }

        System.out.println("A resistência equivalente deste circuíto é: " + resistenciaEquivalente);
        System.out.println("A menor resistência deste circuíto é: " + menorRessitencia);
        System.out.println("A maior resistência deste circuíto é: " + maiorResistencia);
    }

    public static void checkLogin() {
        final String LOGIN_CORRETO = "java";
        final String SENHA_CORRETA = "java123";

        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            String login = JOptionPane.showInputDialog("Digite o login:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");

            if (login.equals(LOGIN_CORRETO) && senha.equals(SENHA_CORRETA)) {
                JOptionPane.showMessageDialog(null, "Acesso permitido!");
                return;
            } else {
                tentativasRestantes--;
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tentativas restantes: " + tentativasRestantes);
            }
        }

        JOptionPane.showMessageDialog(null, "Tentativas esgotadas. Acesso bloqueado!");

    }
    public static void tabuada() {
        int numero = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número para calcular a tabuada do 1 ao 10: ");
            numero = scanner.nextInt();
        }

        System.out.printf("Tabuada do %d:\n\n", numero);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\t%d\tX\t%d\t=\t%d\n", i, numero, i * numero);
        }
    }

};


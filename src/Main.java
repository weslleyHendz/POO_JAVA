import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        calcDesconto();
        calcITBI();
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
    };


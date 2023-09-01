import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        //Declarando Scanner e variáveis
        Scanner terminal = new Scanner(System.in);
        int parametroUm, parametroDois;

        //Entrada de dados
        System.out.print("Digite o primeiro parâmetro: ");
        parametroUm = terminal.nextInt();

        System.out.print("\nDigite o segundo parâmetro: ");
        parametroDois = terminal.nextInt();

        System.out.println();

        try{
            //Comportamento esperado
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception){

            //Mensagem em caso de exception
            System.out.println("O segundo parêmtro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //Cálculo da diferença entre parêmetros
        int diferenca = parametroDois - parametroUm;

        //Verifica se o segundo parâmtro é maior que o primeiro e lança a exceção
        if(diferenca < 1){
            throw new ParametrosInvalidosException();
        }

        //Rotina que imprime a contagem de 1 até a diferença entre parâmetros
        for(int indice = 1; indice <= diferenca; indice++){
            System.out.println("Imprimindo o número " + indice);
        }
    }
}
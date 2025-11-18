package academy.devdojo.maratonajava.introducao;

/**
 * Pática:
 * Crie variáveis entre <> e concateneas formando uma frase:
 * Eu <nome>, morando no endereço <endereço>, confirmo que
 * recebi o salário de <salário>, na data: <data>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Weverton inácio";
        String endereco = "Mato-grosso city";
        double salario = 18.378;
        String dataRecebimento = "17/11/2025.";

        String relatorio = "Eu " + nome + ", morando no endereço: " + endereco +
                ", confirmo que recebi o sálario de " + salario + " na data: " + dataRecebimento;
        System.out.println(relatorio);

        //Posso também imprimir desta forma:
        /*System.out.println("Eu " + nome + ", morando no endereço: " + endereco +
        ", confirmo que recebi o sálario de " + salario + " na data: " + dataRecebimento);*/
    }

}

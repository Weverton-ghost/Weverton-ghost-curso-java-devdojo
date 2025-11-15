package academy.devdojo.maratonajava.introducao;

/**
 * camelCase: variáveis, parâmetros, métodos.
 * PascalCase: classes, interfaces, enums e records.
 * CONSTANT_CASE: constantes.
 */

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        //int, double, float, char, byte, short, long, boolean.

        //Inteiros | diferença geral - (Tamanho);
        int minhaIdade = 20;
        long numeroGrande = 1000000;

        //Decimais;
        double salarioDouble = 3000;
        float salarioFloat = 2500;

        //Valores menores;
        byte idadeByte = 16;
        short idadeShort = 15;

        //True ou false;
        boolean verdadeiro = true;
        boolean falso = false;

        //Letras e sobre tabelas;
        char caractere = 'E';
        char caractereAscii = 87;
        char caracetereUnicode = '\u0042';

        System.out.println("Minha idade é: " + minhaIdade + " anos.");
        System.out.println(verdadeiro);
        System.out.println(caractereAscii);
        System.out.println(caractere);

    }
}

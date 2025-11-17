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
        long numeroGrande = 1000000L;

        //Decimais;
        double salarioDouble = 3000.00D;
        float salarioFloat = 2500.00F;

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

        //Castings - não é prática tão boa, melhor trocar o tipo.

        //Casting explícito com overflow = estouro;
        int arteAntiga;
        arteAntiga = (byte) 150;
        System.out.println(arteAntiga);

        int castingExemplo = (int) 1000000000000000L; //Número long
        System.out.println(castingExemplo);

        //Casting implicito
        int valorArte = 290;
        long arteAntiga2 = valorArte;
        System.out.println(arteAntiga2);
        //Só recebe o valor, não altera o limite.

    }
}

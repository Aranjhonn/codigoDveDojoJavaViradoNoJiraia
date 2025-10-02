package academy.devdojo.maratonajava.introducao;

/*
    Prática

    Crie variáveis para os campos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereco>,
    confirmo que recebi o salário de <salario>. na data <data>
 */

import java.util.Date;

public class Aula03TiposPrimitivosExercicios {

    public static void main(String[] args) {
        String nome = "Aranjhonn Araujo";
        String endereco = "João Alves Acavalcante - 40";
        double salario = 5431.12;
        String dataRecebimentoSalario = "01/12/2025";
        String relatorio = "Eu " + nome +
                " morando no endereço " + endereco +
                " confirmo que recebi o salário de " + salario +
                ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }


}

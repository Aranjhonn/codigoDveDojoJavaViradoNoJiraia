package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        // Não vai ser utilizado, mas saiba que existe em provas de certificação
        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }


        System.out.println("Fora do if");
    }
}

























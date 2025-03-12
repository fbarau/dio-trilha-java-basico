public class Operadores {

    public static void main(String[] args) {

        String primeiroNome = "FERNANDA";
        String segundoNome = new String("FERNANDA");

        System.out.println(primeiroNome.equals(segundoNome));

        int numero1 = 1;
        int numero2 = 2;

        boolean SimNao = numero1 == numero2;

        System.out.println("NumeroUm é igual a NumeroDois? " + SimNao);

        SimNao = numero1 != numero2;

        System.out.println("NumeroUm é diferente a NumeroDois? " + SimNao);

        SimNao = numero1 > numero2;

        System.out.println("NumeroUm é maior que o NumeroDois? " + SimNao);
    }
}
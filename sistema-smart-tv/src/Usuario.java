public class Usuario {
    public static void main(String[] args) throws Exception {

        // Exercício

        SmartTv smartTv = new SmartTv();

        System.out.println("Canal Atual? " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual? " + smartTv.canal);
    }
}

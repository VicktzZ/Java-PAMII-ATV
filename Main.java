public class Main {
    public static void main(String[] args) {
        Cachorro spike = new Cachorro("Spike","Husky", "https://huskyfoto.exemplo", 23.2, 50.8);
        Coruja rolinha = new Coruja("Rolinha", "Coruja das montanhas", "https://corujafoto.exemplo", 1.4, 3.1);
        Galinha gertrudes = new Galinha("Gertrudes", "Galinha-da-angola", "https://galinhafoto.exemplo", 1.2, 4);

        spike.fazerBarulho();
        rolinha.fazerBarulho();
        gertrudes.fazerBarulho();

        System.out.println();

        spike.comer("cenoura frita");
        rolinha.dormir();

        System.out.println();

        rolinha.voar();
        gertrudes.botarOvo();
    }
}

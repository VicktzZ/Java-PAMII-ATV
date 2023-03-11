public class Galinha extends Ave {

    public Galinha(String nome, String raca, String foto, double peso, double medida) {
        super(nome, raca, foto, peso, medida);
    }

    @Override
    public void fazerBarulho() {
        System.out.println(this.nome + " disse cocó!");
    }
}

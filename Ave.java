public abstract class Ave extends Animal {

    public Ave(String nome, String raca, String foto, double peso, double medida) {
        super(nome, raca, foto, peso, medida);
    }

    public void voar() {
        System.out.println(this.nome + " está voando!");
    }

    public void botarOvo() {
        System.out.println(this.nome + " botou um ovo!");
    }
    
    public abstract void fazerBarulho();
}

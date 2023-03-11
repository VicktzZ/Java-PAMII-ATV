public abstract class Animal {
    public String nome, raca, foto;
    public double peso, medida;

    public Animal(String nome, String raca, String foto, double peso, double medida) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.foto = foto;
        this.medida = medida;
    }

    //  Getters

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public String getFoto() {
        return foto;
    }

    public String getRaca() {
        return raca;
    }

    public double getMedida() {
        return medida;
    }

    //  Setters

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Métodos

    public void comer(String comida) {
        System.out.println(this.nome + " está comendo " + comida + "...");
    }

    public void dormir() {
        System.out.println(this.nome + " está dormindo...");
    }

    public void seMovimentar() {
        System.out.println("Estou me movimentando... ");
    }

    public abstract void fazerBarulho();
}
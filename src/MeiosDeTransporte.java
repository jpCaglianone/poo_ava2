
abstract class MeiosDeTransporte {
    private int CapacidadeTanque;
    private int NumeroPassageiros;
    private float Preco;

    MeiosDeTransporte() {
    }

    MeiosDeTransporte(int var1, int var2, float var3) {
        this.setCapacidadeTanque(var1);
        this.setNumeroPassageiros(var2);
        this.setPreco(var3);
    }

    public void imprimir() {
        System.out.println("Capacidade do Tanque: " + this.getCapacidadeTanque());
        System.out.println("Número de Passageiros: " + this.getNumeroPassageiros());
        System.out.println("Preço: " + this.getPreco());
    }

    public void setCapacidadeTanque(int var1) {
        this.CapacidadeTanque = var1;
    }

    public int getCapacidadeTanque() {
        return this.CapacidadeTanque;
    }

    public void setNumeroPassageiros(int var1) {
        this.NumeroPassageiros = var1;
    }

    public int getNumeroPassageiros() {
        return this.NumeroPassageiros;
    }

    public void setPreco(float var1) {
        this.Preco = var1;
    }

    public float getPreco() {
        return this.Preco;
    }
}

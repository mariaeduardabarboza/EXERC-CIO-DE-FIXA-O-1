public class Lutador {
    public String nome;
    public int energia;
    public int forca;

    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    public void aplicarGolpe(Lutador inimigo) {
        System.out.println(this.nome+" aplicou golpe em "+ inimigo.nome+".");
        reduzirEnergia(inimigo);
    }

    public void reduzirEnergia(Lutador inimigo) {
        inimigo.energia = inimigo.energia - this.forca;
    }
    
}

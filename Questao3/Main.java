 public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println();
        Lutador ryu = new Lutador("Ryu",100,10);
        Lutador bison = new Lutador("Bison",100,12);
        ryu.aplicarGolpe(bison);
        ryu.aplicarGolpe(bison);
        ryu.aplicarGolpe(bison);

        System.out.println();
        System.out.println("Bison está com: "+bison.energia+" de energia.");

        System.out.println();    
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        
        System.out.println();
        System.out.println("Ryu está com: "+ryu.energia+" de energia.");

    }
}

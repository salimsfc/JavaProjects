
package uscs;


public class TestaEletrodomestico {
    
    public static void main(String[] args) {
        Eletrodomestico e1 = new Eletrodomestico(2020, "M25", 2500, "Preto");
        //Eletrodomestico e2 = new Eletrodomestico();
        //e1.ligar();
        e1.getValor();
        //e1.desligar();
        e1.setValor(2000);
        e1.getValor();
    }
    
}

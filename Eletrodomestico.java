
package uscs;

public class Eletrodomestico {
    
    //atributos
    public int ano;
    public String modelo;
    public float valor;
    public String cor;
    
    //metodos
    public Eletrodomestico(){
        
    }
    
    public Eletrodomestico(int ano, String modelo, float valor, String cor){
        this.ano = ano;
        this.modelo = modelo;
        this.valor = valor;
        this.cor = cor;
        
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public void getValor(){
        System.out.println("Valor: " + valor);
    }
    
    public void ligar(){
        System.out.println("Ligando...");
        
    }    
    
    public void desligar(){
        System.out.println("Desligando...");
        
    }
    public void descricao(){
        System.out.println("\nAno: " + ano);
        System.out.println("\nModelo: " + modelo);
        System.out.println("\nValor: " + valor);
        System.out.println("\nCor: " + cor);
    }
}

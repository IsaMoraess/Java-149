public class Caneta{
    //ATRIBUTOS
    public String modelo;
    private String cor;
    private double ponta;
    private boolean tampada;

    //METODO CONSTRUTOR
    public Caneta(String m, String c, double p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    //METODOS GETTERS E SETTERS
    /*É uma referência ao próprio objeto atual em execução. 
    Ele é usado dentro de métodos para acessar atributos e métodos do objeto, 
    especialmente quando há ambiguidade entre nomes de variáveis locais e 
    atributos da classe. */
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public double getPonta() {
        return this.ponta;
    }
    public void setPonta(double p) {
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    //STATUS
    public void status(){
        System.out.println("---SOBRE A CANETA--- ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
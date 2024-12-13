public class metodo{
    public static void main(String args[]){
        //INSTANCIAR A CLASSE
        Caneta c1 = new Caneta("Bic", "Vermelho", 0.3);

        /*c1.setModelo("BIC"); // metodo acessor
        //c1.modelo = "BIC"; //acessar diretamente o atributo

        c1.setPonta(0.5);
        //c1.ponta = 0.5; //ñ aceita pq e privada*/

        c1.status();
    }
}
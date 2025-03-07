import vetor.Vetor1;

public class App {
    public static void main(String[] args) throws Exception {
        Vetor1 v1 = new Vetor1(5);

        v1.exibir(); 

        int [] valores = {10,20,30,40,50};
        for (int valor : valores){
            v1.addTodos(valor);
        
        }
        v1.exibir();
        System.out.println("Indice 2 = " + v1.getElemento(2));
        v1.removerPorIndice(2);
        System.out.println("Tamanho = " + v1.getTamanho());
        System.out.println("----------------------------");

    }
}
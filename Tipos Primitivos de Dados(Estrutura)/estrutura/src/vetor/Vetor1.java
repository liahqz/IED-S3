// criar pasta "vetor" dentro da "src"
package vetor;

public class Vetor1 {
    private int[] elementos; // vetor, []
    private int tamanho; // variável

    public Vetor1 (int capacidade){
        this.elementos = new int [capacidade];
        this.tamanho = 0;
    }
     
    public void add (int elemento){

        if (tamanho < elementos.length) { // equanto tamanho < tamanho dos elementos, será feito:
        elementos[tamanho] = elemento;
        tamanho++;

    }
        else{

            System.out.println ("Vetor cheio!");

    }

    }

    public void exibir(){
        System.out.println ("Vetor");

        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i] + " "); 

        }

    }

}
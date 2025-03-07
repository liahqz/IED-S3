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

    public void addTodos (int... elementos){
        for (int elemento : elementos){
            add(elemento);
        }
    }

    //Remover pelo índice
    public void removerPorIndice(int indice){
        if(indice < 0 || indice >= tamanho){
            System.out.println("Indice Inválido!");
            return;
        }
        for(int i = indice; i < tamanho-1; i++){
            elementos[i] = elementos [i+1];
        }
        tamanho--;
    }




    //Pegar elementos
    public int getElemento (int indice){
        if (indice >= 0 && indice < tamanho ){
            return elementos[indice];
        }
        throw new IndexOutOfBoundsException("Indice Inválido" + indice);
    }

    public int getTamanho(){
        return tamanho;
    }

    public void exibir(){
        System.out.println ("Vetor");

        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i] + " "); 

        }

    }

}
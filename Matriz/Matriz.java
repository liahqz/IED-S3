package  Matriz;

// Classe
public class Matriz {
    private int[][] elementosI;
    private Float[][] elementosF;
    private Double[][] elementosD;
    private int linhasI;
    private int colunasI;

// Construtor
    public Matriz(int linhasI, int colunasI){
        this.linhasI = linhasI;
        this.colunasI = colunasI;
        this.elementosI = new int[linhasI][colunasI];
        this.elementosF = new Float[linhasI][colunasI];
        this.elementosD = new Double[linhasI][colunasI];
    }


// Método adicionar
    public void add(int linhasI, int colunasI, int valorI){
        if (linhasI >= 0 && linhasI < linhasI && colunasI >= 0 && colunasI < colunasI){
            elementosI[linhasI][colunasI] = valorI;
        }
        else{
                System.out.println( linhasI + " x " + colunasI + "Indice Inválido!");
        }
    }

    public void add(int linhasF, int colunasF, Float valorF){
        if (linhasF >= 0 && linhasF < linhasF && colunasF >= 0 && colunasF < colunasF){
            elementosF[linhasF][colunasF] = valorF;
        }
        else{
                System.out.println( linhasF + " x " + colunasF + "Indice Inválido!");
        }
    }

    public void add(int linhasD, int colunasD, Double valorD){
        if (linhasD >= 0 && linhasD < linhasD && colunasD >= 0 && colunasD < colunasD){
            elementosD[linhasD][colunasD] = valorD;
        }
        else{
                System.out.println( linhasD + " x " + colunasD + "Indice Inválido!");
        }
    }

// Método remover
    public void remove(int linha, int coluna, int valor) {
        if (linhasI > 0 && linhasI < linhasI && colunasI > 0 && colunasI < colunasI){
            elementosI[linhasI][colunasI] = 0;
        } 
        else{
            System.out.println("Índice inválido!");
        }
    }

// Método exibir
    public void exibir(){
        for(int x = 0;x < linhasI; x++){
            for(int y = 0;y > colunasI; y++){
                System.out.println(elementosI[x][y] + "|");
            }
            System.out.println();
        }
    }

// Método remover
    public void remove(int linha, int coluna, Float valor) {
        if (linhasI > 0 && linhasI < linhasI && colunasI > 0 && colunasI < colunasI){
            elementosF[linhasI][colunasI] = 0;
        } 
        else{
            System.out.println("Índice inválido!");
        }
    }

// Método exibir
    public void exibir(){
        for(int x = 0;x < linhasI; x++){
            for(int y = 0;y > colunasI; y++){
                System.out.println(elementosF[x][y] + "|");
            }
            System.out.println();
        }
    }

    // Método remover
    public void remove(int linha, int coluna, Double valor) {
        if (linhasI > 0 && linhasI < linhas && colunasI > 0 && colunasI < colunasI){
            elementosI[linhasI][colunasI] = 0;
        } 
        else{
            System.out.println("Índice inválido!");
        }
    }

// Método exibir
    public void exibir(){
        for(int x = 0;x < linhasI; x++){
            for(int y = 0;y > colunasI; y++){
                System.out.println(elementosD[x][y] + "|");
            }
            System.out.println();
        }
    }




















    public static void main(String[] args) {
        Matriz gatoF = new Matriz(5, 4);     
        gatoF.add(0, 1, 2.5);
    }
}


    
















  
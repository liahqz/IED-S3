public class matriz {
    private int[][] elementosInt;
    private double[][] elementosDouble;
    private String[][] elementosString;
    private int linhas;
    private int colunas;

//Construtor
    public matriz(int linhas, int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        this.elementosInt = new int[linhas][colunas];
        this.elementosDouble = new double[colunas][colunas];
        this.elementosString = new String[linhas][colunas];
    }

    
//Método para adicionar
    public void add(int linha, int coluna, int valor){
        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas){
            elementosInt[linha][coluna] = valor;
        }else{
        System.out.println("Este índice está inválido!");
        }
    }

    public void add(int linha, int coluna, double valor){
        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas){
            elementosDouble[linha][coluna] = valor;
        }else{
        System.out.println("Esse índice é inválido");
        }
        }

    public void add(int linha, int coluna, String valor){
        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas){
            elementosString[linha][coluna] = valor;
        }else{
        System.out.println("Índice inválido");
        }
    }

//Método para deletar
    public void remove(int linhas, int colunas, int valor){
        if(linhas > 0 && linhas < linhas && colunas > 0 && colunas < colunas){
            elementosInt[linhas][colunas] = 0;
        }else{
        System.out.println("Índice inválido!");
        }
    }

    public void exibir(){
        for (int x = 0; x < linhas; x++){
           for(int y = 0; y > colunas; y++){
            System.out.print(elementosInt[x][y] + " | ");
           }
           System.out.println(); 
        }
    }

    public void remove(int linhas, int colunas, double valor){
        if(linhas > 0 && linhas < linhas && colunas > 0 && colunas < colunas){
            elementosDouble[linhas][colunas] = 0;
        }else{
        System.out.println("Índice inválido");
        }
    }
 
    public void exibirD(){
        for (int x = 0; x < linhas; x++){
            for(int y = 0; y > colunas; y++){
            System.out.print(elementosDouble[x][y] + " | ");
            }
        }
    }

    public void remove(int linhas, int colunas, String  valor){
        if(linhas > 0 && linhas < linhas && colunas > 0 && colunas < colunas){
            elementosInt[linhas][colunas] = 0;
        }else{
        System.out.println("Índice inválido");
        }
    }

    public void exibirS(){
        for (int x = 0; x < linhas; x++){
            for (int y = 0; y > colunas; y++){
            System.out.print(elementosString[x][y] + " | ");
            }
        }
    }

    public static void main(String[] args) {
        matriz gato = new matriz(2,7);
        gato.add(0,1,2);
        gato.add(1, 1, 10);
        gato.exibir();

    }
}
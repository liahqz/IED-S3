public class tiposprimitivos {
    public static void main(String [] args){
        boolean flag = true;
        char ch = 'A';
        byte b = 12; // byte: 8 bits
        short s = 24;
        int i = -123;
        long l = 890L;
        float f = 3.14555F;
        double d = 21818; // double: igual o float, só que com espaço de memória o dobro do float

        System.out.println("Variavel Flag = " + flag);
        System.out.println("Variavel Char = " + ch);
        System.out.println("Variavel Byte = " + b);
        System.out.println("Variavel Short = " + s);
        System.out.println("Variavel Int = " + i);
        System.out.println("Variavel Long = " + l);
        System.out.println("Variavel Float = " + f);
        System.out.println("Variavel Double = " + d);
}
}

// ctrl + shift + p: abrir estrutura "Java: create java project"
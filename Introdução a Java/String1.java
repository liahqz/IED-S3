public class String1 {
    public static void main (String args []){
        String nome = "Maria Lívia";
        String str = "Alunos";

        System.out.println(nome);
        System.out.println(str);
        System.out.println(str + ": " + nome);

        // new String: novo objeto. new: molde; classe: String
        String str2 = new String ("Maria");
        String str3 = new String ("Lívia");
        System.out.println("Esse é o String  2: " + str2);
        System.out.println(str2 + " " + str3);

        // concat precisa do '.'. UpperCase deixa maiúsculo
        System.out.println(str2.concat (str3).toUpperCase() + "." + "Concatenação");
        System.out.println("Quantidade de Caractere: " + str2.length());
        System.out.println("Quantidade de Caractere: " + str3.length());
    }
}

package edu.ivan.segundasemana;
public class MinhaClasse {
    

    public static void main (String [] args) {

        String primeiroNome = "Ivan";
        String segundoNome = "Victor";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }



}

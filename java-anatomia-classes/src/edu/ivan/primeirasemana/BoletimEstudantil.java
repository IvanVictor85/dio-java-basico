package edu.ivan.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[]args){
        double mediaFinal = 7.1;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("RECUPERACAO");
        else
            System.out.println("APROVADO");
    }
}

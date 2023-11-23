public class Calculos {

    public void calculoMedia(double nota1, double nota2, double nota3){

        double resultado = (nota1+nota2+nota3)/3;
        System.out.println("A sua media é: " + resultado);
        if(resultado >=7){
            System.out.println("\nVocê está aprovado!");
        }else {
            System.out.println("\nVocê está reprovado!");
        }

    }

    public boolean validarNota(double nota) {
        if (nota >=0 && nota <=10){
            System.out.println("Nota válida");
            return true;
        }else {
            System.out.println("Nota Invalida");
            System.exit(0);
            return false;
        }
    }

}

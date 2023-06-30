package Algoritimos;

public class PesquisaBinaria {
    public static void main(String[] args) {

        int[] minhaLista = {1, 3, 5, 7, 9, 11, 13, 15, 17};

        int baixo = 0; 
        int alto = minhaLista.length - 1;
        int item = 9;

        extracted(minhaLista, baixo, alto, item);

    }

    private static int extracted(int[] minhaLista, int baixo, int alto, int item) {
        int medio;
        int chute;
        while (baixo <= alto) {
            medio = (baixo + alto)/2;
            chute = minhaLista[medio];

            if(chute == item){
                System.out.println("achamos: " + chute);
                return chute;
            }

            if(chute<item){
                baixo = medio+1;
                System.out.println("é o " + minhaLista[medio] + "?... Não, muito baixo");
            }

            if(chute>item){
                alto = medio-1;
                System.out.println("é o " + minhaLista[medio] + "?... Não, muito alto");
            }

        }

        return 0;
    }

}
    

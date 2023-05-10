public class Main {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Desordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]);
        }

        int aux;


        /*
        bubble sort
        boolean controle;
        for (int i = 0; i < vetor.length; i++){
            controle = true;
            for(int j = 0; j < vetor.length - 1; j++){
                if(vetor[j] > vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                    controle = false;
                }
            }
            if (controle) {
                break;
            }
        }

        */


        /*
        insertion sort

        for (int i = 1; i < vetor.length; i++){
            aux = i;
            int j = i-1;
            while (j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }

         */
        int posicaoMenor;
        for (int i = 0; i < vetor.length; i++){
            posicaoMenor = i;
            for (int j = i+1; j < vetor.length; j++){
                if(vetor[j] < vetor[posicaoMenor]){
                    aux = vetor[posicaoMenor];
                    vetor[posicaoMenor] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        System.out.println("\n\nOrdenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]);
        }
    }


}


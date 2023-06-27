public class Main {
    public static void main(String[] args) {


        Arvore<Integer> arvore = new Arvore<Integer>();

        //Integer[] elementos = {18, 7, 3, 10, 90, 88, 100};
        //arvore.adicionarElementos(elementos);

        arvore.adicionarElemento(18);
        arvore.adicionarElemento(7);
        arvore.adicionarElemento(3);
        arvore.adicionarElemento(10);
        arvore.adicionarElemento(90);
        arvore.adicionarElemento(88);
        arvore.adicionarElemento(100);


        System.out.println("Em ordem");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println("Pré Ordem");
        arvore.preOrdem(arvore.getRaiz());

        System.out.println("Pós ordem");
        arvore.posOrdem(arvore.getRaiz());

        System.out.println("Arvore Util");
        arvore.mostrarArvore();


    }
}


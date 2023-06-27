import java.util.Arrays;

public class Arvore<TIPO extends Comparable> {
    private Elemento<TIPO> raiz;

    public Arvore(){
        this.raiz = null;
    }

    public void adicionarElemento(TIPO valor){
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
        if(raiz == null){
            this.raiz = novoElemento;
        }else{
            Elemento<TIPO> atual = this.raiz;
            while (true){
                if(novoElemento.getValor().compareTo(atual.getValor()) == -1){
                    if(atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                }else{
                    if (atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }

    public Elemento<TIPO> getRaiz(){
        return this.raiz;
    }

    public void emOrdem(Elemento<TIPO> atual){
        if(atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }
    }

    public void preOrdem(Elemento<TIPO> atual){
        if(atual != null) {
            System.out.println(atual.getValor());
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
    }

    public void posOrdem(Elemento<TIPO> atual){
        if(atual != null) {
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }
    }

    public boolean remover(TIPO valor){
        //buscar elemento na árvore
        Elemento<TIPO> atual = this.raiz;
        Elemento<TIPO> paiDoAtual = null;
        while (atual != null){
            if(atual.getValor() == valor){
                break;
            }
            else if(valor.compareTo(atual.getValor()) == -1){ // valor procurando é menor que o vlor atual
                paiDoAtual = atual;
                atual = atual.getEsquerda();
            }else {
                paiDoAtual = atual;
                atual = atual.getDireita();
            }
        }
        if(atual != null){
            //elemento tem dois filhos
            if(atual.getDireita() != null && atual.getEsquerda() != null){//tem filhos à diretia e à esquerda

            }else if(atual.getDireita() != null){ //tem filhos só a direita

            }else if(atual.getEsquerda() != null){// tem filhos só a esquerda

            }else{// não tem filhos
                if(atual.getValor().compareTo(paiDoAtual.getValor()) == -1){
                    paiDoAtual.setEsquerda(null);
                }else {
                    paiDoAtual.setDireita(null);

                }
            }
            return true;
        }else{
            return false;
        }
    }



    private void mostrarArvoreUtil(Elemento<TIPO> no, String espaco, String ramo) {
        if (no == null)
            return;

        espaco += "     ";
        mostrarArvoreUtil(no.getDireita(), espaco, "/");

        System.out.println(espaco + ramo + no.getValor());

        mostrarArvoreUtil(no.getEsquerda(), espaco, "\\");
    }

    public void mostrarArvore() {
        mostrarArvoreUtil(raiz, "", "");
    }

    public void adicionarElementos(TIPO[] elementos) {
        Arrays.sort(elementos); // Ordena o vetor de elementos

        adicionarElementosBalanceados(elementos, 0, elementos.length - 1);
    }

    private void adicionarElementosBalanceados(TIPO[] elementos, int inicio, int fim) {
        if (inicio > fim) {
            return;
        }

        int meio = (inicio + fim) / 2;
        adicionarElemento(elementos[meio]);

        adicionarElementosBalanceados(elementos, inicio, meio - 1);
        adicionarElementosBalanceados(elementos, meio + 1, fim);
    }
}



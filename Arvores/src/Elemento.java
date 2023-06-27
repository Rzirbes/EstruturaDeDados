public class Elemento<TIPO> {
    private TIPO valor;
    private Elemento<TIPO> esquerda;
    private Elemento<TIPO> direita;

    public Elemento(TIPO valor){
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public TIPO getValor(){
        return valor;
    }

    public void setValor(TIPO valor){
        this.valor = valor;
    }

    public Elemento getDireita(){
        return direita;
    }

    public void setDireita(Elemento direita){
        this.direita = direita;
    }

    public Elemento getEsquerda(){
        return esquerda;
    }

    public void setEsquerda(Elemento esquerda){
        this.esquerda = esquerda;
    }


}

public abstract class Produto{

    public String titulo;

    public String getTitulo(){

        return titulo;
    }
    public void setTitulo(String _titulo){

        this.titulo = _titulo;
    }

    public abstract String detalhesDoProduto();
}

public class Livro extends Produto{

    // Achar um jeito de implementar sobrecarga (polimorfismo) aqui
    public String autor;
    public int anoPubli;
    private boolean isAvailable;


    public void setTitulo(String _titulo, int edicao){

        this.titulo = _titulo+", "+edicao+"° edição";
    }           //Sobrecarga para settar uma edição junto do título

    public String getAutor(){

        return autor;
    }
    public void setAutor(String _autor){

        this.autor = _autor;
    }           //Sobrecarga para settar o autor, para livros que tenham 2
    public void setAutor(String autor1, String autor2){

        this.autor = autor1+" & "+autor2;
    }

    public int getAnoPubli(){

        return anoPubli;
    }
    public void setAnoPubli(int _anoPubli){

        this.anoPubli = _anoPubli;
    }
            //Cogitei uma sobrecarga para botar o trimestre(Quarter, .01, .02, .03, .04)
            //Junto do ano, mas por ser um inteiro, não uma double ou String
            //Não rolou :P

    public boolean getAvailable(){

        return isAvailable;
    }
    public void setAvailable(boolean available){

        isAvailable = available;
    }

    @Override
    public String detalhesDoProduto(){

        return "Título: "+this.titulo+"| Autor: "+this.autor+"| Ano de Publicação: "+this.anoPubli;
    }
}

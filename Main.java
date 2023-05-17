public class Main{

    public static void main(String[] args){

        Biblioteca biblio = new Biblioteca();

        Livro vol1 = new Livro();
        Livro vol2 = new Livro();
        Livro vol3 = new Livro();
        Livro vol4 = new Livro();
        Livro vol5 = new Livro();

        Livro newVol4 = new Livro();
        Livro volSobrescreve = new Livro();

        vol1.setTitulo("Umbral");vol1.setAutor("Umberto");
        vol1.setAnoPubli(2001);vol1.setAvailable(false);

        vol2.setTitulo("Adonis",22);vol2.setAutor("Twobbert");
        vol2.setAnoPubli(2002);vol2.setAvailable(true);

        vol3.setTitulo("Athreealizar");vol3.setAutor("Matthreew","Atreis");
        vol3.setAnoPubli(1993);vol3.setAvailable(true);

        vol4.setTitulo("Book Four Deletion",4);vol4.setAutor("4dão");
        vol4.setAnoPubli(2044);vol4.setAvailable(false);

        vol5.setTitulo("Cinco tons de Cinza");vol5.setAutor("Frivello","Cinplo");
        vol5.setAnoPubli(1985);vol5.setAvailable(true);

        // ------------------------------------

        newVol4.setTitulo("Fourks and you",16);newVol4.setAutor("Q.U. Atrois");
        newVol4.setAnoPubli(2014);newVol4.setAvailable(true);

        volSobrescreve.setTitulo("One-oh-Onion: Cebola e você");volSobrescreve.setAutor("Cebolinha");
        volSobrescreve.setAnoPubli(2021);volSobrescreve.setAvailable(false);

        // --------------------------------------


        biblio.adicionarLivro(vol1);
        biblio.adicionarLivro(vol2);
        biblio.adicionarLivro(vol3);
        biblio.adicionarLivro(vol4);
        biblio.adicionarLivro(vol5);

        biblio.listarLivros();

        biblio.adicionarLivro(volSobrescreve);

        vol1 = vol2;
        vol2 = vol3;
        vol3 = vol4;
        vol4 = vol5;
        vol5 = volSobrescreve;
        //Era atualizada apenas a lista em biblioteca
        //E não no main, isso gerava um monte de problema com
        //Integridade, então agora é atualizado aqui também

        biblio.listarLivros();

        biblio.removerLivro(vol4);

        vol4 = null;
        //Tal qual o problema no update, é necessário apagar
        //das DUAS listas para ter certeza que não dê problema

        biblio.listarLivros();

        biblio.atualizarLivro(vol3,"Threes: Silviculture","Dreiven",1973,false);

        biblio.listarLivros();

        System.out.println(biblio.checkDisponivel(vol4));
        System.out.println(biblio.checkDisponivel(vol1));
        System.out.println(biblio.checkDisponivel(vol3));
    }
}

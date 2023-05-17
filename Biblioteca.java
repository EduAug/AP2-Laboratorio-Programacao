public class Biblioteca{

    Livro l1;
    Livro l2;
    Livro l3;
    Livro l4;
    Livro l5;

    public void adicionarLivro(Livro newLivro){

        if(l1 == null){

            l1 = newLivro;
        }else if(l2 == null){

            l2 = newLivro;
        }else if(l3 == null){

            l3 = newLivro;
        }else if(l4 == null){

            l4 = newLivro;
        }else if(l5 == null){

            l5 = newLivro;
        }else if(l1!=null && l2!=null && l3!=null && l4!=null && l5!=null){

            // Caso seja adicionado um novo livro e todos estejam "usados",
            //Empurra o "mais velho" para fora e adiciona no lugar

            l1 = l2;
            l2 = l3;
            l3 = l4;
            l4 = l5;
            l5 = newLivro;
        }
    }

    public void removerLivro(Livro removeAt){

        if(l1 != null && l1 == removeAt){

            l1 = null;
        }else if(l2 != null && l2 == removeAt){

            l2 = null;
        }else if(l3 != null && l3 == removeAt){

            l3 = null;
        }else if(l4 != null && l4 == removeAt){

            l4 = null;
        }else if(l5 != null && l5 == removeAt){

            l5 = null;
        }
    }

    public void atualizarLivro(Livro updateAt, String nTitulo, String nAutor, int nAno, boolean nDispo){

        if(l1 != null && l1 == updateAt){

            l1.titulo = nTitulo;
            l1.autor = nAutor;
            l1.anoPubli = nAno;
            l1.setAvailable(nDispo); // É private, então tenho de usar o set
        }else if(l2 != null && l2 == updateAt){

            l2.titulo = nTitulo;
            l2.autor = nAutor;
            l2.anoPubli = nAno;
            l2.setAvailable(nDispo);
        }else if(l3 != null && l3 == updateAt){

            l3.titulo = nTitulo;
            l3.autor = nAutor;
            l3.anoPubli = nAno;
            l3.setAvailable(nDispo);
        }else if(l4 != null && l4 == updateAt){

            l4.titulo = nTitulo;
            l4.autor = nAutor;
            l4.anoPubli = nAno;
            l4.setAvailable(nDispo);
        }else if(l5 != null && l5 == updateAt){

            l5.titulo = nTitulo;
            l5.autor = nAutor;
            l5.anoPubli = nAno;
            l5.setAvailable(nDispo);
        }
    }

    public String checkDisponivel(Livro checkLivro){

        int disponivel = 0;

        if(l1!=null && l1==checkLivro){

            if(l1.getAvailable()){

                disponivel = 1;
            }else{

                disponivel = 0;
            }
        }else if(l2!=null && l2==checkLivro){

            if(l2.getAvailable()){

                disponivel = 1;
            }else{

                disponivel = 0;
            }
        }else if(l3!=null && l3==checkLivro){

            if(l3.getAvailable()){

                disponivel = 1;
            }else{

                disponivel = 0;
            }
        }else if(l4!=null && l4==checkLivro){

            if(l4.getAvailable()){

                disponivel = 1;
            }else{

                disponivel = 0;
            }
        }else if(l5!=null && l5==checkLivro){

            if(l5.getAvailable()){

                disponivel = 1;
            }else{

                disponivel = 0;
            }
        }

        if(disponivel == 1){

            return "O livro "+checkLivro.titulo+" está Disponível";
        }else{

            return "O livro "+checkLivro.titulo+" está Alugado";
        }
    }
}

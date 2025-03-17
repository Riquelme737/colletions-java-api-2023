package Map.Ordenacao.LivrariaOnline;

import java.util.Comparator;
import java.util.Map;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}

class compararPorPreco implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return Double.compare(o1.getValue().getPreco(), o2.getValue().getPreco());
    }
}

class compararPorAutor implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getAutor().compareToIgnoreCase(o2.getValue().getAutor());
    }
}

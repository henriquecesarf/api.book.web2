package atividadeWeb2.api.book.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Books {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tittle;
    private String sumary;
    private Number qtdPages;
    private String autores;
    private String catogory;


    public Books() {
    }

    public Books(Long id, String tittle, String sumary, Number qtdPages, String autores, String catogory) {
        this.id = id;
        this.tittle = tittle;
        this.sumary = sumary;
        this.qtdPages = qtdPages;
        this.autores = autores;
        this.catogory = catogory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getSumary() {
        return sumary;
    }

    public void setSumary(String sumary) {
        this.sumary = sumary;
    }

    public Number getQtdPages() {
        return qtdPages;
    }

    public void setQtdPages(Number qtdPages) {
        this.qtdPages = qtdPages;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getCatogory() {
        return catogory;
    }

    public void setCatogory(String catogory) {
        this.catogory = catogory;
    }
}

package atividadeWeb2.api.book.requests;

public class BookRequest {
    private String tittle;
    private String sumary;
    private Number QTDPages;
    private String autores;
    private String catogory;

    public BookRequest() {
    }

    public BookRequest(String tittle, String sumary, Number QTDPages, String autores, String catogory) {
        this.tittle = tittle;
        this.sumary = sumary;
        this.QTDPages = QTDPages;
        this.autores = autores;
        this.catogory = catogory;
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

    public Number getQTDPages() {
        return QTDPages;
    }

    public void setQTDPages(Number QTDPages) {
        this.QTDPages = QTDPages;
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

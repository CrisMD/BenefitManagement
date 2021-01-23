package Model;

public class Beneficiu {
    String denumire;
    String descriere;
    Categorie categorie;

    public Beneficiu() {
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Beneficiu(String denumire, String descriere, Categorie categorie) {
        this.denumire = denumire;
        this.descriere = descriere;
        this.categorie = categorie;
    }
}

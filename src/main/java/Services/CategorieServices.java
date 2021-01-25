package Services;

import Model.Categorie;
import Repository.CategorieRepository;

import java.util.List;

public class CategorieServices {

    public void adaugaCategorie(Categorie categorie) {
        CategorieRepository repository = new CategorieRepository();
        repository.adaugaCatetegorie(categorie);
    }

    public void stergeCategorieByDenumire(String demumire){

        CategorieRepository repository = new CategorieRepository();
        repository.stergeCategorieByDenumire(demumire);

    }

    public  void modificareCategorie(String denumireVeche, String denumireNoua){
        CategorieRepository repository = new CategorieRepository();
        repository.modificareCategorie(denumireVeche, denumireNoua);

    }
    public List<Categorie> getListaCategorii(){
        CategorieRepository repository = new CategorieRepository();
        return repository.getListaCategorii();
    }

}

package Model;

public class Utilizator {
    String userName;
    String parola;
    String nume;
    String prenume;
    Boolean isAdmin;

    public Utilizator() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Utilizator(String userName, String parola, String nume, String prenume) {
        this.userName = userName;
        this.parola = parola;
        this.nume = nume;
        this.prenume = prenume;
    }
}

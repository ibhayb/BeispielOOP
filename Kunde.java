public class Kunde {
    String vorname;
    String nachname;
    int id;

    public Kunde(String vorname, String nachname, int id) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.id = id;
    }

    public String toString() {
        return "Kunden-ID: " + this.id + " Vorname: " + this.vorname + " Nachname: " + this.nachname;
    }

    public boolean equals(Kunde kunde) {

        return (kunde.getId() == this.id && kunde.getNachname().equals(this.nachname)
                && kunde.getVorname().equals(this.vorname));
    }

    public int getId() {
        return id;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }
}

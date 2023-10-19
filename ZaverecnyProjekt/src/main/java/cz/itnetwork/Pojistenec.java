package cz.itnetwork;

public class Pojistenec {

    //Jméno pojištěnce
    private String jmeno;
    //Přijmení pojištěnce
    private String prijmeni;
    //telefoní číslo pojištěnce
    private String telefoniCislo;
    //Věk pojištěnce
    private int vek;

    /**
     * vytvoření nového pojištěnce
     * @param jmeno jméne pojištěnce
     * @param prijmeni přijmení pojištěnce
     * @param telefoniCislo telefoní číslo pojištěnce
     * @param vek věk pojištěnce
     */
    public Pojistenec(String jmeno, String prijmeni, String telefoniCislo, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefoniCislo = telefoniCislo;
        this.vek = vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @return vrací všechny informace o pojištěnci jméno,přijmení,telefoní číslo a věk
     */
    @Override
    public String toString() {
        return "Pojištěný/á - " + jmeno + " " + prijmeni + "\n" + "Telefonní číslo - " + telefoniCislo + "\n" + "Věk - " + vek;
    }
}

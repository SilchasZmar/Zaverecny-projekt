package cz.itnetwork;

import java.util.ArrayList;

public class DatabazePojistencu {

    private ArrayList<Pojistenec> seznamPojistencu;

    /**
     * Inicializace databáze
     * sloužící k ukládání pojištěnců
     */
    public DatabazePojistencu() {
        seznamPojistencu = new ArrayList<>();
    }

    /**
     * Vkládání pojištěnců do databáze
     * @param jmeno
     * @param prijmeni
     * @param telefoniCislo
     * @param vek
     */
    public void pridatPojistence(String jmeno, String prijmeni, String telefoniCislo, int vek) {
        seznamPojistencu.add(new Pojistenec(jmeno, prijmeni, telefoniCislo, vek));
    }

    /**
     * Vypíše všechyn pojištěnce uležené v ArrayListu
     */
    public void vypisPojistencu() {
        for (Pojistenec pojistenec : seznamPojistencu) {
            System.out.println(pojistenec);
            System.out.println("___________________");
        }
    }

    /**
     * Hledání v seznamuPojištěnců pomocí jména a příjmení
     *
     * @param jmeno
     * @param prijmeni
     * @return při nalezení vrací pojištěnce
     */
    public Pojistenec najitPojistence(String jmeno, String prijmeni) {
        for (Pojistenec pojistenec : seznamPojistencu) {
            if (pojistenec.getJmeno().equals(jmeno) && pojistenec.getPrijmeni().equals(prijmeni)) {
                return pojistenec;
            }
        }
        return null;
    }

}

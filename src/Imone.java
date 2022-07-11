import java.util.ArrayList;
import java.util.List;

public class Imone {

    String pavadinimas;
    int ikurimoMetai;
    List<Darbuotojas> darbuotojai;

    public Imone(String pavadinimas, int ikurimoMetai) {
        this.pavadinimas = pavadinimas;
        this.ikurimoMetai = ikurimoMetai;
        this.darbuotojai = new ArrayList<>();
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public int getIkurimoMetai() {
        return ikurimoMetai;
    }

    public List<Darbuotojas> getDarbuotojai() {
        return darbuotojai;
    }

    public void pridekDarbuotoja (Darbuotojas darbuotojas) {
        this.darbuotojai.add(darbuotojas);
    }
}

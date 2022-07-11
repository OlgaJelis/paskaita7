public class Main {
    public static void main(String[] args) {
        Imone imone = new Imone ( "Sauni komanda", 2015);

        Darbuotojas darbuotojas1 = new Darbuotojas("Charlis", "Chaplin", "4870517");
        Darbuotojas darbuotojas2 = new Darbuotojas("Jonas", "Jonaitis", "5200315");

        darbuotojas1.spausdinkDarbuotojoInfo();
        darbuotojas2.spausdinkDarbuotojoInfo();

        imone.pridekDarbuotoja(darbuotojas1);
        imone.pridekDarbuotoja(darbuotojas2);

        System.out.println(imone.getDarbuotojai());
        imone.getDarbuotojai().forEach(drb -> drb.spausdinkDarbuotojoInfo());
    }
}
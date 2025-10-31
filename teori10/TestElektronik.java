package teori10;

public class TestElektronik {
    public static void main(String[] args) {
        Manusia indra = new Manusia();
        TelevisiJadul tvJadul = new TelevisiJadul();
        TelevisiModern tvModern = new TelevisiModern();

        indra.nyalakanPerangkat(tvJadul);
        indra.nyalakanPerangkat(tvModern);
    }
}

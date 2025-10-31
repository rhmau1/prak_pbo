package teori10;

public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiJadul) {
            TelevisiJadul tvJadul = (TelevisiJadul) perangkat;
            System.out.println("Menyalakan televisi jadul dengan input: " + tvJadul.getModelInput() + " dan voltase: "
                    + tvJadul.getVoltase());
        } else if (perangkat instanceof TelevisiModern) {
            TelevisiModern tvModern = (TelevisiModern) perangkat;
            System.out.println("Menyalakan televisi modern dengan input: " + tvModern.getModelInput() + " dan voltase: "
                    + tvModern.getVoltase());
        }
    }
}

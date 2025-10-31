package teori10;

public class TelevisiModern extends Elektronik {
    private String modelInput;

    TelevisiModern() {
        super();
        this.modelInput = "HDMI";
    }

    public String getModelInput() {
        return modelInput;
    }
}

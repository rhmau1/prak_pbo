package teori10;

public class TelevisiJadul extends Elektronik {
    private String modelInput;

    TelevisiJadul() {
        super();
        this.modelInput = "DVI";
    };

    public String getModelInput() {
        return modelInput;
    }
}

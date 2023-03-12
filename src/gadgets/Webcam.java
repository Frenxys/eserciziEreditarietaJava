package gadgets;

public class Webcam {
    private String risoluzione;
    public Webcam(String risoluzione){
        setRisoluzione(risoluzione);
    }

    public String getRisoluzione() {
        return risoluzione;
    }

    public void setRisoluzione(String risoluzione) {
        this.risoluzione = risoluzione;
    }
}

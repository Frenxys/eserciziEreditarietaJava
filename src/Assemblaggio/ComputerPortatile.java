package Assemblaggio;

abstract public class ComputerPortatile extends Computer{
    private float peso;
    private float altezza;
    private float larghezza;
    private float profondita;
    private String dimvideo;//risoluzione es. 1920x1080
    private boolean interwireless; //presenza o meno dell'interfaccia di rete wireless
    public ComputerPortatile(String processore, int RAM, int ROM, String marca, String modello, String OS,float peso,float altezza,float larghezza,float profondita,String dimvideo,boolean interwireless) {
        super(processore, RAM, ROM, marca, modello, OS);
        setPeso(peso);
        setLarghezza(larghezza);
        setAltezza(altezza);
        setProfondita(profondita);
        setDimvideo(dimvideo);
        setInterwireless(interwireless);
    }
    public void setProfondita(float profondita) {
        this.profondita = profondita;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }
    public void setDimvideo(String dimvideo) {
        this.dimvideo = dimvideo;
    }

    public void setInterwireless(boolean interwireless) {
        this.interwireless = interwireless;
    }

    public void setLarghezza(float larghezza) {
        this.larghezza = larghezza;
    }

    @Override
    public String toString() {
        return super.toString()+"\npeso:"+peso+"\nlarghezza:"+larghezza+"\naltezza:"+altezza+"\nprofondità:"+profondita+"\nrisoluzione:"+dimvideo+"\ninterfaccia wireless:"+interwireless;
    }
}

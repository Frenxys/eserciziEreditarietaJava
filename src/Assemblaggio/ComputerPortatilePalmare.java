package Assemblaggio;

public class ComputerPortatilePalmare extends ComputerPortatile{
    private String memoriaMassa; //tipo di memoria di massa(sd, micro-sd, mini-sd)
    public ComputerPortatilePalmare(String processore, int RAM, int ROM, String marca, String modello, String OS, float peso, float altezza, float larghezza, float profondita, String dimvideo, boolean interwireless,String memoriaMassa) {
        super(processore, RAM, ROM, marca, modello, OS, peso, altezza, larghezza, profondita, dimvideo, interwireless);
        setMemoriaMassa(memoriaMassa);
    }
    public void setMemoriaMassa(String memoriaMassa) {
        this.memoriaMassa = memoriaMassa;
    }

    @Override
    public String toString() {
        return super.toString()+"\nmemoria di massa:"+memoriaMassa;
    }
}

package Assemblaggio;
import gadgets.Webcam;
public class ComputerPortatileNotebook extends ComputerPortatile{
    Webcam w=null;
    //costruttore normale senza webcam
    public ComputerPortatileNotebook(String processore, int RAM, int ROM, String marca, String modello, String OS, float peso, float altezza, float larghezza, float profondita, String dimvideo, boolean interwireless) {
        super(processore, RAM, ROM, marca, modello, OS, peso, altezza, larghezza, profondita, dimvideo, interwireless);
    }
    //costruttore con webcam
    public ComputerPortatileNotebook(String processore, int RAM, int ROM, String marca, String modello, String OS, float peso, float altezza, float larghezza, float profondita, String dimvideo, boolean interwireless,String risoluzionewebcam) {
        super(processore, RAM, ROM, marca, modello, OS, peso, altezza, larghezza, profondita, dimvideo, interwireless);
        w=new Webcam(risoluzionewebcam);
    }

    @Override
    public String toString() {
        if(w!=null){
            return super.toString()+"\n"+w.getRisoluzione();
        }
        return super.toString();
    }
}

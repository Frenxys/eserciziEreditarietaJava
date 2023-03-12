package Assemblaggio;

public class ComputerFissoDesktop extends ComputerFisso{
    private String GPU; //tipo di scheda video(Graphic Processing Unit)
    public ComputerFissoDesktop(String processore, int RAM, int ROM, String marca, String modello, String OS, String caseComputer,String gpu) {
        super(processore, RAM, ROM, marca, modello, OS, caseComputer);
        setGPU(gpu);
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return super.toString()+"\nGPU:"+GPU;
    }
}

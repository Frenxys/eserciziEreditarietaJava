package Assemblaggio;

public class ComputerFissoServer extends ComputerFisso{
    private int processori;//numero processori
    private boolean RAID;//presenza o meno del discho raid
    public ComputerFissoServer(String processore, int RAM, int ROM, String marca, String modello, String OS, String caseComputer,int processori,boolean raid) {
        super(processore, RAM, ROM, marca, modello, OS, caseComputer);
        setProcessori(processori);
        setRAID(raid);
    }

    public void setProcessori(int processori) {
        this.processori = processori;
    }

    public void setRAID(boolean RAID) {
        this.RAID = RAID;
    }

    @Override
    public String toString() {
        return super.toString()+"\nnumero processori:"+processori+"\nRAID:"+RAID;
    }
}

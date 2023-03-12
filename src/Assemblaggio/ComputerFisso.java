package Assemblaggio;

abstract public class ComputerFisso extends Computer{
    private String caseComputer; //tipo di case(grande,medio,piccolo)

    public ComputerFisso(String processore, int RAM, int ROM, String marca, String modello, String OS,String caseComputer) {
        super(processore, RAM, ROM, marca, modello, OS);
        setCaseComputer(caseComputer);
    }

    public void setCaseComputer(String caseComputer) {
        this.caseComputer = caseComputer;
    }

    @Override
    public String toString() {
        return super.toString()+"\ncase:"+caseComputer;
    }
}

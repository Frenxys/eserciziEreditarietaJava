package Assemblaggio;

abstract public class Computer {
    private String processore; //tipo processore
    private int RAM; // dimensione RAM in GigaByte
    private int ROM; // dimensione ROM in megabyte
    private String marca;
    private String modello;
    private String OS; //nome sistema operativo(Operative System)
    public Computer(String processore,int RAM,int ROM,String marca,String modello,String OS){
        setMarca(marca);
        setModello(modello);
        setOS(OS);
        setROM(ROM);
        setRAM(RAM);
        setProcessore(processore);
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    @Override
    public String toString() {
        return "marca:"+marca+"\nmodello:"+modello+"\nOS:"+OS+"\nROM:"+ROM+"\nRAM:"+RAM+"\nprocessore:"+processore;
    }
}

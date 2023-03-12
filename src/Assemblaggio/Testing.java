package Assemblaggio;

public class Testing {
    public static void main(String[] args){
        ComputerPortatilePalmare pc1=new ComputerPortatilePalmare(
                "intel i5 2300k",
                8,
                1000,
                "AMD",
                "portatilefigo",
                "windows",
                1200,
                20,
                40,
                30,
                "1920x1080",
                false,
                "SD");
        ComputerPortatileNotebook pc2=new ComputerPortatileNotebook(
                "intel 17 11300",
                4,
                1200,
                "HP",
                "lowcost",
                "windows",
                1400,
                24,
                50,
                32,
                "1280x720",
                true);
        ComputerFissoServer pc3=new ComputerFissoServer(
                "intel 19 11900k",
                24,
                12000,
                "AMD",
                "potente",
                "linux",
                "grande",
                45,
                true);
        ComputerFissoDesktop pc4=new ComputerFissoDesktop(
                "intel i5 7800",
                16,
                2400,
                "asus",
                "mediocosto",
                "windows",
                "medio",
                "gtx 1660");

        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);
        System.out.println(pc4);
    }
    
}

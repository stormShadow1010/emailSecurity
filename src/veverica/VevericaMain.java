package veverica;

public class VevericaMain {

    public static void main(String[] args) {
        Veverica v1 = new Veverica("Chip", "braon");
        
        v1.savijLevuRuku();
        v1.pridrzi("LESNIK");
        v1.ispruziLevuRuku();
        System.out.println(v1.getStaDrzi());
        
        

    }

}

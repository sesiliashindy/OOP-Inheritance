public class Prisma extends Segitiga{
    int tinggiPrisma;

    public void setTinggiPrisma(int tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    public void getVolume(){
        System.out.println("Volume Prisma: ");
        System.out.println(((alas*tinggi)/2)*tinggiPrisma);
    }

    // @Override
    // public void getLuas() {
    //     System.out.println("Luas Alas Prisma");
    //     super.getLuas();
    // }

    
    
}

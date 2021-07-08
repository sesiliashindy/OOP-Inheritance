public class Segitiga {
    int tinggi;
    int alas;
    int sisi;
    double hasil;

    public Segitiga() {

    }

    public Segitiga(int tinggi,int alas,int sisi ) {
        this.tinggi = tinggi;
        this.alas = alas;
        this.sisi = sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void getKeliling(){
        System.out.println("Keliling Segitiga: ");
        System.out.println((hasil= this.alas+this.sisi+this.tinggi));
    }

    public void getLuas(){
        System.out.println("Luas Segitiga: ");
        System.out.println(((hasil= this.alas*this.tinggi)/2));
    }

    // public void getsisiMiring(){
    //     System.out.println("Sisi Miring: ");
    //     System.out.println((Math.sqrt(Math.pow(this.alas, 2)+Math.pow(this.tinggi, 2))));
    // }

}

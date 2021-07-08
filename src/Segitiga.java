public class Segitiga {
    int tinggi;
    int alas;
    int sisi;
    double hasil;

    public int getSisi() {
        return sisi;
    }
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getAlas() {
        return alas;
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public double getHasil() {
        return hasil;
    }
    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public void getKeliling(){
        System.out.println("Keliling Segitiga: ");
        System.out.println((hasil= this.alas+this.sisi+this.tinggi));
    }

    public void getLuas(){
        // System.out.println("Luas Segitiga: ");
        System.out.println(((hasil= this.alas*this.tinggi)/2));
    }

    public void getsisiMiring(){
        System.out.println("Sisi Miring: ");
        System.out.println((Math.sqrt(Math.pow(this.alas, 2)+Math.pow(this.tinggi, 2))));
    }

}


public class Manusia {
    
    protected String nama;
    protected int umur;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur (int umur){
        this.umur =  umur;
    }
    
    public void siapaKamu(){
        System.out.println("Saya Manusia");
    }
}

class Dosen extends Manusia{
    private String nip;
    private String mataKuliah;
    
    public String getNip(){
        return nip;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getMataKuliah(){
        return mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang"
                + " mengajar matakuliah PBO");
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}

class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 tahun sedang belajar di kelas PBO2");
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
    
}

class ManusiaTester{
    
    public static void main(String[] args) {
        Dosen d = new Dosen();
        System.out.println("NIP DOSEN : 41227829930");
        d.siapaKamu();
        d.mengajarApa();
        
        Mahasiswa m = new Mahasiswa();
        System.out.println("\nNIM MAHASISWA : 10110269");
        m.siapaKamu();
        m.kelasApa();
    }
    
}

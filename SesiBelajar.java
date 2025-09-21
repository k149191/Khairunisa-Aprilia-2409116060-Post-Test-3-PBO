package model;

public abstract class SesiBelajar {
    private String namaSesi;
    private int waktuBelajar;

    public SesiBelajar(String namaSesi, int waktuBelajar) {
        setNamaSesi(namaSesi);
        setWaktuBelajar(waktuBelajar);
    }

    public String getNamaSesi() {
        return namaSesi;
    }   
    
    public void setNamaSesi(String namaSesi) {
        if (namaSesi == null || namaSesi.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama sesi tidak boleh kosong.");
        }
        this.namaSesi = namaSesi;
    }

    public int getWaktuBelajar() {
        return waktuBelajar;
    }
    
    public void setWaktuBelajar(int waktuBelajar) {
        if (waktuBelajar <= 0) {
            throw new IllegalArgumentException("Waktu belajar harus lebih dari 0.");
        }
        this.waktuBelajar = waktuBelajar;
    }
    
    public abstract void infoSesi();
}
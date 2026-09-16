
public class Hewan {
    String nama; 
    String jenis; 
    public void tampilkanInfo() { 
        System.out.println("Nama Hewan: " + nama); 
        System.out.println("Jenis Hewan: " + jenis); 
    } 
} 

// Kelas Turunan Hewan
class Kucing extends Hewan { 
    String suaraKucing; 
    
    @Override 
    public void tampilkanInfo() { 
        super.tampilkanInfo(); 
        System.out.println("Suara Kucing: " + suaraKucing); 
    }   
}

class Anjing extends Hewan { 
    String suaraAnjing; 
    @Override 
    
    
    
    public void tampilkanInfo() { 
        super.tampilkanInfo(); 
        System.out.println("Suara Kucing: " + suaraAnjing); 
    }   
}
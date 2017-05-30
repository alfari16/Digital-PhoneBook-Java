package PhoneBook;

public class array {
    String namaDepan;
    String namaBelakang;
    String number;
    int cat;
    
    array(int cat, String namaDepan,String namaBelakang, String numberPhone){
        this.namaDepan=namaDepan;
        this.namaBelakang=namaBelakang.toUpperCase();
        this.number = numberPhone;
        this.cat = cat;
    }
    
    array(String numberPhone){
        this.number = numberPhone;
    }
    
    public String toString(){
        if(namaDepan==null) return number;
        return String.format("%s, %s \t- %s",namaDepan,namaBelakang,number);
    }
   
}

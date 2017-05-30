package PhoneBook;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class hash {
    Scanner scn = new Scanner(System.in);
    array[][] hashFirst;
    array head;
    static int counter;
    String[] yes={"Ya","Tidak"};
    String text;
    int hashed;
    
    /*
    Kategori
    [0] Keluarga
    [1] Teman
    [2] Dosen
    */
    
    hash(){
        hashFirst = new array[2][100];
        System.out.println("=========================="
                       + "\n|  BUKU TELEPON DIGITAL  |\n==========================");
        insert(1,"d", "oke", "085704856007");
        insert(0,"budi", "suca", "08570485689812");
//        insert(0,"budi", "suca", "sasa");
        insert(0,"ASA", "PARMIN", "08570485689323");
        insert(0,"DADA", "CIPTO", "08570485432232");
        insert(1,"abida", "asa", "08570485432232");
        insert(1,"dsd", "padamu", "00012");
        insert(2,"dsd", "padaku", "00012");
        insert(2,"z-index", "asa", "08570485432232");
        insert(2,"z-index2", "suca", "08570485432232");
        int counter=counter("oke".toUpperCase());
        int anu=hashFunc(counter);
        System.out.println(hashFirst[1][anu]);
    }
    String convert(String key){
        String first=key.substring(0,1).toUpperCase();
        first+=key.substring(1, key.length()).toLowerCase();
        return first;
    }
    int counter(String key){
        int temp=0;
        for (int i = 0; i < key.length(); i++) {
            temp+=key.charAt(i);
        }
        return temp;
    }
    void insert(int kat, String namaDepan, String namaBelakang, String nomor){
        String first=convert(namaDepan);
        array newNode = new array(kat,first,namaBelakang,nomor);
        int index=counter(first);
        int index2=counter(namaBelakang.toUpperCase());
        int hash=hashFunc(index);
        int hash2=hashFunc(index2);
        while(hashFirst[0][hash]!=null && (!first.equals(hashFirst[0][hash].namaDepan) || !namaBelakang.toUpperCase().equals(hashFirst[0][hash].namaBelakang))){
            hash=hashFunc(++hash);
        }
        while(hashFirst[1][hash2]!=null && (!first.equals(hashFirst[1][hash2].namaDepan) || !namaBelakang.toUpperCase().equals(hashFirst[1][hash2].namaBelakang))){
            hash2=hashFunc(++hash2);
        }
        if(hashFirst[0][hash]!=null){
            int input=0;
            try{
                input=Integer.parseInt(JOptionPane.showInputDialog(null, hashFirst[0][hash].namaDepan+" Sudah terdaftar.\n1. Anda ingin mengganti telepon yang sudah ada?"
                + "\n2. Atau menambah nomor?\n\nAnswer:","Kontak sudah terdaftar.",JOptionPane.WARNING_MESSAGE));
                if(input>2){
                    JOptionPane.showMessageDialog(null, "Input salah! Operasi dibatalkan.");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Input salah! Operasi dibatalkan.");
            }
            switch(input){
                case 1: 
                    hashFirst[0][hash]=newNode;
                    hashFirst[1][hash2]=newNode;
                    return;
                case 2: 
                    hashFirst[0][hash].number+=", "+nomor;
                    hashFirst[1][hash2].number+=", "+nomor;
                    return;
                default: System.out.println("Input salah. Operasi dibatalkan.");return;
            }
        }else{
            hashFirst[0][hash]=newNode;
            hashFirst[1][hash2]=newNode;
        }
        System.out.println(first+" ditambahkan.");
        counter++;
    }
    
    int hashFunc(int key){
        return (key%100);
    }
    void setCounter(){
        counter--;
    }
    
}

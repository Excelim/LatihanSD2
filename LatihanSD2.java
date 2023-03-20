/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihansd2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author EXCEL
 */
public class LatihanSD2 {

    public static void main(String[] args) {
         // Membuat objek Hewan dan menambahkan beberapa elemen
        List<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        
        // Membuat objek DeleteHewan dan menambahkan beberapa elemen
        List<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        
        // Menghapus data pada objek Hewan yang sama dengan data warna pada objek DeleteHewan
        Iterator<String> iterator = Hewan.iterator();
        System.out.println("Hewan: "+ Hewan);
        while (iterator.hasNext()) {
            String hewan = iterator.next();
            if (DeleteHewan.contains(hewan)) {
                iterator.remove();
                
                // Menampilkan elemen pada objek Hewan setelah data dihapus
        
        System.out.println("Hewan yang dihapus: " + Hewan);
            }
        }
        System.out.println("Output Hewan : [Sapi, Domba]");
    }
}
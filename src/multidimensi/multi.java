/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimensi;

/**
 *
 * @author Rara ^___^
 */
public class multi {
    int nis [][] = {{210651},{210653},{210652}};
        String nama [][] = {{"Rizvan Dimas"},{"Nur Azmi"},{"Devita Fahma"}};
        
        public void tampil(){
            System.out.println("Identitas siswa angkatan 25");
        }
    public void namanis (int n){
        for (int i = 0; i< 3; i++){
            for (int j = 0; j < 1; j++){
                System.out.println(nama[i][j]+":"+nis[i][j]);
            }
        }
    }
    public static void main (String[]args){
        multi siswa = new multi();
        siswa.tampil();
        siswa.namanis(0);
    }
    }

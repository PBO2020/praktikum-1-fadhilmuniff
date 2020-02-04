
package fadil;

import java.util.ArrayList;
import java.util.Scanner;

class main {
        public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        ArrayList<Fadil> arrayList = new ArrayList<>();
        Fadil data1 = new Fadil();
        System.out.print("NIK : ");
        String nik = inn.next();
        data1.setNik(nik);
        System.out.print("Nama : ");
        String nama = inn.next();
        data1.setNama(nama);
        System.out.print("TTL : ");
        String ttl = inn.next();
        data1.setTtl(ttl);
        System.out.print("Gol : ");
        String gol = inn.next();
        data1.setGol(gol);
        arrayList.add(data1);
        
        System.out.println("Apakah ingin menambah data lagi?[y]/[t]");
        String pilih = inn.next();
        switch(pilih){
            case "y" :
                
               
                 Fadil data2 = new Fadil();
                System.out.print("NIK : ");
                String nik1 = inn.next();
                data2.setNik(nik1);
                System.out.print("Nama : ");
                String nama1 = inn.next();
                data2.setNama(nama1);
                System.out.print("TTL : ");
                String ttl1 = inn.next();
                data2.setTtl(ttl1);
                System.out.print("Gol : ");
                String gol1 = inn.next();
                data2.setGol(gol1);
                arrayList.add(data2);
                for(int b = 0; b < arrayList.size(); b++){
                    System.out.println("Data ke " + b+1);
                System.out.println("NIK : "+arrayList.get(b).getNik(b));
                System.out.println("Nama: "+arrayList.get(b).getNama(b));
                System.out.println("TTL : "+arrayList.get(b).getTtl(b));
                System.out.println("Gol : "+arrayList.get(b).getGol(b));
                
                   
                }
                
            case "t":
                for(int a = 0; a < arrayList.size(); a++){
                
                System.out.println("NIK : "+arrayList.get(a).getNik(a));
                System.out.println("Nama : "+arrayList.get(a).getNama(a));
                System.out.println("TTL : "+arrayList.get(a).getTtl(a));
                System.out.println("Gol : "+arrayList.get(a).getGol(a));
        }

        }
       
        
            
        
    }
        
}

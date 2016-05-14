/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan8;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class tesclass {
    public static void main(String[] args) {
        Scanner masuk=new Scanner(System.in);
        System.out.print("masukan angka: ");
        double d=masuk.nextDouble();
        cekangka cek=new cekangka();
        cek.cek(d);
    }
}

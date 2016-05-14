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
public class cekangka implements I1,D1 {
    private double hasil;
    public void cek(double d){
        if(d!=(int)d){
            hasil=d;
            methodD1();
        }
        else{
            hasil=(int)d;
            methodI1();
        }
    }
    public int hasilint(){
        return (int)hasil;
    }
    public double hasildouble(){
        return hasil;
    }
    public void methodI1() {
        System.out.println(hasilint()+" adalah angka integer");
    }
    public void methodD1() {
        System.out.println(hasildouble()+" adalah angka double");
    }
    
}

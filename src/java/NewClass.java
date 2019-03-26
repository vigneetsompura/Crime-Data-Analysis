
import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vigneet Sompura
 */
public class NewClass {
    public static void main(String args[]){
        double N = 1000000;
        double k = 20;
        for(double n=1; n<=N; n++){
            double sos  = 0;
            for(double i=0; i<k; i++){
                sos += (n+i)*(n+i);
            }
            if(ceil(sqrt(sos))==floor(sqrt(sos))){
                System.out.println(n);
            }
        }       
    }
}


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
        int N = 1000000;
        int k = 20;
        for(int n=1; n<=N; n++){
            double sos  = 0;
            for(int i=0; i<k; i++){
                sos += (n+i)*(n+i);
            }
            System.out.println(sqrt(sos));
            if(ceil(sqrt(sos))==floor(sqrt(sos))){
                System.out.println(n);
            }
        }       
    }
}

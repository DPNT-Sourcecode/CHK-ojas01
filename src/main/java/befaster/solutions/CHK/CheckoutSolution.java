package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int a = 0;
        int b = 0;
        int cgtw = 0;
        int dm = 0;
        int e = 0;
        int f = 0;
        int suma = 0;
        for(int i = 0; i < skus.length(); i++){
            if(skus.charAt(i) == 'A'){
                a++;
            } else if(skus.charAt(i) == 'B'){
                b++;
            } else if(skus.charAt(i) == 'C' || skus.charAt(i) == 'G' || skus.charAt(i) == 'T' || skus.charAt(i) == 'W'){
                cgtw++;
            } else if(skus.charAt(i) == 'D' || skus.charAt(i) == 'M'){
                dm++;
            } else if(skus.charAt(i) == 'E') {
                e++;
            } else if(skus.charAt(i) == 'F') {
                f++;
            } else {
                return -1;
            }
        }
        if(a >= 5){
            int rest;
            rest = a%5;
            if(rest >= 3){
                suma += (a/5)*200 + (rest/3)*130 + (rest%3)*50;
            } else {
                suma += (a/5)*200 + rest * 50;
            }
        } else if(a >= 3 && a < 5){
            suma += (a/3)*130 + (a%3)*50;
        } else {
            suma += a*50;
        }
        if(e >= 2){
            if(b > 0) {
                b = b - (e / 2);
            }
        }
        if(b >= 2){
            suma += (b/2)*45 + (b%2)*30;
        } else {
            suma += b*30;
        }
        if(f >= 3){
            suma += (f/3)*20 + (f%3)*10;
        } else {
            suma += f*10;
        }

        suma += cgtw*20;
        suma += dm*15;
        suma += e*40;



        return suma;
    }
}


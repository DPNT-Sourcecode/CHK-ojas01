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
        int h = 0;
        int counti = 0;
        int j = 0;
        int k = 0;
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
            } else if(skus.charAt(i) == 'H') {
                h++;
            } else if(skus.charAt(i) == 'I') {
                counti++;
            } else if(skus.charAt(i) == 'J') {
                j++;
            } else if(skus.charAt(i) == 'K') {
                k++;
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
        if(h >= 10){
            int rest;
            rest = h%10;
            if(rest >= 5){
                suma += (h/10)*80 + (rest/5)*45 + (rest%5)*10;
            } else {
                suma += (h/10)*80 + rest * 10;
            }
        } else if(h >= 5 && h < 10){
            suma += (h/5)*45 + (h%3)*10;
        } else {
            suma += a*50;
        }

        suma += cgtw*20;
        suma += dm*15;
        suma += e*40;
        suma += counti*35;
        suma += j*60;



        return suma;
    }
}




package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int suma = 0;
        for(int i = 0; i < skus.length(); i++){
            if(skus.charAt(i) == 'A'){
                a++;
            } else if(skus.charAt(i) == 'B'){
                b++;
            } else if(skus.charAt(i) == 'C'){
                c++;
            } else if(skus.charAt(i) == 'D'){
                d++;
            } else if(skus.charAt(i) == 'E') {
                e++;
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
        }
        if(a >= 3 && a < 5){
            suma += (a/3)*130 + (a%3)*50;
        } else {
            suma += a*50;
        }
        if(b >= 2){
            suma += (b/2)*45 + (b%2)*30;
        } else {
            suma += b*30;
        }

        suma += c*20;
        suma += d*15;
        if(e >= 2){
            suma += e*40 - (e/2)*30;
        } else {
            suma += e*40;
        }

        return suma;
    }
}



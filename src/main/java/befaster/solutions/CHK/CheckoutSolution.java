package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
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
            }
        }
        if(a >= 3){
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

        return suma;
    }
}



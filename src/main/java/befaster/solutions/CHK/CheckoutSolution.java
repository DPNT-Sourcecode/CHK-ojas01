package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int a = 0;
        int b = 0;
        int cgtw = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int h = 0;
        int counti = 0;
        int j = 0;
        int k = 0;
        int lx = 0;
        int m = 0;
        int n = 0;
        int oy = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int u = 0;
        int v = 0;
        int z = 0;
        int suma = 0;
        for(int i = 0; i < skus.length(); i++){
            if(skus.charAt(i) == 'A'){
                a++;
            } else if(skus.charAt(i) == 'B'){
                b++;
            } else if(skus.charAt(i) == 'C' || skus.charAt(i) == 'G' || skus.charAt(i) == 'T' || skus.charAt(i) == 'W'){
                cgtw++;
            } else if(skus.charAt(i) == 'D'){
                d++;
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
            } else if(skus.charAt(i) == 'L' || skus.charAt(i) == 'X') {
                lx++;
            } else if(skus.charAt(i) == 'N') {
                n++;
            } else if(skus.charAt(i) == 'M') {
                m++;
            } else if(skus.charAt(i) == 'O' || skus.charAt(i) == 'Y') {
                oy++;
            } else if(skus.charAt(i) == 'P') {
                p++;
            }  else if(skus.charAt(i) == 'Q') {
                q++;
            } else if(skus.charAt(i) == 'R') {
                r++;
            } else if(skus.charAt(i) == 'S') {
                s++;
            } else if(skus.charAt(i) == 'U') {
                u++;
            }  else if(skus.charAt(i) == 'V') {
                v++;
            } else if(skus.charAt(i) == 'Z') {
                z++;
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
            suma += h*50;
        }
        if(k >= 2){
            suma += (k/2)*150 + (k%2)*80;
        } else {
            suma += k*80;
        }
        if(n >= 3){
            if(m > 0) {
                m = m - (n / 3);
            }
        }
        if(p >= 5){
            suma += (p/5)*200 + (p%5)*50;
        } else {
            suma += p*50;
        }
        if(r >= 3){
            if(q > 0) {
                q = q - (r / 3);
            }
        }
        if(q >= 3){
            suma += (q/3)*80 + (q%3)*30;
        } else {
            suma += q*30;
        }
        if(u >= 4){
            suma += (u/4)*120 + (u%3)*40;
        } else {
            suma += u*40;
        }
        if(v >= 3){
            int rest;
            rest = v%3;
            if(rest >= 3){
                suma += (v/3)*130 + (rest/2)*90 + (rest%2)*50;
            } else {
                suma += (a/3)*130 + rest * 50;
            }
        } else if(v >= 2 && v < 3){
            suma += (v/2)*90 + (v%2)*50;
        } else {
            suma += v*50;
        }

        suma += cgtw*20;
        suma += d*15;
        suma += e*40;
        suma += counti*35;
        suma += j*60;
        suma += lx*90;
        suma += m*15;
        suma += n*40;
        suma += oy*10;
        suma += r*50;
        suma += s*30;
        suma += z*50;



        return suma;
    }
}





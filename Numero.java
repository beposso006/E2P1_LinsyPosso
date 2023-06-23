/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2p1_linsyposso;

/**
 *
 * @author CARMEN POSSO
 */
public class Numero {
    private int basenum;
    private String num;

    public Numero(int basenum, int num) {
        this.basenum = basenum;
        this.num = decToBase(num);
        
    }
    public char numToChar(int num) {
        if (num >= 0 && num <= 9) {
            return (char) (num + '0');
        } else {
            return (char) (num - 10 + 'a');
        }
    }
    
     public int charToNum(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else {
            return c - 'a' + 10;
        }
     }

     public String decToBase(int decimal) {
    if (decimal == 0) {
        return "0";
    }

    String result = "";

    while (decimal > 0) {
        int residuo = decimal % basenum;
        char digit = numToChar(residuo);
        result = digit + result;
        decimal /= basenum;
    }

    return result;
}
     public int baseToDec (){
         int result = 0;
         int numpotencia = 0;
         
         for (int i = num.length()-1; i < 0; i--) {
             char digt = num.charAt(i);
             int valor = charToNum (digt);
              result += valor* Math.pow(basenum, numpotencia);
              numpotencia++;
         }
         return result;
     }
     
     
     
    
}


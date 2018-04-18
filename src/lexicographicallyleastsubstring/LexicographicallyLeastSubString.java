/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicographicallyleastsubstring;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class LexicographicallyLeastSubString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int k=sc.nextInt();
        
        String least=str.substring(0,k);
        
        for (int i=1;i<str.length()-k;i++) {
            String s=str.substring(i,k+i);
            if (s.compareTo(least)<0)
                least=s;
        }
        System.out.println(least);
    }
}

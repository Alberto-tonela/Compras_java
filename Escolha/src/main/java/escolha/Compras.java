/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escolha;

import java.util.Scanner;

/**
 *
 * @author Alberto tonela
 */
public class Compras {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner (System.in);
        String resp;
        String  sim = "0";
        do{
        System.out.println("escolha [1] pra livros ou [2] pra telefone ");
         int ler = tec.nextInt();
         switch( ler){
             case 1:
                 System.out.println(" informe o total dos livros ");
                  int n = tec.nextInt();
                 int valor[] = new int[n];
                 int ano [] = new int[n];
                 String serie[] = new String[n];
                 for(int i = 0 ; i < n ; i++){
                     for(int j = 0 ; i< n ; i++){
                         for (int  k = 0 ; i < n ; i++){
                             System.out.println(" informe o valor  ");
                             valor[i] = tec.nextInt();
                             System.out.println(" informe o ano  ");
                             ano[i] = tec.nextInt();
                             System.out.println("  informe a serie ");
                             serie[i] = tec.next();
                             
                              
                         }
                     }
                 }
                 System.out.println("======================================================================");
                 for( int i = 0 ; i<n ; i++){
                     System.out.println(" o valor e "+valor[i]+" do ano de "+ano[i]+" cuja a serie e "+serie[i]);
                     System.out.println("====================================================================");
                 }
                 
                 
                 break;
             case 2:
                 System.out.println(" informe a quantidade de telefone ");
                 int q = tec.nextInt();
                 int valo[] = new int [q];
                 int an [] = new  int [q];
                 String seri[] = new String[q];
                 for(int l = 0 ; l < q ; l++){
                     for(int t = 0 ; l < q ; l++){
                         for (int a =  0 ; l < q ; l++){
                             System.out.println("digite o valor ");
                             valo[l]= tec.nextInt();
                             System.out.println(" digite o ano ");
                             an[l]= tec.nextInt();
                             System.out.println("igite a serie ");
                             seri[l]= tec.next();
                             
                             
                         }
                     }
                 }
                 System.out.println("_____________________________________________________________________________");
                 for( int l = 0 ; l< q ; l++){
                     
                     System.out.println(" o valor do custo e "+valo[l]+" do ano de fabrico de "+an[l]+
                             " cuja a serie e "+seri[l]);
                     System.out.println("____________________________________________________________________________");
                 }
                 break;
             case 3:
             default:
                 System.out.println(" invalido");
                 break;
         }
         System.out.println(" digite [nao] para terminar ou [sim] para continurar ");
         resp = tec.next();
        } while(resp.equals("sim"));
    }
    
}

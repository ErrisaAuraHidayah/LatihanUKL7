/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl7;
import java.util.Scanner;

/**
 *
 * @author erisa
 */
public class LatihanUKL7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //latihan A
        System.out.println("SOAL LATIHAN MATRIKS");
        System.out.println(" ");
        System.out.println("Latihan A");
        int [][] matriksA = {{1,6},{5,3}};
        int [][] matriksB = {{2},{3}};
        int [][] hasil = new int [matriksA.length][matriksB[0].length];
        
        for(int barisA = 0; barisA < matriksA.length; barisA++){
            for(int kolomB = 0; kolomB < matriksB[0].length; kolomB++){
                for(int c =0; c < matriksB.length; c++){
                    
                    hasil [barisA][kolomB] += matriksA[barisA][c] * matriksB[c][kolomB];
                    
                }
                System.out.print(hasil[barisA][kolomB]+ " ");
            }
            System.out.println(" ");
            
        }
        System.out.println(" ");
        System.out.println("Latihan B");
        int [][] matriksC = {{1,6},{5,3},{9,6}};
        int [][] matriksD = {{2},{3}};
        int [][] hasil2 = new int[matriksC.length][matriksD[0].length];
        
        
        for(int barisC= 0; barisC < matriksC.length; barisC++){
            for(int kolomD =0; kolomD < matriksD[0].length; kolomD++){
                for(int e =0; e < matriksB.length; e++){
                    
                    hasil2[barisC][kolomD] += matriksC[barisC][e] * matriksD[e][kolomD];
                    
                }
                System.out.print(hasil2[barisC][kolomD] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Latihan C");
        int [][] matriksE = {{1},{3},{6}};
        int [][] matriksF = {{2, 4, 6}};
        int [][] hasil3 = new int[matriksE.length][matriksF[0].length];
        
        
        for(int barisE= 0; barisE < matriksE.length; barisE++){
            for(int kolomF =0; kolomF < matriksF[0].length; kolomF++){
                for(int x =0; x < matriksF.length; x++){
                    
                    hasil3[barisE][kolomF] += matriksE[barisE][x] * matriksF[x][kolomF];
                    
                }
                System.out.print(hasil3[barisE][kolomF] + " ");
            }
            System.out.println(" ");
        }
      
        
       
    }
}
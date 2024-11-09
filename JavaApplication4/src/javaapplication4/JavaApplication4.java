/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author User
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] mark = new int[12];
        for(int i=0; i<mark.length;i++)
        {
            mark[i]=i+5;
        }
        for(int z=0;z<mark.length;z++)
        {
            System.out.print("mark["+z+"]="+mark[z]+"\n");
        }
	}
}
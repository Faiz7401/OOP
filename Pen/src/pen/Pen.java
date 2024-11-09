/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pen;

/**
 *
 * @author User
 */
public class Pen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        penn p = new penn();
        
        System.out.println("The colour of this pen is "+p.color);
        System.out.println(p.point);
        System.out.println(p.type);
        System.out.println(p.clicked);
        
        p.click();
        
        System.out.println(p.clicked);
    }
    
}

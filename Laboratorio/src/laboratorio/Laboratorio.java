/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author FilipeBarros
 */
public class Laboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal [] list = new Animal [15];
        for (int i = 2; i < list.length; i+=3) {
            
            list [i] = new Boi ();
            list [i-1] = new Sapo ();
            list [i-2] = new Cachorro ();
            
        }
        
        for (int i = 0; i < list.length; i++) {
            Animal animal = list[i];
            System.out.println(animal.som());
            
        }
    }
    
}

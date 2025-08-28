/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pigeon.platformer;

import javax.swing.JFrame;

/**
 *
 * @author alist
 */
public class PigeonPlatformer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //for the menu i'm thinking of using things like the auto completed 
        //switng frames or somthing 
        
        //create the frame and the set the size
        JFrame frame = new JFrame("Pugen Platformer");
        frame.setSize(500, 500);
        
        //allow the frame to be closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create the pallen for the frame allowing us to make it visible
        Panel panel = new Panel(frame);
        
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    
    }
    
}

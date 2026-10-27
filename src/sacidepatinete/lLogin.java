/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sacidepatinete;

/**
 *
 * @author vector
 */

public class lLogin extends javax.swing.JFrame 
{
    public lLogin() 
    {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(new login());
    pack();
    setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new lLogin().setVisible(true));
    }
}
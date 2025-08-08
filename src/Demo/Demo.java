/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author Pasindu Bandara
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("Final CorseWork");
        ControallerRoom cr = new ControallerRoom();
        cr.addDefence(new Helicopter(cr));
        cr.addDefence(new MainContraller(cr));
        cr.addDefence(new Tank(cr));
        cr.addDefence(new Submarine(cr));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author Pasindu Bandara
 */
public class ControallerRoom implements Contraller {
    private Contraller[] contrallerArray = new Contraller[20];
    private int nextIndex;
    private String sms;

    public void addDefence(Contraller obj) {
        contrallerArray[nextIndex++] = obj;
    }

    public void message(String sms) {
        if(sms != ""){
         this.sms = sms;
         setMessage(sms);
        }
    }
    public void setMessage(String sms){
        for (int i = 0; i < nextIndex; i++) {
            contrallerArray[i].message(sms);
        }
    }
}

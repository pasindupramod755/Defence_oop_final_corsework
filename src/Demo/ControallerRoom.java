/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author Pasindu Bandara
 */
public class ControallerRoom {

    private Contraller[] contrallerArray = new Contraller[20];
    private int nextIndex;
    private String sms;
    private int helicopterAmmo;
    private int helicopterFule;
    private int tankAmmo;
    private int tankFule;
    private int submarineAmmo;
    private int submarineFule;

    public void addDefence(Contraller obj) {
        contrallerArray[nextIndex++] = obj;
    }

    public void message(String sms) {
        if (sms != "") {
            this.sms = sms;
            setMessage(sms);
        }
    }

    public void setMessage(String sms) {
        for (int i = 0; i < nextIndex; i++) {
            contrallerArray[i].message(sms);
        }
    }

    public void areaClean() {
        for (int i = 0; i < nextIndex; i++) {
            contrallerArray[i].areaClean();
        }
    }

    public void areaNotClean() {
        for (int i = 0; i < nextIndex; i++) {
            contrallerArray[i].areaNotClean();
        }
    }

    public void privateMessage(String sms) {
        for (int i = 0; i < nextIndex; i++) {
            contrallerArray[i].privateMessage(sms);
        }
    }

    public void sliderController(int level) {
        for (int i = 0; i < nextIndex; i++) {
            contrallerArray[i].sliderController(level);
        }
    }

    public void mainMessage(String sms) {
        for (int i = 0; i < nextIndex; i++) {
            contrallerArray[i].mainMessage(sms);
        }
    }

    public void fuleCount(int soldier) {
        for (int i = 0; i < nextIndex; i++) {
            contrallerArray[i].fuleCount(soldier);
        }
    }

    public void buttonMessage(String massage) {
        for (int i = 0; i < nextIndex; i++) {
            contrallerArray[i].buttonMessage(massage);
        }
    }
    
    
    
    public void setHelicopterAmmo(int helicopterAmmo){
        this.helicopterAmmo = helicopterAmmo;
    }
    public int getHelicopterAmmo(){
        return helicopterAmmo;
    }
    public void setHelicopterFule(int helicopterFule){
        this.helicopterFule = helicopterFule;
    }
    public int getHelicopterFule(){
        return helicopterFule;
    }
    
    
    public void setTankAmmo(int tankAmmo){
        this.tankAmmo = tankAmmo;
    }
    public int getTankAmmo(){
        return tankAmmo;
    }
    public void setTankFule(int tankFule){
        this.tankFule = tankFule;
    }
    public int getTankFule(){
        return tankFule;
    }
    
    
    public void setSubmarineAmmo(int submarineAmmo){
        this.submarineAmmo = submarineAmmo;
    }
    public int getSubmarineAmmo(){
        return submarineAmmo;
    }
    public void setSubmarineFule(int submarineFule){
        this.submarineFule = submarineFule;
    }
    public int getSubmarineFule(){
        return submarineFule;
    }
    
    
    
}

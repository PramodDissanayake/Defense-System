/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defense.system;

/**
 *
 * @author Administrator
 */
public class DefenseSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Observerble observerble = Observerble.getinstace();
        
        Helicopter1  helicopter1 = new Helicopter1();
        Tank tank = new Tank();
        Submarine submarine = new Submarine();
        MainController mainController = new MainController();
        
        
        helicopter1.setVisible(true);
        tank.setVisible(true);
        submarine.setVisible(true);
        mainController.setVisible(true);
        
        
        
        observerble.addComp(helicopter1);
        observerble.addComp((Observer) tank);
        observerble.addComp((Observer) submarine);
        observerble.addComp((Observer) mainController);
        
        
        
    }
    
}
    


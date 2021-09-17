/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defultpackages;

/**
 *
 * @author alhan
 */
public class OlympicPerson extends Person{
    
    
     public OlympicPerson(JumpBehavior jumpBehavior){
        super(jumpBehavior);
    }
    public void performJump(){
        jumpBehavior.jump();
    }
    
}

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
public class main {
    
    public static void main(String[] args)
      {
         JumpBehavior jumpWithLegs = new JumpWithLegs();
        Person athletePerson = new OlympicPerson(jumpWithLegs);
        athletePerson.performJump();
          
      }
    
}

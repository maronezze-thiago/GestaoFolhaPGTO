/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaofinanceira3;

import java.util.logging.Logger;

/**
 *
 * @author THIAGODEOLIVEIRAMARO
 */
public class funcionariofixo extends funcionario{

    private double bonus;
  
    public funcionariofixo(double bonus, int id, String nome, String cpf, double salariobase) {
        super(id, nome, cpf, salariobase);
        this.bonus = bonus;
    }

  
    
    
//   
////    public double getBonus() {
////        return bonus;
////    }
////
////    public void setBonus(double bonus) {
////        this.bonus = bonus;
////    }


    
    @Override
    public double calcularsalario() {
        
        return this.salariobase + this.bonus ;
    }
    
    
    
    
}

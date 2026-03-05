/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaofinanceira3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THIAGODEOLIVEIRAMARO
 */
public class gerenciadorRH {

   protected List<funcionario> lista;

    

   
   
   public gerenciadorRH(){
        this.lista = new ArrayList<>();
    }
    

    
    
    
    
    public void adicionarfuncionario(funcionario funcionario){
        
        
        lista.add(funcionario);
        
    }
    
    
    public void listarfuncionario(){
        
        for(funcionario func : lista){
            
            System.out.println(func);
            
        }
        
    }
    
      
    public void limparfolha(){
        
        this.lista.clear();
    }

    
    
    public void calularfolha(){
        
        double total = 0;

        for (funcionario func : lista) {
            total += func.calcularsalario();
        }

        System.out.println("Total da folha: " + total);
    }

    
    
    
    
}

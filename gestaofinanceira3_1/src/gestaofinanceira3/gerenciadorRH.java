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

   private List<funcionario> lista;

    

   
   
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
        
    }
    
    
    
}

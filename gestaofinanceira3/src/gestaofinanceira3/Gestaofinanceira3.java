/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestaofinanceira3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author THIAGODEOLIVEIRAMARO
 */
public class Gestaofinanceira3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Random aleatorio = new Random();   
        Scanner sc1 = new Scanner(System.in);   // numeros
        Scanner sc2 = new Scanner(System.in);   // letras
        
        
        int contadorprincipal = 0;
                               gerenciadorRH rh = new gerenciadorRH();

        
        
        do{
            
            System.out.println("1 - cadastrar funcionario assalariado");
            System.out.println("2- cadastrar funcionario horista");
            System.out.println("3- listar funcionarios");
            System.out.println("4- listar folha");
            
            System.out.println("10- sair");
            
            contadorprincipal = sc1.nextInt();
            
            
            switch(contadorprincipal){
                
                case 1:
                    
                 
                    
                    System.out.println("nome do funcionario");
                    String nome = sc1.nextLine();  sc1.nextLine();
                    System.out.println("cpf");
                    String cpf = sc1.nextLine();
                    System.out.println("salario");
                    double salario = sc1.nextDouble();
                    sc1.nextLine();
                    System.out.println(" e qual e o bonus de salario dele?");
                    double bonus = sc1.nextDouble();
                    
                    funcionariofixo ff = new funcionariofixo(bonus,aleatorio.nextInt(1000), nome, cpf, salario);
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    

                    rh.adicionarfuncionario(ff);
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    break;
                
                    
                    
                case 2:
                    
                    System.out.println("nome");
        String nome2 = sc1.nextLine();
        sc1.nextLine();
                    System.out.println("cpf");
                    String cpf2 = sc1.nextLine();
                    System.out.println("valor da hora");
                    double valor = sc1.nextDouble();
                    System.out.println("horas trabalhadas");
                    double horas = sc1.nextDouble();
                    double salarioh = 0;
                    
                    funcionariohorista fh = new funcionariohorista(horas, valor, aleatorio.nextInt(100), nome2, cpf2, salarioh);
                    
                    
                    rh.adicionarfuncionario(fh);
                  
                    
                    break;
                case 3:  
                    
                    
                    
                    
                    rh.listarfuncionario();
                    
                    
                    
                    break;
                    
                    
                    
                    
                    
                case 4:
                    
                    
                    
                    
                    rh.calularfolha();
                    
                    
                    break;
                    
                    
                    
              
                
            }
            
            
            
            
            
            
            
            
            
        }while(contadorprincipal != 10);
        
        
        
        
        
        
        
        
        
    }
    
}

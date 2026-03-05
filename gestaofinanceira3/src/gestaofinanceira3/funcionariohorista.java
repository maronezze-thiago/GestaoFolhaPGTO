/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaofinanceira3;

/**
 *
 * @author THIAGODEOLIVEIRAMARO
 */
public class funcionariohorista extends funcionario{

//    public String identificacao;
    public double horastrabalhadas;
    public double valorhora;

    public funcionariohorista( double horastrabalhadas, double valorhora, int id, String nome, String cpf, double salariobase) {
        super(id, nome, cpf, salariobase);
//        this.identificacao = identificacao;
        this.horastrabalhadas = horastrabalhadas;
        this.valorhora = valorhora;
    }

    public funcionariohorista(int id, String nome, String cpf, double salariobase) {
        super(id, nome, cpf, salariobase);
    }
    
    
    
    
//    
//    public funcionariohorista(int id, String nome, String cpf, double salariobase) {
//        super(id, nome, cpf, salariobase);
//    }

    public double getHorastrabalhadas() {
        return horastrabalhadas;
    }

    public void setHorastrabalhadas(double horastrabalhadas) {
        this.horastrabalhadas = horastrabalhadas;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    @Override
    public double calcularsalario() {
        
        this.salariobase = this.horastrabalhadas * this.valorhora;
        return this.salariobase;
        
    }
    
    
    
    
    
    
    
    
    
    
}

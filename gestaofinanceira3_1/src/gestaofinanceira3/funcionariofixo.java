/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaofinanceira3;

/**
 *
 * @author THIAGODEOLIVEIRAMARO
 */
public class funcionariofixo extends funcionario{

    public funcionariofixo(int id, String nome, String cpf, double salariobase) {
        super(id, nome, cpf, salariobase);
    }

    funcionariofixo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    
    
    
    
    @Override
    public double calcularsalario() {
        
        return this.salariobase;
    }
    
    
    
    
}

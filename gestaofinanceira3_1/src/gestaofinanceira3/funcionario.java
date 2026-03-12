/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaofinanceira3;

/**
 *
 * @author THIAGODEOLIVEIRAMARO
 */
public abstract class funcionario {
    
    public int id;
    public String nome;
    public String cpf;
    public double salariobase;

    public funcionario(int id, String nome, String cpf, double salariobase) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salariobase = salariobase;
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
    public String toString() {
        return "funcionario{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", salariobase=" + salariobase + '}';
    }
    
    
    
    
    
    
    
   public double calcularsalario(){
        return this.salariobase;
    }
    
    
    
}

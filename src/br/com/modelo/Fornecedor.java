package br.com.modelo;

public class Fornecedor extends Pessoa{
    private String cnpj;

    public Fornecedor() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "cnpj=" + cnpj + '}';
    }
    
    
   
  
    
    
    
}

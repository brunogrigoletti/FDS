package br.pucrs.bruno.laitano;

public class ContaCorrente {
    private String nro;
    private String nome;
    private String categoria;
    private double saldo;

    public ContaCorrente(String nro, String nome) {
        this.nro=nro;
        this.nome=nome;
        this.saldo=0;
        this.categoria="Silver";
    }

    public String getNumeroConta() {
        return this.nro;
    }

    public String getNomeCorrentista() {
        return this.nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setSaldo(double novoSaldo){
        this.saldo=novoSaldo;
    }

    public void setCategoria(String novaCategoria){
        this.categoria=novaCategoria;
    }

    public boolean deposito(double valor) {
        if (this.getCategoria().equalsIgnoreCase("silver")){
            this.setSaldo(valor);
            if (this.getSaldo()>=50.000)
                this.setCategoria("gold");
            return true;
        }
        else if (this.getCategoria().equalsIgnoreCase("gold")){
            this.setSaldo(valor+(valor*0.01));
            if (this.getSaldo()>=200.000)
                this.setCategoria("platinum");
            return true;
        }
        else if (this.getCategoria().equalsIgnoreCase("platinum")){
            this.setSaldo(valor+(valor*0.025));
            return true;
        }
        else{
            return false;
        }
    }

    public boolean saque(double valor) {
        double novoSaldo = this.getSaldo()-valor;
        if (getCategoria().equalsIgnoreCase("platinum") && novoSaldo<100.000){
            this.setCategoria("gold");
            this.setSaldo(novoSaldo);
            return true;
        }
        else if (getCategoria().equalsIgnoreCase("gold") && novoSaldo<25.000){
            this.setCategoria("silver");
            this.setSaldo(novoSaldo);
            return true;
        }
        else{
            return false;
        }
    }
}
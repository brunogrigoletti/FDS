public class Credito implements FormaPagamento{
    private double valor;
    private double parcelas;

    public Credito(double valor, double parcelas){
        this.valor=valor;
        this.parcelas=parcelas;
    }

    @Override
    public double calcular(){
        double taxaJuros = 0.05;
        double prestacao = (this.valor*taxaJuros)/(1-Math.pow(1+taxaJuros,-this.parcelas));
        return prestacao * this.parcelas;
    }
}
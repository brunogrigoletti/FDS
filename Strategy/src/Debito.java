public class Debito implements FormaPagamento{
    private double valor;

    public Debito(double valor){
        this.valor=valor;
    }

    @Override
    public double calcular(){
        return this.valor-(this.valor*0.10);
    }
}
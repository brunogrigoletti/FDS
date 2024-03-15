public class Pix implements FormaPagamento{
    private double valor;

    public Pix(double valor){
        this.valor=valor;
    }

    @Override
    public double calcular(){
        return this.valor-(this.valor*0.30);
    }
}
public class Pagamento {
    public double pagar(FormaPagamento formaPagamento){
        return formaPagamento.calcular();
    }
}
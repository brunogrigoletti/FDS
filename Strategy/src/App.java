public class App {
    public static void main(String[] args){
        Pagamento pag = new Pagamento();

        System.out.println("Uma compra no valor de R$ 100,00 sairia: ");
        System.out.printf("No PIX: %.2f reais.\n",pag.pagar(new Pix(100)));
        System.out.printf("No Débito: %.2f reais.\n",pag.pagar(new Debito(100)));
        System.out.printf("No Crédito: %.2f reais.\n",pag.pagar(new Credito(100,5)));
    }
}
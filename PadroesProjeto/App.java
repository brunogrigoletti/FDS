public class App {
    public static void main(String[] args) throws Exception {

        // Comentário inserido no branch 'main'

        // Bug resolvido

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);

        // Adicionando carros...
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        Carro utilitario = new Carro("Utilitário", TipoCombustivel.DIESEL, 5, 70);
        Carro suv = new Carro("SUV", TipoCombustivel.GASOLINA, 8, 55);
        //CarroFlex suvFlex = new CarroFlex("SUV Flex", TipoCombustivel.FLEX, 8, 6, 65);
        //CarroEcono econo = new CarroEcono("Econo", TipoCombustivel.GASOLINA, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(basico);
        System.out.println(utilitario);
        System.out.println(suv);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);
    }
}

public class Carro {

    // Comentário inserido no branch 'main'

    private String modelo;
    private Motor motor;
    private TanqueCombustivel tanque;

    public Carro(String modelo, TipoCombustivel tipoCombustivel, int consumoMotor, int capacidadeTanque) {
        this.modelo = modelo;
        motor = new Motor(tipoCombustivel, consumoMotor);
        tanque = new TanqueCombustivel(tipoCombustivel, capacidadeTanque);
    }

    public CarroFlex(String modelo, TipoCombustivel tipoCombustivel, int consumoMotorGas, int consumoMotorAlc, int capacidadeTanque) {
        this.modelo = modelo;
        motor = new Motor(tipoCombustivel, consumoMotor);
        tanque = abastece(tipoCombustivel,capacidadeTanque);
    }

    public CarroEcono(String modelo, TipoCombustivel tipoCombustivel, int capacidadeTanque) {
        this.modelo = modelo;
        motor = new Motor(tipoCombustivel, consumoMotor);
        tanque = abastece(tipoCombustivel,capacidadeTanque);
        int consumoMotor = 0;
        if (this.motor.getQuilometragem()==0)
            consumoMotor = 20;
        else{
            while (consumoMotor>=10){
                consumoMotor = motor.getQuilometragem()/5000;
            }
        }
    }

    public String getModelo() {
        return modelo;
    }

    public int getCombustivelDisponivel() {
        return tanque.getCombustivelDisponivel();
    }

    // Retorna a quantidade efetivamente abastecida
    public int abastece(TipoCombustivel tipoCombustivel, int quantidade) {
        int capacidadeLivre = tanque.getCapacidade() - tanque.getCombustivelDisponivel();
        if (capacidadeLivre < quantidade) {
            tanque.abastece(tipoCombustivel, capacidadeLivre);
            return capacidadeLivre;
        } else {
            tanque.abastece(tipoCombustivel, quantidade);
            return quantidade;
        }
    }

    // Retorna a distancia que consegue viajar com o combustivel remanescente
    public int verificaSePodeViajar(int distancia) {
        int combustivelNecessario = motor.combustivelNecessario(distancia);
        if (tanque.getCombustivelDisponivel() >= combustivelNecessario) {
            return distancia;
        } else {
            return tanque.getCombustivelDisponivel() * motor.getConsumo();
        }
    }

    // Retorna true se conseguiu viajar
    public boolean viaja(int distancia) {
        if (verificaSePodeViajar(distancia) >= distancia) {
            motor.percorre(distancia);
            tanque.gasta(motor.combustivelNecessario(distancia));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carro:\n  Modelo=" + modelo + "\n  Motor=" + motor + "\n  Tanque=" + tanque;
    }
}

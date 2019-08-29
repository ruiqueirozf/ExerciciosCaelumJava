package app;

public class App {
    public static void main(String[] args) throws Exception {

        Conta conta = new Conta("rui", 123, "itau", 1000.0, "10/11/2019");
        conta.saca(500.0);
        conta.saca(300.0);
        conta.deposita(50.0);
        conta.calculaRendimento();
        conta.recuperaDadosParaImpressao();
    }
}
public class App {
    public static void main(String[] args) {
        Calculadora calculadoraDeIdades = new Calculadora();
        int somaDasIdades = calculadoraDeIdades.somar(33, 54);
        System.out.println(somaDasIdades);

        int subtracaoDasIdades = calculadoraDeIdades.subtrai(80,100);
        System.out.println(subtracaoDasIdades);

        int multiplicacaoDeIdades = calculadoraDeIdades.multiplica(10,25);
        System.out.println(multiplicacaoDeIdades);

        int divisaoDeIdades = calculadoraDeIdades.divide(100,4);
        System.out.println(divisaoDeIdades);

        Comparador comparadorDeNumeros = new Comparador();
        boolean menor = comparadorDeNumeros.menorQue(10,20);
        System.out.println(menor);

        boolean maior = comparadorDeNumeros.maiorQue(10,20);
        System.out.println(maior);
    }
}
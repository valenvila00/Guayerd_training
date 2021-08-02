public class Main {
    public static void main(String[] args) {
        //expresion lambda {parametros} -> {sentencias}
        ISaludo saludo = System.out::println; //referencia de metodo

        saludo.saludar("Hola a todos :)");

    }
}

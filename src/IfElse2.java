public class IfElse2 {
 //FESTA DA GRAZY
    static void main() {
        int idade = Integer.parseInt(IO.readln("Digite sua idade:"));

        if (idade < 18) {
            IO.println("Pode entrar e curtir a RB");
        } else{
            IO.println("Ta velho dorme");
        }
    }
}

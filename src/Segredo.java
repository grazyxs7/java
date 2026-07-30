public class Segredo {
  static void main() {

        String segredos = "2208";
        String tentativa = "";


        while (!segredos.equals(tentativa)) {

            tentativa = IO.readln("Digite o segredo: ");

            if (!segredos.equals(tentativa)) {
                IO.println("Errou feio, melhore!");
            }
        }
        IO.println("Parabens voce acertou, topper!");

    }
}

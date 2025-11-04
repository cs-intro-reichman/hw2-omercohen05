public class Cheers {
        public static void main(String[] args) {
                String word = args[0].toUpperCase();
                int chants = Integer.parseInt(args[1]);

                String specials = "AEFHILMNORSX";

                for (int i = 0; i < word.length(); i++) {
                        char letter = word.charAt(i);
                        String connector = (specials.indexOf(letter) != -1) ? "an" : "a ";
                        System.out.println("Give me " + connector + " " + letter + ": " + letter + "!");
                }

                System.out.println("What does that spell?");
                for (int i = 0; i < chants; i++) {
                        System.out.println(word + "!!!");
                }
        }
}

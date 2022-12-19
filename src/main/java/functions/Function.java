package functions;

import io.quarkus.funqy.Funq;
import java.util.*;

/**
 * Your Function class
 */
public class Function {

    @Funq
public Output function(Input input) {
   Map<String, String> greetings = Map.of(
                   "english", "Welcome",
                   "spanish", "Bienvenido",
                   "italian", "Benvenuto",
                   "portuguese", "Bem-Vindo",
                   "czech", "Vítejte");

   String lang = Optional.ofNullable(input.getLanguage()).orElse("english");
   String greeting = greetings.getOrDefault(lang, "");

   return new Output(String.format("%s!!! Here is your message: %s", greeting,
       input.getMessage()));
}


}

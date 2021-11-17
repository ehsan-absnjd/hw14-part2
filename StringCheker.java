package StringChecker;

import java.util.function.Predicate;

public class StringCheker {
    public static void main(String[] args) {

        String str = "aasdg a";
        Predicate<String> stringPredicate = s -> s.charAt(0)==s.charAt(s.length()-1);
        System.out.println(stringPredicate.test(str));
    }
}

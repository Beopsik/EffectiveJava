package Item05;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

//적절한 구현
public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Supplier<Lexicon> dictionary){
        this.dictionary= Objects.requireNonNull(dictionary.get())
    }
    public SpellChecker(Lexicon dictionary){
        this.dictionary=dictionary;
    }

    public boolean isValid(String word){
        throw new UnsupportedOperationException();
    }

    public List<String> suggestions(String typo){
        throw new UnsupportedOperationException();
    }
}

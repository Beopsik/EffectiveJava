package Item05;

public class Main {

    public static void main(String[] args) {
//        SpellChecker_StaticUtil.isValid("hello");
//        SpellChecker_Singleton.INSTANCE.isValid("hello");
//        Lexicon lexicon=new KoreanDictionary();
//        SpellChecker spellChecker=new SpellChecker(lexicon);
        Lexicon lexicon=new TestDictionary();
        SpellChecker spellChecker=new SpellChecker(()->lexicon);
        spellChecker.isValid("hello");
    }
}
interface Lexicon{}

class KoreanDictionary implements Lexicon{}

class TestDictionary implements Lexicon{}

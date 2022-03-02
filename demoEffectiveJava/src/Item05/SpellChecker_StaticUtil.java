package Item05;

import java.util.List;

//정적 유틸리티의 잘못 사용한 예 - 유연하지 않고 테스트하기 어렵다.
public class SpellChecker_StaticUtil {
    private static final  Lexicon dictionary=new KoreanDictionary();

    private SpellChecker_StaticUtil(){
        //Noninstantiable
    }

    public static boolean isValid(String word){
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo){
        throw new UnsupportedOperationException();
    }
}

interface Lexicon{}

class KoreanDictionary implements Lexicon{}

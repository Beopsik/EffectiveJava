package Item05;

import java.util.List;

//싱글톤을 잘못 사용한 예-유연하지 않고 테스트하기 어렵다.
public class SpellChecker_Singleton {
    private final Lexicon dictionary=new KoreanDictionary();
    private SpellChecker_Singleton(){

    }
    public static final SpellChecker_Singleton INSTANCE=new SpellChecker_Singleton(){

    };

    public boolean isValid(String word){
        throw new UnsupportedOperationException();
    }

    public List<String> suggestion(String typo){
        throw new UnsupportedOperationException();
    }
}


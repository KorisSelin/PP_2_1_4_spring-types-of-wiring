package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    private Needle7 needle;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
    @Autowired
    public void method ( Needle7 needle7 ){
        this.needle = needle7;
    }
}

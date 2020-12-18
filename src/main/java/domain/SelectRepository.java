package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectRepository {
    private static List<Select> selects = new ArrayList<>();

    public static List<Select> selects(){
        return Collections.unmodifiableList(selects);
    }

    public static void addSelect(Select select){
        selects.add(select);
    }

}

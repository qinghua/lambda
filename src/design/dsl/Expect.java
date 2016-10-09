package design.dsl;

import java.util.ArrayList;
import java.util.List;

public class Expect {

    private List<String> descptions;

    public Expect(List<String> descptions) {
        this.descptions = new ArrayList<>();
        this.descptions.add("这儿有点问题:");
        this.descptions.addAll(descptions);
    }

    public void that(boolean b) {
        if (!b) throw new AssertionError(String.join("\n", descptions));
    }
}

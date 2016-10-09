package design.dsl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class It {
    private String descption;

    public It(String description) {
        this.descption = description;
    }

    public void should(String description, Consumer<Expect> consumer) {
        List<String> descptions = new ArrayList<>(Arrays.asList(this.descption, description));
        consumer.accept(new Expect(descptions));
    }
}

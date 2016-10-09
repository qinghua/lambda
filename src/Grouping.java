import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Model.UserModel;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

public class Grouping {

    public static void main(String[] args) {
        List<UserModel> users = new ArrayList<>();
        users.add(new UserModel(1, true, "ggg"));
        users.add(new UserModel(2, true, "loxes"));
        users.add(new UserModel(3, false, "mm"));
        users.add(new UserModel(4, false, "mm"));

        Map<Boolean, List<UserModel>> collection1 = users.stream().collect(partitioningBy(UserModel::isMale));
        Map<String, List<UserModel>> collection2 = users.stream().collect(groupingBy(UserModel::getName));
        Map<Boolean, Long> collection3 = users.stream().collect(groupingBy(user -> user.isMale(), counting()));
        Map<Boolean, List<String>> collection4 = users.stream().collect(groupingBy(user -> user.isMale(), mapping(UserModel::getName, toList())));
        String names = users.stream().map(UserModel::getName).collect(Collectors.joining(","));
        System.out.println(names);
    }
}

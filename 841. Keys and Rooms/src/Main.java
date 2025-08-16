import model.Solution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1));
        rooms.add(List.of(2));
        rooms.add(List.of(3));
        rooms.add(new ArrayList<>());
        System.out.println(solution.canVisitAllRooms(rooms));
    }
}

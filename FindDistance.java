import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FindDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader reared = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reared.readLine().split(" ");
        List listOfNumbers = new ArrayList();
        for (String x : numbers) {
            listOfNumbers.add(numbers);
        }

        int firstMinIndex = findMinIndex(listOfNumbers);
        listOfNumbers.set(firstMinIndex, 666666666);
        int secondMinIndex = findMinIndex(listOfNumbers);

        System.out.println(secondMinIndex - firstMinIndex);
    }

    public static int findMinIndex(List<Integer> list) {
        int minIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(minIndex)) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}

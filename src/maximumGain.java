import java.util.ArrayList;

public class maximumGain {
    public static int maxGain(int[] a) {
        ArrayList<Integer> gains = new ArrayList<>();
        int maxGain = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                gains.add(a[i + 1] - a[i]);
            }
        }
        if (gains.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < gains.size() - 1; i++) {
            int initial = gains.get(i);
            if (initial > maxGain) {
                maxGain = initial;
            }
        }

        return maxGain;
    }
}

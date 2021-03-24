import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {
    private static final Logger logger = LoggerFactory.getLogger(BinarySearch.class);
    private static final Logger secondLogger = LoggerFactory.getLogger("logger");

    public static int binarySearchMethod(int[] array, int start, int end, int target) {


        if (end < start) {
            throw new IllegalArgumentException("end<start");
        }
        int middleElementIndex = (end + start) / 2;
        logger.debug("middle {}", middleElementIndex);
        secondLogger.debug("middle {}", middleElementIndex);

        if (target == array[middleElementIndex]) {
            return middleElementIndex;
        } else if (target < array[middleElementIndex]) {
            return binarySearchMethod(array, start, middleElementIndex - 1, target);
        } else return binarySearchMethod(array, middleElementIndex + 1, end, target);
    }



}

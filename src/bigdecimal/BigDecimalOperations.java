import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static double roundToHundredth(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double reverseSignAndRoundToTenth(BigDecimal value) {
        return value.negate().setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}

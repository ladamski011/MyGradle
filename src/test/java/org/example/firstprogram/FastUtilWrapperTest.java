import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;

import it.unimi.dsi.fastutil.doubles.Double2DoubleArrayMap;
import org.example.firstprogram.FastUtilWrapper;
import org.junit.jupiter.api.Test;

public class FastUtilWrapperTest {
    @Test
    void newlyCreatedWrapperHasEmptyMap() throws Exception {
        FastUtilWrapper wrapper = new FastUtilWrapper();

        Field mapField = FastUtilWrapper.class.getDeclaredField("map");
        mapField.setAccessible(true);
        Double2DoubleArrayMap map = (Double2DoubleArrayMap) mapField.get(wrapper);

        assertTrue(map.isEmpty(), "Wrapped map should start empty");
    }
}

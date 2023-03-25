package ru.rtinform.counter

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CounterTest {

    @Test
    void transformIntegerTest() {
        int[] array = new int[]{1, 3, 4, 5, 1, 5, 4, 3, 3, 6}
        Map res = Counter.transform(array)

        Assertions.assertNotNull(res)
        Assertions.assertEquals(5, res.size())
        Assertions.assertEquals(2, res.get(1))
        Assertions.assertEquals(3, res.get(3))
        Assertions.assertEquals(2, res.get(4))
        Assertions.assertEquals(2, res.get(5))
        Assertions.assertEquals(1, res.get(6))
    }

    @Test
    void transformLongTest() {
        long[] array = new long[]{1, 3, 4, 5, 1, 5, 4, 3, 3, 6}
        Map res = Counter.transform(array)

        Assertions.assertNotNull(res)
        Assertions.assertEquals(5, res.size())
        Assertions.assertEquals(2, res.get(1L))
        Assertions.assertEquals(3, res.get(3L))
        Assertions.assertEquals(2, res.get(4L))
        Assertions.assertEquals(2, res.get(5L))
        Assertions.assertEquals(1, res.get(6L))
    }

    @Test
    void transformDoubleTest() {
        double[] array = new double[]{1.2, 3.1, 4.3, 5.7, 1.2, 5.7, 4.3, 3.1, 3.1, 6.9}
        Map res = Counter.transform(array)

        Assertions.assertNotNull(res)
        Assertions.assertEquals(5, res.size())
        Assertions.assertEquals(2, res.get(1.2d))
        Assertions.assertEquals(3, res.get(3.1d))
        Assertions.assertEquals(2, res.get(4.3d))
        Assertions.assertEquals(2, res.get(5.7d))
        Assertions.assertEquals(1, res.get(6.9d))
    }

    @Test
    void transformStringTest() {
        String[] array = new String[]{"abc", "def", "ghi", "jkl", "abc", "jkl", "ghi", "def", "def", "mno"}
        Map res = Counter.transform(array)

        Assertions.assertNotNull(res)
        Assertions.assertEquals(5, res.size())
        Assertions.assertEquals(2, res.get("abc"))
        Assertions.assertEquals(3, res.get("def"))
        Assertions.assertEquals(2, res.get("ghi"))
        Assertions.assertEquals(2, res.get("jkl"))
        Assertions.assertEquals(1, res.get("mno"))
    }

    @Test
    void transformEmptyArrayTest() {
        int[] array = new int[]{}
        Map res = Counter.transform(array)

        Assertions.assertNotNull(res)
        Assertions.assertTrue(res.isEmpty())
    }
}
package Rooks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void test2() {
        Assert.assertFalse(Rooks.canCapture(new String[]{"A1", "B2"}));
    }

    @Test
    public void test3() {
        Assert.assertTrue(Rooks.canCapture(new String[]{"H4", "H3"}));
    }

    @Test
    public void test4() {
        Assert.assertFalse(Rooks.canCapture(new String[]{"F5", "C8"}));
    }

    @Test
    public void test5() {
        Assert.assertTrue(Rooks.canCapture(new String[]{"G3", "G7"}));
    }

    @Test
    public void test6() {
        Assert.assertTrue(Rooks.canCapture(new String[]{"B3", "B2"}));
    }

    @Test
    public void test7() {
        Assert.assertFalse(Rooks.canCapture(new String[]{"F5", "B2"}));
    }

    @Test
    public void test8() {
        Assert.assertFalse(Rooks.canCapture(new String[]{"H5", "C8"}));
    }

    @Test
    public void test1() {
        Assert.assertTrue(Rooks.canCapture(new String[]{"A8", "E8"}));
    }
}
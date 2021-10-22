package NameSwap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NameSwapTest {
    @Test
    public void test1() {
        String swapped = NameSwap.shuffle("Donald Trump");
        Assert.assertEquals("Trump Donald", swapped,
                "expected: Trump Donald but found: " + swapped);
    }

    @Test
    public void test2() {
        String swapped = NameSwap.shuffle("Rosie O'Donnel");
        Assert.assertEquals("O'Donnel Rosie", swapped,
                "expected: O'Donnel Rosie but found: " + swapped);
    }

    @Test
    public void test3() {
        String swapped = NameSwap.shuffle("Seymour Butts");
        Assert.assertEquals("Butts Seymour", swapped,
                "expected: Butts Seymour but found: " + swapped);
    }

    @Test
    public void test4() {
        String swapped = NameSwap.shuffle("Ebony Greene");
        Assert.assertEquals("Greene Ebony", swapped,
                "expected: Butts Seymour but found: " + swapped);
    }

    @Test
    public void test5() {
        String swapped =  NameSwap.shuffle("Ken Kennedy");
        Assert.assertEquals("Kennedy Ken", swapped, "expected: Kennedy Ken but found: " + swapped);
    }

}
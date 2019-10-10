package org.jenkinsci.plugins.scoverage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoverageResultTest {
    private ScoverageResult result = new ScoverageResult(95.27, 50.0, 1);

    @Test
    public void toStringTest() {
        assertEquals(result.toString(), "95.3% / 50.0%");
    }
}

package com.agiledeveloper;

import junit.framework.TestCase;

import static com.agiledeveloper.Sample.isPrimeFunctional;
import static com.agiledeveloper.Sample.isPrimeIterative;

/**
 * Created by Bext on 17/02/2017.
 */
public class SampleTest extends TestCase {
    public void testIsPrimeIterative() throws Exception {
        boolean i = isPrimeIterative(2000);
    }

    public void testIsPrimeFunctional() throws Exception {
        boolean i = isPrimeFunctional(2000);
    }

}
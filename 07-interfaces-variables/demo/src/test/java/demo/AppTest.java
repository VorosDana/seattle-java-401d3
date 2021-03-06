/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import critters.Cat;
import critters.NoiseMakerOutputService;
import critters.Robot;
import critters.TestLogger;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testOutputsLoudNoises() {
        // We want to test that our noisemaker can distinguish between
        // quiet and loud noises.
        // but it's designed to output!

        // so we abstract out the logger - allowing different implementations
        // the test uses the TestLogger
        TestLogger logger = new TestLogger();

        // we pass it into the service
        NoiseMakerOutputService service = new NoiseMakerOutputService(logger);

        // and use it like normal
        Robot robot = new Robot("TEST");
        service.output(robot);

        // but we can access the of logged items to verify it worked!
        assertEquals(1, logger.logged.size());
    }

    @Test
    public void testOutputsQuietNoises() {
        TestLogger logger = new TestLogger();
        NoiseMakerOutputService service = new NoiseMakerOutputService(logger);

        Cat cat = new Cat("TEST");

        service.output(cat);

        assertEquals(0, logger.logged.size());
    }
}

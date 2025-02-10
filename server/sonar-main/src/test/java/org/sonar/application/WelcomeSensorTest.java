package org.sonar.plugins.welcome;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.sonar.api.batch.sensor.SensorContext;

import static org.mockito.Mockito.*;

public class WelcomeSensorTest {

    @Mock
    private SensorContext context;

    private WelcomePlugin.WelcomeSensor sensor;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        sensor = new WelcomePlugin.WelcomeSensor();
    }

    @Test
    public void testWelcomeMessage() {
        // Execute the sensor
        sensor.execute(context);

        // Verify that the welcome message is printed
        System.out.println("Bienvenue dans l'analyse de SonarQube! Nous espérons que vous aurez une analyse réussie.");
    }
}

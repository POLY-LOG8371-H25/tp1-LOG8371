package org.sonar.plugins.welcome;

import org.sonar.api.Plugin;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;

import java.util.Collections;

class WelcomePlugin implements Plugin {
    @Override
    public void define(Context context) {
        context.addExtensions(Collections.singletonList(WelcomeSensor.class));
    }

    public static class WelcomeSensor implements Sensor {
        @Override
        public void describe(SensorDescriptor descriptor) {
            descriptor.name("Welcome Sensor");
        }

        @Override
        public void execute(SensorContext context) {
            System.out.println("Bienvenue dans l'analyse de SonarQube! Nous espérons que vous aurez une analyse réussie.");
        }
    }
}

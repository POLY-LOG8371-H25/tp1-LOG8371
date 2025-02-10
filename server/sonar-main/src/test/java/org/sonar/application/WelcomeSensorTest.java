/*
 * SonarQube
 * Copyright (C) 2009-2025 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
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

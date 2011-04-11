/*
 * Sonar, open source software quality management tool.
 * Copyright (C) 2008-2011 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * Sonar is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sonar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.java.bytecode.asm;

import org.junit.Test;
import org.sonar.java.ast.SquidTestUtils;
import org.sonar.java.bytecode.ClassworldsClassLoader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AsmFieldVisitorTest {

  @Test
  public void testVisitStringField() {
    AsmClassProviderImpl classProvider = new AsmClassProviderImpl(ClassworldsClassLoader.create(SquidTestUtils.getFile("/bytecode/bin/")));
    AsmClass fileClass = classProvider.getClass("tags/SourceFile");
    assertEquals(5, fileClass.getFields().size());
    AsmField field = fileClass.getField("path");
    assertTrue(field.isStatic());
    assertTrue(field.isPublic());
  }
}

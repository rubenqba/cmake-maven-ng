package org.apache.maven.plugin.cmake.ng;

import java.io.File;

import org.apache.maven.plugin.Mojo;
import org.apache.maven.plugin.testing.AbstractMojoTestCase;

public class GenerateMojoTest extends AbstractMojoTestCase {

	public void testMojoLookup() throws Exception {
		File pluginXml = new File(getBasedir(),
		        "src/test/resources/unit/plugin-config.xml");
		Mojo mojo = lookupMojo("generate", pluginXml);
		assertNotNull(mojo);
		assertTrue(mojo instanceof GenerateMojo);

	}
	// public void testMojoExecution() throws Exception {
	// File pluginXml = new File(getBasedir(),
	// "src/test/resources/unit/plugin-config.xml");
	// GenerateMojo mojo = (GenerateMojo) lookupMojo("generate", pluginXml);
	// assertNotNull(mojo);
	// try {
	// mojo.execute();
	// } catch (Exception e) {
	// fail("Unexpected exception with test data.");
	// }
	// }
}
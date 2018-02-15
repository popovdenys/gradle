package api.groovy.version;

import org.gradle.api.GradleException

public class Version {
	
	Properties versionProps
	
	Version(File versionFile) {
		
		println 'Reading the version file.'
		
		if(!versionFile.exists()) {
			throw new GradleException("Required version file does not exist : $versionFile.canonicalPath")
		}
		
		this.versionProps = new Properties()
		
		versionFile.withInputStream { stream ->
			versionProps.load(stream)
		}
		
	}
	
	@Override
	String toString() {
		new ProjectVersion(versionProps.major.toInteger(), versionProps.minor.toInteger(), versionProps.release.toBoolean())
	}
}

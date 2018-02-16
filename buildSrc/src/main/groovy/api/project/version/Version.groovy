package api.project.version;

import org.gradle.api.GradleException

public class Version {
	
	File versionFile
	
	Version(File versionFile) {
		
		this.versionFile = versionFile
		
	}
	
	ProjectVersion getVersion() {
		
		println 'Reading the version file.'
		
		checkFile()
		
		Properties versionProps = new Properties()
		
		versionFile.withInputStream { stream -> versionProps.load(stream) }
		
		new ProjectVersion(versionProps.major.toInteger(), versionProps.minor.toInteger(), versionProps.release.toBoolean())
		
	}
	
	void checkFile() {
		
		if(!versionFile.exists()) {
			
			throw new GradleException("Required version file does not exist : $versionFile.canonicalPath")
			
		}
		
	}
}

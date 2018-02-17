package api.project.version;

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

class IncrementMajorVersion extends DefaultTask {
	
	@Input Integer major
	@OutputFile File destFile
	
	IncrementMajorVersion() { }
	
	@TaskAction
	void run() {
		
		String currentProjectVersion = project.version
		
		++project.version.major
		
		String newProjectVersion = project.version
		
		println "Incrementing major project version : $currentProjectVersion -> $newProjectVersion"
		
		ant.propertyfile( file : destFile ) {
			
			entry( key: 'major', type: 'int', operation: '+', value: 1 )
			
		}
	}

}
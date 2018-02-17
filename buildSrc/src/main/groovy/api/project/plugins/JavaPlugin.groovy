package api.project.plugins;

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

class JavaPlugin implements Plugin<Project> {
	
	void apply(Project project) {
		
		project.apply(plugin : "java-base")
		
		project.sourceSets {
			
			main {
				// ToDo
			}
			
		}
		
	}
	
}

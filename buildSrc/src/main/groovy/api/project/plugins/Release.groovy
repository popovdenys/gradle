package api.project.plugins;

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

class Release implements Plugin<Project> {
	void apply(Project project) {
		Task toDo = project.tasks.create("taskToDo")
		toDo.doLast {
			println "added by a binary plugin!"
		}
	}
	
}

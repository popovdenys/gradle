package api.java;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class FtpJ extends DefaultTask {
	
	private String host = "po.inc";
	
	public void setHost(String host) {
		this.host = host;
	}
	
	@TaskAction
	public void ftp() {
		System.out.println(String.format("connect to %s", host));
	}
}

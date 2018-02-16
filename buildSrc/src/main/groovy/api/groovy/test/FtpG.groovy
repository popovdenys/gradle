package api.groovy.test;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class FtpG extends DefaultTask {
	
	private String host = "po.inc"
	private String author
	
	FtpG() {
		doLast {
			System.out.println(String.format("connect to %s by %s", host, author))
		}
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public String getHost() {
		return host;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}

}

import org.eclipse.jgit.api.Git;

import java.io.File;

public class Main {
	public static void main (String[] args) throws Exception {
		Git.cloneRepository().setURI("https://github.com/nise-nabe/helloworld.git").setDirectory(new File("helloworld")).call();
	}
}

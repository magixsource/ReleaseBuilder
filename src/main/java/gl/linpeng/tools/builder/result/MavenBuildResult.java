package gl.linpeng.tools.builder.result;

import gl.linpeng.tools.builder.service.BuildService;

/**
 * Maven build result parse result as a pom.xml
 * 
 * @author linpeng
 *
 */
public class MavenBuildResult implements BuildResult {

	@Override
	public String toText() {
		return null;
	}

	@Override
	public BuildResult toResult(BuildService service) {
		return null;
	}

}
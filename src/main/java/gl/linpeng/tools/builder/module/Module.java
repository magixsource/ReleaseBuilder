package gl.linpeng.tools.builder.module;

import java.util.List;

/**
 * Module is a bean of builder process target
 * 
 * @author linpeng
 * 
 */
public class Module<T extends Module<T>> {

	private String id;
	private String name;
	private String type;
	private List<T> dependencies;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<T> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<T> dependencies) {
		this.dependencies = dependencies;
	}

}

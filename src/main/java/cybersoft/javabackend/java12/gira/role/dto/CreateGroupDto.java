package cybersoft.javabackend.java12.gira.role.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateGroupDto {
	@NotBlank(message = "{group.name.not-blank}")
	@Size(min=3,max = 50, message="group.name.size")
	private String name;
	@NotBlank
	private String description;
	public CreateGroupDto() {
		// TODO Auto-generated constructor stub
	}
	public CreateGroupDto(String name, String description) {
	
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

package kr.or.connect.daoexam.dto;

public class Role {
	private int roleId; // 칼럼명이 role_id 이런 식으로 되어 있으면 DTO 필드잡을 때에는 roleId 이렇게 해야한다. dbms랑 java랑 이름표현법을 자동으로 spring이 변경해주는 규칙이다.
	private String description;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role(int roleID, String description) {
		super();
		this.roleId = roleID;
		this.description = description;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleID) {
		this.roleId = roleID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", description=" + description + "]";
	}
	
	
}

package br.com.senac.auth.microservice.dto;

import java.io.Serializable;

import br.com.senac.auth.microservice.entities.Role;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String authority;

	public RoleDTO(Role role) {
		super();
		id = role.getId();
		authority = role.getAuthority();
	}

}

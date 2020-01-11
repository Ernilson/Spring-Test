package br.com.doce.ServiceRole;

import javax.persistence.*;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
        private String senha;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
	
	
	
}

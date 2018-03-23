package ar.com.sierra.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String email;
	private String password;
	private Boolean adm;
	
	@OneToMany(mappedBy="usuarioPost")
	private List<Post> post = new ArrayList<>();
	
	@OneToMany(mappedBy="usuarioComentario")
	private List<Comentario> comentario = new ArrayList<>();
	
	public Usuario(){}

	public Usuario(Long id, String email, String password, Boolean adm, List<Post> post, List<Comentario> comentario) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.adm = adm;
		this.post = post;
		this.comentario = comentario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getAdm() {
		return adm;
	}

	public void setAdm(Boolean adm) {
		this.adm = adm;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}

	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}
	
}

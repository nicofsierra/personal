package ar.com.sierra.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comentario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String comentario;
	
	@ManyToOne
	@JoinColumn(name="usuarioComentario")
	private Usuario usuarioComentario;
	
	@ManyToOne
	@JoinColumn(name="post")
	private Post post;
	
	public Comentario(){}

	public Comentario(Long id, String comentario, Usuario usuarioComentario, Post post) {
		super();
		this.id = id;
		this.comentario = comentario;
		this.usuarioComentario = usuarioComentario;
		this.post = post;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Usuario getUsuarioComentario() {
		return usuarioComentario;
	}

	public void setUsuarioComentario(Usuario usuarioComentario) {
		this.usuarioComentario = usuarioComentario;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}

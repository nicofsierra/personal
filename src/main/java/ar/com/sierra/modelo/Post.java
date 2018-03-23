package ar.com.sierra.modelo;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Blob texto;
	
	@OneToMany(mappedBy="post")
	private List<Comentario> comentario = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="usuarioPost")
	private Usuario usuarioPost;
	
	public Post(){}

	public Post(Long id, Blob texto, List<Comentario> comentario, Usuario usuarioPost) {
		super();
		this.id = id;
		this.texto = texto;
		this.comentario = comentario;
		this.usuarioPost = usuarioPost;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Blob getTexto() {
		return texto;
	}

	public void setTexto(Blob texto) {
		this.texto = texto;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}

	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}

	public Usuario getUsuario() {
		return usuarioPost;
	}

	public void setUsuario(Usuario usuarioPost) {
		this.usuarioPost = usuarioPost;
	}
	
}

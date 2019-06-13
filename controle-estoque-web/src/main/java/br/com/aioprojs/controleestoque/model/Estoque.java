package br.com.aioprojs.controleestoque.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "estoques")
public class Estoque {

	@Id private ObjectId databaseId;
	private Integer identificador;
	@Indexed
	private String codigo;
	private int quantidade;
	private int minimo;
	private int maximo;
	@DBRef
	private Produto produto;

	public Estoque(Integer id, String codigo, int quantidade, int minimo, int maximo, Produto produto) {
		super();
		this.identificador = id;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.minimo = minimo;
		this.maximo = maximo;
		this.produto = produto;
	}

	public Integer getId() {
		return identificador;
	}

	public void setId(Integer id) {
		this.identificador = id;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}

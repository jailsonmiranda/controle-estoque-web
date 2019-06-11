package br.com.aioprojs.controleestoque.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Fornecedor {

	@Id
	private Long id;
	
	@Getter @Setter 
	private String nome;
}

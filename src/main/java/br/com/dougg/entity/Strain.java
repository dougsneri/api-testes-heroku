package br.com.dougg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name = "strain")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Strain implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_strain", nullable = false)
    @JsonProperty("id_strain")
	private Integer idStrain;
	
	@Column(name = "nome")
    @JsonProperty("nome")
    @NotNull(message = "nome não pode ser nulo")
	private String nome;
	
	@Column(name = "descricao")
    @JsonProperty("descricao")
    @NotNull(message = "descricao não pode ser nulo")
	private String descricao;
	
	@Column(name = "thc")
    @JsonProperty("thc")
    @NotNull(message = "thc não pode ser nulo")
	private int thc;
	
}

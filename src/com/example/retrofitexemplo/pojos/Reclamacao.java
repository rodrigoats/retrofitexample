package com.example.retrofitexemplo.pojos;

public class Reclamacao {

	private Integer Id;
	private Categoria Categoria;
	private String DataHora;
	private String Latitude;
	private String Longitude;
	private String Endereco;
	private String Cidade;
	private String Estado;
	private String Descricao;
	private String FotoGrande;
	private String FotoMedia;
	private String FotoPequena;
	private String Video;
	private Integer Votos;
	private String FoiResolvida;
	private String DataResolvida;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Categoria getCategoria() {
		return Categoria;
	}
	public void setCategoria(Categoria categoria) {
		Categoria = categoria;
	}
	public String getDataHora() {
		return DataHora;
	}
	public void setDataHora(String dataHora) {
		DataHora = dataHora;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getFotoGrande() {
		return FotoGrande;
	}
	public void setFotoGrande(String fotoGrande) {
		FotoGrande = fotoGrande;
	}
	public String getFotoMedia() {
		return FotoMedia;
	}
	public void setFotoMedia(String fotoMedia) {
		FotoMedia = fotoMedia;
	}
	public String getFotoPequena() {
		return FotoPequena;
	}
	public void setFotoPequena(String fotoPequena) {
		FotoPequena = fotoPequena;
	}
	public String getVideo() {
		return Video;
	}
	public void setVideo(String video) {
		Video = video;
	}
	public Integer getVotos() {
		return Votos;
	}
	public void setVotos(Integer votos) {
		Votos = votos;
	}
	public String getFoiResolvida() {
		return FoiResolvida;
	}
	public void setFoiResolvida(String foiResolvida) {
		FoiResolvida = foiResolvida;
	}
	public String getDataResolvida() {
		return DataResolvida;
	}
	public void setDataResolvida(String dataResolvida) {
		DataResolvida = dataResolvida;
	}

}

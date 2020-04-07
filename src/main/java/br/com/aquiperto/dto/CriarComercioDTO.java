package br.com.aquiperto.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CriarComercioDTO {

    @NotBlank
    private String nome;

    @NotBlank
    private String categoria;

    @NotBlank
    private String endereco;

    @Min(1)
    private Long telefone;

    @NotNull
    private Integer horarioInicioFuncionamento;

    @NotNull
    private Integer horarioFimFuncionamento;

    @NotNull
    private Double latitude;

    @NotNull
    private Double longitude;

    private String webSite;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Integer getHorarioInicioFuncionamento() {
        return horarioInicioFuncionamento;
    }

    public void setHorarioInicioFuncionamento(Integer horarioInicioFuncionamento) {
        this.horarioInicioFuncionamento = horarioInicioFuncionamento;
    }

    public Integer getHorarioFimFuncionamento() {
        return horarioFimFuncionamento;
    }

    public void setHorarioFimFuncionamento(Integer horarioFimFuncionamento) {
        this.horarioFimFuncionamento = horarioFimFuncionamento;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
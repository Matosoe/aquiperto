package br.com.aquiperto.entity;

import br.com.aquiperto.dto.CriarComercioDTO;

import javax.persistence.*;

@Entity
@Table (name= "TB_COMERCIO")
public class Comercio {

    @Id
    @Column(name="id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name="nome", length = 100, nullable = false)
    private String nome;

    @Column (name = "categoria", length = 100, nullable = false)
    private String categoria;

    @Column(name = "telefone", nullable = false)
    private Long telefone;

    @Column(name = "website", length = 100, nullable = true)
    private String webSite;

    @Column (name = "horarioInicioFuncionamento", nullable = false)
    private Integer horarioInicioFuncionamento;

    @Column(name = "horaioFimFuncionamento", nullable = false)
    private Integer horarioFimFuncionamento;

    @Column(name = "latitude", nullable = false)
    private double latitude;

    @Column(name = "longitude", nullable = false)
    private double longitude;

    @Column(name = "endereco", length = 200, nullable = false)
    private String endereco;

    public Comercio(){}

    public Comercio(CriarComercioDTO criarComercioDTO){
        this.nome = criarComercioDTO.getNome();
        this.categoria = criarComercioDTO.getCategoria();
        this.telefone = criarComercioDTO.getTelefone();
        this.webSite = criarComercioDTO.getWebSite();
        this.horarioInicioFuncionamento = criarComercioDTO.getHorarioInicioFuncionamento();
        this.horarioFimFuncionamento = criarComercioDTO.getHorarioFimFuncionamento();
        this.latitude = criarComercioDTO.getLatitude();
        this.longitude = criarComercioDTO.getLongitude();
        this.endereco = criarComercioDTO.getEndereco();
    }

    public Comercio(Integer id,
                    String nome,
                    String categoria,
                    Long telefone,
                    String webSite,
                    Integer horarioInicioFuncionamento,
                    Integer horarioFimFuncionamento,
                    Double latitude,
                    Double longitude,
                    String endereco) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.telefone = telefone;
        this.webSite = webSite;
        this.horarioInicioFuncionamento = horarioInicioFuncionamento;
        this.horarioFimFuncionamento = horarioFimFuncionamento;
        this.latitude = latitude;
        this.longitude = longitude;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

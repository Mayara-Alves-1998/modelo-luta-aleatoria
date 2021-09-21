package br.com.mbas;

public class Lutador implements LutadorInter{

	private String nome;
	private String nacionalidade;
	private Integer idade;
	private Double altura;
	private Double peso;
	private String categoria;
	private Integer vitorias;
	private Integer derrotas;
	private Integer empates;
	
	public Lutador(String nm, String ncnldd, Integer idd, Double alt, Double ps, Integer vtr, 
			Integer drt, Integer empt) {
		this.setNome(nm);
		this.setNacionalidade(ncnldd);
		this.setIdade(idd);
		this.setAltura(alt);
		this.setPeso(ps);
		this.setVitorias(vtr);
		this.setDerrotas(drt);
		this.setEmpates(empt);
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Integer getIdade() {
		return this.idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Double getAltura() {
		return this.altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return this.peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return this.categoria;
	}
	public void setCategoria() {
		if(this.getPeso() < 52.2) {
			this.categoria = "Invalido";
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Pena";
		} else if( this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if (this.getPeso() <= 120.0) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalido";
		}
	}
	public Integer getVitorias() {
		return this.vitorias;
	}
	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}
	public Integer getDerrotas() {
		return this.derrotas;
	}
	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}
	public Integer getEmpates() {
		return this.empates;
	}
	public void setEmpates(Integer empates) {
		this.empates = empates;
	}
	@Override
	public void apresentar() {
		System.out.println("--------------------------------------");
		System.out.println("-------------Apresentando-------------");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos");
		System.out.println(this.getAltura() + "m de altura");
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Pesando " + this.getPeso() + "kg");
		System.out.println("Ganhou " + this.getVitorias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: " + this.getEmpates());
		System.out.println("--------------------------------------");
	}
	@Override
	public void status() {
		System.out.println("-------------STATUS-------------");
		System.out.println(this.getNome());
		System.out.println("É um peso " + this.getCategoria());
		System.out.println(this.getVitorias() + " vitorias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates() + "empates");
		System.out.println("--------------------------------");
	}
	@Override
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	@Override
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	@Override
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
}

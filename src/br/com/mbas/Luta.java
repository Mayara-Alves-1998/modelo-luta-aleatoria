package br.com.mbas;

import java.util.Random;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private Integer rounds;
	private Boolean aprovada;
	
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public Integer getRounds () {
		return this.rounds;
	}
	public void setRounds(Integer rounds) {
		this.rounds = rounds;
	}
	public Boolean getAprovada() {
		return this.aprovada;
	}
	public void setAprovada(Boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	public void lutar() {
		if(this.getAprovada()) {
			System.out.println("---DESAFIADO---");
			this.getDesafiado().apresentar();
			System.out.println("---DESAFIANTE---");
			this.getDesafiante().apresentar();
			
			Random aleatorio = new Random();
			
			Integer vencedor = aleatorio.nextInt(3);
			
			switch (vencedor) {
			case 0: 
				System.out.println("Empatou!!!");
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
			 break;
			case 1:
				System.out.println(this.getDesafiado().getNome() + " ganhou!!");
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
			break;
			case 2:
				System.out.println(this.getDesafiante().getNome() + " ganhou!!");
				this.getDesafiado().perderLuta();
				this.getDesafiante().ganharLuta();
				break;
			} 
		} else {
			System.err.println("A luta foi reprovada!");
		}
	}
}
package br.usjt.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class PrevisoesDoTempo implements Serializable{
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue
		private Long id;
		private String 	semana;
		private Double 	tempMin;
		private Double 	tempMax;
		private Integer umi;
		private String 	descricao;
		@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
		private Date data;
		private Double la;
		private Double lo;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getSemana() {
			return semana;
		}
		public void setSemana(String semana) {
			this.semana = semana;
		}
		public Double getTempMin() {
			return tempMin;
		}
		public void setTempMin(Double tempMin) {
			this.tempMin = tempMin;
		}
		public Double getTempMax() {
			return tempMax;
		}
		public void setTempMax(Double tempMax) {
			this.tempMax = tempMax;
		}
		public Integer getUmi() {
			return umi;
		}
		public void setUmi(Integer umi) {
			this.umi = umi;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public Date getData() {
			return data;
		}
		public void setData(Date data) {
			this.data = data;
		}
		public Double getLa() {
			return la;
		}
		public void setLa(Double la) {
			this.la = la;
		}
		public Double getLo() {
			return lo;
		}
		public void setLo(Double lo) {
			this.lo = lo;
		}

	}



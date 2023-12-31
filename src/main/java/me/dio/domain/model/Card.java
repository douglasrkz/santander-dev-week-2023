package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gerar id automaticamente
    private Long id;
    @Column(unique = true)
    private String number;
    @Column(name = "available_limit",precision = 13, scale = 2) //Scale -> precision é decimal, precision é quantidades
    // de numeros que gostaria, mudando nome pois alguns banco de dados a palavra limit é reservada
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}

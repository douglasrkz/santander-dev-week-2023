package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;
@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gerar id automaticamente
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL) //Relacionamento um para um, Cascade -> quando um usuário for deletado sua
    // conta também será deletada
    private Account account;
    @OneToOne(cascade = CascadeType.ALL) //Mesma explicação
    private Card card;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) //Relacionamento um para muitos, EAGER -> toda vez
    // que consultar usuário vai trazer a lista de features pois sempre vai precisar dela
    private List<Feature> features;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) //Relacionamento um para muitos, EAGER -> toda vez
    // que consultar usuário vai trazer a lista de features pois sempre vai precisar dela
    private List<News> news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}

package br.ufrpe.rubank.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
@Document
public class Account {

    @Id
    private final String id;
    private String nickname;
    private String password;
    private Double balance;
    private List<Favorite> favorites;
    private List<History> history;
    private LocalDate createAt;

    public Account(
            String id,
            String nickname,
            String password,
            Double balance
    ) {
        this.id = id;
        this.setNickname(nickname);
        this.setPassword(password);
        this.balance = balance;
        this.createAt = LocalDate.now();
    }

    public String getId() { return id; }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Double getBalance() { return balance; }

    public List<Favorite> getFavorites() { return favorites; }

    public List<History> getHistory() { return history; }

    public LocalDate getCreateAt() { return createAt; }

    public void addToBalance(Double value) { this.balance += value; }
    public void removeFromBalance(Double value) { this.balance -= value; }

    public void addFavorite(Favorite favorite) { this.favorites.add(favorite); }
    public void removeFavorite(Favorite favorite) { this.favorites.remove(favorite); }

    public void addHistory(History history) { this.history.add(history); }
}

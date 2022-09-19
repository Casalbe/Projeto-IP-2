package br.ufrpe.rubank.services;

import br.ufrpe.rubank.models.Account;
import br.ufrpe.rubank.models.Favorite;
import br.ufrpe.rubank.models.History;

public interface AccountService {

    public void create(Account account);

    public Account findOne(String id);

    public Account findByNickname(String nickname);

    public Account findByNicknameAndPassword(String nickname, String password);

    public void update(Account account);

    public void delete(String id);

    public void addFavorite(String id, Favorite favorite);

    public void removeFavorite(String id, Favorite favorite);

    public void addHistory(String id, History history);

    public void addToBalance(String id, Double value);

    public void removeFromBalance(String id, Double value);
}

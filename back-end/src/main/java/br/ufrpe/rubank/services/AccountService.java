package br.ufrpe.rubank.services;

import br.ufrpe.rubank.models.Account;
import br.ufrpe.rubank.models.Favorite;
import br.ufrpe.rubank.models.History;

public interface AccountService {

    public void create(Account account);

    public Account findOne(String id);

    public Account update(Account account);

    public void delete(String id);

    public Account addFavorite(String id, Favorite favorite);

    public Account removeFavorite(String id, Favorite favorite);

    public void addHistory(String id, History history);

    public void addToBalance(String id, Double value);

    public void removeFromBalance(String id, Double value);
}

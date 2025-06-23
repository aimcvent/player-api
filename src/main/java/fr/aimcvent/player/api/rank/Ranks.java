package fr.aimcvent.player.api.rank;

import fr.aimcvent.player.api.Player;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface Ranks {
    List<Rank> all();

    Optional<Rank> of(UUID id);

    Optional<Rank> of(String name);

    Rank def();

    void update(Player player, Rank rank);
}

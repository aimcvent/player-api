package fr.aimcvent.player.api.event;

import fr.aimcvent.player.api.Player;
import fr.aimcvent.player.api.Rank;

public class PlayerChangeRankEvent extends PlayerEvent {
    private final Rank previous;
    private final Rank next;

    public PlayerChangeRankEvent(Player player, Rank previous, Rank next) {
        super(player);
        this.previous = previous;
        this.next = next;
    }

    public Rank previousRank() {
        return this.previous;
    }

    public Rank nextRank() {
        return this.next;
    }
}

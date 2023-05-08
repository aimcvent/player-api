package fr.aimcvent.player.api.event;

import fr.aimcvent.kernel.api.event.Event;
import fr.aimcvent.player.api.Player;

public abstract class PlayerEvent implements Event {
    private final Player player;

    protected PlayerEvent(Player player) {
        this.player = player;
    }

    public Player player() {
        return this.player;
    }
}

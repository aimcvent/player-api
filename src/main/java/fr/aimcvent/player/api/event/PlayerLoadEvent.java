package fr.aimcvent.player.api.event;

import fr.aimcvent.player.api.Player;

public class PlayerLoadEvent extends PlayerEvent {
    public PlayerLoadEvent(Player player) {
        super(player);
    }
}

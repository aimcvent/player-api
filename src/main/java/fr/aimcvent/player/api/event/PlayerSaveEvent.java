package fr.aimcvent.player.api.event;

import fr.aimcvent.player.api.Player;

public class PlayerSaveEvent extends PlayerEvent {
    public PlayerSaveEvent(Player player) {
        super(player);
    }
}

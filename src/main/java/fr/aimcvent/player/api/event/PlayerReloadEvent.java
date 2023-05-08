package fr.aimcvent.player.api.event;

import fr.aimcvent.player.api.Player;

public class PlayerReloadEvent extends PlayerEvent {
    public PlayerReloadEvent(Player player) {
        super(player);
    }
}

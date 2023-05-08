package fr.aimcvent.player.api.event;

import fr.aimcvent.player.api.Player;

public class PlayerUnloadEvent extends PlayerEvent {
    public PlayerUnloadEvent(Player player) {
        super(player);
    }
}

package fr.aimcvent.player.api.event;

import fr.aimcvent.player.api.Player;

public class PlayerLinkEvent extends PlayerEvent {
    public PlayerLinkEvent(Player player) {
        super(player);
    }
}

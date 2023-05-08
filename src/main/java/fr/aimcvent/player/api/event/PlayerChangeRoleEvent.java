package fr.aimcvent.player.api.event;

import fr.aimcvent.player.api.Player;
import fr.aimcvent.player.api.Role;

public class PlayerChangeRoleEvent extends PlayerEvent {
    private final Role previous;
    private final Role next;

    public PlayerChangeRoleEvent(Player player, Role previous, Role next) {
        super(player);
        this.previous = previous;
        this.next = next;
    }

    public Role previousRole() {
        return this.previous;
    }

    public Role nextRole() {
        return this.next;
    }
}

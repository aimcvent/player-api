package fr.aimcvent.player.api.event;

import fr.aimcvent.player.api.Player;

public class PlayerCheckPermissionEvent extends PlayerEvent {
    public final String permission;
    private boolean result;
    public PlayerCheckPermissionEvent(Player player, String permission, boolean result) {
        super(player);
        this.permission = permission;
        this.result = result;
    }

    public String permission() {
        return this.permission;
    }

    public boolean result() {
        return this.result;
    }

    public void result(boolean result) {
        this.result = result;
    }
}

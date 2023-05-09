package fr.aimcvent.player.api.event;

import fr.aimcvent.kernel.api.translation.Translation;
import fr.aimcvent.player.api.Player;

public class PlayerChangeTranslationEvent extends PlayerEvent {
    private final Translation previous;
    private final Translation next;

    public PlayerChangeTranslationEvent(Player player, Translation previous, Translation next) {
        super(player);
        this.previous = previous;
        this.next = next;
    }

    public Translation previousTranslation() {
        return this.previous;
    }

    public Translation nextTranslation() {
        return this.next;
    }
}

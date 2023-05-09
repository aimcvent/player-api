package fr.aimcvent.player.api;

import fr.aimcvent.kernel.api.translation.Translation;

import java.util.UUID;

public interface Player {
    UUID id();

    UUID playerId();

    Long discordId();

    Role role();

    Translation translation();
}

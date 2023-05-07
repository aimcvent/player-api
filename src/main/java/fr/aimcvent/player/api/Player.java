package fr.aimcvent.player.api;

import java.util.UUID;

public interface Player {
    UUID id();

    UUID playerId();

    Long discordId();

    Role role();
}

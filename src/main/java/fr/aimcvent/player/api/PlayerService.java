package fr.aimcvent.player.api;

import fr.aimcvent.kernel.api.service.Service;

import java.util.List;
import java.util.UUID;

public interface PlayerService extends Service {
    Player of(UUID id);

    Player byPlayerId(UUID id);

    Player byDiscordId(long id);

    Role defaultRole();

    List<Role> roles();

    void save(Player player);

    void link(Player player, long discordId);

    void unload(Player player, boolean save);
}

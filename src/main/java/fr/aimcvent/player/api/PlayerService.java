package fr.aimcvent.player.api;

import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.translation.Translation;
import fr.aimcvent.player.api.rank.Ranks;

import java.util.Optional;
import java.util.UUID;

public interface PlayerService extends Service {
    Player of(UUID id);

    Player load(UUID id, String name);

    Player load(long id, String name);

    Optional<Player> byId(UUID id);

    Optional<Player> byName(String name);

    Optional<Player> byId(long id);

    Optional<Player> byDiscordName(String name);

    Ranks ranks();

    void save(Player player);

    void link(Player player, long discordId, String discordName);

    void updateTranslation(Player player, Translation translation);

    void reload(Player player);

    void unload(Player player, boolean save);

    boolean isLoaded(UUID id);

    boolean isLoaded(long id);

    boolean hasPermission(Player player, String permission);
}

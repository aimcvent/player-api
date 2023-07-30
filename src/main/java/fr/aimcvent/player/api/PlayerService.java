package fr.aimcvent.player.api;

import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.translation.Translation;

import java.util.List;
import java.util.UUID;

public interface PlayerService extends Service {
    Player of(UUID id);

    Player byPlayerId(UUID id);

    Player byDiscordId(long id);

    Rank defaultRank();

    List<Rank> ranks();

    void save(Player player);

    void link(Player player, long discordId);

    void updateRank(Player player, Rank rank);

    void updateTranslation(Player player, Translation translation);

    void reload(Player player);

    void unload(Player player, boolean save);
}

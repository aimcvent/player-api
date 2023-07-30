package fr.aimcvent.player.api;

public interface Tags {
    <T> T of (String key, T def);

    Tags add(String key, Object value);

    Tags remove(String key);
}

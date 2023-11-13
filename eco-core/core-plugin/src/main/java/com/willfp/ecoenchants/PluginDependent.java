package com.willfp.ecoenchants;

import com.willfp.eco.core.EcoPlugin;
import org.jetbrains.annotations.NotNull;

/**
 * This was removed from Eco in 6.53.0 for leaking inheritance. I am putting it here because I am lazy to deal with redoing this shit
 * @param <T>
 */
public abstract class PluginDependent<T extends EcoPlugin> {
    /**
     * The {@link EcoPlugin} that is stored.
     */
    @NotNull
    private final T plugin;

    /**
     * Pass an {@link EcoPlugin} in order to interface with it.
     *
     * @param plugin The plugin to manage.
     */
    protected PluginDependent(@NotNull final T plugin) {
        this.plugin = plugin;
    }

    /**
     * Get the plugin.
     *
     * @return The plugin.
     */
    @NotNull
    protected T getPlugin() {
        return this.plugin;
    }
}

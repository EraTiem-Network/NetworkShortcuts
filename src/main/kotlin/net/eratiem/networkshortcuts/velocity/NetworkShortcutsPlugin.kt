package net.eratiem.networkshortcuts.velocity

import com.velocitypowered.api.plugin.Dependency
import com.velocitypowered.api.plugin.Plugin

@Plugin(
    id = "networkshortcuts",
    name = "NetworkShortcuts",
    version = "1.0.0-alpha-SNAPSHOT",
    description = "A plugin to create shortcuts for your velocity network",
    authors = ["Motzkiste"],
    dependencies = [
        Dependency(id = "kotlinprovide"),
        Dependency(id = "eralogger")
    ]
)
class NetworkShortcutsPlugin {
}
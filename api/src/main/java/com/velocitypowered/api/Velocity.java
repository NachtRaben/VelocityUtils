package com.velocitypowered.api;

import com.velocitypowered.api.event.EventManager;
import com.velocitypowered.api.plugin.PluginManager;
import com.velocitypowered.api.scheduler.Scheduler;

public interface Velocity {

    Scheduler scheduler();

    PluginManager pluginManager();

    EventManager eventManager();

}

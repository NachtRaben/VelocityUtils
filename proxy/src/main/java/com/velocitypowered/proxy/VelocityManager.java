package com.velocitypowered.proxy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.velocitypowered.api.Velocity;
import com.velocitypowered.api.event.EventManager;
import com.velocitypowered.api.plugin.PluginManager;
import com.velocitypowered.api.scheduler.Scheduler;

public abstract class VelocityManager implements Velocity {

    public static final Gson GENERAL_GSON = new GsonBuilder().create();

    @Override
    public abstract Scheduler scheduler();

    @Override
    public abstract PluginManager pluginManager();

    @Override
    public abstract EventManager eventManager();
}

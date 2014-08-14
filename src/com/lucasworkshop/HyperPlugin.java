package com.lucasworkshop;

/**
 * Created by Lucas on 14-8-14.
 */
public abstract class HyperPlugin {
    public String name;
    abstract void onEnable();
    abstract void onInit();
    abstract void onPostInit();
    abstract void onDisable();
    public String getName(){return this.name;}
}

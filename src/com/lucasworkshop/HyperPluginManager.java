package com.lucasworkshop;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.*;

import java.io.File;

/**
 * Created by Lucas on 14-8-12.
 */
public class HyperPluginManager {
    private Logger logger;
    private File pluginDirectory;
    private File[] pluginList;
    private File mainPlugin;
    public Integer[] a;
    public String[] b;
    private final int EXIT_FAILURE=1;
    public void start(){
        logger.info("Loading HyperPluginManager...");
        /*
        Scan for all the plugins.
        */
        File workingDirectory = new File("");
        StringBuilder sb = new StringBuilder();
        sb.append(workingDirectory.getAbsolutePath());
        sb.append("\\");
        sb.append("plugin");
        logger.info("Searching for plugins in "+sb.toString()+" ...");
        searchForPlugins(new File(sb.toString()));
        /* This plugin manager is designed that inside it could only have
        and must have 1 plugin that contains JFrame or JPanel and
        interacts with the user.
        So we made the following code to check if there is only 1 "Main.hp".
        */
        int flag=0;
        for(File t:pluginList){
           if(t.getName()=="Main.hp"){
               flag++;
           }
        }
        if(flag==0){
            logger.error("No 'Main.hp' found in plugin directory!");
            logger.error("Program will exit.");
            System.exit(EXIT_FAILURE);
        }
        else if(flag!=1){
            logger.error("Too many Main plugin file found!");
            logger.error("Program will exit.");
            System.exit(EXIT_FAILURE);
        }
        //End plugin checking
        /* After checking all the plugins,
        it's time to load them all.
        */

    }
    public File[] searchForPlugins(File dir){
        return dir.listFiles();
    }
    public void loadPlugins() {

    }
}

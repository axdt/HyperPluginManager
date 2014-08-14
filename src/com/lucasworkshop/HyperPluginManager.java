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
    public Integer[] a;
    public String[] b;
    public void start(){
        logger.info("Loading HyperPluginManager...");
        File workingDirectory = new File("");
        StringBuilder sb = new StringBuilder();
        sb.append(workingDirectory.getAbsolutePath());
        sb.append("\\");
        sb.append("plugin");
        logger.info("Searching for plugins in "+sb.toString()+" ...");
        searchForPlugins(new File(sb.toString()));
        logger.info("Reading plugin priority...");
        
    }
    public File[] searchForPlugins(File dir){
        return dir.listFiles();
    }
}

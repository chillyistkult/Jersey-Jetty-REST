package de.htw.core;

import com.google.inject.Inject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

class DocumentManagerImpl implements DocumentManager {
    private HashMap<Integer, File> resources = new HashMap<Integer, File>();

    @Inject
    public DocumentManagerImpl() {
        try {
            File file = new File("Test1.txt");
            FileWriter fw = new FileWriter(file.getPath());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Das ist ein Test");
            bw.close();
            this.resources.put(1, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized HashMap<Integer, File> getResources() {
        return resources;
    }

    public synchronized void setResources(HashMap<Integer, File> resources) {
        this.resources = resources;
    }

}

package de.htw.core;

import java.io.File;
import java.util.HashMap;

public interface DocumentManager {

	public HashMap<Integer, File> getResources();

	public void setResources(HashMap<Integer, File> resources);

}

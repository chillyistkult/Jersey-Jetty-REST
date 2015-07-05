package de.htw.core;

import com.google.inject.AbstractModule;

public class RESTModule extends AbstractModule {
	@Override
	public void configure() {
		bind(DocumentManager.class).to(DocumentManagerImpl.class).asEagerSingleton();
	}
}

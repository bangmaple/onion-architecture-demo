package com.bangmaple.onion_architecture_demo.listeners;

import com.bangmaple.onion_architecture_demo.repositories.helper.PersistenceManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class PersistenceInitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        PersistenceManager.getInstance().getEntityManagerFactory();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        PersistenceManager.getInstance().loseEntityManagerFactory();
    }
}

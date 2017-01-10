package com.kallan.espn.ff;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class ESPNFantasy {

    public static void main(String[] args) {
        Server jettyServer = new Server(8080);
        //jettyServer.setHandler(context);

        ResourceConfig config = new ResourceConfig();
        config.packages("com.kallan.espn.ff.endpoint");
        ServletHolder jerseyServlet = new ServletHolder(new ServletContainer(config));

        ServletContextHandler context = new ServletContextHandler(jettyServer, "/*");
        context.addServlet(jerseyServlet, "/*");

        try {
            jettyServer.start();
            jettyServer.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

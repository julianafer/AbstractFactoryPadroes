package br.edu.ifpb.pweb2.praticas;

import br.edu.ifpb.pweb2.praticas.factory.GUIAbstractFactory;
import br.edu.ifpb.pweb2.praticas.factory.GUIConcreteFactoryMacOS;
import br.edu.ifpb.pweb2.praticas.factory.GUIConcreteFactoryWindows;

public class ApplicationConfigurator {
    public static Cliente configureApplication() {
        Cliente app;
        GUIAbstractFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            factory = new GUIConcreteFactoryWindows();
        } else if (osName.contains("mac")) {
            factory = new GUIConcreteFactoryMacOS();
        } else {
            throw new UnsupportedOperationException("Sistema operacional não suportado.");
        }

        app = new Cliente(factory);
        return app;
    }

    public static void main(String[] args) {
        Cliente app = configureApplication();
        app.render();
    }
}

package firstSteps;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RaceApplication extends Application {

    /**
     * Creates a root Restlet that will receive all incoming calls.
     */
    @Override
    public synchronized Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a new instance of HelloWorldResource.
        Router router = new Router(getContext());

        // Defines only one route
        router.attach("/person", PersonResoure.class);
        router.attach("/hello", HelloWorldResource.class);
        router.attach("/races", RacesResource.class);
        router.attach("/race/{race_id}", RaceResource.class);
        router.attach("/race/{race_id}/runner", RaceRunnersResource.class);
        router.attach("/race/{race_id}/runner/{runner_id}", RaceRunnerResource.class);
        
        return router;
    }

}   
package controllers;

import com.google.inject.Inject;
import play.mvc.*;

import services.Manager;

public class Application extends Controller {

    @Inject
    private Manager manager;

    public Result index()
    {
        return ok( String.valueOf(manager.getRandomNumber()) );
    }
  
}

package module;

import com.google.inject.AbstractModule;
import services.Manager;
import services.ManagerImpl;

public class ApplicationModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(Manager.class).to(ManagerImpl.class);
    }
}

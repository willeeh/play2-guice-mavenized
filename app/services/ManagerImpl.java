package services;

public class ManagerImpl implements Manager
{
    @Override
    public double getRandomNumber()
    {
        return Math.random();
    }
}

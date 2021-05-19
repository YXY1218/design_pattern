package test10;

public class Cat extends MySubject
{
    public void cry()
    {
        System.out.println("TOM猫叫！");
        System.out.println("----------------------------");

        for(Object obs:observers)
        {
            ((MyObserver)obs).response();
        }
    }
}

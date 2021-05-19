package test10;

public class Client
{
    public static void main(String a[])
    {
        MySubject subject=new Cat();

        MyObserver obs1,obs2;
        obs1=new Mouse();
        obs2=new Dog();

        subject.attach(obs1);
        subject.attach(obs2);

        subject.cry();
    }
}

package 练习;

public class BasketBallSporter extends Sporter{
    public BasketBallSporter(String name, int age){
        super(name,age);
    }

    @Override
    public void sport(){
        System.out.println("篮球运动员在打篮球");
    }
}

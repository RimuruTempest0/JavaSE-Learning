package 练习;

public class PingPangSporter extends Sporter implements speakEng{
    public PingPangSporter(String name, int age){
        super(name,age);
    }

    @Override
    public void sport(){
        System.out.println("乒乓球运动员学乒乓球");
    }

    @Override
    public void speakEnglish(){
        System.out.println("乒乓球运动员说英语");
    }
}

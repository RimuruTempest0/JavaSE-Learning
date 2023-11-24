package 练习;

public class Test {
    public static void main(String[] args) {
        PingPangSporter ps = new PingPangSporter("马龙",30);
        ps.sport();
        ps.speakEnglish();

        BasketBallSporter bs = new BasketBallSporter("易建联",20);
        bs.sport();

    }
}

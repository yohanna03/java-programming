package day24_loop;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat \uD83D\uDC08- BBC");
        int second = 0;
        while (second <= 117) {
            System.out.println(" Watching \uD83D\uDC08 at second: 1");
            second++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching the \uD83D\uDC08 lets start another one");



    }
}

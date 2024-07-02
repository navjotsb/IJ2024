public class Google extends PlayStore implements june25.multipledemo.Calculator, june25.multipledemo.Camera, june25.multipledemo.Phone, june25.multipledemo.MusicPlayer {

    @Override
    public void takePictures() {
        System.out.println("Lovely Pic");
    }

    @Override
    public void play() {
        System.out.println("Playing Music Now");
    }

    @Override
    public void pause() {
        System.out.println("Music Paused");
    }

    @Override
    public void stop() {
        System.out.println("Music Stopped");
    }

    @Override
    public void makeCalls() {
        System.out.println("Calling ....");
    }

    public static void main(String[] args) {

    }

    @Override
    public void calculate() {
        System.out.println("UI is amazing");
    }
}

public class MyECommercePlatform {
    private MyECommercePlatform() {
    }

    public static MyECommercePlatform getInstance() {
        return MyECommercePlatformHolder.INSTANCE;
    }

    private static class MyECommercePlatformHolder {
        private static final MyECommercePlatform INSTANCE = new MyECommercePlatform();
    }
}

public class VideoProxy implements VideoService{

    private boolean ispremium;

    private RealVideoService realService;

    public VideoProxy(boolean ispremium){
        this.ispremium = ispremium;
        this.realService = new RealVideoService();
    }

    @Override
    public void watchVideo(String title) {
        if(title.contains("Premium") && !ispremium){
            System.out.println("Bu video sadece premiumlar içindir");
        }
        else {
            realService.watchVideo(title);
        }
    }


}

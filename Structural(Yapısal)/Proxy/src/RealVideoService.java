public class RealVideoService implements VideoService {

    @Override
    public void watchVideo(String title){
        System.out.println(title+ " oynatılıyor...");
    }
}

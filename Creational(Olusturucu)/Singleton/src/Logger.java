public class Logger {

    private static Logger instance;

    private Logger(){          // private Construction : dışarıdan new yapılmasın diye

    }

    public static Logger getInstances(){
        if (instance == null){
            instance = new Logger();    // İlk defa oluşturuluyor
        }
        return instance;    // hep aynı nesneyi döndürür.
    }


    public void log(String msg){
        System.out.println(msg);

    }




}

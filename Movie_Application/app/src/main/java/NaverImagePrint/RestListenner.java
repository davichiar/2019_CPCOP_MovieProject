package NaverImagePrint;

public abstract class RestListenner {

    public abstract void onSuccess(NaverImage naverImage);
    protected void onError(int httpCode, String error){}

}
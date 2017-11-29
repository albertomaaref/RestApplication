package it.dsgroup.restapplication;
import com.loopj.android.http.*;

/**
 * Created by utente9.academy on 28/11/2017.
 */

public class FireBaseConnection {
    private static final String BASE_URL = "https://fir-test-a9754.firebaseio.com/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }
}

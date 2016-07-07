// (c)2016 Flipboard Inc, All Rights Reserved.

package im.vinci.materialdesign.network.api;


import java.util.List;

import im.vinci.materialdesign.module.ZhuangbiImage;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ZhuangbiApi {
    @GET("search")
    Observable<List<ZhuangbiImage>> search(@Query("q") String query);

}


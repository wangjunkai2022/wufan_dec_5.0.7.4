package e2;

import com.join.mgps.activity.login.ChangeNiknameRequest;
import com.join.mgps.activity.login.ChuanglanRequest;
import com.join.mgps.activity.login.LoginResultMain;
import com.join.mgps.activity.login.LoginUserStatuDataBean;
import com.join.mgps.activity.login.LoginUserStatuRequest;
import com.join.mgps.activity.login.LoginjiguangRequest;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.AccountLoginresultData;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountresultData;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.LoginMethodResultData;
import com.join.mgps.dto.RequestUserCenterArgs;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.UserCenterBean;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
/* compiled from: IRpcLoginClient.java */
/* loaded from: classes4.dex */
public interface j {
    @POST("/v4/personal_center/index")
    Call<ResultMainBean<UserCenterBean>> a(@Body CommonRequestBean<RequestUserCenterArgs> commonRequestBean);

    @POST("/user/v4/login/flash")
    Call<LoginResultMain<AccountresultData<AccountBean>>> b(@Body ChuanglanRequest chuanglanRequest);

    @POST("/user/v3/nick_name/perfecting")
    Call<LoginResultMain<AccountresultData>> c(@Body ChangeNiknameRequest changeNiknameRequest);

    @POST("/login/oneclick/check_login")
    Call<AccountResultMainBean<AccountLoginresultData>> d(@Body Map<String, Object> map);

    @GET("/login/methods")
    Call<AccountResultMainBean<LoginMethodResultData>> e(@Query("versionCode") String str, @Query("account") String str2);

    @POST("/user/v3/member_state/index")
    Call<LoginResultMain<LoginUserStatuDataBean>> f(@Body LoginUserStatuRequest loginUserStatuRequest);

    @POST("/login/oneclick/login")
    Call<AccountResultMainBean<AccountLoginresultData>> g(@Body Map<String, Object> map);

    @POST("/user/v3/login/jpush")
    Call<LoginResultMain<AccountresultData<AccountBean>>> h(@Body LoginjiguangRequest loginjiguangRequest);
}

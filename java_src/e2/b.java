package e2;

import com.wufan.user.service.protobuf.b0;
import com.wufan.user.service.protobuf.d0;
import com.wufan.user.service.protobuf.f0;
import com.wufan.user.service.protobuf.h0;
import com.wufan.user.service.protobuf.j0;
import com.wufan.user.service.protobuf.l0;
import com.wufan.user.service.protobuf.p0;
import com.wufan.user.service.protobuf.s0;
import com.wufan.user.service.protobuf.v0;
import com.wufan.user.service.protobuf.x;
import com.wufan.user.service.protobuf.z;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
/* compiled from: IRpcAccountClientV2.java */
/* loaded from: classes4.dex */
public interface b {
    @POST("/user/v1/userStatus")
    Call<v0> a(@Body s0 s0Var);

    @POST("/user/v1/theThirdPartyLogin")
    Call<d0> b(@Body j0 j0Var);

    @POST("/login/thirdParty")
    Call<d0> c(@Body z zVar);

    @POST("/user/v1/checkToken")
    Call<com.wufan.user.service.protobuf.n> d(@Body com.wufan.user.service.protobuf.k kVar);

    @POST("/user/v1/userInfo")
    Call<d0> e(@Body b0 b0Var);

    @POST("/user/v1/ttpRegister")
    Call<d0> f(@Body l0 l0Var);

    @POST("/user/v1/mobileRegister")
    Call<d0> g(@Body x xVar);

    @POST("/user/v1/userLogin")
    Call<d0> h(@Body p0 p0Var);

    @POST("/user/v1/verifyToken")
    Call<com.wufan.user.service.protobuf.n> i(@Body com.wufan.user.service.protobuf.k kVar);

    @POST("/sms/v2/sendCode")
    Call<f0> j(@Body h0 h0Var);
}

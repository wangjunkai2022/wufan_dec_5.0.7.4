package com.join.mgps.rpc;

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
import retrofit2.http.Body;
import retrofit2.http.POST;
/* compiled from: RpcAccountClientV2.java */
/* loaded from: classes4.dex */
public interface c {
    @POST("/user/v1/userStatus")
    v0 a(@Body s0 s0Var);

    @POST("/user/v1/theThirdPartyLogin")
    d0 b(@Body j0 j0Var);

    @POST("/login/thirdParty")
    d0 c(@Body z zVar);

    @POST("/user/v1/checkToken")
    com.wufan.user.service.protobuf.n d(@Body com.wufan.user.service.protobuf.k kVar);

    @POST("/user/v1/userInfo")
    d0 e(@Body b0 b0Var);

    @POST("/user/v1/ttpRegister")
    d0 f(@Body l0 l0Var);

    @POST("/user/v1/mobileRegister")
    d0 g(@Body x xVar);

    @POST("/user/v1/userLogin")
    d0 h(@Body p0 p0Var);

    @POST("/user/v1/verifyToken")
    com.wufan.user.service.protobuf.n i(@Body com.wufan.user.service.protobuf.k kVar);

    @POST("/sms/v2/sendCode")
    f0 j(@Body h0 h0Var);
}

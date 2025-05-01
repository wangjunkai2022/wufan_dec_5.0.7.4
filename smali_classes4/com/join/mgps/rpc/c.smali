.class public interface abstract Lcom/join/mgps/rpc/c;
.super Ljava/lang/Object;
.source "RpcAccountClientV2.java"


# virtual methods
.method public abstract a(Lcom/wufan/user/service/protobuf/s0;)Lcom/wufan/user/service/protobuf/v0;
    .param p1    # Lcom/wufan/user/service/protobuf/s0;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/userStatus"
    .end annotation
.end method

.method public abstract b(Lcom/wufan/user/service/protobuf/j0;)Lcom/wufan/user/service/protobuf/d0;
    .param p1    # Lcom/wufan/user/service/protobuf/j0;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/theThirdPartyLogin"
    .end annotation
.end method

.method public abstract c(Lcom/wufan/user/service/protobuf/z;)Lcom/wufan/user/service/protobuf/d0;
    .param p1    # Lcom/wufan/user/service/protobuf/z;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation runtime Lretrofit2/http/POST;
        value = "/login/thirdParty"
    .end annotation
.end method

.method public abstract d(Lcom/wufan/user/service/protobuf/k;)Lcom/wufan/user/service/protobuf/n;
    .param p1    # Lcom/wufan/user/service/protobuf/k;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/checkToken"
    .end annotation
.end method

.method public abstract e(Lcom/wufan/user/service/protobuf/b0;)Lcom/wufan/user/service/protobuf/d0;
    .param p1    # Lcom/wufan/user/service/protobuf/b0;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/userInfo"
    .end annotation
.end method

.method public abstract f(Lcom/wufan/user/service/protobuf/l0;)Lcom/wufan/user/service/protobuf/d0;
    .param p1    # Lcom/wufan/user/service/protobuf/l0;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/ttpRegister"
    .end annotation
.end method

.method public abstract g(Lcom/wufan/user/service/protobuf/x;)Lcom/wufan/user/service/protobuf/d0;
    .param p1    # Lcom/wufan/user/service/protobuf/x;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/mobileRegister"
    .end annotation
.end method

.method public abstract h(Lcom/wufan/user/service/protobuf/p0;)Lcom/wufan/user/service/protobuf/d0;
    .param p1    # Lcom/wufan/user/service/protobuf/p0;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/userLogin"
    .end annotation
.end method

.method public abstract i(Lcom/wufan/user/service/protobuf/k;)Lcom/wufan/user/service/protobuf/n;
    .param p1    # Lcom/wufan/user/service/protobuf/k;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/verifyToken"
    .end annotation
.end method

.method public abstract j(Lcom/wufan/user/service/protobuf/h0;)Lcom/wufan/user/service/protobuf/f0;
    .param p1    # Lcom/wufan/user/service/protobuf/h0;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation runtime Lretrofit2/http/POST;
        value = "/sms/v2/sendCode"
    .end annotation
.end method

.class public interface abstract Le2/b;
.super Ljava/lang/Object;
.source "IRpcAccountClientV2.java"


# virtual methods
.method public abstract a(Lcom/wufan/user/service/protobuf/s0;)Lretrofit2/Call;
    .param p1    # Lcom/wufan/user/service/protobuf/s0;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/wufan/user/service/protobuf/s0;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/wufan/user/service/protobuf/v0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/userStatus"
    .end annotation
.end method

.method public abstract b(Lcom/wufan/user/service/protobuf/j0;)Lretrofit2/Call;
    .param p1    # Lcom/wufan/user/service/protobuf/j0;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/wufan/user/service/protobuf/j0;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/wufan/user/service/protobuf/d0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/theThirdPartyLogin"
    .end annotation
.end method

.method public abstract c(Lcom/wufan/user/service/protobuf/z;)Lretrofit2/Call;
    .param p1    # Lcom/wufan/user/service/protobuf/z;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/wufan/user/service/protobuf/z;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/wufan/user/service/protobuf/d0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/login/thirdParty"
    .end annotation
.end method

.method public abstract d(Lcom/wufan/user/service/protobuf/k;)Lretrofit2/Call;
    .param p1    # Lcom/wufan/user/service/protobuf/k;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/wufan/user/service/protobuf/k;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/wufan/user/service/protobuf/n;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/checkToken"
    .end annotation
.end method

.method public abstract e(Lcom/wufan/user/service/protobuf/b0;)Lretrofit2/Call;
    .param p1    # Lcom/wufan/user/service/protobuf/b0;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/wufan/user/service/protobuf/b0;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/wufan/user/service/protobuf/d0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/userInfo"
    .end annotation
.end method

.method public abstract f(Lcom/wufan/user/service/protobuf/l0;)Lretrofit2/Call;
    .param p1    # Lcom/wufan/user/service/protobuf/l0;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/wufan/user/service/protobuf/l0;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/wufan/user/service/protobuf/d0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/ttpRegister"
    .end annotation
.end method

.method public abstract g(Lcom/wufan/user/service/protobuf/x;)Lretrofit2/Call;
    .param p1    # Lcom/wufan/user/service/protobuf/x;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/wufan/user/service/protobuf/x;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/wufan/user/service/protobuf/d0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/mobileRegister"
    .end annotation
.end method

.method public abstract h(Lcom/wufan/user/service/protobuf/p0;)Lretrofit2/Call;
    .param p1    # Lcom/wufan/user/service/protobuf/p0;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/wufan/user/service/protobuf/p0;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/wufan/user/service/protobuf/d0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/userLogin"
    .end annotation
.end method

.method public abstract i(Lcom/wufan/user/service/protobuf/k;)Lretrofit2/Call;
    .param p1    # Lcom/wufan/user/service/protobuf/k;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/wufan/user/service/protobuf/k;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/wufan/user/service/protobuf/n;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/user/v1/verifyToken"
    .end annotation
.end method

.method public abstract j(Lcom/wufan/user/service/protobuf/h0;)Lretrofit2/Call;
    .param p1    # Lcom/wufan/user/service/protobuf/h0;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/wufan/user/service/protobuf/h0;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/wufan/user/service/protobuf/f0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/sms/v2/sendCode"
    .end annotation
.end method

.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;)Lcom/baidu/mobads/sdk/api/BaiduNativeManager$ExpressAdListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;

.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 p1, 0x0

    if-eqz p2, :cond_7

    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;

    if-eqz v0, :cond_7

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "onNoAd"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;

    invoke-static {p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;[Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;

    move-result-object p2

    iget-object p3, p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;->c:Ljava/lang/Object;

    instance-of v0, p3, Lcom/baidu/mobads/sdk/api/ExpressResponse;

    if-eqz v0, :cond_0

    check-cast p3, Lcom/baidu/mobads/sdk/api/ExpressResponse;

    goto :goto_0

    :cond_0
    move-object p3, p1

    :goto_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;

    iget v1, p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;->a:I

    iget-object p2, p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;->b:Ljava/lang/String;

    invoke-interface {v0, v1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;->b(ILjava/lang/String;Lcom/baidu/mobads/sdk/api/ExpressResponse;)V

    goto :goto_2

    :cond_1
    const-string v0, "onNativeFail"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;

    invoke-static {p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;[Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;

    move-result-object p2

    iget-object p3, p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;->c:Ljava/lang/Object;

    instance-of v0, p3, Lcom/baidu/mobads/sdk/api/ExpressResponse;

    if-eqz v0, :cond_2

    check-cast p3, Lcom/baidu/mobads/sdk/api/ExpressResponse;

    goto :goto_1

    :cond_2
    move-object p3, p1

    :goto_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;

    iget v1, p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;->a:I

    iget-object p2, p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;->b:Ljava/lang/String;

    invoke-interface {v0, v1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;->a(ILjava/lang/String;Lcom/baidu/mobads/sdk/api/ExpressResponse;)V

    goto :goto_2

    :cond_3
    const-string v0, "onNativeLoad"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;

    const/4 v0, 0x0

    aget-object p3, p3, v0

    check-cast p3, Ljava/util/List;

    invoke-interface {p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;->a(Ljava/util/List;)V

    goto :goto_2

    :cond_4
    const-string p3, "onVideoDownloadSuccess"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;

    invoke-interface {p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;->onVideoDownloadSuccess()V

    goto :goto_2

    :cond_5
    const-string p3, "onVideoDownloadFailed"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;

    invoke-interface {p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;->onVideoDownloadFailed()V

    goto :goto_2

    :cond_6
    const-string p3, "onLpClosed"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;

    invoke-interface {p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    :cond_7
    :goto_2
    return-object p1
.end method

.class Lcom/beizi/fusion/work/nativead/a$2;
.super Ljava/lang/Object;
.source "BaiduNativeAdWorker.java"

# interfaces
.implements Lcom/baidu/mobads/sdk/api/BaiduNativeManager$ExpressAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/a;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/nativead/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLpClosed()V
    .locals 0

    return-void
.end method

.method public onNativeFail(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showBdNativeAd Callback --> onNativeFail() code:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " message:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/nativead/a;->a(Lcom/beizi/fusion/work/nativead/a;Ljava/lang/String;I)V

    return-void
.end method

.method public onNativeLoad(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/baidu/mobads/sdk/api/ExpressResponse;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/nativead/a;->a(Lcom/beizi/fusion/work/nativead/a;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->a(Lcom/beizi/fusion/work/nativead/a;)V

    if-eqz p1, :cond_2

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/baidu/mobads/sdk/api/ExpressResponse;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/nativead/a;->a(Lcom/beizi/fusion/work/nativead/a;Lcom/baidu/mobads/sdk/api/ExpressResponse;)Lcom/baidu/mobads/sdk/api/ExpressResponse;

    .line 5
    :try_start_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->b(Lcom/beizi/fusion/work/nativead/a;)Lcom/baidu/mobads/sdk/api/ExpressResponse;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->b(Lcom/beizi/fusion/work/nativead/a;)Lcom/baidu/mobads/sdk/api/ExpressResponse;

    move-result-object p1

    invoke-interface {p1}, Lcom/baidu/mobads/sdk/api/ExpressResponse;->getECPMLevel()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "showBdNativeAd getECPMLevel:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->b(Lcom/beizi/fusion/work/nativead/a;)Lcom/baidu/mobads/sdk/api/ExpressResponse;

    move-result-object v0

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/ExpressResponse;->getECPMLevel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->b(Lcom/beizi/fusion/work/nativead/a;)Lcom/baidu/mobads/sdk/api/ExpressResponse;

    move-result-object v0

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/ExpressResponse;->getECPMLevel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/beizi/fusion/work/nativead/a;->a(Lcom/beizi/fusion/work/nativead/a;D)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 9
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->c(Lcom/beizi/fusion/work/nativead/a;)V

    .line 10
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->b(Lcom/beizi/fusion/work/nativead/a;)Lcom/baidu/mobads/sdk/api/ExpressResponse;

    move-result-object p1

    invoke-interface {p1}, Lcom/baidu/mobads/sdk/api/ExpressResponse;->render()V

    return-void

    .line 11
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    const/16 v0, -0x3df

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/nativead/a;->b(Lcom/beizi/fusion/work/nativead/a;I)V

    return-void
.end method

.method public onNoAd(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showBdNativeAd  Callback --> onNoAd() code:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " message:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$2;->a:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/nativead/a;->b(Lcom/beizi/fusion/work/nativead/a;Ljava/lang/String;I)V

    return-void
.end method

.method public onVideoDownloadFailed()V
    .locals 0

    return-void
.end method

.method public onVideoDownloadSuccess()V
    .locals 0

    return-void
.end method

.class Lcom/beizi/fusion/work/nativead/f$2;
.super Ljava/lang/Object;
.source "CsjNativeAdWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/f;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/nativead/f;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/f$2;->a:Lcom/beizi/fusion/work/nativead/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showCsjNativeAd Callback --> onError:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/f$2;->a:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/nativead/f;->a(Lcom/beizi/fusion/work/nativead/f;Ljava/lang/String;I)V

    return-void
.end method

.method public onNativeExpressAdLoad(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/f$2;->a:Lcom/beizi/fusion/work/nativead/f;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/nativead/f;->a(Lcom/beizi/fusion/work/nativead/f;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/f$2;->a:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/f;->a(Lcom/beizi/fusion/work/nativead/f;)V

    if-eqz p1, :cond_1

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/f$2;->a:Lcom/beizi/fusion/work/nativead/f;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/nativead/f;->a(Lcom/beizi/fusion/work/nativead/f;Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$2;->a:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->b(Lcom/beizi/fusion/work/nativead/f;)Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/nativead/f;->b(Lcom/beizi/fusion/work/nativead/f;Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$2;->a:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->b(Lcom/beizi/fusion/work/nativead/f;)Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    move-result-object p1

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;->render()V

    return-void

    .line 7
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$2;->a:Lcom/beizi/fusion/work/nativead/f;

    const/16 v0, -0x3df

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/nativead/f;->b(Lcom/beizi/fusion/work/nativead/f;I)V

    return-void
.end method

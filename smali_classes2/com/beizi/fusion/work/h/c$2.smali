.class Lcom/beizi/fusion/work/h/c$2;
.super Ljava/lang/Object;
.source "CsjUnifiedCustomWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/h/c;->aJ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/h/c;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/h/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/h/c$2;->a:Lcom/beizi/fusion/work/h/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showCsjUnifiedAd Callback --> onError:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/h/c$2;->a:Lcom/beizi/fusion/work/h/c;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/h/c;->a(Lcom/beizi/fusion/work/h/c;Ljava/lang/String;I)V

    return-void
.end method

.method public onFeedAdLoad(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/TTFeedAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/c$2;->a:Lcom/beizi/fusion/work/h/c;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/h/c;->a(Lcom/beizi/fusion/work/h/c;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/h/c$2;->a:Lcom/beizi/fusion/work/h/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/h/c;->a(Lcom/beizi/fusion/work/h/c;)V

    const/16 v0, -0x3df

    if-eqz p1, :cond_4

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/beizi/fusion/work/h/c$2;->a:Lcom/beizi/fusion/work/h/c;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/sdk/openadsdk/TTFeedAd;

    invoke-static {v1, p1}, Lcom/beizi/fusion/work/h/c;->a(Lcom/beizi/fusion/work/h/c;Lcom/bytedance/sdk/openadsdk/TTFeedAd;)Lcom/bytedance/sdk/openadsdk/TTFeedAd;

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/h/c$2;->a:Lcom/beizi/fusion/work/h/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/h/c;->b(Lcom/beizi/fusion/work/h/c;)Lcom/bytedance/sdk/openadsdk/TTFeedAd;

    move-result-object p1

    if-nez p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/h/c$2;->a:Lcom/beizi/fusion/work/h/c;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/h/c;->c(Lcom/beizi/fusion/work/h/c;I)V

    return-void

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/h/c$2;->a:Lcom/beizi/fusion/work/h/c;

    .line 8
    invoke-static {p1}, Lcom/beizi/fusion/work/h/c;->b(Lcom/beizi/fusion/work/h/c;)Lcom/bytedance/sdk/openadsdk/TTFeedAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTNativeAd;->getImageMode()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/beizi/fusion/work/h/c$2;->a:Lcom/beizi/fusion/work/h/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/h/c;->b(Lcom/beizi/fusion/work/h/c;)Lcom/bytedance/sdk/openadsdk/TTFeedAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTNativeAd;->getImageMode()I

    move-result v0

    const/16 v1, 0xf

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/beizi/fusion/work/h/c$2;->a:Lcom/beizi/fusion/work/h/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/h/c;->b(Lcom/beizi/fusion/work/h/c;)Lcom/bytedance/sdk/openadsdk/TTFeedAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTNativeAd;->getImageMode()I

    move-result v0

    const/16 v1, 0xa6

    if-ne v0, v1, :cond_3

    :cond_2
    const/4 v2, 0x1

    .line 9
    :cond_3
    invoke-static {p1, v2}, Lcom/beizi/fusion/work/h/c;->a(Lcom/beizi/fusion/work/h/c;Z)Z

    .line 10
    iget-object p1, p0, Lcom/beizi/fusion/work/h/c$2;->a:Lcom/beizi/fusion/work/h/c;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/h/a;->aM()V

    return-void

    .line 11
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/beizi/fusion/work/h/c$2;->a:Lcom/beizi/fusion/work/h/c;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/h/c;->b(Lcom/beizi/fusion/work/h/c;I)V

    return-void
.end method

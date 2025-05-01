.class Lcom/beizi/fusion/work/f/c$2;
.super Ljava/lang/Object;
.source "CsjNativeUnifiedWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/f/c;->aH()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/f/c;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/f/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/f/c$2;->a:Lcom/beizi/fusion/work/f/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showCsjNativeUnifiedAd Callback --> onError:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/f/c$2;->a:Lcom/beizi/fusion/work/f/c;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/f/c;->a(Lcom/beizi/fusion/work/f/c;Ljava/lang/String;I)V

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
    iget-object v0, p0, Lcom/beizi/fusion/work/f/c$2;->a:Lcom/beizi/fusion/work/f/c;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/f/c;->a(Lcom/beizi/fusion/work/f/c;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/f/c$2;->a:Lcom/beizi/fusion/work/f/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/f/c;->a(Lcom/beizi/fusion/work/f/c;)V

    const/16 v0, -0x3df

    if-eqz p1, :cond_2

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/beizi/fusion/work/f/c$2;->a:Lcom/beizi/fusion/work/f/c;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/sdk/openadsdk/TTFeedAd;

    invoke-static {v1, p1}, Lcom/beizi/fusion/work/f/c;->a(Lcom/beizi/fusion/work/f/c;Lcom/bytedance/sdk/openadsdk/TTFeedAd;)Lcom/bytedance/sdk/openadsdk/TTFeedAd;

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/f/c$2;->a:Lcom/beizi/fusion/work/f/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/f/c;->b(Lcom/beizi/fusion/work/f/c;)Lcom/bytedance/sdk/openadsdk/TTFeedAd;

    move-result-object p1

    if-nez p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/f/c$2;->a:Lcom/beizi/fusion/work/f/c;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/f/c;->c(Lcom/beizi/fusion/work/f/c;I)V

    return-void

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/f/c$2;->a:Lcom/beizi/fusion/work/f/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/f/c;->c(Lcom/beizi/fusion/work/f/c;)V

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/f/c$2;->a:Lcom/beizi/fusion/work/f/c;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/f/a;->aT()V

    return-void

    .line 9
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/beizi/fusion/work/f/c$2;->a:Lcom/beizi/fusion/work/f/c;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/f/c;->b(Lcom/beizi/fusion/work/f/c;I)V

    return-void
.end method

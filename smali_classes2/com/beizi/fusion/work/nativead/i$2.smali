.class Lcom/beizi/fusion/work/nativead/i$2;
.super Ljava/lang/Object;
.source "KsNativeAdWorker.java"

# interfaces
.implements Lcom/kwad/sdk/api/KsLoadManager$FeedAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/i;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/nativead/i;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/i$2;->a:Lcom/beizi/fusion/work/nativead/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showKsNativeAd Callback --> onError: code = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \uff0cmessage= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$2;->a:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/nativead/i;->a(Lcom/beizi/fusion/work/nativead/i;Ljava/lang/String;I)V

    return-void
.end method

.method public onFeedAdLoad(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/api/KsFeedAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$2;->a:Lcom/beizi/fusion/work/nativead/i;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/nativead/i;->a(Lcom/beizi/fusion/work/nativead/i;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$2;->a:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->a(Lcom/beizi/fusion/work/nativead/i;)V

    if-eqz p1, :cond_2

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$2;->a:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/nativead/i;->a(Lcom/beizi/fusion/work/nativead/i;Ljava/util/List;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/i$2;->a:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/i;->b(Lcom/beizi/fusion/work/nativead/i;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/i$2;->a:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/i;->c(Lcom/beizi/fusion/work/nativead/i;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/i$2;->a:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/i;->d(Lcom/beizi/fusion/work/nativead/i;)V

    :goto_0
    return-void

    .line 8
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/i$2;->a:Lcom/beizi/fusion/work/nativead/i;

    const/16 v0, -0x3df

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/nativead/i;->b(Lcom/beizi/fusion/work/nativead/i;I)V

    return-void
.end method

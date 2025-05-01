.class Lcom/beizi/fusion/work/f/e$2;
.super Ljava/lang/Object;
.source "KsNativeUnifiedWorker.java"

# interfaces
.implements Lcom/kwad/sdk/api/KsLoadManager$NativeAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/f/e;->aH()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/f/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/f/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/f/e$2;->a:Lcom/beizi/fusion/work/f/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showKsNativeUnifiedAd Callback --> onError: code = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \uff0cmessage= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/f/e$2;->a:Lcom/beizi/fusion/work/f/e;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/f/e;->a(Lcom/beizi/fusion/work/f/e;Ljava/lang/String;I)V

    return-void
.end method

.method public onNativeAdLoad(Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/api/KsNativeAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/e$2;->a:Lcom/beizi/fusion/work/f/e;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/f/e;->a(Lcom/beizi/fusion/work/f/e;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/f/e$2;->a:Lcom/beizi/fusion/work/f/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/f/e;->a(Lcom/beizi/fusion/work/f/e;)V

    const/16 v0, -0x3df

    if-eqz p1, :cond_2

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/beizi/fusion/work/f/e$2;->a:Lcom/beizi/fusion/work/f/e;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/api/KsNativeAd;

    invoke-static {v1, p1}, Lcom/beizi/fusion/work/f/e;->a(Lcom/beizi/fusion/work/f/e;Lcom/kwad/sdk/api/KsNativeAd;)Lcom/kwad/sdk/api/KsNativeAd;

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/f/e$2;->a:Lcom/beizi/fusion/work/f/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/f/e;->b(Lcom/beizi/fusion/work/f/e;)Lcom/kwad/sdk/api/KsNativeAd;

    move-result-object p1

    if-nez p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/f/e$2;->a:Lcom/beizi/fusion/work/f/e;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/f/e;->c(Lcom/beizi/fusion/work/f/e;I)V

    return-void

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/f/e$2;->a:Lcom/beizi/fusion/work/f/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/f/e;->b(Lcom/beizi/fusion/work/f/e;)Lcom/kwad/sdk/api/KsNativeAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsNativeAd;->getECPM()I

    move-result v0

    int-to-double v0, v0

    invoke-static {p1, v0, v1}, Lcom/beizi/fusion/work/f/e;->a(Lcom/beizi/fusion/work/f/e;D)V

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/f/e$2;->a:Lcom/beizi/fusion/work/f/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/f/e;->c(Lcom/beizi/fusion/work/f/e;)V

    .line 9
    iget-object p1, p0, Lcom/beizi/fusion/work/f/e$2;->a:Lcom/beizi/fusion/work/f/e;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/f/a;->aT()V

    return-void

    .line 10
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/beizi/fusion/work/f/e$2;->a:Lcom/beizi/fusion/work/f/e;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/f/e;->b(Lcom/beizi/fusion/work/f/e;I)V

    return-void
.end method

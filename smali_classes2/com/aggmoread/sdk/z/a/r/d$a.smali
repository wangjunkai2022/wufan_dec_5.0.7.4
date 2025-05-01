.class final Lcom/aggmoread/sdk/z/a/r/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/r/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/r/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "DspListenerSplash_[EMPTY]"

    const-string v1, "onAdDismissed enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/g/e;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAdError = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/e;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "empty"

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "DspListenerSplash_[EMPTY]"

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public e()V
    .locals 2

    const-string v0, "DspListenerSplash_[EMPTY]"

    const-string v1, "onAdExposure enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onAdClicked()V
    .locals 2

    const-string v0, "DspListenerSplash_[EMPTY]"

    const-string v1, "onAdClicked enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onAdShow()V
    .locals 2

    const-string v0, "DspListenerSplash_[EMPTY]"

    const-string v1, "onAdShow enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/baidu/mobads/sdk/api/FullScreenVideoAd$FullScreenVideoAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClick()V
    .locals 2

    const-string v0, "AMFTAGBD"

    const-string v1, "onADClicked"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;)V

    return-void
.end method

.method public onAdClose(F)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onADClosed playScale = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "AMFTAGBD"

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->f(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;)V

    return-void
.end method

.method public onAdFailed(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "failed "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AMFTAGBD"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const/16 v1, -0x3e8

    invoke-direct {v0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    const-string v0, "AMFTAGBD"

    const-string v1, "onADReceive"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;)Lcom/baidu/mobads/sdk/api/FullScreenVideoAd;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;II)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    iget-object v2, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v2, v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->b(Ljava/util/Map;ILcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;)V

    return-void
.end method

.method public onAdShow()V
    .locals 3

    const-string v0, "AMFTAGBD"

    const-string v1, "onAdShow"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a$a;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;)V

    const-wide/16 v1, 0x1

    invoke-static {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onAdSkip(F)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAdSkip playScale = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "AMFTAGBD"

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a$c;

    invoke-direct {p1, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a$c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;)V

    const-wide/16 v0, 0x3e8

    invoke-static {p1, v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onVideoDownloadFailed()V
    .locals 3

    const-string v0, "AMFTAGBD"

    const-string v1, "onVideoDownloadFailed"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const/16 v1, -0x3e8

    const-string v2, "\u89c6\u9891\u7d20\u6750\u7f13\u5b58\u5931\u8d25"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public onVideoDownloadSuccess()V
    .locals 2

    const-string v0, "AMFTAGBD"

    const-string v1, "onVideoDownloadSuccess"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->c(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;)V

    return-void
.end method

.method public playCompletion()V
    .locals 3

    const-string v0, "AMFTAGBD"

    const-string v1, "playCompletion"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a$b;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;)V

    const-wide/16 v1, 0x3e8

    invoke-static {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;J)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;->e(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/f/a;)V

    return-void
.end method

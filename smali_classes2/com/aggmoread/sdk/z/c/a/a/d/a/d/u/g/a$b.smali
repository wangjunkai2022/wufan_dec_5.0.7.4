.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/api/KsFullScreenVideoAd$FullScreenVideoAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2

    const-string v0, "AMFTAGKS"

    const-string v1, "onADClicked"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;Z)Z

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->k(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V

    return-void
.end method

.method public onPageDismiss()V
    .locals 2

    const-string v0, "AMFTAGKS"

    const-string v1, "onPageDismiss"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->e(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V

    return-void
.end method

.method public onSkippedVideo()V
    .locals 2

    const-string v0, "AMFTAGKS"

    const-string v1, "onSkippedVideo"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->g(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V

    return-void
.end method

.method public onVideoPlayEnd()V
    .locals 2

    const-string v0, "AMFTAGKS"

    const-string v1, "onVideoPlayEnd"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->f(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->g(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V

    return-void
.end method

.method public onVideoPlayError(II)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onVideoPlayError i "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",s "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AMFTAGKS"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->h:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/l;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/f;->a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public onVideoPlayStart()V
    .locals 4

    const-string v0, "AMFTAGKS"

    const-string v1, "onVideoPlayStart"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->l(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->m(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iget-object v3, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v3, v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->e:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v0, v3, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;[Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/c/i;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->e()Z

    move-result v0

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b()Z

    move-result v2

    invoke-static {v1, v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->b(Ljava/lang/Object;ZZ)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d()[I

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d()[I

    move-result-object v0

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;[I)V

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->r:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->b()[B

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;[B)V

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->c(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;ZZ)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->d(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-void
.end method

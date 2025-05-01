.class final Lcom/kwad/components/ad/reward/presenter/h/a$2;
.super Lcom/kwad/components/core/l/a/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/reward/presenter/h/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic xb:Lcom/kwad/components/ad/reward/presenter/h/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/presenter/h/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-direct {p0}, Lcom/kwad/components/core/l/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lcom/kwad/components/core/proxy/c;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->a(Lcom/kwad/components/ad/reward/presenter/h/a;Z)Z

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {p1}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance p1, Lcom/kwad/components/core/webview/tachikoma/b/v;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/tachikoma/b/v;-><init>()V

    .line 4
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/components/core/q/a;->rp()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    .line 5
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/q/a;->aM(Z)V

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/presenter/h/a;->d(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aM(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    if-nez v1, :cond_1

    .line 7
    iput v2, p1, Lcom/kwad/components/core/webview/tachikoma/b/v;->abg:I

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    return-void

    .line 9
    :cond_1
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/components/core/q/a;->rl()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 10
    iput v2, p1, Lcom/kwad/components/core/webview/tachikoma/b/v;->abg:I

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    return-void

    .line 12
    :cond_2
    iput v0, p1, Lcom/kwad/components/core/webview/tachikoma/b/v;->abg:I

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    return-void

    .line 14
    :cond_3
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/components/core/q/a;->rn()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    .line 15
    invoke-static {v1}, Lcom/kwad/components/ad/reward/presenter/h/a;->d(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aM(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    if-ne v1, v2, :cond_6

    .line 16
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/components/core/q/a;->ro()I

    move-result v1

    if-ne v1, v2, :cond_5

    .line 17
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/presenter/h/a;->d(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->ax(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    .line 18
    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v2}, Lcom/kwad/components/ad/reward/presenter/h/a;->e(Lcom/kwad/components/ad/reward/presenter/h/a;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/kwad/sdk/utils/al;->an(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v0, 0x2

    .line 19
    iput v0, p1, Lcom/kwad/components/core/webview/tachikoma/b/v;->abg:I

    .line 20
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/q/a;->aI(I)V

    .line 21
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    goto :goto_0

    .line 22
    :cond_4
    iput v0, p1, Lcom/kwad/components/core/webview/tachikoma/b/v;->abg:I

    .line 23
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    return-void

    .line 24
    :cond_5
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/components/core/q/a;->ro()I

    move-result v1

    const/4 v3, 0x3

    if-ne v1, v3, :cond_6

    .line 25
    iput v2, p1, Lcom/kwad/components/core/webview/tachikoma/b/v;->abg:I

    .line 26
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/q/a;->aI(I)V

    .line 27
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public final d(Lcom/kwad/components/core/proxy/c;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/l/a/b;->d(Lcom/kwad/components/core/proxy/c;)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/h/a$2;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->a(Lcom/kwad/components/ad/reward/presenter/h/a;Z)Z

    return-void
.end method

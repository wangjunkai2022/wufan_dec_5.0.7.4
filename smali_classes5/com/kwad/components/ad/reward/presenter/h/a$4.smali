.class final Lcom/kwad/components/ad/reward/presenter/h/a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/presenter/h/a;->aj()V
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
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/h/a$4;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/h/a$4;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {p1}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance p1, Lcom/kwad/components/core/webview/tachikoma/b/v;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/tachikoma/b/v;-><init>()V

    .line 3
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/q/a;->rp()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 4
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/q/a;->aM(Z)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$4;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->d(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aM(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    if-nez v0, :cond_1

    .line 6
    iput v2, p1, Lcom/kwad/components/core/webview/tachikoma/b/v;->abg:I

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$4;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    return-void

    .line 8
    :cond_1
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/q/a;->rl()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    iput v2, p1, Lcom/kwad/components/core/webview/tachikoma/b/v;->abg:I

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$4;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    return-void

    .line 11
    :cond_2
    iput v1, p1, Lcom/kwad/components/core/webview/tachikoma/b/v;->abg:I

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$4;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    return-void

    .line 13
    :cond_3
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/q/a;->rn()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$4;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    .line 14
    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->d(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aM(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    if-ne v0, v2, :cond_6

    .line 15
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/q/a;->ro()I

    move-result v0

    if-ne v0, v2, :cond_5

    .line 16
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$4;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->d(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ax(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    .line 17
    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/h/a$4;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v2}, Lcom/kwad/components/ad/reward/presenter/h/a;->n(Lcom/kwad/components/ad/reward/presenter/h/a;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/kwad/sdk/utils/al;->an(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 18
    iput v1, p1, Lcom/kwad/components/core/webview/tachikoma/b/v;->abg:I

    .line 19
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$4;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    :cond_4
    return-void

    .line 20
    :cond_5
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/q/a;->ro()I

    move-result v0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_6

    .line 21
    iput v2, p1, Lcom/kwad/components/core/webview/tachikoma/b/v;->abg:I

    .line 22
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/q/a;->aI(I)V

    .line 23
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/h/a$4;->xb:Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/h/a;->c(Lcom/kwad/components/ad/reward/presenter/h/a;)Lcom/kwad/components/core/webview/tachikoma/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    :cond_6
    return-void
.end method

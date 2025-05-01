.class final Lcom/kwad/components/ad/reward/m$1;
.super Lcom/kwad/components/core/webview/tachikoma/e/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/reward/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic qr:Lcom/kwad/components/ad/reward/m;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/e/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;JJJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    invoke-static {p1}, Lcom/kwad/components/ad/reward/m;->b(Lcom/kwad/components/ad/reward/m;)Lcom/kwad/components/ad/reward/g;

    move-result-object p1

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/kwad/components/ad/reward/g;->jY:Z

    return-void
.end method

.method public final q(Ljava/lang/String;)V
    .locals 2

    const-string v0, "tk_reward"

    .line 1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "tk_live_video"

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "tk_image_video"

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    invoke-static {p1, p1}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/components/ad/reward/m;Lcom/kwad/components/ad/reward/m;)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    invoke-static {p1}, Lcom/kwad/components/ad/reward/m;->b(Lcom/kwad/components/ad/reward/m;)Lcom/kwad/components/ad/reward/g;

    move-result-object p1

    sget-object v0, Lcom/kwad/components/ad/reward/RewardRenderResult;->DEFAULT:Lcom/kwad/components/ad/reward/RewardRenderResult;

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/RewardRenderResult;)V

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    invoke-static {p1}, Lcom/kwad/components/ad/reward/m;->e(Lcom/kwad/components/ad/reward/m;)Lcom/kwad/components/core/l/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/m;->f(Lcom/kwad/components/ad/reward/m;)Lcom/kwad/components/ad/reward/model/c;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/components/ad/reward/m;Lcom/kwad/components/core/l/b;Lcom/kwad/components/ad/reward/model/c;)V

    :cond_1
    return-void

    .line 7
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    invoke-static {p1, p1}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/components/ad/reward/m;Lcom/kwad/components/ad/reward/m;)V

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    invoke-static {p1}, Lcom/kwad/components/ad/reward/m;->c(Lcom/kwad/components/ad/reward/m;)Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    .line 9
    invoke-static {v0}, Lcom/kwad/components/ad/reward/m;->b(Lcom/kwad/components/ad/reward/m;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/m;->d(Lcom/kwad/components/ad/reward/m;)Landroid/widget/FrameLayout;

    move-result-object v1

    .line 10
    invoke-static {p1, v0, v1}, Lcom/kwad/components/ad/reward/g;->a(Landroid/content/Context;Lcom/kwad/components/ad/reward/g;Landroid/view/ViewGroup;)V

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    invoke-static {p1}, Lcom/kwad/components/ad/reward/m;->b(Lcom/kwad/components/ad/reward/m;)Lcom/kwad/components/ad/reward/g;

    move-result-object p1

    sget-object v0, Lcom/kwad/components/ad/reward/RewardRenderResult;->DEFAULT:Lcom/kwad/components/ad/reward/RewardRenderResult;

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/RewardRenderResult;)V

    .line 12
    iget-object p1, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    invoke-static {p1}, Lcom/kwad/components/ad/reward/m;->e(Lcom/kwad/components/ad/reward/m;)Lcom/kwad/components/core/l/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/m$1;->qr:Lcom/kwad/components/ad/reward/m;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/m;->f(Lcom/kwad/components/ad/reward/m;)Lcom/kwad/components/ad/reward/model/c;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/components/ad/reward/m;Lcom/kwad/components/core/l/b;Lcom/kwad/components/ad/reward/model/c;)V

    return-void
.end method

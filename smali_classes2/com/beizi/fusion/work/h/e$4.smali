.class Lcom/beizi/fusion/work/h/e$4;
.super Ljava/lang/Object;
.source "KsUnifiedCustomWorker.java"

# interfaces
.implements Lcom/kwad/sdk/api/KsAppDownloadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/h/e;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/h/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/h/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/h/e$4;->a:Lcom/beizi/fusion/work/h/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDownloadFailed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/e$4;->a:Lcom/beizi/fusion/work/h/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/h/e;->b(Lcom/beizi/fusion/work/h/e;)Lcom/kwad/sdk/api/KsNativeAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsNativeAd;->getActionDescription()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/beizi/fusion/work/h/e$4;->a:Lcom/beizi/fusion/work/h/e;

    iget-object v1, v1, Lcom/beizi/fusion/work/h/a;->F:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public onDownloadFinished()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/e$4;->a:Lcom/beizi/fusion/work/h/e;

    iget-object v0, v0, Lcom/beizi/fusion/work/h/a;->F:Landroid/widget/TextView;

    const-string v1, "\u7acb\u5373\u5b89\u88c5"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onDownloadStarted()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/e$4;->a:Lcom/beizi/fusion/work/h/e;

    iget-object v0, v0, Lcom/beizi/fusion/work/h/a;->F:Landroid/widget/TextView;

    const-string v1, "\u5f00\u59cb\u4e0b\u8f7d"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onIdle()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/e$4;->a:Lcom/beizi/fusion/work/h/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/h/e;->b(Lcom/beizi/fusion/work/h/e;)Lcom/kwad/sdk/api/KsNativeAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsNativeAd;->getActionDescription()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/beizi/fusion/work/h/e$4;->a:Lcom/beizi/fusion/work/h/e;

    iget-object v1, v1, Lcom/beizi/fusion/work/h/a;->F:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public onInstalled()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/e$4;->a:Lcom/beizi/fusion/work/h/e;

    iget-object v0, v0, Lcom/beizi/fusion/work/h/a;->F:Landroid/widget/TextView;

    const-string v1, "\u7acb\u5373\u6253\u5f00"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onProgressUpdate(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/e$4;->a:Lcom/beizi/fusion/work/h/e;

    iget-object v0, v0, Lcom/beizi/fusion/work/h/a;->F:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "%s/100"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.class final Lcom/kwad/sdk/widget/DownloadProgressBar$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/widget/DownloadProgressBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aTF:Lcom/kwad/sdk/widget/DownloadProgressBar;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/widget/DownloadProgressBar;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar$1;->aTF:Lcom/kwad/sdk/widget/DownloadProgressBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/widget/DownloadProgressBar$1;->aTF:Lcom/kwad/sdk/widget/DownloadProgressBar;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/widget/DownloadProgressBar$1;->aTF:Lcom/kwad/sdk/widget/DownloadProgressBar;

    invoke-virtual {v0}, Landroid/view/View;->getWindowVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/widget/DownloadProgressBar$1;->aTF:Lcom/kwad/sdk/widget/DownloadProgressBar;

    const-wide/16 v1, 0x22

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

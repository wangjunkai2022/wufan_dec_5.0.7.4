.class Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$1;
.super Ljava/lang/Object;
.source "DownloadFactory.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->onProgress(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;

.field final synthetic val$progress:J

.field final synthetic val$total:J


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$1;->this$0:Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;

    iput-wide p2, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$1;->val$progress:J

    iput-wide p4, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$1;->val$total:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$1;->this$0:Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->access$500(Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;)Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadDelegate;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$1;->this$0:Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;->access$500(Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl;)Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadDelegate;

    move-result-object v0

    iget-wide v1, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$1;->val$progress:J

    iget-wide v3, p0, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadImpl$1;->val$total:J

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/beizi/ad/internal/utilities/DownloadFactory$DownloadDelegate;->onProgress(JJ)V

    :cond_0
    return-void
.end method

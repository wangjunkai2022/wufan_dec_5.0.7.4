.class Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kwad/sdk/api/KsApkDownloadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d;


# direct methods
.method constructor <init>(Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d;)V
    .locals 0

    iput-object p1, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d$c;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDownloadFailed()V
    .locals 7

    iget-object v0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d$c;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d;

    const-wide/16 v1, -0x1

    const-wide/16 v3, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/native_ad/MediationNativeAd;->notifyOnDownloadFailed(JJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onDownloadFinished()V
    .locals 4

    iget-object v0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d$c;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d;

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v3}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/native_ad/MediationNativeAd;->notifyOnDownloadFinished(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onDownloadStarted()V
    .locals 1

    iget-object v0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d$c;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/native_ad/MediationNativeAd;->notifyOnDownloadStarted()V

    return-void
.end method

.method public onIdle()V
    .locals 1

    iget-object v0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d$c;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/native_ad/MediationNativeAd;->notifyOnIdel()V

    return-void
.end method

.method public onInstalled()V
    .locals 2

    iget-object v0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d$c;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/native_ad/MediationNativeAd;->notifyOnInstalled(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onPaused(I)V
    .locals 7

    iget-object v0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d$c;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d;

    const-wide/16 v1, -0x1

    const-wide/16 v3, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/native_ad/MediationNativeAd;->notifyOnDownloadPause(JJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onProgressUpdate(I)V
    .locals 7

    iget-object v0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d$c;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/d;

    const-wide/16 v1, -0x1

    const-wide/16 v3, -0x1

    const/4 v6, 0x2

    move v5, p1

    invoke-virtual/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/native_ad/MediationNativeAd;->notifyOnProgressUpdate(JJII)V

    return-void
.end method

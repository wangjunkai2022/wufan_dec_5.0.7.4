.class public Lcom/bytedance/sdk/openadsdk/api/vv/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private vv:Lcom/ss/android/download/api/download/DownloadModel;


# direct methods
.method public constructor <init>(Lcom/ss/android/download/api/download/DownloadModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    return-void
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getExtra()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->isShowToast()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getModelType()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-eqz p2, :cond_0

    const p1, 0x368c7

    .line 1
    const-class p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 2
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv(Ljava/lang/String;)Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object p1

    return-object p1

    .line 3
    :sswitch_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->y()V

    goto :goto_0

    .line 4
    :sswitch_2
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->x()V

    goto :goto_0

    .line 5
    :sswitch_3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->g()V

    :cond_0
    :goto_0
    const/4 p1, 0x0

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x368b9 -> :sswitch_3
        0x368bb -> :sswitch_2
        0x368bc -> :sswitch_1
        0x368c6 -> :sswitch_0
    .end sparse-switch
.end method

.method public cq()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getExecutorGroup()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getFileName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ds()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->enablePause()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f()Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadFileUriProvider()Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ff()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->forceWifi()V

    :cond_0
    return-void
.end method

.method public i()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getFilePath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public jb()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getStartToast()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public jh()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->isShowNotification()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public k()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ky()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->isAutoInstall()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getVersionName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public la()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadSettings()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public lb()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getSdkMonitorScene()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public m()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getBackupUrls()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public n()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getExtraValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public ns()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->isAd()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getMd5()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ot()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->shouldDownloadWithPatchApply()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getNotificationJumpUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public pd()Lcom/ss/android/download/api/model/DeepLink;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getDeepLink()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public pj()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->autoInstallWithoutNotification()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->isVisibleInDownloadsUi()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public qv()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public r()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->isNeedWifi()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public s()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->distinctDir()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public t()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->isInExternalPublicDir()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public td()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getAppIcon()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public tf()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getFunnelType()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public u()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getExpectFileLength()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public v()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->needIndependentProcess()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 7

    .line 1
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv()Ljava/lang/String;

    move-result-object v1

    const v2, 0x368a8

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->m()Ljava/util/List;

    move-result-object v1

    const v2, 0x368a9

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->p()Ljava/lang/String;

    move-result-object v1

    const v2, 0x368aa

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->i()J

    move-result-wide v1

    const v3, 0x368ab

    invoke-virtual {v0, v3, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->g(IJ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 6
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->o()Ljava/lang/String;

    move-result-object v1

    const v2, 0x368ac

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->u()J

    move-result-wide v1

    const v3, 0x368ad

    invoke-virtual {v0, v3, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->g(IJ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->n()J

    move-result-wide v1

    const v3, 0x368ae

    invoke-virtual {v0, v3, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->g(IJ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->qv()Ljava/lang/String;

    move-result-object v1

    const v2, 0x368af

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->wv()Ljava/lang/String;

    move-result-object v1

    const v2, 0x368b0

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->k()Ljava/util/Map;

    move-result-object v1

    const v2, 0x368b1

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 12
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->b()Z

    move-result v1

    const v2, 0x368b2

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->jh()Z

    move-result v1

    const v2, 0x368b3

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 14
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->r()Z

    move-result v1

    const v2, 0x368b4

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 15
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->t()Z

    move-result v1

    const v2, 0x368b5

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 16
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->q()Z

    move-result v1

    const v2, 0x368b6

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 17
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->j()Ljava/lang/String;

    move-result-object v1

    const v2, 0x368b7

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->d()Ljava/lang/String;

    move-result-object v1

    const v2, 0x368b8

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 19
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->la()Lorg/json/JSONObject;

    move-result-object v1

    const v2, 0x368ba

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 20
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->v()Z

    move-result v1

    const v2, 0x368bd

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 21
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->ya()I

    move-result v1

    const v2, 0x368be

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 22
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->l()Ljava/lang/String;

    move-result-object v1

    const v2, 0x368bf

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 23
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->ns()Z

    move-result v1

    const v2, 0x368c0

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 24
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vu()Ljava/lang/String;

    move-result-object v1

    const v2, 0x368c1

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 25
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->ff()Ljava/lang/String;

    move-result-object v1

    const v2, 0x368c2

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 26
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->td()Ljava/lang/String;

    move-result-object v1

    const v2, 0x368c3

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 27
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->pd()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object v1

    const v2, 0x368c4

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 28
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->w()Ljava/util/List;

    move-result-object v1

    const v2, 0x368c5

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 29
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->a()Lorg/json/JSONObject;

    move-result-object v1

    const v2, 0x368c6

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 30
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->c()I

    move-result v1

    const v2, 0x368c7

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 31
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->zn()Lcom/ss/android/download/api/model/i;

    move-result-object v1

    const v2, 0x368c8

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 32
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->pj()Z

    move-result v1

    const v3, 0x368c9

    invoke-virtual {v0, v3, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 33
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->f()Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    move-result-object v1

    const v4, 0x368ca

    invoke-virtual {v0, v4, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 34
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->ot()Z

    move-result v1

    const v5, 0x368cb

    invoke-virtual {v0, v5, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 35
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->cq()I

    move-result v1

    const v6, 0x368cc

    invoke-virtual {v0, v6, v1}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 36
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->tf()I

    move-result v1

    const v6, 0x368cd

    invoke-virtual {v0, v6, v1}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 37
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->jb()Ljava/lang/String;

    move-result-object v1

    const v6, 0x368ce

    invoke-virtual {v0, v6, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 38
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->lb()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 39
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->ky()Z

    move-result v1

    invoke-virtual {v0, v3, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 40
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->s()Z

    move-result v1

    invoke-virtual {v0, v4, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 41
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/p;->ds()Z

    move-result v1

    invoke-virtual {v0, v5, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    return-object v0
.end method

.method public vu()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public vv(Ljava/lang/String;)Lcom/ss/android/download/api/download/DownloadModel;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/download/DownloadModel;->setFilePath(Ljava/lang/String;)Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public vv()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public w()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getClickTrackUrl()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public wv()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getMimeType()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public x()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->forceHideToast()V

    :cond_0
    return-void
.end method

.method public y()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->forceHideNotification()V

    :cond_0
    return-void
.end method

.method public ya()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getVersionCode()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public zn()Lcom/ss/android/download/api/model/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/p;->vv:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getQuickAppModel()Lcom/ss/android/download/api/model/i;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

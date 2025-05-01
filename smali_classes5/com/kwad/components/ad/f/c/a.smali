.class public final Lcom/kwad/components/ad/f/c/a;
.super Lcom/kwad/components/ad/k/b;
.source "SourceFile"


# instance fields
.field private bQ:Lcom/kwad/components/core/widget/a/b;

.field private dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

.field private final df:Lcom/kwad/sdk/core/h/c;

.field private eQ:Z

.field private eY:Lcom/kwad/components/core/j/a$b;

.field private fa:Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

.field private hasNoCache:Z

.field private final mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field private mContext:Landroid/content/Context;

.field private no:Z

.field private np:Z

.field private nq:Lcom/kwad/components/core/video/l;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/widget/a/b;Lcom/kwad/components/core/video/DetailVideoView;Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V
    .locals 1
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/components/core/widget/a/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/kwad/components/core/video/DetailVideoView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/kwad/sdk/api/KsAdVideoPlayConfig;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p3}, Lcom/kwad/components/ad/k/b;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/video/DetailVideoView;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/f/c/a;->hasNoCache:Z

    .line 3
    new-instance v0, Lcom/kwad/components/ad/f/c/a$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/f/c/a$3;-><init>(Lcom/kwad/components/ad/f/c/a;)V

    iput-object v0, p0, Lcom/kwad/components/ad/f/c/a;->df:Lcom/kwad/sdk/core/h/c;

    .line 4
    new-instance v0, Lcom/kwad/components/ad/f/c/a$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/f/c/a$5;-><init>(Lcom/kwad/components/ad/f/c/a;)V

    iput-object v0, p0, Lcom/kwad/components/ad/f/c/a;->fa:Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

    .line 5
    iput-object p2, p0, Lcom/kwad/components/ad/f/c/a;->bQ:Lcom/kwad/components/core/widget/a/b;

    .line 6
    iget-object p2, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p2

    iput-object p2, p0, Lcom/kwad/components/ad/f/c/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 7
    instance-of v0, p4, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    .line 8
    invoke-virtual {v0}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getVideoSoundValue()I

    move-result v0

    if-eqz v0, :cond_0

    .line 9
    invoke-interface {p4}, Lcom/kwad/sdk/api/KsAdVideoPlayConfig;->isVideoSoundEnable()Z

    move-result p2

    iput-boolean p2, p0, Lcom/kwad/components/ad/f/c/a;->no:Z

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->bU(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/kwad/components/ad/f/c/a;->no:Z

    .line 11
    :goto_0
    iput-object p4, p0, Lcom/kwad/components/ad/f/c/a;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    .line 12
    invoke-virtual {p3}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    if-eqz p4, :cond_1

    .line 13
    :try_start_0
    invoke-interface {p4}, Lcom/kwad/sdk/api/KsAdVideoPlayConfig;->isNoCache()Z

    move-result p2

    iput-boolean p2, p0, Lcom/kwad/components/ad/f/c/a;->hasNoCache:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    .line 14
    invoke-static {p2}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 15
    :cond_1
    :goto_1
    new-instance p2, Lcom/kwad/components/ad/f/c/a$1;

    invoke-direct {p2, p0, p1}, Lcom/kwad/components/ad/f/c/a$1;-><init>(Lcom/kwad/components/ad/f/c/a;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object p2, p0, Lcom/kwad/components/ad/f/c/a;->nq:Lcom/kwad/components/core/video/l;

    .line 16
    iget-object p1, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/video/b;->c(Lcom/kwad/components/core/video/k;)V

    .line 17
    invoke-direct {p0}, Lcom/kwad/components/ad/f/c/a;->aL()V

    .line 18
    iget-object p1, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    new-instance p2, Lcom/kwad/components/ad/f/c/a$2;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/f/c/a$2;-><init>(Lcom/kwad/components/ad/f/c/a;)V

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/sdk/core/video/a/c$e;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/c/a;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/c/a;->eD()Z

    move-result p0

    return p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/c/a;Z)Z
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/f/c/a;->g(Z)Z

    move-result p0

    return p0
.end method

.method private aL()V
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/sdk/contentalliance/a/a/b$a;

    iget-object v1, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iget-object v1, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 2
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dU(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->da(Ljava/lang/String;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dT(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/PhotoInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/h;->b(Lcom/kwad/sdk/core/response/model/PhotoInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->db(Ljava/lang/String;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mVideoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    .line 4
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->a(Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/kwad/components/ad/f/c/a;->hasNoCache:Z

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->bl(Z)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 6
    invoke-static {v1}, Lcom/kwad/sdk/contentalliance/a/a/a;->bF(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/contentalliance/a/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->b(Lcom/kwad/sdk/contentalliance/a/a/a;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->BJ()Lcom/kwad/sdk/contentalliance/a/a/b;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    iget-object v2, p0, Lcom/kwad/components/ad/k/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3, v3, v2}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/sdk/contentalliance/a/a/b;ZZLcom/kwad/components/core/video/DetailVideoView;)V

    .line 8
    iget-boolean v0, p0, Lcom/kwad/components/ad/f/c/a;->no:Z

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/f/c/a;->g(Z)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/f/c/a;->setAudioEnabled(Z)V

    .line 9
    invoke-direct {p0}, Lcom/kwad/components/ad/f/c/a;->eD()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/b;->prepareAsync()V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/c/a;->fa:Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/s/a;->a(Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/f/c/a;)Lcom/kwad/components/core/widget/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/c/a;->bQ:Lcom/kwad/components/core/widget/a/b;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/f/c/a;Z)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/f/c/a;->setAudioEnabled(Z)V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/f/c/a;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/f/c/a;Z)Z
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/f/c/a;->eQ:Z

    return p1
.end method

.method static synthetic d(Lcom/kwad/components/ad/f/c/a;)Lcom/kwad/components/core/video/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/f/c/a;)Lcom/kwad/components/core/j/a$b;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/c/a;->getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;

    move-result-object p0

    return-object p0
.end method

.method private eD()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/f/c/a;->np:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    instance-of v2, v0, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    .line 3
    check-cast v0, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getVideoAutoPlayType()I

    move-result v2

    if-ne v2, v1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v0

    return v0

    .line 6
    :cond_1
    invoke-virtual {v0}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getVideoAutoPlayType()I

    move-result v2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_2

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isWifiConnected(Landroid/content/Context;)Z

    move-result v0

    return v0

    .line 8
    :cond_2
    invoke-virtual {v0}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getVideoAutoPlayType()I

    move-result v2

    const/4 v4, 0x3

    if-ne v2, v4, :cond_3

    return v3

    .line 9
    :cond_3
    invoke-virtual {v0}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getDataFlowAutoStartValue()I

    move-result v2

    if-eqz v2, :cond_6

    .line 10
    iget-object v2, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/kwad/sdk/utils/ah;->isWifiConnected(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 11
    invoke-virtual {v0}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->isDataFlowAutoStart()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isMobileConnected(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    return v3

    :cond_5
    :goto_0
    return v1

    .line 12
    :cond_6
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bV(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    .line 13
    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    return v1

    .line 14
    :cond_7
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bW(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isWifiConnected(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    return v1

    :cond_8
    return v3
.end method

.method static synthetic f(Lcom/kwad/components/ad/f/c/a;)Lcom/kwad/components/core/video/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/ad/f/c/a;)Lcom/kwad/components/core/j/a$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/c/a;->eY:Lcom/kwad/components/core/j/a$b;

    return-object p0
.end method

.method private g(Z)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/f/c/a;->eY:Lcom/kwad/components/core/j/a$b;

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    iget-object p1, p0, Lcom/kwad/components/ad/f/c/a;->eY:Lcom/kwad/components/core/j/a$b;

    invoke-static {p1}, Lcom/kwad/components/core/j/a;->b(Lcom/kwad/components/core/j/a$b;)Z

    move-result p1

    if-nez p1, :cond_1

    return v0

    .line 3
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->gt()Z

    move-result p1

    const/4 v1, 0x1

    if-nez p1, :cond_4

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/components/core/s/a;->rB()Z

    move-result p1

    if-nez p1, :cond_2

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/s/a;->aN(Z)Z

    move-result p1

    return p1

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/components/core/s/a;->rA()Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0

    .line 7
    :cond_4
    iget-boolean p1, p0, Lcom/kwad/components/ad/f/c/a;->eQ:Z

    if-nez p1, :cond_5

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/kwad/components/core/s/a;->aN(Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/components/ad/f/c/a;->eQ:Z

    .line 9
    :cond_5
    iget-boolean p1, p0, Lcom/kwad/components/ad/f/c/a;->eQ:Z

    return p1
.end method

.method private getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->eY:Lcom/kwad/components/core/j/a$b;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/j/a$b;

    new-instance v1, Lcom/kwad/components/ad/f/c/a$4;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/f/c/a$4;-><init>(Lcom/kwad/components/ad/f/c/a;)V

    invoke-direct {v0, v1}, Lcom/kwad/components/core/j/a$b;-><init>(Lcom/kwad/components/core/j/a$c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/f/c/a;->eY:Lcom/kwad/components/core/j/a$b;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->eY:Lcom/kwad/components/core/j/a$b;

    return-object v0
.end method

.method static synthetic h(Lcom/kwad/components/ad/f/c/a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/f/c/a;->no:Z

    return p0
.end method

.method private setAudioEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/b;->setAudioEnabled(Z)V

    return-void
.end method


# virtual methods
.method public final aJ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/utils/l;->en(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/b;->rW()Lcom/kwad/sdk/core/video/a/c;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/f/c/a;->aL()V

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/f/c/a;->eD()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/b;->dX()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/contentalliance/a/a/a;->bF(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/contentalliance/a/a/a;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/sdk/contentalliance/a/a/a;)V

    .line 7
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    invoke-direct {p0}, Lcom/kwad/components/ad/f/c/a;->getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/b;->start()V

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->bQ:Lcom/kwad/components/core/widget/a/b;

    iget-object v1, p0, Lcom/kwad/components/ad/f/c/a;->df:Lcom/kwad/sdk/core/h/c;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/a/a;->a(Lcom/kwad/sdk/core/h/c;)V

    return-void
.end method

.method public final aK()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/utils/l;->el(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->bQ:Lcom/kwad/components/core/widget/a/b;

    iget-object v1, p0, Lcom/kwad/components/ad/f/c/a;->df:Lcom/kwad/sdk/core/h/c;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/a/a;->b(Lcom/kwad/sdk/core/h/c;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/b;->release()V

    .line 4
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/c/a;->eY:Lcom/kwad/components/core/j/a$b;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->c(Lcom/kwad/components/core/j/a$b;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/c/a;->fa:Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/s/a;->b(Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;)V

    return-void
.end method

.method public final eE()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/f/c/a;->np:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/b;->dX()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/utils/l;->em(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/contentalliance/a/a/a;->bF(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/contentalliance/a/a/a;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/video/b;->a(Lcom/kwad/sdk/contentalliance/a/a/a;)V

    .line 6
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    invoke-direct {p0}, Lcom/kwad/components/ad/f/c/a;->getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/b;->start()V

    :cond_0
    return-void
.end method

.method public final resume()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    invoke-direct {p0}, Lcom/kwad/components/ad/f/c/a;->getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 2
    iget-boolean v0, p0, Lcom/kwad/components/ad/f/c/a;->no:Z

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/f/c/a;->g(Z)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/f/c/a;->setAudioEnabled(Z)V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/f/c/a;->eD()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-super {p0}, Lcom/kwad/components/ad/k/b;->resume()V

    return-void
.end method

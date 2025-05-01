.class public final Lcom/kwad/components/ad/interstitial/e/f;
.super Lcom/kwad/components/ad/interstitial/e/b;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/widget/c;


# instance fields
.field private cB:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private eM:Landroid/widget/ImageView;

.field private eN:Lcom/kwad/sdk/core/video/videoview/a;

.field private final eS:Lcom/kwad/components/core/video/a$a;

.field private jK:Lcom/kwad/components/ad/interstitial/e/c;

.field private kK:Lcom/kwad/sdk/widget/KSFrameLayout;

.field private kL:Lcom/kwad/sdk/widget/KSFrameLayout;

.field private kM:Lcom/kwad/components/core/video/f;

.field protected mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

.field protected mContext:Landroid/content/Context;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private mIsAudioEnable:Z
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/b;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->mIsAudioEnable:Z

    .line 3
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/f$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/e/f$3;-><init>(Lcom/kwad/components/ad/interstitial/e/f;)V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->eS:Lcom/kwad/components/core/video/a$a;

    return-void
.end method

.method private a(Landroid/view/View;Z)Lcom/kwad/components/ad/interstitial/e/c$b;
    .locals 1

    .line 3
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/c$b;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/kwad/components/ad/interstitial/e/c$b;-><init>(Landroid/content/Context;)V

    .line 4
    invoke-virtual {v0, p2}, Lcom/kwad/components/ad/interstitial/e/c$b;->k(Z)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/e/f;->kK:Lcom/kwad/sdk/widget/KSFrameLayout;

    .line 5
    invoke-virtual {p2}, Lcom/kwad/sdk/widget/KSFrameLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/interstitial/e/c$b;->a(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object p1

    const/4 p2, 0x3

    .line 6
    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/interstitial/e/c$b;->z(I)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object p1

    const/16 p2, 0x55

    .line 7
    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/interstitial/e/c$b;->A(I)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object p1

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/f;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/e/f;J)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/interstitial/e/f;->c(J)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/interstitial/e/f;J)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/interstitial/e/f;->h(J)V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/sdk/core/video/videoview/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/f;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    return-object p0
.end method

.method private c(J)V
    .locals 2

    long-to-float p1, p1

    const/high16 p2, 0x447a0000    # 1000.0f

    div-float/2addr p1, p2

    float-to-double p1, p1

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-int p1, p1

    .line 3
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/e/f;->cB:Ljava/util/List;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/e/f;->cB:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 5
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;)V

    .line 9
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/kwad/components/ad/interstitial/e/f;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method private dw()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsAdVideoPlayConfig;->isVideoSoundEnable()Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->mIsAudioEnable:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bs(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/b;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->eM:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->eM:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1, v0, v3}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->eM:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->eM:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 9
    :goto_0
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->zA()I

    move-result v0

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-void

    :cond_1
    if-gez v0, :cond_3

    .line 12
    invoke-static {}, Lcom/kwad/sdk/core/diskcache/b/a;->DM()Lcom/kwad/sdk/core/diskcache/b/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/diskcache/b/a;->bZ(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 14
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v1, v0

    goto :goto_2

    :cond_2
    move-object v1, v2

    goto :goto_2

    :cond_3
    if-nez v0, :cond_4

    goto :goto_2

    .line 15
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/core/videocache/c/a;->by(Landroid/content/Context;)Lcom/kwad/sdk/core/videocache/f;

    move-result-object v0

    .line 16
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Ci()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 17
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->zA()I

    move-result v3

    .line 18
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/videocache/f;->eM(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 19
    new-instance v7, Lcom/kwad/sdk/core/network/a/a$a;

    invoke-direct {v7}, Lcom/kwad/sdk/core/network/a/a$a;-><init>()V

    mul-int/lit16 v3, v3, 0x400

    int-to-long v5, v3

    const/4 v8, 0x0

    move-object v3, v0

    move-object v4, v1

    .line 20
    invoke-virtual/range {v3 .. v8}, Lcom/kwad/sdk/core/videocache/f;->a(Ljava/lang/String;JLcom/kwad/sdk/core/network/a/a$a;Lcom/kwad/sdk/export/proxy/AdHttpResponseListener;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 21
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/videocache/f;->eK(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 22
    :cond_5
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/videocache/f;->eK(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 23
    :cond_6
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/videocache/f;->eK(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 24
    :cond_7
    :goto_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 25
    :cond_8
    new-instance v0, Lcom/kwad/sdk/contentalliance/a/a/b$a;

    iget-object v3, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v0, v3}, Lcom/kwad/sdk/contentalliance/a/a/b$a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 26
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->da(Ljava/lang/String;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 27
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dT(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/PhotoInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/h;->b(Lcom/kwad/sdk/core/response/model/PhotoInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->db(Ljava/lang/String;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mVideoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    .line 28
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->a(Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    new-instance v1, Lcom/kwad/sdk/contentalliance/a/a/a;

    iget-object v3, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v1, v3, v4, v5}, Lcom/kwad/sdk/contentalliance/a/a/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;J)V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->b(Lcom/kwad/sdk/contentalliance/a/a/a;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->BJ()Lcom/kwad/sdk/contentalliance/a/a/b;

    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v1, v0, v2}, Lcom/kwad/sdk/core/video/videoview/a;->a(Lcom/kwad/sdk/contentalliance/a/a/b;Ljava/util/Map;)V

    .line 31
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    iget-boolean v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->mIsAudioEnable:Z

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/video/videoview/a;->setVideoSoundEnable(Z)V

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 33
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/d;->dT()Lcom/kwad/components/ad/interstitial/report/d;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v2, v3}, Lcom/kwad/components/ad/interstitial/report/d;->v(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 34
    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/f;->kM:Lcom/kwad/components/core/video/f;

    new-instance v3, Lcom/kwad/components/ad/interstitial/e/f$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/kwad/components/ad/interstitial/e/f$1;-><init>(Lcom/kwad/components/ad/interstitial/e/f;J)V

    .line 35
    invoke-virtual {v2, v3}, Lcom/kwad/components/core/video/a;->setVideoPlayCallback(Lcom/kwad/components/core/video/a$c;)V

    .line 36
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->kM:Lcom/kwad/components/core/video/f;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/video/videoview/a;->setController(Lcom/kwad/sdk/core/video/videoview/b;)V

    .line 37
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setClickable(Z)V

    .line 38
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/f;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    invoke-direct {v0, v1, v2, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 39
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 40
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    new-instance v1, Lcom/kwad/components/ad/interstitial/e/f$2;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/e/f$2;-><init>(Lcom/kwad/components/ad/interstitial/e/f;)V

    iput-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jT:Lcom/kwad/components/ad/interstitial/e/c$d;

    return-void
.end method

.method static synthetic e(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/core/e/d/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/f;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/ad/interstitial/e/f;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method private h(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jM:Z

    const-wide/16 v1, 0x1

    .line 2
    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/kwad/components/ad/interstitial/e/c;->b(JJ)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    const/4 v1, 0x1

    invoke-direct {p0, p1, v1}, Lcom/kwad/components/ad/interstitial/e/f;->a(Landroid/view/View;Z)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/components/ad/interstitial/e/c$b;)V

    return-void
.end method

.method public final aj()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/interstitial/e/b;->aj()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/interstitial/e/c;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    .line 3
    iget-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    iput-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    .line 4
    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bn(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->cB:Ljava/util/List;

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    iput-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    .line 8
    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 9
    new-instance v0, Lcom/kwad/components/core/video/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v3, p0, Lcom/kwad/components/ad/interstitial/e/f;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/video/f;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/video/videoview/c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->kM:Lcom/kwad/components/core/video/f;

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    invoke-interface {v1}, Lcom/kwad/sdk/api/KsAdVideoPlayConfig;->isDataFlowAutoStart()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/video/a;->setDataFlowAutoStart(Z)V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->kM:Lcom/kwad/components/core/video/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->eS:Lcom/kwad/components/core/video/a$a;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/video/a;->setAdClickListener(Lcom/kwad/components/core/video/a$a;)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->kM:Lcom/kwad/components/core/video/f;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/a;->rV()V

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 14
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/f;->dw()V

    .line 15
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_interstitial_card_radius:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 16
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v0, v2, v2}, Lcom/kwad/sdk/widget/KSFrameLayout;->setRadius(FFFF)V

    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1}, Lcom/kwad/components/ad/interstitial/e/f;->a(Landroid/view/View;Z)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/components/ad/interstitial/e/c$b;)V

    return-void
.end method

.method public final onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getRootView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$id;->ksad_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/widget/KSFrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->kK:Lcom/kwad/sdk/widget/KSFrameLayout;

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getRootView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$id;->ksad_video_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/widget/KSFrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    .line 4
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getRootView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$id;->ksad_video_first_frame_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->eM:Landroid/widget/ImageView;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 6
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->mContext:Landroid/content/Context;

    return-void
.end method

.method public final onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onDestroy()V

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jT:Lcom/kwad/components/ad/interstitial/e/c$d;

    return-void
.end method

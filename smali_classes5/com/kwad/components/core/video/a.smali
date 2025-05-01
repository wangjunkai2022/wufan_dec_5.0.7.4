.class public Lcom/kwad/components/core/video/a;
.super Lcom/kwad/sdk/core/video/videoview/b;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/video/a$a;,
        Lcom/kwad/components/core/video/a$b;,
        Lcom/kwad/components/core/video/a$c;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field protected Ud:Z

.field private Ue:Z

.field protected Uf:Z

.field private Ug:I

.field private Uh:I

.field private Ui:Lcom/kwad/sdk/widget/KSRelativeLayout;

.field private Uj:Landroid/widget/RelativeLayout;

.field private Uk:Z

.field private Ul:Z

.field private Um:Landroid/widget/LinearLayout;

.field private Un:Landroid/widget/LinearLayout;

.field private Uo:Landroid/widget/ImageView;

.field private Up:Landroid/view/ViewGroup;

.field private Uq:Landroid/widget/TextView;

.field private Ur:Lcom/kwad/components/core/video/a$c;

.field private Us:Lcom/kwad/components/core/video/a$a;

.field protected Ut:Lcom/kwad/components/core/video/a/a;

.field private final Uu:Lcom/kwad/sdk/core/download/a/a;

.field protected mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field protected mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

.field protected mContext:Landroid/content/Context;

.field protected mS:Landroid/widget/ImageView;

.field protected mT:Landroid/widget/TextView;

.field private nm:Landroid/widget/ProgressBar;

.field private np:Z

.field private zT:Landroid/widget/ImageView;

.field private zU:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/video/videoview/c;)V
    .locals 0
    .param p2    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/kwad/sdk/core/video/videoview/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p3}, Lcom/kwad/sdk/core/video/videoview/b;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/video/videoview/c;)V

    const/4 p3, 0x1

    .line 2
    iput-boolean p3, p0, Lcom/kwad/components/core/video/a;->Ue:Z

    const/4 p3, 0x0

    .line 3
    iput-boolean p3, p0, Lcom/kwad/components/core/video/a;->Uf:Z

    .line 4
    iput-boolean p3, p0, Lcom/kwad/components/core/video/a;->Ul:Z

    .line 5
    new-instance p3, Lcom/kwad/components/core/video/a$1;

    invoke-direct {p3, p0}, Lcom/kwad/components/core/video/a$1;-><init>(Lcom/kwad/components/core/video/a;)V

    iput-object p3, p0, Lcom/kwad/components/core/video/a;->Uu:Lcom/kwad/sdk/core/download/a/a;

    .line 6
    iput-object p1, p0, Lcom/kwad/components/core/video/a;->mContext:Landroid/content/Context;

    .line 7
    iput-object p2, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 8
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/video/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 9
    invoke-direct {p0}, Lcom/kwad/components/core/video/a;->init()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/video/a;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/video/a;->Uq:Landroid/widget/TextView;

    return-object p0
.end method

.method private aL(I)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Us:Lcom/kwad/components/core/video/a$a;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/video/a;->Ui:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {v1}, Lcom/kwad/sdk/widget/KSRelativeLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/kwad/components/core/video/a$a;->a(ILcom/kwad/sdk/utils/ac$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private init()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$layout;->ksad_feed_video_palyer_controller:I

    invoke-static {v0, v1, p0}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_root_container:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/widget/KSRelativeLayout;

    iput-object v0, p0, Lcom/kwad/components/core/video/a;->Ui:Lcom/kwad/sdk/widget/KSRelativeLayout;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_data_flow_container:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/kwad/components/core/video/a;->Uj:Landroid/widget/RelativeLayout;

    .line 4
    sget v0, Lcom/kwad/sdk/R$id;->ksad_data_flow_play_tip:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/video/a;->mT:Landroid/widget/TextView;

    .line 5
    sget v0, Lcom/kwad/sdk/R$id;->ksad_data_flow_play_btn:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/core/video/a;->mS:Landroid/widget/ImageView;

    .line 6
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_network_unavailable:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/kwad/components/core/video/a;->Um:Landroid/widget/LinearLayout;

    .line 8
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_error_container:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/kwad/components/core/video/a;->Un:Landroid/widget/LinearLayout;

    .line 9
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_progress:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/kwad/components/core/video/a;->nm:Landroid/widget/ProgressBar;

    .line 10
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_thumb_image:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/core/video/a;->Uo:Landroid/widget/ImageView;

    .line 11
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bs(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/b;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/b;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 14
    iget-object v1, p0, Lcom/kwad/components/core/video/a;->Uo:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 15
    iget-object v1, p0, Lcom/kwad/components/core/video/a;->Uo:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 16
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Uo:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Uo:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 18
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->L(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    .line 19
    iget-object v1, p0, Lcom/kwad/components/core/video/a;->mT:Landroid/widget/TextView;

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v2, v0

    invoke-static {v2, v3}, Lcom/kwad/sdk/utils/bm;->ai(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/components/core/video/a/d;->az(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/video/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/video/a;->Ut:Lcom/kwad/components/core/video/a/a;

    .line 21
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rL()V

    return-void
.end method

.method private rM()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Up:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private rQ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Uj:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void
.end method

.method private setTopBottomVisible(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a;->Ul:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->nm:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/core/video/a;->Uk:Z

    return-void
.end method


# virtual methods
.method public final aF(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$id;->ksad_app_download:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final aO(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a;->Ul:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 2
    iget-boolean p1, p0, Lcom/kwad/components/core/video/a;->Uk:Z

    if-eqz p1, :cond_2

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->nm:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->nm:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method protected ey()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_complete_app_container:I

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 4
    sget v1, Lcom/kwad/sdk/R$id;->ksad_video_complete_app_icon:I

    invoke-virtual {p0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/kwad/components/core/video/a;->zT:Landroid/widget/ImageView;

    .line 5
    sget v1, Lcom/kwad/sdk/R$id;->ksad_app_name:I

    invoke-virtual {p0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/kwad/components/core/video/a;->zU:Landroid/widget/TextView;

    .line 6
    sget v1, Lcom/kwad/sdk/R$id;->ksad_app_download:I

    invoke-virtual {p0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/kwad/components/core/video/a;->Uq:Landroid/widget/TextView;

    .line 7
    iget-object v1, p0, Lcom/kwad/components/core/video/a;->zT:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 8
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/e;->dX(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v4, 0xc

    invoke-static {v1, v2, v3, v4}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadAppIcon(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 9
    iget-object v1, p0, Lcom/kwad/components/core/video/a;->zU:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/kwad/components/core/video/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->cd(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v1, p0, Lcom/kwad/components/core/video/a;->Uq:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/kwad/components/core/video/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iput-object v0, p0, Lcom/kwad/components/core/video/a;->Up:Landroid/view/ViewGroup;

    .line 12
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->zT:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->zU:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Uq:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    new-instance v0, Lcom/kwad/components/core/e/d/c;

    iget-object v1, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object v0, p0, Lcom/kwad/components/core/video/a;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 16
    iget-object v1, p0, Lcom/kwad/components/core/video/a;->Uu:Lcom/kwad/sdk/core/download/a/a;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/c;->b(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    goto :goto_0

    .line 17
    :cond_0
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_complete_h5_container:I

    .line 18
    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 19
    sget v1, Lcom/kwad/sdk/R$id;->ksad_h5_open:I

    invoke-virtual {p0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/kwad/components/core/video/a;->Uq:Landroid/widget/TextView;

    .line 20
    iget-object v2, p0, Lcom/kwad/components/core/video/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    iget-object v1, p0, Lcom/kwad/components/core/video/a;->Uq:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    iput-object v0, p0, Lcom/kwad/components/core/video/a;->Up:Landroid/view/ViewGroup;

    .line 23
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Up:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Up:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object v0
.end method

.method public final n(II)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/kwad/components/core/video/a;->Uh:I

    .line 2
    iput p1, p0, Lcom/kwad/components/core/video/a;->Ug:I

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mS:Landroid/widget/ImageView;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    .line 2
    iput-boolean v1, p0, Lcom/kwad/components/core/video/a;->Ud:Z

    .line 3
    iput-boolean v1, p0, Lcom/kwad/components/core/video/a;->Ue:Z

    .line 4
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rR()V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->zT:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_1

    .line 6
    invoke-direct {p0, v1}, Lcom/kwad/components/core/video/a;->aL(I)V

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->zU:Landroid/widget/TextView;

    if-ne p1, v0, :cond_2

    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lcom/kwad/components/core/video/a;->aL(I)V

    return-void

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Uq:Landroid/widget/TextView;

    if-ne p1, v0, :cond_3

    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1}, Lcom/kwad/components/core/video/a;->aL(I)V

    return-void

    :cond_3
    const/4 p1, 0x4

    .line 11
    invoke-direct {p0, p1}, Lcom/kwad/components/core/video/a;->aL(I)V

    return-void
.end method

.method public final onPlayStateChanged(I)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onPlayStateChanged playState="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AdVideoPlayerController"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eq p1, v0, :cond_b

    const/16 v0, 0x9

    if-eq p1, v0, :cond_9

    const/4 v0, 0x1

    if-eq p1, v0, :cond_8

    const/4 v1, 0x2

    if-eq p1, v1, :cond_5

    const/4 v0, 0x4

    if-eq p1, v0, :cond_3

    const/4 v0, 0x5

    if-eq p1, v0, :cond_2

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ut:Lcom/kwad/components/core/video/a/a;

    if-eqz p1, :cond_e

    .line 3
    invoke-virtual {p1}, Lcom/kwad/components/core/video/l;->onVideoPlayBufferingPaused()V

    goto/16 :goto_0

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ut:Lcom/kwad/components/core/video/a/a;

    if-eqz p1, :cond_e

    .line 5
    invoke-virtual {p1}, Lcom/kwad/components/core/video/l;->onVideoPlayBufferingPlaying()V

    return-void

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ut:Lcom/kwad/components/core/video/a/a;

    if-eqz p1, :cond_e

    .line 7
    invoke-virtual {p1}, Lcom/kwad/components/core/video/l;->onMediaPlayPaused()V

    return-void

    .line 8
    :cond_3
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ur:Lcom/kwad/components/core/video/a$c;

    if-eqz p1, :cond_4

    .line 9
    invoke-interface {p1}, Lcom/kwad/components/core/video/a$c;->bl()V

    .line 10
    :cond_4
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Uo:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ut:Lcom/kwad/components/core/video/a/a;

    if-eqz p1, :cond_e

    .line 12
    invoke-virtual {p1}, Lcom/kwad/components/core/video/a/a;->pc()V

    .line 13
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ut:Lcom/kwad/components/core/video/a/a;

    invoke-virtual {p1}, Lcom/kwad/components/core/video/l;->onMediaPlaying()V

    return-void

    .line 14
    :cond_5
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ur:Lcom/kwad/components/core/video/a$c;

    if-eqz p1, :cond_6

    .line 15
    invoke-interface {p1}, Lcom/kwad/components/core/video/a$c;->onVideoPlayStart()V

    .line 16
    :cond_6
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ut:Lcom/kwad/components/core/video/a/a;

    if-eqz p1, :cond_7

    .line 17
    invoke-virtual {p1}, Lcom/kwad/components/core/video/l;->onMediaPlayStart()V

    .line 18
    :cond_7
    invoke-direct {p0, v0}, Lcom/kwad/components/core/video/a;->setTopBottomVisible(Z)V

    .line 19
    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/b;->sa()V

    return-void

    .line 20
    :cond_8
    invoke-direct {p0}, Lcom/kwad/components/core/video/a;->rQ()V

    .line 21
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Um:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 22
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Un:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 23
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->nm:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 24
    invoke-direct {p0}, Lcom/kwad/components/core/video/a;->rM()V

    return-void

    .line 25
    :cond_9
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ur:Lcom/kwad/components/core/video/a$c;

    if-eqz p1, :cond_a

    .line 26
    invoke-interface {p1}, Lcom/kwad/components/core/video/a$c;->bm()V

    .line 27
    :cond_a
    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/b;->sb()V

    .line 28
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const-wide/16 v2, -0x1

    invoke-virtual {p1, v2, v3}, Lcom/kwad/sdk/core/response/model/AdTemplate;->setmCurPlayTime(J)V

    .line 29
    invoke-direct {p0, v1}, Lcom/kwad/components/core/video/a;->setTopBottomVisible(Z)V

    .line 30
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Uo:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->W(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1, v0, v2}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 31
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Uo:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 32
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->ey()V

    .line 33
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ut:Lcom/kwad/components/core/video/a/a;

    if-eqz p1, :cond_e

    .line 34
    invoke-virtual {p1}, Lcom/kwad/components/core/video/l;->onMediaPlayCompleted()V

    return-void

    .line 35
    :cond_b
    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/b;->sb()V

    .line 36
    invoke-direct {p0, v1}, Lcom/kwad/components/core/video/a;->setTopBottomVisible(Z)V

    .line 37
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Um:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 38
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Un:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 39
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ur:Lcom/kwad/components/core/video/a$c;

    instance-of v0, p1, Lcom/kwad/components/core/video/f$a;

    if-eqz v0, :cond_c

    .line 40
    check-cast p1, Lcom/kwad/components/core/video/f$a;

    iget v0, p0, Lcom/kwad/components/core/video/a;->Ug:I

    iget v1, p0, Lcom/kwad/components/core/video/a;->Uh:I

    .line 41
    invoke-interface {p1, v0, v1}, Lcom/kwad/components/core/video/f$a;->onVideoPlayError(II)V

    .line 42
    :cond_c
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ur:Lcom/kwad/components/core/video/a$c;

    instance-of v0, p1, Lcom/kwad/components/core/video/a$b;

    if-eqz v0, :cond_d

    .line 43
    check-cast p1, Lcom/kwad/components/core/video/a$b;

    iget v0, p0, Lcom/kwad/components/core/video/a;->Ug:I

    iget v1, p0, Lcom/kwad/components/core/video/a;->Uh:I

    invoke-interface {p1, v0, v1}, Lcom/kwad/components/core/video/a$b;->onVideoPlayError(II)V

    .line 44
    :cond_d
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget v1, p0, Lcom/kwad/components/core/video/a;->Ug:I

    iget v2, p0, Lcom/kwad/components/core/video/a;->Uh:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/kwad/components/core/o/a;->c(Lcom/kwad/sdk/core/response/model/AdTemplate;II)V

    .line 45
    iget-object p1, p0, Lcom/kwad/components/core/video/a;->Ut:Lcom/kwad/components/core/video/a/a;

    if-eqz p1, :cond_e

    .line 46
    iget v0, p0, Lcom/kwad/components/core/video/a;->Ug:I

    iget v1, p0, Lcom/kwad/components/core/video/a;->Uh:I

    invoke-virtual {p1, v0, v1}, Lcom/kwad/components/core/video/l;->onMediaPlayError(II)V

    :cond_e
    :goto_0
    return-void
.end method

.method protected rL()V
    .locals 0

    return-void
.end method

.method protected final rN()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Um:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method protected final rO()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Um:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method protected final rP()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Uj:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Uo:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mVideoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;->setVideoPlayerBehavior(I)V

    return-void
.end method

.method protected rR()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->isIdle()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Ut:Lcom/kwad/components/core/video/a/a;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/components/core/video/a/c;->onStart()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rN()V

    return-void

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rO()V

    .line 7
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a;->Uf:Z

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rS()V

    .line 9
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->start()V

    return-void

    .line 10
    :cond_2
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a;->Ue:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isWifiConnected(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rS()V

    .line 12
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->start()V

    return-void

    .line 13
    :cond_3
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a;->Ue:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/kwad/components/core/video/a;->np:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/kwad/components/core/video/a;->Ud:Z

    if-eqz v0, :cond_5

    .line 14
    :cond_4
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rS()V

    .line 15
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->start()V

    return-void

    .line 16
    :cond_5
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rP()V

    return-void

    .line 17
    :cond_6
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->isPaused()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->GT()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 18
    :cond_7
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rS()V

    .line 19
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->restart()V

    :cond_8
    return-void
.end method

.method protected final rS()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/contentalliance/a/a/a;->bF(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/contentalliance/a/a/a;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v1, v0}, Lcom/kwad/sdk/core/video/videoview/c;->setKsPlayLogParam(Lcom/kwad/sdk/contentalliance/a/a/a;)V

    return-void
.end method

.method protected rT()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->pause()V

    return-void
.end method

.method public final rU()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->getCurrentPosition()J

    move-result-wide v0

    .line 2
    iget-object v2, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v2}, Lcom/kwad/sdk/core/video/videoview/c;->getDuration()J

    move-result-wide v2

    .line 3
    iget-object v4, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v4}, Lcom/kwad/sdk/core/video/videoview/c;->getBufferPercentage()I

    move-result v4

    .line 4
    iget-object v5, p0, Lcom/kwad/components/core/video/a;->nm:Landroid/widget/ProgressBar;

    invoke-virtual {v5, v4}, Landroid/widget/ProgressBar;->setSecondaryProgress(I)V

    long-to-float v4, v0

    const/high16 v5, 0x42c80000    # 100.0f

    mul-float v4, v4, v5

    long-to-float v2, v2

    div-float/2addr v4, v2

    float-to-int v2, v4

    .line 5
    iget-object v3, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v3, v0, v1}, Lcom/kwad/sdk/core/response/model/AdTemplate;->setmCurPlayTime(J)V

    .line 6
    iget-object v3, p0, Lcom/kwad/components/core/video/a;->nm:Landroid/widget/ProgressBar;

    invoke-virtual {v3, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 7
    iget-object v2, p0, Lcom/kwad/components/core/video/a;->Ur:Lcom/kwad/components/core/video/a$c;

    if-eqz v2, :cond_0

    .line 8
    invoke-interface {v2, v0, v1}, Lcom/kwad/components/core/video/a$c;->e(J)V

    :cond_0
    return-void
.end method

.method public final rV()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a;->Ul:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->nm:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->release()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Ut:Lcom/kwad/components/core/video/a/a;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/components/core/video/a/c;->onRelease()V

    :cond_0
    return-void
.end method

.method public final reset()V
    .locals 2
    .annotation build Landroidx/annotation/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/b;->sb()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->nm:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->nm:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setSecondaryProgress(I)V

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/core/video/a;->rQ()V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Um:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Un:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->nm:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Uo:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Uj:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mVideoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;->setVideoPlayerBehavior(I)V

    .line 11
    invoke-direct {p0}, Lcom/kwad/components/core/video/a;->rM()V

    return-void
.end method

.method public setAdClickListener(Lcom/kwad/components/core/video/a$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/video/a;->Us:Lcom/kwad/components/core/video/a$a;

    return-void
.end method

.method public setCanControlPlay(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/video/a;->Uf:Z

    return-void
.end method

.method public setDataAutoStart(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/video/a;->Ue:Z

    return-void
.end method

.method public setDataFlowAutoStart(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/video/a;->np:Z

    return-void
.end method

.method public setVideoPlayCallback(Lcom/kwad/components/core/video/a$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/video/a;->Ur:Lcom/kwad/components/core/video/a$c;

    return-void
.end method

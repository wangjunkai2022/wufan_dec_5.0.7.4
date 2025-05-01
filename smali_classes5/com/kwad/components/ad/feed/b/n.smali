.class public final Lcom/kwad/components/ad/feed/b/n;
.super Lcom/kwad/components/core/widget/b;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/widget/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/feed/b/n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/components/core/widget/b<",
        "Lcom/kwad/sdk/core/response/model/AdResultData;",
        "Lcom/kwad/sdk/core/response/model/AdTemplate;",
        ">;",
        "Lcom/kwad/sdk/widget/c;"
    }
.end annotation


# instance fields
.field private dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

.field private eY:Lcom/kwad/components/core/j/a$b;

.field private ey:J

.field private fM:Lcom/kwad/components/core/widget/b;

.field private fN:F

.field private fO:F

.field private fP:Z

.field private fZ:Lcom/kwad/components/core/widget/b$a;

.field private gj:Lcom/kwad/components/core/webview/tachikoma/i;

.field private gk:Lcom/kwad/sdk/widget/KSFrameLayout;

.field private gl:Z

.field private gm:Lcom/kwad/components/core/webview/jshandler/aw;

.field private gn:Lcom/kwad/sdk/core/webview/c/c;

.field private go:Lcom/kwad/components/core/webview/tachikoma/a/o;

.field private gp:Lcom/kwad/components/ad/feed/b/n$a;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

.field private mHeight:I

.field private mWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/feed/b/n;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kwad/components/ad/feed/b/n;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 p3, 0x0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/core/widget/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p2, p0, Lcom/kwad/components/ad/feed/b/n;->mWidth:I

    .line 5
    iput-boolean p3, p0, Lcom/kwad/components/ad/feed/b/n;->gl:Z

    .line 6
    new-instance p2, Lcom/kwad/components/ad/feed/b/n$4;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/feed/b/n$4;-><init>(Lcom/kwad/components/ad/feed/b/n;)V

    iput-object p2, p0, Lcom/kwad/components/ad/feed/b/n;->fZ:Lcom/kwad/components/core/widget/b$a;

    .line 7
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/feed/b/n;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic A(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/api/KsAdVideoPlayConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/n;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    return-object p0
.end method

.method static synthetic B(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method static synthetic C(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic D(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic E(Lcom/kwad/components/ad/feed/b/n;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/widget/b;->tO()V

    return-void
.end method

.method static synthetic F(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic G(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic H(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic I(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic J(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic K(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic L(Lcom/kwad/components/ad/feed/b/n;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic M(Lcom/kwad/components/ad/feed/b/n;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic N(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/webview/c/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/n;->gn:Lcom/kwad/sdk/core/webview/c/c;

    return-object p0
.end method

.method static synthetic O(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic P(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic Q(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic R(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic S(Lcom/kwad/components/ad/feed/b/n;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/feed/b/n;->gl:Z

    return p0
.end method

.method static synthetic T(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic U(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic V(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic W(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic X(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic Y(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic Z(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/n;Lcom/kwad/components/core/webview/jshandler/aw;)Lcom/kwad/components/core/webview/jshandler/aw;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/n;->gm:Lcom/kwad/components/core/webview/jshandler/aw;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/n;Lcom/kwad/components/core/webview/tachikoma/a/o;)Lcom/kwad/components/core/webview/tachikoma/a/o;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/n;->go:Lcom/kwad/components/core/webview/tachikoma/a/o;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/webview/tachikoma/i;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/n;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/n;Lcom/kwad/sdk/core/webview/c/c;)Lcom/kwad/sdk/core/webview/c/c;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/n;->gn:Lcom/kwad/sdk/core/webview/c/c;

    return-object p1
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 1

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-nez v0, :cond_0

    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/feed/b/n;->fN:F

    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/feed/b/n;->fO:F

    :cond_0
    return-void
.end method

.method static synthetic aa(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic ab(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic ac(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic ad(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/webview/jshandler/aw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/n;->gm:Lcom/kwad/components/core/webview/jshandler/aw;

    return-object p0
.end method

.method private bD()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->gn:Lcom/kwad/sdk/core/webview/c/c;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/kwad/components/ad/feed/b/n$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/feed/b/n$3;-><init>(Lcom/kwad/components/ad/feed/b/n;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private bE()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->fM:Lcom/kwad/components/core/widget/b;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/feed/b/n;->gl:Z

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bd(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    .line 4
    iget-object v2, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget v3, v3, Lcom/kwad/sdk/core/response/model/AdTemplate;->type:I

    .line 5
    invoke-static {v3}, Lcom/kwad/components/model/FeedType;->fromInt(I)Lcom/kwad/components/model/FeedType;

    move-result-object v3

    .line 6
    invoke-static {v2, v3, v1}, Lcom/kwad/components/ad/feed/b;->a(Landroid/content/Context;Lcom/kwad/components/model/FeedType;I)Lcom/kwad/components/core/widget/b;

    move-result-object v1

    iput-object v1, p0, Lcom/kwad/components/ad/feed/b/n;->fM:Lcom/kwad/components/core/widget/b;

    if-eqz v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v1

    .line 8
    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/n;->fM:Lcom/kwad/components/core/widget/b;

    invoke-virtual {v2, v1}, Lcom/kwad/components/core/widget/b;->setMargin(I)V

    .line 9
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/n;->gk:Lcom/kwad/sdk/widget/KSFrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/n;->fM:Lcom/kwad/components/core/widget/b;

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/n;->fZ:Lcom/kwad/components/core/widget/b$a;

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/widget/b;->setInnerAdInteractionListener(Lcom/kwad/components/core/widget/b$a;)V

    .line 11
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/n;->gk:Lcom/kwad/sdk/widget/KSFrameLayout;

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/n;->fM:Lcom/kwad/components/core/widget/b;

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 12
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/n;->gp:Lcom/kwad/components/ad/feed/b/n$a;

    const-string v2, ""

    invoke-interface {v1, v0, v2}, Lcom/kwad/components/ad/feed/b/n$a;->c(ILjava/lang/String;)V

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->fM:Lcom/kwad/components/core/widget/b;

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/b;->b(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 14
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->fM:Lcom/kwad/components/core/widget/b;

    instance-of v1, v0, Lcom/kwad/components/ad/feed/b/c;

    if-eqz v1, :cond_0

    .line 15
    check-cast v0, Lcom/kwad/components/ad/feed/b/c;

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/n;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/b/c;->a(Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V

    :cond_0
    return-void
.end method

.method private bw()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/n;->fP:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/feed/b/n;->fP:Z

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x3

    invoke-virtual {p0}, Lcom/kwad/components/core/widget/b;->getStayTime()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IJ)V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/widget/KSFrameLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/n;->gk:Lcom/kwad/sdk/widget/KSFrameLayout;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/feed/b/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/n;->bE()V

    return-void
.end method

.method static synthetic f(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/ad/feed/b/n$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/n;->gp:Lcom/kwad/components/ad/feed/b/n$a;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/e/d/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/n;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-object p0
.end method

.method private getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->eY:Lcom/kwad/components/core/j/a$b;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/j/a$b;

    new-instance v1, Lcom/kwad/components/ad/feed/b/n$5;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/feed/b/n$5;-><init>(Lcom/kwad/components/ad/feed/b/n;)V

    invoke-direct {v0, v1}, Lcom/kwad/components/core/j/a$b;-><init>(Lcom/kwad/components/core/j/a$c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->eY:Lcom/kwad/components/core/j/a$b;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->eY:Lcom/kwad/components/core/j/a$b;

    return-object v0
.end method

.method static synthetic h(Lcom/kwad/components/ad/feed/b/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/n;->bD()V

    return-void
.end method

.method static synthetic i(Lcom/kwad/components/ad/feed/b/n;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method private init(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/config/c;->atM:Lcom/kwad/sdk/core/config/item/k;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/k;)I

    move-result v0

    .line 2
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-direct {v1, p1, v0, v0}, Lcom/kwad/components/core/webview/tachikoma/i;-><init>(Landroid/content/Context;II)V

    iput-object v1, p0, Lcom/kwad/components/ad/feed/b/n;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    new-instance v0, Lcom/kwad/components/ad/feed/b/n$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/ad/feed/b/n$1;-><init>(Lcom/kwad/components/ad/feed/b/n;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/kwad/sdk/core/c/b;->a(Lcom/kwad/sdk/core/c/c;)V

    return-void
.end method

.method static synthetic j(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/webview/tachikoma/a/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/n;->go:Lcom/kwad/components/core/webview/tachikoma/a/o;

    return-object p0
.end method

.method static synthetic k(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/j/a$b;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/n;->getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic m(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method static synthetic n(Lcom/kwad/components/ad/feed/b/n;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/feed/b/n;->ey:J

    return-wide v0
.end method

.method static synthetic o(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic p(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method static synthetic q(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic r(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/j/a$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/n;->eY:Lcom/kwad/components/core/j/a$b;

    return-object p0
.end method

.method static synthetic s(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic t(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic u(Lcom/kwad/components/ad/feed/b/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/n;->bw()V

    return-void
.end method

.method static synthetic v(Lcom/kwad/components/ad/feed/b/n;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic w(Lcom/kwad/components/ad/feed/b/n;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/feed/b/n;->mWidth:I

    return p0
.end method

.method static synthetic x(Lcom/kwad/components/ad/feed/b/n;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic y(Lcom/kwad/components/ad/feed/b/n;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/feed/b/n;->mHeight:I

    return p0
.end method

.method static synthetic z(Lcom/kwad/components/ad/feed/b/n;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final aM()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/widget/b;->aM()V

    .line 2
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/n;->getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->gm:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sZ()V

    :cond_0
    return-void
.end method

.method public final aN()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/widget/b;->aN()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->gm:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->ta()V

    .line 4
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/n;->eY:Lcom/kwad/components/core/j/a$b;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->c(Lcom/kwad/components/core/j/a$b;)V

    :cond_0
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/response/model/AdResultData;)V
    .locals 5
    .param p1    # Lcom/kwad/sdk/core/response/model/AdResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-super {p0, p1}, Lcom/kwad/components/core/widget/b;->b(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 3
    new-instance v0, Lcom/kwad/components/core/e/d/c;

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 4
    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/d/c;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/d/c;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/feed/b/n;->ey:J

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cO(Lcom/kwad/sdk/core/response/model/AdTemplate;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v4, v0, v2

    if-lez v4, :cond_0

    .line 8
    iget v0, p0, Lcom/kwad/components/ad/feed/b/n;->mWidth:I

    int-to-double v0, v0

    iget-object v2, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/b;->cO(Lcom/kwad/sdk/core/response/model/AdTemplate;)D

    move-result-wide v2

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int v0, v0

    iput v0, p0, Lcom/kwad/components/ad/feed/b/n;->mHeight:I

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->gk:Lcom/kwad/sdk/widget/KSFrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/feed/b/n;->mHeight:I

    .line 10
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/kwad/sdk/n/l;->dB(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/kwad/components/ad/feed/b/n$2;

    invoke-direct {v2, p0}, Lcom/kwad/components/ad/feed/b/n$2;-><init>(Lcom/kwad/components/ad/feed/b/n;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Landroid/app/Activity;Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/components/core/webview/tachikoma/j;)V

    return-void
.end method

.method public final bc()V
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$id;->ksad_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/widget/KSFrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->gk:Lcom/kwad/sdk/widget/KSFrameLayout;

    return-void
.end method

.method public final bv()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->gm:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sV()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->gm:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x3

    invoke-static {v0, v1, v1}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;II)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    if-eqz v0, :cond_1

    .line 7
    invoke-interface {v0}, Lcom/kwad/components/core/widget/b$a;->onAdShow()V

    :cond_1
    return-void
.end method

.method public final getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_feed_tkview:I

    return v0
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CY()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/d;->dH(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->ch(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/FeedSlideConf;

    move-result-object v1

    if-nez v1, :cond_1

    .line 5
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 6
    :cond_1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/feed/b/n;->a(Landroid/view/MotionEvent;)V

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-ne v0, v2, :cond_4

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->gk:Lcom/kwad/sdk/widget/KSFrameLayout;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/n;->gl:Z

    if-nez v0, :cond_4

    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v2, p0, Lcom/kwad/components/ad/feed/b/n;->fN:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_4

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->gk:Lcom/kwad/sdk/widget/KSFrameLayout;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->requestDisallowInterceptTouchEvent(Z)V

    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 11
    iget v2, p0, Lcom/kwad/components/ad/feed/b/n;->fN:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 13
    iget v3, p0, Lcom/kwad/components/ad/feed/b/n;->fO:F

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 14
    iget v3, v1, Lcom/kwad/sdk/core/response/model/FeedSlideConf;->maxRange:I

    int-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->tan(D)D

    move-result-wide v3

    float-to-double v5, v0

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v5

    float-to-double v7, v2

    cmpg-double v0, v3, v7

    if-ltz v0, :cond_3

    iget v0, v1, Lcom/kwad/sdk/core/response/model/FeedSlideConf;->minRange:I

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v5

    cmpg-double v2, v0, v7

    if-gez v2, :cond_4

    .line 15
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->gk:Lcom/kwad/sdk/widget/KSFrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->requestDisallowInterceptTouchEvent(Z)V

    .line 16
    :cond_4
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 17
    :cond_5
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final setTKLoadListener(Lcom/kwad/components/ad/feed/b/n$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n;->gp:Lcom/kwad/components/ad/feed/b/n$a;

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v1, p0, Lcom/kwad/components/ad/feed/b/n;->gl:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    :goto_0
    const-string v2, ""

    invoke-interface {v0, v1, v2}, Lcom/kwad/components/ad/feed/b/n$a;->c(ILjava/lang/String;)V

    .line 3
    :cond_1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/n;->gp:Lcom/kwad/components/ad/feed/b/n$a;

    return-void
.end method

.method public final setVideoPlayConfig(Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/n;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/n;->bD()V

    return-void
.end method

.method public final setWidth(I)V
    .locals 0

    if-lez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    :goto_0
    iput p1, p0, Lcom/kwad/components/ad/feed/b/n;->mWidth:I

    return-void
.end method

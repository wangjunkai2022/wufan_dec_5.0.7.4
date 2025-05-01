.class public final Lcom/kwad/components/ad/feed/b/m;
.super Lcom/kwad/components/core/widget/b;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/kwad/sdk/widget/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/feed/b/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/components/core/widget/b<",
        "Lcom/kwad/sdk/core/response/model/AdResultData;",
        "Lcom/kwad/sdk/core/response/model/AdTemplate;",
        ">;",
        "Landroid/view/View$OnClickListener;",
        "Lcom/kwad/sdk/widget/c;"
    }
.end annotation


# static fields
.field private static final fG:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field


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

.field private cP:I

.field private dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

.field private eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

.field private eM:Landroid/widget/ImageView;

.field private eN:Lcom/kwad/sdk/core/video/videoview/a;

.field private eO:Lcom/kwad/components/core/video/e;

.field private eP:Lcom/kwad/components/ad/feed/b/d;

.field private eQ:Z

.field private final eS:Lcom/kwad/components/core/video/a$a;

.field private eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

.field private eU:Lcom/kwad/components/core/n/a/a/a;

.field private eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

.field private eW:Z

.field private eX:Landroid/view/View;

.field private eY:Lcom/kwad/components/core/j/a$b;

.field private final eZ:Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListener;

.field private ek:Lcom/kwad/components/ad/feed/d$b;

.field private ey:J

.field private fA:Landroid/widget/LinearLayout;

.field private fB:Landroid/widget/TextView;

.field private fC:Lcom/kwad/components/core/webview/jshandler/ba;

.field private fD:Lcom/kwad/components/core/webview/jshandler/aw;

.field private fE:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;

.field private fF:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;

.field private fH:Z

.field private fI:Ljava/lang/String;

.field private fJ:Lcom/kwad/components/core/webview/jshandler/ax$b;

.field private fK:Lcom/kwad/components/core/webview/jshandler/ax$a;

.field private fL:Z

.field private fM:Lcom/kwad/components/core/widget/b;

.field private fN:F

.field private fO:F

.field private fP:Z

.field private fQ:Lcom/kwad/components/ad/feed/b/m$a;

.field private fR:Landroid/view/ViewGroup$MarginLayoutParams;

.field private fS:Landroid/os/Handler;

.field private fT:Lcom/kwad/components/ad/feed/b/e;

.field private fU:Lcom/kwad/components/core/webview/jshandler/ar;

.field private fV:Z

.field private fW:Z

.field private fX:Lcom/kwad/components/core/webview/b;

.field private fY:Lcom/kwad/components/core/webview/c;

.field private fZ:Lcom/kwad/components/core/widget/b$a;

.field private fa:Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

.field private fy:Lcom/kwad/sdk/widget/RatioFrameLayout;

.field private fz:D

.field private ga:Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;

.field private mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mIsAudioEnable:Z

.field private final mNetworking:Lcom/kwad/sdk/core/network/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kwad/sdk/core/network/l<",
            "Lcom/kwad/components/core/liveEnd/a;",
            "Lcom/kwad/components/core/liveEnd/AdLiveEndCommonResultData;",
            ">;"
        }
    .end annotation
.end field

.field private mWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Lcom/kwad/components/ad/feed/b/m;->fG:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/core/widget/b;-><init>(Landroid/content/Context;)V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lcom/kwad/components/ad/feed/b/m;->cP:I

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    .line 4
    iput-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->fL:Z

    .line 5
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fS:Landroid/os/Handler;

    .line 6
    iput-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->fV:Z

    .line 7
    iput-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->fW:Z

    .line 8
    new-instance p1, Lcom/kwad/components/ad/feed/b/m$1;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/feed/b/m$1;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fa:Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

    .line 9
    new-instance p1, Lcom/kwad/components/ad/feed/b/m$11;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/feed/b/m$11;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fY:Lcom/kwad/components/core/webview/c;

    .line 10
    new-instance p1, Lcom/kwad/components/ad/feed/b/m$13;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/feed/b/m$13;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fZ:Lcom/kwad/components/core/widget/b$a;

    .line 11
    new-instance p1, Lcom/kwad/components/ad/feed/b/m$15;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/feed/b/m$15;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->mNetworking:Lcom/kwad/sdk/core/network/l;

    .line 12
    new-instance p1, Lcom/kwad/components/ad/feed/b/m$16;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/feed/b/m$16;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eZ:Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListener;

    .line 13
    new-instance p1, Lcom/kwad/components/ad/feed/b/m$10;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/feed/b/m$10;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eS:Lcom/kwad/components/core/video/a$a;

    return-void
.end method

.method static synthetic A(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic B(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic C(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/webview/KsAdWebView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    return-object p0
.end method

.method static synthetic D(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/widget/RatioFrameLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->fy:Lcom/kwad/sdk/widget/RatioFrameLayout;

    return-object p0
.end method

.method static synthetic E(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic F(Lcom/kwad/components/ad/feed/b/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->bw()V

    return-void
.end method

.method static synthetic G(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method static synthetic H(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic I(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic J(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/e/d/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-object p0
.end method

.method static synthetic K(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic L(Lcom/kwad/components/ad/feed/b/m;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/feed/b/m;->fH:Z

    return p0
.end method

.method static synthetic M(Lcom/kwad/components/ad/feed/b/m;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/feed/b/m;->cP:I

    return p0
.end method

.method static synthetic N(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->fM:Lcom/kwad/components/core/widget/b;

    return-object p0
.end method

.method static synthetic O(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic P(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/m$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->fQ:Lcom/kwad/components/ad/feed/b/m$a;

    return-object p0
.end method

.method static synthetic Q(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic R(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic S(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic T(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic U(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic V(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic W(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic X(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic Y(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic Z(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;D)D
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/ad/feed/b/m;->fz:D

    return-wide p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/kwad/components/ad/feed/b/m;->cP:I

    return p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Landroid/view/ViewGroup$MarginLayoutParams;)Landroid/view/ViewGroup$MarginLayoutParams;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fR:Landroid/view/ViewGroup$MarginLayoutParams;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/ad/feed/b/d;)Lcom/kwad/components/ad/feed/b/d;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eP:Lcom/kwad/components/ad/feed/b/d;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/ad/feed/b/e;)Lcom/kwad/components/ad/feed/b/e;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fT:Lcom/kwad/components/ad/feed/b/e;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;)Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fE:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;)Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fF:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/core/webview/jshandler/ar;)Lcom/kwad/components/core/webview/jshandler/ar;
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fU:Lcom/kwad/components/core/webview/jshandler/ar;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/core/webview/jshandler/aw;)Lcom/kwad/components/core/webview/jshandler/aw;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fD:Lcom/kwad/components/core/webview/jshandler/aw;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/core/webview/jshandler/ax$a;)Lcom/kwad/components/core/webview/jshandler/ax$a;
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fK:Lcom/kwad/components/core/webview/jshandler/ax$a;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/core/webview/jshandler/ax$b;)Lcom/kwad/components/core/webview/jshandler/ax$b;
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fJ:Lcom/kwad/components/core/webview/jshandler/ax$b;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/core/webview/jshandler/ba;)Lcom/kwad/components/core/webview/jshandler/ba;
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fC:Lcom/kwad/components/core/webview/jshandler/ba;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;)Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->ga:Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;)Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/video/videoview/a;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->cB:Ljava/util/List;

    return-object p1
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 1

    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/feed/b/m;->fN:F

    .line 25
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/feed/b/m;->fO:F

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;J)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/feed/b/m;->c(J)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Landroid/view/View;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/feed/b/m;->c(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/sdk/core/adlog/c/b;)V
    .locals 0

    .line 19
    invoke-virtual {p0, p1}, Lcom/kwad/components/core/widget/b;->c(Lcom/kwad/sdk/core/adlog/c/b;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Ljava/lang/String;II)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/ad/feed/b/m;->a(Ljava/lang/String;II)V

    return-void
.end method

.method private a(Lcom/kwad/sdk/core/video/videoview/a;I)V
    .locals 2

    if-eqz p1, :cond_0

    .line 130
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    .line 131
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eO:Lcom/kwad/components/core/video/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/video/e;->setAutoRelease(Z)V

    .line 132
    invoke-static {}, Lcom/kwad/sdk/core/video/videoview/AdVideoPlayerViewCache;->getInstance()Lcom/kwad/sdk/core/video/videoview/AdVideoPlayerViewCache;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v0, p1, v1}, Lcom/kwad/sdk/core/video/videoview/AdVideoPlayerViewCache;->a(Ljava/lang/String;Lcom/kwad/sdk/core/video/videoview/a;)V

    .line 133
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget p1, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->type:I

    invoke-static {p1}, Lcom/kwad/components/model/FeedType;->fromInt(I)Lcom/kwad/components/model/FeedType;

    .line 134
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->bw()V

    .line 135
    new-instance p1, Lcom/kwad/components/core/e/d/a$a;

    .line 136
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 137
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 138
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    const/4 v0, 0x2

    .line 139
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->an(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 140
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bb(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->as(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    new-instance v0, Lcom/kwad/components/ad/feed/b/m$9;

    invoke-direct {v0, p0, p2}, Lcom/kwad/components/ad/feed/b/m$9;-><init>(Lcom/kwad/components/ad/feed/b/m;I)V

    .line 141
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 142
    invoke-static {p1}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;II)V
    .locals 9

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "handleWebViewError "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FeedWebView"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fS:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 28
    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->fH:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->fH:Z

    .line 30
    iget-object v3, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-eqz v3, :cond_1

    .line 31
    iget-object v3, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 32
    invoke-static {v3}, Lcom/kwad/sdk/core/response/b/b;->cI(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v4

    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-object v7, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v7}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getLoadTime()J

    move-result-wide v7

    sub-long/2addr v5, v7

    .line 34
    invoke-static {v3, v4, v5, v6, p2}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;JI)V

    .line 35
    :cond_1
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object p2

    iget-object v3, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 36
    invoke-static {v3}, Lcom/kwad/sdk/core/response/b/b;->cI(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v3, v4, p1}, Lcom/kwad/components/core/o/a;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 37
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 38
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "handleWebViewError errorCode exception"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 39
    :goto_0
    iget-object v3, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v3}, Lcom/kwad/sdk/core/response/b/a;->bd(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v3

    iget-object v4, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1, v3, v4, p3}, Lcom/kwad/components/ad/feed/monitor/b;->a(IILcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 40
    iget-object p3, p0, Lcom/kwad/components/ad/feed/b/m;->fQ:Lcom/kwad/components/ad/feed/b/m$a;

    if-eqz p3, :cond_2

    .line 41
    invoke-interface {p3, v0, p1}, Lcom/kwad/components/ad/feed/b/m$a;->c(ILjava/lang/String;)V

    .line 42
    :cond_2
    iput-object v2, p0, Lcom/kwad/components/ad/feed/b/m;->fQ:Lcom/kwad/components/ad/feed/b/m$a;

    .line 43
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fM:Lcom/kwad/components/core/widget/b;

    if-nez p1, :cond_6

    .line 44
    iput-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->fL:Z

    .line 45
    invoke-static {p0}, Lcom/kwad/components/core/widget/b;->c(Landroid/view/ViewGroup;)V

    .line 46
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->bd(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result p1

    .line 47
    iget-object p3, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    if-eqz p3, :cond_3

    .line 48
    invoke-interface {p3, p2, p2}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->setAudioEnabled(ZZ)V

    .line 49
    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    invoke-interface {p2}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->onDestroy()V

    .line 50
    iput-object v2, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    .line 51
    :cond_3
    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    if-eqz p2, :cond_4

    .line 52
    invoke-interface {p2}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->onDestroy()V

    .line 53
    iput-object v2, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    .line 54
    :cond_4
    iget-object p2, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    iget-object p3, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget p3, p3, Lcom/kwad/sdk/core/response/model/AdTemplate;->type:I

    .line 55
    invoke-static {p3}, Lcom/kwad/components/model/FeedType;->fromInt(I)Lcom/kwad/components/model/FeedType;

    move-result-object p3

    .line 56
    invoke-static {p2, p3, p1}, Lcom/kwad/components/ad/feed/b;->a(Landroid/content/Context;Lcom/kwad/components/model/FeedType;I)Lcom/kwad/components/core/widget/b;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fM:Lcom/kwad/components/core/widget/b;

    if-eqz p1, :cond_6

    .line 57
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    const/high16 p2, 0x41800000    # 16.0f

    invoke-static {p1, p2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p1

    .line 58
    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m;->fM:Lcom/kwad/components/core/widget/b;

    invoke-virtual {p2, p1}, Lcom/kwad/components/core/widget/b;->setMargin(I)V

    .line 59
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fy:Lcom/kwad/sdk/widget/RatioFrameLayout;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 60
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fy:Lcom/kwad/sdk/widget/RatioFrameLayout;

    const-wide/16 p2, 0x0

    invoke-virtual {p1, p2, p3}, Lcom/kwad/sdk/widget/RatioFrameLayout;->setRatio(D)V

    .line 61
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/16 p2, 0x8

    if-eqz p1, :cond_5

    .line 62
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 63
    :cond_5
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 64
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fM:Lcom/kwad/components/core/widget/b;

    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m;->fZ:Lcom/kwad/components/core/widget/b$a;

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/widget/b;->setInnerAdInteractionListener(Lcom/kwad/components/core/widget/b$a;)V

    .line 65
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fy:Lcom/kwad/sdk/widget/RatioFrameLayout;

    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m;->fM:Lcom/kwad/components/core/widget/b;

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 66
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fM:Lcom/kwad/components/core/widget/b;

    iget-object p2, p0, Lcom/kwad/components/core/widget/b;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/widget/b;->b(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 67
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fM:Lcom/kwad/components/core/widget/b;

    instance-of p2, p1, Lcom/kwad/components/ad/feed/b/c;

    if-eqz p2, :cond_6

    .line 68
    check-cast p1, Lcom/kwad/components/ad/feed/b/c;

    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/feed/b/c;->a(Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V

    :cond_6
    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/sdk/core/webview/d/b/a;)Z
    .locals 0

    .line 21
    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/m;->b(Lcom/kwad/sdk/core/webview/d/b/a;)Z

    move-result p0

    return p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/feed/b/m;Z)Z
    .locals 0

    const/4 p1, 0x0

    .line 22
    iput-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->eQ:Z

    return p1
.end method

.method static synthetic aA(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic aB(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic aC(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic aD(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic aE(Lcom/kwad/components/ad/feed/b/m;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic aF(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic aG(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method static synthetic aH(Lcom/kwad/components/ad/feed/b/m;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/widget/b;->tN()V

    return-void
.end method

.method static synthetic aI(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic aa(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic ab(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic ac(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic ad(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic ae(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic af(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/ax$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->fK:Lcom/kwad/components/core/webview/jshandler/ax$a;

    return-object p0
.end method

.method static synthetic ag(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/ax$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->fJ:Lcom/kwad/components/core/webview/jshandler/ax$b;

    return-object p0
.end method

.method static synthetic ah(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->ga:Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;

    return-object p0
.end method

.method static synthetic ai(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method static synthetic aj(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/network/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->mNetworking:Lcom/kwad/sdk/core/network/l;

    return-object p0
.end method

.method static synthetic ak(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/j/a$b;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic al(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic am(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic an(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic ao(Lcom/kwad/components/ad/feed/b/m;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic ap(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->bi()Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    move-result-object p0

    return-object p0
.end method

.method static synthetic aq(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic ar(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method static synthetic as(Lcom/kwad/components/ad/feed/b/m;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/feed/b/m;->ey:J

    return-wide v0
.end method

.method static synthetic at(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic au(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->eP:Lcom/kwad/components/ad/feed/b/d;

    return-object p0
.end method

.method static synthetic av(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->fT:Lcom/kwad/components/ad/feed/b/e;

    return-object p0
.end method

.method static synthetic aw(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic ax(Lcom/kwad/components/ad/feed/b/m;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/feed/b/m;->fV:Z

    return p0
.end method

.method static synthetic ay(Lcom/kwad/components/ad/feed/b/m;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method private ay()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled",
            "AddJavascriptInterface",
            "JavascriptInterface"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fX:Lcom/kwad/components/core/webview/b;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/b;->jq()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 6
    new-instance v0, Lcom/kwad/components/core/webview/b;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fX:Lcom/kwad/components/core/webview/b;

    .line 7
    new-instance v0, Lcom/kwad/components/core/webview/b$a;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/b$a;-><init>()V

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 8
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->aA(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 9
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cI(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->aH(Ljava/lang/String;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    .line 10
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->d(Lcom/kwad/sdk/core/webview/KsAdWebView;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->fy:Lcom/kwad/sdk/widget/RatioFrameLayout;

    .line 11
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->k(Landroid/view/ViewGroup;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 12
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->f(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->fY:Lcom/kwad/components/core/webview/c;

    .line 13
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->a(Lcom/kwad/components/core/webview/c;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->fX:Lcom/kwad/components/core/webview/b;

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/webview/b;->a(Lcom/kwad/components/core/webview/b$a;)V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cI(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->loadUrl(Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 17
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cI(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-static {v0, v1}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->bt()V

    return-void
.end method

.method static synthetic az(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/feed/b/m;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/feed/b/m;->v(I)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/feed/b/m;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    return p1
.end method

.method private static b(Lcom/kwad/sdk/core/webview/d/b/a;)Z
    .locals 1

    .line 27
    iget-boolean v0, p0, Lcom/kwad/sdk/core/webview/d/b/a;->KS:Z

    if-eqz v0, :cond_0

    .line 28
    iget-boolean p0, p0, Lcom/kwad/sdk/core/webview/d/b/a;->Yl:Z

    return p0

    .line 29
    :cond_0
    iget p0, p0, Lcom/kwad/sdk/core/webview/d/b/a;->Yn:I

    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private bh()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 3
    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    if-eq v0, v2, :cond_1

    .line 4
    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    invoke-interface {v2}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    invoke-interface {v2}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    invoke-interface {v2}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    iget-boolean v2, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    invoke-direct {p0, v2}, Lcom/kwad/components/ad/feed/b/m;->g(Z)Z

    move-result v2

    invoke-interface {v0, v2, v1}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->setAudioEnabled(ZZ)V

    .line 11
    iget-object v3, p0, Lcom/kwad/components/ad/feed/b/m;->eU:Lcom/kwad/components/core/n/a/a/a;

    iget-object v4, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    .line 12
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getAppId()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 13
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ch(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 14
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ci(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 15
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cj(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v8

    .line 16
    invoke-interface/range {v3 .. v9}, Lcom/kwad/components/core/n/a/a/a;->getAdLivePlayModule(Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    .line 17
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eZ:Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListener;

    invoke-interface {v0, v1}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->registerAdLivePlayStateListener(Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListener;)V

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->onResume()V

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method private bi()Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->bj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eU:Lcom/kwad/components/core/n/a/a/a;

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    const/4 v2, 0x3

    .line 3
    invoke-static {v0, v1, v2}, Lcom/kwad/components/ad/j/b;->a(Lcom/kwad/components/core/n/a/a/a;Landroid/content/Context;I)Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    move-result-object v4

    iput-object v4, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    const/4 v0, 0x0

    if-nez v4, :cond_0

    return-object v0

    .line 4
    :cond_0
    iget-object v3, p0, Lcom/kwad/components/ad/feed/b/m;->eU:Lcom/kwad/components/core/n/a/a/a;

    .line 5
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v1

    iget-object v5, v1, Lcom/kwad/sdk/api/SdkConfig;->appId:Ljava/lang/String;

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 6
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->ch(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 7
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->ci(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v7

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 8
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->cj(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v8

    .line 9
    invoke-interface/range {v3 .. v9}, Lcom/kwad/components/core/n/a/a/a;->getAdLivePlayModule(Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    move-result-object v1

    .line 10
    iget-boolean v2, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    invoke-direct {p0, v2}, Lcom/kwad/components/ad/feed/b/m;->g(Z)Z

    move-result v2

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->setAudioEnabled(ZZ)V

    .line 11
    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m;->eZ:Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListener;

    invoke-interface {v1, v2}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->registerAdLivePlayStateListener(Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListener;)V

    .line 12
    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    invoke-interface {v2}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->getView()Landroid/view/View;

    move-result-object v2

    .line 13
    iget-object v3, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getTag()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 14
    iget-object v3, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getTag()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 15
    iget-object v3, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 17
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 18
    new-instance v0, Lcom/kwad/components/ad/feed/b/m$3;

    invoke-direct {v0, p0, v2}, Lcom/kwad/components/ad/feed/b/m$3;-><init>(Lcom/kwad/components/ad/feed/b/m;Landroid/view/View;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V

    .line 19
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->by()V

    .line 20
    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    if-eqz v0, :cond_2

    .line 21
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m;->fa:Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

    invoke-virtual {v0, v2}, Lcom/kwad/components/core/s/a;->a(Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;)V

    :cond_2
    return-object v1
.end method

.method private bj()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bs(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/b;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/b;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eM:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eX:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eM:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eM:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    new-instance v3, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;

    invoke-direct {v3}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;-><init>()V

    const/16 v4, 0x32

    .line 8
    invoke-virtual {v3, v4}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->setBlurRadius(I)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->build()Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;

    move-result-object v3

    new-instance v4, Lcom/kwad/components/ad/feed/b/m$6;

    invoke-direct {v4, p0}, Lcom/kwad/components/ad/feed/b/m$6;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    .line 9
    invoke-static {v1, v0, v2, v3, v4}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;Lcom/kwad/sdk/core/imageloader/core/listener/ImageLoadingListener;)V

    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eM:Landroid/widget/ImageView;

    sget v1, Lcom/kwad/sdk/R$drawable;->ksad_ad_live_end:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method private bt()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fS:Landroid/os/Handler;

    new-instance v1, Lcom/kwad/components/ad/feed/b/m$12;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/feed/b/m$12;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    const-wide/16 v2, 0x9c4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private bu()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cN(Lcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result v0

    int-to-float v0, v0

    .line 2
    new-instance v1, Lcom/kwad/components/ad/feed/b/m$17;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/feed/b/m$17;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    iput-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->ek:Lcom/kwad/components/ad/feed/d$b;

    .line 3
    iget-object v2, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    .line 4
    invoke-static {v0, v2, v1}, Lcom/kwad/components/ad/feed/d;->a(FLandroid/content/Context;Lcom/kwad/components/ad/feed/d$b;)V

    return-void
.end method

.method private bw()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->fP:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->fP:Z

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x2

    invoke-virtual {p0}, Lcom/kwad/components/core/widget/b;->getStayTime()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IJ)V

    return-void
.end method

.method private bx()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/feed/b/m;->cP:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private by()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    new-instance v1, Lcom/kwad/components/ad/feed/b/m$4;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/feed/b/m$4;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    invoke-interface {v0, v1}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->registerLiveMessageListener(Lcom/kwad/components/offline/api/core/adlive/listener/AdLiveMessageListener;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    new-instance v1, Lcom/kwad/components/ad/feed/b/m$5;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/feed/b/m$5;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    invoke-interface {v0, v1}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->registerLiveShopListener(Lcom/kwad/components/offline/api/core/adlive/listener/AdLiveShopListener;)V

    return-void
.end method

.method static synthetic bz()Ljava/util/HashMap;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/ad/feed/b/m;->fG:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic c(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method private c(J)V
    .locals 2

    long-to-float p1, p1

    const/high16 p2, 0x447a0000    # 1000.0f

    div-float/2addr p1, p2

    float-to-double p1, p1

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-int p1, p1

    .line 10
    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m;->cB:Ljava/util/List;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m;->cB:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 12
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 13
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 15
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;)V

    .line 16
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    :cond_2
    :goto_0
    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 3

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v1

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f100000    # 0.5625f

    int-to-float v2, v1

    mul-float v2, v2, v0

    float-to-int v0, v2

    .line 6
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xd

    const/4 v1, -0x1

    .line 7
    invoke-virtual {v2, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 8
    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/feed/b/m;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/kwad/components/core/widget/b;->aL(I)V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/feed/b/m;Z)Z
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/feed/b/m;->g(Z)Z

    move-result p0

    return p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/ba;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->fC:Lcom/kwad/components/core/webview/jshandler/ba;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/feed/b/m;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/kwad/components/core/widget/b;->aL(I)V

    return-void
.end method

.method static synthetic d(Lcom/kwad/components/ad/feed/b/m;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->fV:Z

    return p1
.end method

.method static synthetic e(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/ao$a;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->getOpenNewPageListener()Lcom/kwad/components/core/webview/jshandler/ao$a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method private g(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 1

    .line 10
    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->fW:Z

    if-eqz v0, :cond_0

    return-void

    .line 11
    :cond_0
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cM(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 12
    sget p1, Lcom/kwad/sdk/R$id;->ksad_web_bottom_card_webView:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    goto :goto_0

    .line 13
    :cond_1
    sget p1, Lcom/kwad/sdk/R$id;->ksad_web_default_bottom_card_webView:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    :goto_0
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->fW:Z

    return-void
.end method

.method private g(Z)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eY:Lcom/kwad/components/core/j/a$b;

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eY:Lcom/kwad/components/core/j/a$b;

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
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/components/core/s/a;->rB()Z

    move-result p1

    if-nez p1, :cond_2

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/s/a;->aN(Z)Z

    move-result p1

    return p1

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

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
    iget-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->eQ:Z

    if-nez p1, :cond_5

    .line 8
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/kwad/components/core/s/a;->aN(Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->eQ:Z

    .line 9
    :cond_5
    iget-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->eQ:Z

    return p1
.end method

.method private getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eY:Lcom/kwad/components/core/j/a$b;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/j/a$b;

    new-instance v1, Lcom/kwad/components/ad/feed/b/m$2;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/feed/b/m$2;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    invoke-direct {v0, v1}, Lcom/kwad/components/core/j/a$b;-><init>(Lcom/kwad/components/core/j/a$c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eY:Lcom/kwad/components/core/j/a$b;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eY:Lcom/kwad/components/core/j/a$b;

    return-object v0
.end method

.method private getOpenNewPageListener()Lcom/kwad/components/core/webview/jshandler/ao$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/feed/b/m$18;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/feed/b/m$18;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    return-object v0
.end method

.method private getRegisterLiveListener()Lcom/kwad/components/core/webview/jshandler/ax$c;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/feed/b/m$14;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/feed/b/m$14;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    return-object v0
.end method

.method private getVideoPlayCallback()Lcom/kwad/components/core/video/a$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/feed/b/m$7;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/feed/b/m$7;-><init>(Lcom/kwad/components/ad/feed/b/m;)V

    return-object v0
.end method

.method private static h(Lcom/kwad/sdk/core/response/model/AdTemplate;)F
    .locals 1

    .line 2
    iget p0, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->type:I

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const p0, 0x3f19eecc    # 0.6013f

    return p0

    :cond_0
    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-ne p0, v0, :cond_1

    goto :goto_0

    :cond_1
    const p0, 0x3f77ced9    # 0.968f

    return p0

    :cond_2
    :goto_0
    const p0, 0x3e90e560    # 0.283f

    return p0
.end method

.method static synthetic h(Lcom/kwad/components/ad/feed/b/m;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/feed/b/m;->eW:Z

    return p0
.end method

.method static synthetic i(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/widget/KSRelativeLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    return-object p0
.end method

.method private i(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 4

    .line 2
    new-instance v0, Lcom/kwad/components/core/e/d/c;

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 3
    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/d/c;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/d/c;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 5
    iput-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 7
    sget-object p1, Lcom/kwad/components/ad/feed/b/m;->fG:Ljava/util/HashMap;

    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-wide v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->posId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    if-eqz p1, :cond_0

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fy:Lcom/kwad/sdk/widget/RatioFrameLayout;

    invoke-virtual {p1}, Ljava/lang/Double;->floatValue()F

    move-result p1

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/widget/RatioFrameLayout;->setRatio(D)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/b;->cO(Lcom/kwad/sdk/core/response/model/AdTemplate;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double p1, v0, v2

    if-lez p1, :cond_1

    .line 10
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fy:Lcom/kwad/sdk/widget/RatioFrameLayout;

    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cO(Lcom/kwad/sdk/core/response/model/AdTemplate;)D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/widget/RatioFrameLayout;->setRatio(D)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fy:Lcom/kwad/sdk/widget/RatioFrameLayout;

    invoke-virtual {p1}, Lcom/kwad/sdk/widget/RatioFrameLayout;->getRatio()D

    move-result-wide v0

    cmpl-double p1, v0, v2

    if-nez p1, :cond_2

    .line 12
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fy:Lcom/kwad/sdk/widget/RatioFrameLayout;

    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->h(Lcom/kwad/sdk/core/response/model/AdTemplate;)F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/widget/RatioFrameLayout;->setRatio(D)V

    .line 13
    :cond_2
    :goto_0
    const-class p1, Lcom/kwad/components/core/n/a/a/a;

    invoke-static {p1}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/core/n/a/a/a;

    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eU:Lcom/kwad/components/core/n/a/a/a;

    if-eqz p1, :cond_3

    .line 14
    invoke-interface {p1}, Lcom/kwad/components/core/n/a/a/a;->pj()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 15
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cM(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->eW:Z

    :cond_3
    return-void
.end method

.method static synthetic j(Lcom/kwad/components/ad/feed/b/m;)D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/feed/b/m;->fz:D

    return-wide v0
.end method

.method static synthetic k(Lcom/kwad/components/ad/feed/b/m;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/feed/b/m;->mWidth:I

    return p0
.end method

.method static synthetic l(Lcom/kwad/components/ad/feed/b/m;)Landroid/view/ViewGroup$MarginLayoutParams;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->fR:Landroid/view/ViewGroup$MarginLayoutParams;

    return-object p0
.end method

.method static synthetic m(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/api/KsAdVideoPlayConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    return-object p0
.end method

.method static synthetic n(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method static synthetic o(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic p(Lcom/kwad/components/ad/feed/b/m;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    return p0
.end method

.method static synthetic q(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method static synthetic r(Lcom/kwad/components/ad/feed/b/m;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/widget/b;->tO()V

    return-void
.end method

.method static synthetic s(Lcom/kwad/components/ad/feed/b/m;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->fS:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic t(Lcom/kwad/components/ad/feed/b/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->bu()V

    return-void
.end method

.method static synthetic u(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/ar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->fU:Lcom/kwad/components/core/webview/jshandler/ar;

    return-object p0
.end method

.method static synthetic v(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->fF:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;

    return-object p0
.end method

.method private v(I)V
    .locals 3

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->bw()V

    .line 3
    new-instance v0, Lcom/kwad/components/core/e/d/a$a;

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 6
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->an(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 8
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lcom/kwad/components/core/e/d/a$a;->am(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    const/4 v2, 0x5

    .line 10
    invoke-virtual {v0, v2}, Lcom/kwad/components/core/e/d/a$a;->al(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, v2}, Lcom/kwad/components/core/e/d/a$a;->aq(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 12
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->as(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/ad/feed/b/m$8;

    invoke-direct {v1, p0, p1}, Lcom/kwad/components/ad/feed/b/m$8;-><init>(Lcom/kwad/components/ad/feed/b/m;I)V

    .line 13
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 14
    invoke-static {p1}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    return-void
.end method

.method static synthetic w(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/feed/b/m;->fE:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;

    return-object p0
.end method

.method static synthetic x(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/ax$c;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->getRegisterLiveListener()Lcom/kwad/components/core/webview/jshandler/ax$c;

    move-result-object p0

    return-object p0
.end method

.method static synthetic y(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    return-object p0
.end method

.method static synthetic z(Lcom/kwad/components/ad/feed/b/m;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/feed/b/m;->fL:Z

    return p0
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    if-ne p1, v0, :cond_1

    .line 122
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1}, Lcom/kwad/sdk/core/video/videoview/a;->isIdle()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 123
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/utils/l;->em(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 124
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/contentalliance/a/a/a;->bF(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/contentalliance/a/a/a;

    move-result-object p1

    .line 125
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/video/videoview/a;->setKsPlayLogParam(Lcom/kwad/sdk/contentalliance/a/a/a;)V

    .line 126
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1}, Lcom/kwad/sdk/core/video/videoview/a;->start()V

    return-void

    .line 127
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    const/16 v0, 0x64

    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/sdk/core/video/videoview/a;I)V

    return-void

    .line 128
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fB:Landroid/widget/TextView;

    if-ne p1, v0, :cond_2

    .line 129
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    const/16 v0, 0x19

    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/sdk/core/video/videoview/a;I)V

    :cond_2
    return-void
.end method

.method public final a(Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V
    .locals 10
    .param p1    # Lcom/kwad/sdk/api/KsAdVideoPlayConfig;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 69
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bs(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/b;

    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/b;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 71
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 72
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eM:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 73
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eM:Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1, v0, v4}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 74
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eM:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eM:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 76
    :goto_0
    new-instance v0, Lcom/kwad/sdk/core/video/videoview/a;

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/kwad/sdk/core/video/videoview/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    .line 77
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->cB:Ljava/util/List;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 78
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->zA()I

    move-result v0

    .line 79
    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    .line 80
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-void

    :cond_1
    if-gez v0, :cond_3

    .line 81
    invoke-static {}, Lcom/kwad/sdk/core/diskcache/b/a;->DM()Lcom/kwad/sdk/core/diskcache/b/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/diskcache/b/a;->bZ(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 82
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 83
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v1, v0

    goto :goto_2

    :cond_2
    move-object v1, v3

    goto :goto_2

    :cond_3
    if-nez v0, :cond_4

    goto :goto_2

    .line 84
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/core/videocache/c/a;->by(Landroid/content/Context;)Lcom/kwad/sdk/core/videocache/f;

    move-result-object v0

    .line 85
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cg()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 86
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->zA()I

    move-result v4

    .line 87
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/videocache/f;->eM(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 88
    new-instance v8, Lcom/kwad/sdk/core/network/a/a$a;

    invoke-direct {v8}, Lcom/kwad/sdk/core/network/a/a$a;-><init>()V

    mul-int/lit16 v4, v4, 0x400

    int-to-long v6, v4

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, v1

    .line 89
    invoke-virtual/range {v4 .. v9}, Lcom/kwad/sdk/core/videocache/f;->a(Ljava/lang/String;JLcom/kwad/sdk/core/network/a/a$a;Lcom/kwad/sdk/export/proxy/AdHttpResponseListener;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 90
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/videocache/f;->eK(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 91
    :cond_5
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/videocache/f;->eK(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 92
    :cond_6
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/videocache/f;->eK(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 93
    :cond_7
    :goto_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 94
    :cond_8
    new-instance v0, Lcom/kwad/sdk/contentalliance/a/a/b$a;

    iget-object v4, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v0, v4}, Lcom/kwad/sdk/contentalliance/a/a/b$a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 95
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->da(Ljava/lang/String;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 96
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dT(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/PhotoInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/h;->b(Lcom/kwad/sdk/core/response/model/PhotoInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->db(Ljava/lang/String;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mVideoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    .line 97
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->a(Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    new-instance v1, Lcom/kwad/sdk/contentalliance/a/a/a;

    iget-object v4, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-direct {v1, v4, v5, v6}, Lcom/kwad/sdk/contentalliance/a/a/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;J)V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->b(Lcom/kwad/sdk/contentalliance/a/a/a;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->BJ()Lcom/kwad/sdk/contentalliance/a/a/b;

    move-result-object v0

    .line 99
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v1, v0, v3}, Lcom/kwad/sdk/core/video/videoview/a;->a(Lcom/kwad/sdk/contentalliance/a/a/b;Ljava/util/Map;)V

    .line 100
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    iget-boolean v1, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    invoke-direct {p0, v1}, Lcom/kwad/components/ad/feed/b/m;->g(Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/video/videoview/a;->setVideoSoundEnable(Z)V

    .line 101
    new-instance v0, Lcom/kwad/components/core/video/e;

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    iget-object v4, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v5, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-direct {v0, v1, v4, v5, p1}, Lcom/kwad/components/core/video/e;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/video/videoview/c;Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eO:Lcom/kwad/components/core/video/e;

    .line 102
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/feed/b/m;->ey:J

    .line 103
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eO:Lcom/kwad/components/core/video/e;

    .line 104
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->getVideoPlayCallback()Lcom/kwad/components/core/video/a$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/video/a;->setVideoPlayCallback(Lcom/kwad/components/core/video/a$c;)V

    .line 105
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eO:Lcom/kwad/components/core/video/e;

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eS:Lcom/kwad/components/core/video/a$a;

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/video/a;->setAdClickListener(Lcom/kwad/components/core/video/a$a;)V

    .line 106
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eO:Lcom/kwad/components/core/video/e;

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/video/videoview/a;->setController(Lcom/kwad/sdk/core/video/videoview/b;)V

    .line 107
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 108
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 109
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {p1, v3}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 110
    :cond_9
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;I)V

    .line 111
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 112
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 113
    new-instance p1, Lcom/kwad/sdk/widget/f;

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-direct {p1, v0, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 114
    iget-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    if-eqz p1, :cond_a

    .line 115
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fa:Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/s/a;->a(Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;)V

    .line 116
    :cond_a
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget p1, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->type:I

    if-eq p1, v1, :cond_b

    const/16 v0, 0x13

    if-ne p1, v0, :cond_c

    .line 117
    :cond_b
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fA:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 118
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fB:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 119
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fB:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/f;->c(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    new-instance p1, Lcom/kwad/sdk/widget/f;

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fB:Landroid/widget/TextView;

    invoke-direct {p1, v0, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    :cond_c
    return-void
.end method

.method public final aM()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/widget/b;->aM()V

    .line 2
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 3
    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->eW:Z

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    if-nez v0, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->bi()Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    return-void

    .line 6
    :cond_1
    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->onResume()V

    return-void
.end method

.method public final aN()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/widget/b;->aN()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->onPause()V

    .line 4
    :cond_0
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eY:Lcom/kwad/components/core/j/a$b;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->c(Lcom/kwad/components/core/j/a$b;)V

    return-void
.end method

.method public final ac()V
    .locals 3

    .line 2
    invoke-super {p0}, Lcom/kwad/components/core/widget/b;->ac()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->ek:Lcom/kwad/components/ad/feed/d$b;

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cN(Lcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result v0

    int-to-float v0, v0

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m;->ek:Lcom/kwad/components/ad/feed/d$b;

    invoke-static {v0, v1, v2}, Lcom/kwad/components/ad/feed/d;->a(FLandroid/content/Context;Lcom/kwad/components/ad/feed/d$b;)V

    :cond_0
    return-void
.end method

.method public final ad()V
    .locals 3

    .line 2
    invoke-super {p0}, Lcom/kwad/components/core/widget/b;->ad()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fS:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/utils/l;->el(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->ek:Lcom/kwad/components/ad/feed/d$b;

    if-eqz v0, :cond_0

    .line 6
    invoke-static {v0}, Lcom/kwad/components/ad/feed/d;->a(Lcom/kwad/components/ad/feed/d$b;)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    if-eqz v0, :cond_1

    .line 8
    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->onDestroy()V

    .line 9
    iput-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    if-eqz v0, :cond_2

    .line 11
    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->onDestroy()V

    .line 12
    iput-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    .line 13
    :cond_2
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m;->eY:Lcom/kwad/components/core/j/a$b;

    invoke-virtual {v0, v2}, Lcom/kwad/components/core/j/a;->c(Lcom/kwad/components/core/j/a$b;)V

    .line 14
    iput-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->fJ:Lcom/kwad/components/core/webview/jshandler/ax$b;

    .line 15
    iput-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->fK:Lcom/kwad/components/core/webview/jshandler/ax$a;

    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/d;->dH(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fB:Landroid/widget/TextView;

    if-ne p1, v0, :cond_2

    .line 26
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    const/16 v0, 0x99

    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/sdk/core/video/videoview/a;I)V

    :cond_2
    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/response/model/AdResultData;)V
    .locals 5
    .param p1    # Lcom/kwad/sdk/core/response/model/AdResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/c;->n(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lcom/kwad/components/ad/feed/b/m;->g(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    const/4 v1, 0x2

    .line 6
    iput v1, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->realShowType:I

    .line 7
    invoke-super {p0, p1}, Lcom/kwad/components/core/widget/b;->b(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 8
    iget-boolean v2, p0, Lcom/kwad/components/ad/feed/b/m;->fH:Z

    if-eqz v2, :cond_1

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fM:Lcom/kwad/components/core/widget/b;

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0, p1}, Lcom/kwad/components/core/widget/b;->b(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fM:Lcom/kwad/components/core/widget/b;

    instance-of v0, p1, Lcom/kwad/components/ad/feed/b/c;

    if-eqz v0, :cond_0

    .line 12
    check-cast p1, Lcom/kwad/components/ad/feed/b/c;

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/feed/b/c;->a(Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V

    :cond_0
    return-void

    .line 13
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/b;->cP(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p1

    const/4 v2, 0x0

    const-string v3, "0"

    if-nez p1, :cond_2

    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, v3, v2, p1}, Lcom/kwad/components/ad/feed/b/m;->a(Ljava/lang/String;II)V

    return-void

    .line 15
    :cond_2
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->bx()Z

    move-result p1

    if-nez p1, :cond_3

    .line 16
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {p0, p1}, Lcom/kwad/components/ad/feed/b/m;->i(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 17
    :cond_3
    :try_start_0
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fI:Ljava/lang/String;

    if-eqz p1, :cond_4

    iget-object v4, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mOriginJString:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 18
    :cond_4
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->bx()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 19
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    goto :goto_0

    :cond_5
    const/4 p1, -0x2

    .line 20
    iput p1, p0, Lcom/kwad/components/ad/feed/b/m;->cP:I

    .line 21
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->ay()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 22
    :catchall_0
    invoke-direct {p0, v3, v2, v1}, Lcom/kwad/components/ad/feed/b/m;->a(Ljava/lang/String;II)V

    .line 23
    :cond_6
    :goto_0
    iget-object p1, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mOriginJString:Ljava/lang/String;

    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fI:Ljava/lang/String;

    return-void
.end method

.method public final bc()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/feed/monitor/b;->aZ()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/widget/RatioFrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fy:Lcom/kwad/sdk/widget/RatioFrameLayout;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/widget/KSRelativeLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    .line 4
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_immerse_text_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fA:Landroid/widget/LinearLayout;

    .line 5
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_immerse_text:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fB:Landroid/widget/TextView;

    .line 6
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_first_frame_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eM:Landroid/widget/ImageView;

    .line 7
    sget v0, Lcom/kwad/sdk/R$id;->ksad_live_end_bg_mantle:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eX:Landroid/view/View;

    return-void
.end method

.method public final bf()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/widget/b;->bf()V

    .line 2
    iget v0, p0, Lcom/kwad/components/ad/feed/b/m;->cP:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->fH:Z

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setVisibility(I)V

    const/4 v0, 0x3

    const-string v2, "0"

    .line 5
    invoke-direct {p0, v2, v1, v0}, Lcom/kwad/components/ad/feed/b/m;->a(Ljava/lang/String;II)V

    :cond_0
    return-void
.end method

.method public final bv()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/kwad/components/ad/feed/b/m;->fL:Z

    if-eqz v1, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/components/core/widget/b$a;->onAdShow()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;II)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->fL:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fD:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    :cond_1
    return-void
.end method

.method public final getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_feed_webview:I

    return v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 0

    return-void
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
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/feed/b/m;->a(Landroid/view/MotionEvent;)V

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-ne v0, v2, :cond_4

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->fL:Z

    if-nez v0, :cond_4

    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v2, p0, Lcom/kwad/components/ad/feed/b/m;->fN:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_4

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->requestDisallowInterceptTouchEvent(Z)V

    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 11
    iget v2, p0, Lcom/kwad/components/ad/feed/b/m;->fN:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 13
    iget v3, p0, Lcom/kwad/components/ad/feed/b/m;->fO:F

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

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v5

    cmpg-double v2, v0, v7

    if-gez v2, :cond_4

    .line 16
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->requestDisallowInterceptTouchEvent(Z)V

    .line 17
    :cond_4
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 18
    :cond_5
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_3

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->bh()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    if-eq p1, v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 9
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 12
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/video/videoview/a;->setVideoSoundEnable(Z)V

    .line 13
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eO:Lcom/kwad/components/core/video/e;

    .line 14
    invoke-direct {p0}, Lcom/kwad/components/ad/feed/b/m;->getVideoPlayCallback()Lcom/kwad/components/core/video/a$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/video/a;->setVideoPlayCallback(Lcom/kwad/components/core/video/a$c;)V

    .line 15
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eO:Lcom/kwad/components/core/video/e;

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eS:Lcom/kwad/components/core/video/a$a;

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/video/a;->setAdClickListener(Lcom/kwad/components/core/video/a$a;)V

    .line 16
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eO:Lcom/kwad/components/core/video/e;

    invoke-virtual {p1}, Lcom/kwad/components/core/video/a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdWebVideoPageShowing:Z

    .line 17
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eO:Lcom/kwad/components/core/video/e;

    invoke-virtual {p1}, Lcom/kwad/components/core/video/e;->sq()V

    .line 18
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eO:Lcom/kwad/components/core/video/e;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/video/e;->setAutoRelease(Z)V

    .line 19
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    .line 20
    invoke-static {}, Lcom/kwad/sdk/core/video/videoview/AdVideoPlayerViewCache;->getInstance()Lcom/kwad/sdk/core/video/videoview/AdVideoPlayerViewCache;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/video/videoview/AdVideoPlayerViewCache;->remove(Ljava/lang/String;)V

    return-void

    .line 21
    :cond_3
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->getView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    if-eqz p1, :cond_4

    .line 22
    invoke-interface {p1}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->onPause()V

    :cond_4
    return-void
.end method

.method public final setMargin(I)V
    .locals 0

    return-void
.end method

.method public final setPreloadListener(Lcom/kwad/components/ad/feed/b/m$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->fQ:Lcom/kwad/components/ad/feed/b/m$a;

    if-eqz v0, :cond_1

    .line 2
    iget v1, p0, Lcom/kwad/components/ad/feed/b/m;->cP:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    const-string v1, ""

    .line 3
    invoke-interface {v0, v2, v1}, Lcom/kwad/components/ad/feed/b/m$a;->c(ILjava/lang/String;)V

    .line 4
    :cond_1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->fQ:Lcom/kwad/components/ad/feed/b/m$a;

    return-void
.end method

.method public final setVideoPlayConfig(Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    .line 2
    instance-of v0, p1, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    if-eqz v0, :cond_4

    .line 3
    check-cast p1, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    .line 4
    invoke-virtual {p1}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getVideoSoundValue()I

    move-result v0

    if-eqz v0, :cond_3

    .line 5
    invoke-virtual {p1}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->isVideoSoundEnable()Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    .line 6
    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-eqz v1, :cond_0

    .line 7
    iput-boolean v0, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mIsAudioEnable:Z

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    if-eqz v0, :cond_1

    .line 9
    iget-boolean v1, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    invoke-direct {p0, v1}, Lcom/kwad/components/ad/feed/b/m;->g(Z)Z

    move-result v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->setAudioEnabled(ZZ)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    if-eqz v0, :cond_2

    .line 11
    iget-boolean v1, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    invoke-direct {p0, v1}, Lcom/kwad/components/ad/feed/b/m;->g(Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/video/videoview/a;->setVideoSoundEnable(Z)V

    .line 12
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m;->mIsAudioEnable:Z

    if-eqz v0, :cond_3

    .line 13
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m;->fa:Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

    .line 14
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/s/a;->a(Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;)V

    .line 15
    :cond_3
    invoke-virtual {p1}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getDataFlowAutoStartValue()I

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m;->eO:Lcom/kwad/components/core/video/e;

    if-eqz v0, :cond_4

    .line 16
    invoke-virtual {p1}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->isDataFlowAutoStart()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/a;->setDataAutoStart(Z)V

    :cond_4
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
    iput p1, p0, Lcom/kwad/components/ad/feed/b/m;->mWidth:I

    return-void
.end method

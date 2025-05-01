.class public Lcom/kwad/components/ad/l/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/l/b$b;,
        Lcom/kwad/components/ad/l/b$a;
    }
.end annotation


# instance fields
.field private Ik:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            ">;"
        }
    .end annotation
.end field

.field private Il:Ljava/util/List;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/e/d/c;",
            ">;"
        }
    .end annotation
.end field

.field protected Im:Landroid/view/View;

.field protected In:Z

.field private Io:Ljava/lang/String;

.field private Ip:Lcom/kwad/components/ad/l/b$a;

.field private Iq:Lcom/kwad/components/ad/l/b$b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field protected cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

.field protected cO:Lcom/kwad/sdk/core/webview/b;

.field private cP:I

.field protected cQ:Lcom/kwad/components/core/webview/jshandler/aw;

.field private cR:Lcom/kwad/sdk/core/webview/d/a/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private cT:Lcom/kwad/components/core/webview/jshandler/ai$b;

.field private dB:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

.field private da:Landroid/widget/FrameLayout;

.field private fX:Lcom/kwad/components/core/webview/b;

.field private fY:Lcom/kwad/components/core/webview/c;

.field protected mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mReportExtData:Lorg/json/JSONObject;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private yu:Lcom/kwad/components/core/webview/jshandler/bb;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->Ik:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->Il:Ljava/util/List;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/kwad/components/ad/l/b;->cP:I

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/ad/l/b;->In:Z

    .line 6
    new-instance v0, Lcom/kwad/components/ad/l/b$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/l/b$1;-><init>(Lcom/kwad/components/ad/l/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->fY:Lcom/kwad/components/core/webview/c;

    .line 7
    new-instance v0, Lcom/kwad/components/ad/l/b$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/l/b$2;-><init>(Lcom/kwad/components/ad/l/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->cT:Lcom/kwad/components/core/webview/jshandler/ai$b;

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->Ik:Ljava/util/List;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->Il:Ljava/util/List;

    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lcom/kwad/components/ad/l/b;->cP:I

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/kwad/components/ad/l/b;->In:Z

    .line 13
    new-instance v0, Lcom/kwad/components/ad/l/b$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/l/b$1;-><init>(Lcom/kwad/components/ad/l/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->fY:Lcom/kwad/components/core/webview/c;

    .line 14
    new-instance v0, Lcom/kwad/components/ad/l/b$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/l/b$2;-><init>(Lcom/kwad/components/ad/l/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->cT:Lcom/kwad/components/core/webview/jshandler/ai$b;

    .line 15
    iput-object p1, p0, Lcom/kwad/components/ad/l/b;->mReportExtData:Lorg/json/JSONObject;

    .line 16
    iput-object p2, p0, Lcom/kwad/components/ad/l/b;->Io:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/l/b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/ad/l/b;->cP:I

    return p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/l/b;)Lcom/kwad/components/ad/l/b$a;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/kwad/components/ad/l/b;->Ip:Lcom/kwad/components/ad/l/b$a;

    return-object p0
.end method

.method private aH()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/l/b;->cP:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string v0, "timeout"

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const-string v0, "h5error"

    goto :goto_0

    :cond_1
    const-string v0, "others"

    .line 2
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "show webCard fail, reason: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PlayEndWebCard"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/l/b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/l/b;->Io:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/l/b;)Lcom/kwad/components/ad/l/b$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/l/b;->Iq:Lcom/kwad/components/ad/l/b$b;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/l/b;)Lcom/kwad/sdk/core/webview/d/a/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/l/b;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    return-object p0
.end method

.method private static getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_ad_web_card_layout:I

    return v0
.end method


# virtual methods
.method protected B(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/l/b;->Io:Ljava/lang/String;

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/l/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/b;->cA(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final a(Landroid/widget/FrameLayout;Lcom/kwad/sdk/core/view/AdBaseFrameLayout;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;)V
    .locals 6
    .param p4    # Lcom/kwad/components/core/e/d/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 4
    invoke-virtual/range {v0 .. v5}, Lcom/kwad/components/ad/l/b;->a(Landroid/widget/FrameLayout;Lcom/kwad/sdk/core/view/AdBaseFrameLayout;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;I)V

    return-void
.end method

.method public a(Landroid/widget/FrameLayout;Lcom/kwad/sdk/core/view/AdBaseFrameLayout;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    iget-object p5, p0, Lcom/kwad/components/ad/l/b;->Il:Ljava/util/List;

    invoke-interface {p5, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iput-object p2, p0, Lcom/kwad/components/ad/l/b;->dB:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 7
    iput-object p1, p0, Lcom/kwad/components/ad/l/b;->da:Landroid/widget/FrameLayout;

    .line 8
    iput-object p3, p0, Lcom/kwad/components/ad/l/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 9
    invoke-virtual {p0}, Lcom/kwad/components/ad/l/b;->fk()V

    return-void
.end method

.method public final a(Landroid/widget/FrameLayout;Lcom/kwad/sdk/core/view/AdBaseFrameLayout;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/FrameLayout;",
            "Lcom/kwad/sdk/core/view/AdBaseFrameLayout;",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            ">;",
            "Ljava/util/List<",
            "Lcom/kwad/components/core/e/d/c;",
            ">;)V"
        }
    .end annotation

    .line 10
    iput-object p4, p0, Lcom/kwad/components/ad/l/b;->Il:Ljava/util/List;

    .line 11
    iput-object p2, p0, Lcom/kwad/components/ad/l/b;->dB:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 12
    iput-object p1, p0, Lcom/kwad/components/ad/l/b;->da:Landroid/widget/FrameLayout;

    if-eqz p3, :cond_0

    .line 13
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 14
    iput-object p3, p0, Lcom/kwad/components/ad/l/b;->Ik:Ljava/util/List;

    const/4 p1, 0x0

    .line 15
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object p1, p0, Lcom/kwad/components/ad/l/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/ad/l/b;->fk()V

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/l/b$a;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/kwad/components/ad/l/b;->Ip:Lcom/kwad/components/ad/l/b$a;

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/l/b$b;)V
    .locals 2
    .param p1    # Lcom/kwad/components/ad/l/b$b;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 17
    iput-object p1, p0, Lcom/kwad/components/ad/l/b;->Iq:Lcom/kwad/components/ad/l/b$b;

    .line 18
    iget-object p1, p0, Lcom/kwad/components/ad/l/b;->da:Landroid/widget/FrameLayout;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    const/4 p1, -0x1

    .line 19
    iput p1, p0, Lcom/kwad/components/ad/l/b;->cP:I

    .line 20
    iget-object p1, p0, Lcom/kwad/components/ad/l/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p0, p1}, Lcom/kwad/components/ad/l/b;->B(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object p1

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "startPreloadWebView url : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PlayEndWebCard"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-eqz v0, :cond_1

    .line 24
    invoke-virtual {p0}, Lcom/kwad/components/ad/l/b;->fo()V

    .line 25
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method protected a(Lcom/kwad/components/core/webview/a;)V
    .locals 5

    .line 27
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->Il:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->Ik:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v1, :cond_0

    .line 28
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aa;

    iget-object v1, p0, Lcom/kwad/components/ad/l/b;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/ad/l/b;->Il:Ljava/util/List;

    const/4 v3, 0x0

    .line 29
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/components/core/e/d/c;

    iget-object v4, p0, Lcom/kwad/components/ad/l/b;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    invoke-direct {v0, v1, v2, v4, v3}, Lcom/kwad/components/core/webview/jshandler/aa;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;B)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 30
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v1, p0, Lcom/kwad/components/ad/l/b;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/ad/l/b;->Il:Ljava/util/List;

    iget-object v3, p0, Lcom/kwad/components/ad/l/b;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/webview/jshandler/x;-><init>(Lcom/kwad/sdk/core/webview/b;Ljava/util/List;Lcom/kwad/sdk/core/webview/d/a/a;)V

    .line 31
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 32
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/am;

    iget-object v1, p0, Lcom/kwad/components/ad/l/b;->Ik:Ljava/util/List;

    iget-object v2, p0, Lcom/kwad/components/ad/l/b;->Il:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/webview/jshandler/am;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 33
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 34
    :cond_0
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/bb;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/bb;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->yu:Lcom/kwad/components/core/webview/jshandler/bb;

    .line 35
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 36
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ai;

    iget-object v1, p0, Lcom/kwad/components/ad/l/b;->cT:Lcom/kwad/components/core/webview/jshandler/ai$b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ai;-><init>(Lcom/kwad/components/core/webview/jshandler/ai$b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/webview/d/a/a;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kwad/components/ad/l/b;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    return-void
.end method

.method public final ag(Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/l/b;->yu:Lcom/kwad/components/core/webview/jshandler/bb;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/jshandler/bb;->ag(Z)V

    return-void
.end method

.method public final ar()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/ad/l/b;->bx()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sV()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->da:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/kwad/components/ad/l/b;->fl()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    :cond_2
    const/4 v0, 0x1

    return v0

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->da:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_4

    const/4 v2, 0x4

    .line 9
    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 10
    :cond_4
    invoke-direct {p0}, Lcom/kwad/components/ad/l/b;->aH()V

    return v1
.end method

.method protected b(Lcom/kwad/sdk/core/webview/b;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/webview/b;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method protected bx()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/l/b;->cP:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected fk()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->da:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->da:Landroid/widget/FrameLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->da:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/kwad/components/ad/l/b;->getLayoutId()I

    move-result v1

    iget-object v2, p0, Lcom/kwad/components/ad/l/b;->da:Landroid/widget/FrameLayout;

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->Im:Landroid/view/View;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->da:Landroid/widget/FrameLayout;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_web_card_webView:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 7
    new-instance v0, Lcom/kwad/components/core/webview/b;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->fX:Lcom/kwad/components/core/webview/b;

    .line 8
    new-instance v0, Lcom/kwad/components/core/webview/b$a;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/b$a;-><init>()V

    iget-object v2, p0, Lcom/kwad/components/ad/l/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 9
    invoke-virtual {v0, v2}, Lcom/kwad/components/core/webview/b$a;->aA(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/l/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 10
    invoke-virtual {p0, v2}, Lcom/kwad/components/ad/l/b;->B(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kwad/components/core/webview/b$a;->aH(Ljava/lang/String;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/l/b;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    .line 11
    invoke-virtual {v0, v2}, Lcom/kwad/components/core/webview/b$a;->d(Lcom/kwad/sdk/core/webview/KsAdWebView;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/l/b;->mReportExtData:Lorg/json/JSONObject;

    .line 12
    invoke-virtual {v0, v2}, Lcom/kwad/components/core/webview/b$a;->e(Lorg/json/JSONObject;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/l/b;->dB:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 13
    invoke-virtual {v0, v2}, Lcom/kwad/components/core/webview/b$a;->k(Landroid/view/ViewGroup;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/l/b;->Il:Ljava/util/List;

    .line 14
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/components/core/e/d/c;

    invoke-virtual {v0, v2}, Lcom/kwad/components/core/webview/b$a;->f(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/l/b;->Il:Ljava/util/List;

    .line 15
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    iget-object v2, p0, Lcom/kwad/components/ad/l/b;->Ik:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v3, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->aS(Z)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/l/b;->fY:Lcom/kwad/components/core/webview/c;

    .line 16
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->a(Lcom/kwad/components/core/webview/c;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/kwad/components/ad/l/b;->fX:Lcom/kwad/components/core/webview/b;

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/webview/b;->a(Lcom/kwad/components/core/webview/b$a;)V

    .line 18
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iget-object v1, p0, Lcom/kwad/components/ad/l/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p0, v1}, Lcom/kwad/components/ad/l/b;->B(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->loadUrl(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0}, Lcom/kwad/components/ad/l/b;->fn()V

    :cond_1
    return-void
.end method

.method protected fl()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected fn()V
    .locals 0

    return-void
.end method

.method protected fo()V
    .locals 0

    return-void
.end method

.method protected fp()V
    .locals 0

    return-void
.end method

.method public final getLoadTime()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getLoadTime()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method protected getName()Ljava/lang/String;
    .locals 1

    const-string v0, "PlayEndWebCard"

    return-object v0
.end method

.method public final mJ()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/16 v1, 0x32

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/br;->a(Landroid/view/View;IZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->da:Landroid/widget/FrameLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    :cond_2
    return-void
.end method

.method public final mw()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->fX:Lcom/kwad/components/core/webview/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/b;->jq()V

    :cond_0
    return-void
.end method

.method public final release()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/components/ad/l/b;->Iq:Lcom/kwad/components/ad/l/b$b;

    return-void
.end method

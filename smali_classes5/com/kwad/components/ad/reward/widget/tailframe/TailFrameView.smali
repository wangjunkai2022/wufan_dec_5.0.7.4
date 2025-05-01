.class public Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;
.super Lcom/kwad/sdk/widget/KSFrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView$a;,
        Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView$b;,
        Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView$c;,
        Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView$d;
    }
.end annotation


# instance fields
.field private BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

.field private qp:Lcom/kwad/components/ad/reward/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method

.method private f(ZZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    .line 2
    new-instance p1, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView$d;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView$d;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

    return-void

    .line 3
    :cond_1
    new-instance p1, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView$c;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView$c;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

    return-void

    :cond_2
    if-eqz p2, :cond_3

    .line 4
    new-instance p1, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView$b;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView$b;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

    return-void

    .line 5
    :cond_3
    new-instance p1, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView$a;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView$a;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;ZZ)V
    .locals 1

    .line 3
    invoke-direct {p0, p2, p3}, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->f(ZZ)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/reward/widget/tailframe/a;->A(Landroid/content/Context;)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

    invoke-virtual {p1, p2, p3}, Lcom/kwad/components/ad/reward/widget/tailframe/a;->f(ZZ)V

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/widget/tailframe/a;->kk()Landroid/view/View;

    move-result-object p1

    const/4 p2, -0x1

    invoke-virtual {p0, p1, p2, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/reward/widget/tailframe/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/widget/tailframe/a;->setCallerContext(Lcom/kwad/components/ad/reward/g;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v2, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    invoke-virtual {v0, v2, v1, p1}, Lcom/kwad/components/ad/reward/widget/tailframe/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/components/ad/reward/widget/tailframe/b;)V

    return-void
.end method

.method public final destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/widget/tailframe/a;->destroy()V

    :cond_0
    return-void
.end method

.method public final jR()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->BN:Lcom/kwad/components/ad/reward/widget/tailframe/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/widget/tailframe/a;->jR()V

    return-void
.end method

.method public setCallerContext(Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameView;->qp:Lcom/kwad/components/ad/reward/g;

    return-void
.end method

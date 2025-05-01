.class public final Lcom/kwad/components/core/widget/f;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private ade:Z

.field protected iD:Z

.field protected if:Lcom/kwad/components/core/widget/g;

.field protected mContext:Landroid/content/Context;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/widget/f;->mContext:Landroid/content/Context;

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/components/core/widget/f;->iD:Z

    return-void
.end method

.method private tY()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result v0

    .line 2
    iget-boolean v1, p0, Lcom/kwad/components/core/widget/f;->ade:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/kwad/components/core/widget/f;->iD:Z

    if-eq v0, v1, :cond_0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/widget/f;->iD:Z

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/widget/f;->if:Lcom/kwad/components/core/widget/g;

    if-eqz v1, :cond_0

    xor-int/lit8 v0, v0, 0x1

    .line 5
    invoke-interface {v1, v0}, Lcom/kwad/components/core/widget/g;->j(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/widget/f;->tY()V

    return-void
.end method

.method protected final onWindowVisibilityChanged(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowVisibilityChanged(I)V

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    iput-boolean p1, p0, Lcom/kwad/components/core/widget/f;->ade:Z

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/widget/f;->tY()V

    return-void
.end method

.method public final setOrientationChangeListener(Lcom/kwad/components/core/widget/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/widget/f;->if:Lcom/kwad/components/core/widget/g;

    return-void
.end method

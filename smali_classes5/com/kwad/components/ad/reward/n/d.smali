.class public abstract Lcom/kwad/components/ad/reward/n/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lcom/kwad/components/ad/reward/n/r;)V
    .locals 0

    return-void
.end method

.method protected ab(Z)V
    .locals 0

    return-void
.end method

.method public final b(Lcom/kwad/components/ad/reward/n/r;)V
    .locals 0
    .param p1    # Lcom/kwad/components/ad/reward/n/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0, p1}, Lcom/kwad/components/ad/reward/n/d;->a(Lcom/kwad/components/ad/reward/n/r;)V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/n/d;->gG()Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result p1

    .line 3
    invoke-virtual {p0, p1}, Lcom/kwad/components/ad/reward/n/d;->ab(Z)V

    return-void
.end method

.method public abstract gG()Landroid/view/ViewGroup;
.end method

.method public onUnbind()V
    .locals 0

    return-void
.end method

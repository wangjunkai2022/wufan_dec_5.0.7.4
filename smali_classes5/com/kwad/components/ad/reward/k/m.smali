.class public final Lcom/kwad/components/ad/reward/k/m;
.super Lcom/kwad/components/core/webview/tachikoma/a/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/k/m$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/a/w;-><init>()V

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "registerBackPressedListener"

    return-object v0
.end method

.method public final jh()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/k/m$a;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/k/m$a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    return-void
.end method

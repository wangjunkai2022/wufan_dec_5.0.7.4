.class final Lcom/kwad/components/ad/reward/presenter/f/d$15;
.super Lcom/kwad/components/ad/reward/k/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/presenter/f/d;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic wv:Lcom/kwad/components/ad/reward/presenter/f/d;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/f/d$15;->wv:Lcom/kwad/components/ad/reward/presenter/f/d;

    invoke-direct {p0}, Lcom/kwad/components/ad/reward/k/f;-><init>()V

    return-void
.end method


# virtual methods
.method public final U(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/ad/reward/k/f;->U(Z)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/f/d$15;->wv:Lcom/kwad/components/ad/reward/presenter/f/d;

    invoke-static {p1}, Lcom/kwad/components/ad/reward/presenter/f/d;->C(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/components/ad/reward/presenter/f;->t(Lcom/kwad/components/ad/reward/g;)V

    return-void
.end method

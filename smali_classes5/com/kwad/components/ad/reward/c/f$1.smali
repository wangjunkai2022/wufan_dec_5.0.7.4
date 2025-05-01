.class final Lcom/kwad/components/ad/reward/c/f$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/c/f;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic rs:Lcom/kwad/components/ad/reward/c/b;

.field final synthetic rt:Lcom/kwad/components/ad/reward/c/f;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/c/f;Lcom/kwad/components/ad/reward/c/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/c/f$1;->rt:Lcom/kwad/components/ad/reward/c/f;

    iput-object p2, p0, Lcom/kwad/components/ad/reward/c/f$1;->rs:Lcom/kwad/components/ad/reward/c/b;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/c/f$1;->rt:Lcom/kwad/components/ad/reward/c/f;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/c/f;->a(Lcom/kwad/components/ad/reward/c/f;)Lcom/kwad/components/ad/reward/c/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/c/f$1;->rt:Lcom/kwad/components/ad/reward/c/f;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/c/f;->a(Lcom/kwad/components/ad/reward/c/f;)Lcom/kwad/components/ad/reward/c/d;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/c/f$1;->rs:Lcom/kwad/components/ad/reward/c/b;

    invoke-interface {v0, v1}, Lcom/kwad/components/ad/reward/c/d;->a(Lcom/kwad/components/ad/reward/c/b;)V

    :cond_0
    return-void
.end method

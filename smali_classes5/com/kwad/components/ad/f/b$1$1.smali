.class final Lcom/kwad/components/ad/f/b$1$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/b$1;->a(D)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic mh:Lcom/kwad/components/ad/f/b$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/b$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/b$1$1;->mh:Lcom/kwad/components/ad/f/b$1;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    const-string v0, "KSNativeAdShakeManager"

    const-string v1, "onShakeEvent openGate2"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/b$1$1;->mh:Lcom/kwad/components/ad/f/b$1;

    iget-object v0, v0, Lcom/kwad/components/ad/f/b$1;->mg:Lcom/kwad/components/ad/f/b;

    invoke-static {v0}, Lcom/kwad/components/ad/f/b;->b(Lcom/kwad/components/ad/f/b;)Lcom/kwad/sdk/core/g/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/core/g/d;->Ge()V

    return-void
.end method

.class final Lcom/kwad/sdk/utils/bc$1;
.super Lcom/kwad/sdk/core/c/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/utils/bc;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aRd:Lcom/kwad/sdk/utils/bc;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/utils/bc;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/utils/bc$1;->aRd:Lcom/kwad/sdk/utils/bc;

    invoke-direct {p0}, Lcom/kwad/sdk/core/c/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBackToBackground()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/core/c/d;->onBackToBackground()V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/utils/bc$1;->aRd:Lcom/kwad/sdk/utils/bc;

    invoke-static {v0}, Lcom/kwad/sdk/utils/bc;->b(Lcom/kwad/sdk/utils/bc;)V

    return-void
.end method

.method public final onBackToForeground()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/core/c/d;->onBackToForeground()V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/o;->LT()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/utils/bc$1;->aRd:Lcom/kwad/sdk/utils/bc;

    invoke-static {v0}, Lcom/kwad/sdk/utils/bc;->a(Lcom/kwad/sdk/utils/bc;)V

    :cond_0
    return-void
.end method

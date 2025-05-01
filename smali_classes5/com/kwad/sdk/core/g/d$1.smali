.class final Lcom/kwad/sdk/core/g/d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/utils/bb$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/core/g/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aBD:Lcom/kwad/sdk/core/g/d;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/core/g/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/g/d$1;->aBD:Lcom/kwad/sdk/core/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/g/d$1;->aBD:Lcom/kwad/sdk/core/g/d;

    invoke-static {v0}, Lcom/kwad/sdk/core/g/d;->a(Lcom/kwad/sdk/core/g/d;)Lcom/kwad/sdk/core/g/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/g/d$1;->aBD:Lcom/kwad/sdk/core/g/d;

    invoke-static {v0}, Lcom/kwad/sdk/core/g/d;->a(Lcom/kwad/sdk/core/g/d;)Lcom/kwad/sdk/core/g/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/core/g/b;->aV()V

    :cond_0
    return-void
.end method

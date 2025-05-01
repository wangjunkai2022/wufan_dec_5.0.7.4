.class final Lcom/kwad/components/core/c/d$1$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/c/d$1;->doTask()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Jy:Lcom/kwad/components/core/c/e;

.field final synthetic Jz:Lcom/kwad/components/core/c/d$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/c/d$1;Lcom/kwad/components/core/c/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/c/d$1$1;->Jz:Lcom/kwad/components/core/c/d$1;

    iput-object p2, p0, Lcom/kwad/components/core/c/d$1$1;->Jy:Lcom/kwad/components/core/c/e;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/c/d$1$1;->Jy:Lcom/kwad/components/core/c/e;

    invoke-static {v0}, Lcom/kwad/components/core/c/b;->b(Lcom/kwad/components/core/c/e;)V

    return-void
.end method

.class final Lcom/kwad/components/core/video/a/d$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/video/a/d;->a(ZII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic VV:Z

.field final synthetic VW:Lcom/kwad/components/core/video/a/d$b;

.field final synthetic VX:I

.field final synthetic VY:I

.field final synthetic VZ:Lcom/kwad/components/core/video/a/d;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/video/a/d;ZLcom/kwad/components/core/video/a/d$b;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/video/a/d$1;->VZ:Lcom/kwad/components/core/video/a/d;

    iput-boolean p2, p0, Lcom/kwad/components/core/video/a/d$1;->VV:Z

    iput-object p3, p0, Lcom/kwad/components/core/video/a/d$1;->VW:Lcom/kwad/components/core/video/a/d$b;

    iput p4, p0, Lcom/kwad/components/core/video/a/d$1;->VX:I

    iput p5, p0, Lcom/kwad/components/core/video/a/d$1;->VY:I

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a/d$1;->VV:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a/d$1;->VW:Lcom/kwad/components/core/video/a/d$b;

    invoke-static {v0}, Lcom/kwad/sdk/commercial/b;->r(Lcom/kwad/sdk/commercial/c/a;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/a/d$1;->VZ:Lcom/kwad/components/core/video/a/d;

    iget v1, p0, Lcom/kwad/components/core/video/a/d$1;->VX:I

    iget v2, p0, Lcom/kwad/components/core/video/a/d$1;->VY:I

    invoke-static {v0, v1, v2}, Lcom/kwad/components/core/video/a/d;->a(Lcom/kwad/components/core/video/a/d;II)Lcom/kwad/components/core/video/a/d$a;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/commercial/b;->s(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

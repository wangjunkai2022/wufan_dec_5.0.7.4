.class final Lcom/kwad/components/core/widget/a/a$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/widget/a/a;->a(Lcom/kwad/sdk/core/h/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic adj:Lcom/kwad/sdk/core/h/c;

.field final synthetic adk:Lcom/kwad/components/core/widget/a/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/widget/a/a;Lcom/kwad/sdk/core/h/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/widget/a/a$1;->adk:Lcom/kwad/components/core/widget/a/a;

    iput-object p2, p0, Lcom/kwad/components/core/widget/a/a$1;->adj:Lcom/kwad/sdk/core/h/c;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a$1;->adk:Lcom/kwad/components/core/widget/a/a;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->dX()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a$1;->adj:Lcom/kwad/sdk/core/h/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/h/c;->aM()V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a$1;->adj:Lcom/kwad/sdk/core/h/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/h/c;->aN()V

    return-void
.end method

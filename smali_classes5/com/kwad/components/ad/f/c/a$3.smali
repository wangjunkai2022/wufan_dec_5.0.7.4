.class final Lcom/kwad/components/ad/f/c/a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/h/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/f/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic nr:Lcom/kwad/components/ad/f/c/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/c/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/c/a$3;->nr:Lcom/kwad/components/ad/f/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final aM()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/c/a$3;->nr:Lcom/kwad/components/ad/f/c/a;

    invoke-static {v1}, Lcom/kwad/components/ad/f/c/a;->e(Lcom/kwad/components/ad/f/c/a;)Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a$3;->nr:Lcom/kwad/components/ad/f/c/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/f/c/a;->resume()V

    return-void
.end method

.method public final aN()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/c/a$3;->nr:Lcom/kwad/components/ad/f/c/a;

    invoke-static {v1}, Lcom/kwad/components/ad/f/c/a;->g(Lcom/kwad/components/ad/f/c/a;)Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->c(Lcom/kwad/components/core/j/a$b;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/c/a$3;->nr:Lcom/kwad/components/ad/f/c/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/k/b;->pause()V

    return-void
.end method

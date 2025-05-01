.class final Lcom/kwad/components/ad/i/b$1;
.super Lcom/kwad/components/core/proxy/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/i/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic nN:Lcom/kwad/components/ad/i/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/i/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/i/b$1;->nN:Lcom/kwad/components/ad/i/b;

    invoke-direct {p0}, Lcom/kwad/components/core/proxy/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/proxy/c;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/proxy/i;->a(Lcom/kwad/components/core/proxy/c;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/i/b$1;->nN:Lcom/kwad/components/ad/i/b;

    invoke-static {v0}, Lcom/kwad/components/ad/i/b;->a(Lcom/kwad/components/ad/i/b;)Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Lcom/kwad/components/ad/i/b;->eM()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b(Lcom/kwad/components/core/proxy/c;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/proxy/i;->b(Lcom/kwad/components/core/proxy/c;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/i/b$1;->nN:Lcom/kwad/components/ad/i/b;

    invoke-static {v0}, Lcom/kwad/components/ad/i/b;->a(Lcom/kwad/components/ad/i/b;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/i/b$1;->nN:Lcom/kwad/components/ad/i/b;

    invoke-static {p1}, Lcom/kwad/components/ad/i/b;->a(Lcom/kwad/components/ad/i/b;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/i/b$1;->nN:Lcom/kwad/components/ad/i/b;

    invoke-static {p1}, Lcom/kwad/components/ad/i/b;->b(Lcom/kwad/components/ad/i/b;)V

    :cond_0
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/core/proxy/c;

    invoke-virtual {p0, p1}, Lcom/kwad/components/ad/i/b$1;->b(Lcom/kwad/components/core/proxy/c;)V

    return-void
.end method

.method public final synthetic d(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/core/proxy/c;

    invoke-virtual {p0, p1}, Lcom/kwad/components/ad/i/b$1;->a(Lcom/kwad/components/core/proxy/c;)V

    return-void
.end method

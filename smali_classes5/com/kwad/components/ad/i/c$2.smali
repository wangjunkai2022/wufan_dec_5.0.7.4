.class final Lcom/kwad/components/ad/i/c$2;
.super Lcom/kwad/components/core/e/a/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/i/c;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic nU:Lcom/kwad/components/ad/i/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/i/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/i/c$2;->nU:Lcom/kwad/components/ad/i/c;

    invoke-direct {p0}, Lcom/kwad/components/core/e/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final eQ()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/core/e/a/e;->nE()Lcom/kwad/components/core/e/a/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/a/e;->b(Lcom/kwad/components/core/e/a/b;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/i/c$2;->nU:Lcom/kwad/components/ad/i/c;

    invoke-static {v0}, Lcom/kwad/components/ad/i/c;->b(Lcom/kwad/components/ad/i/c;)V

    return-void
.end method

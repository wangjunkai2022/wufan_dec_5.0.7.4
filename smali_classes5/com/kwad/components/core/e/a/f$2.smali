.class final Lcom/kwad/components/core/e/a/f$2;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/e/a/f;->ai(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ku:Lcom/kwad/components/core/e/a/f;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/e/a/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/e/a/f$2;->Ku:Lcom/kwad/components/core/e/a/f;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/a/f$2;->Ku:Lcom/kwad/components/core/e/a/f;

    invoke-static {v0}, Lcom/kwad/components/core/e/a/f;->a(Lcom/kwad/components/core/e/a/f;)Lcom/kwad/components/core/e/a/a;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/core/e/a/a;->Kk:Lcom/kwad/components/core/e/a/d;

    invoke-interface {v0}, Lcom/kwad/components/core/e/a/d;->nD()V

    return-void
.end method

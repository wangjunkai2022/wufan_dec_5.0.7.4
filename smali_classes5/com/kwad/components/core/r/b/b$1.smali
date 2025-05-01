.class final Lcom/kwad/components/core/r/b/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/l/a/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/r/b/b;->aj()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ty:Lcom/kwad/components/core/r/b/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/r/b/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/r/b/b$1;->Ty:Lcom/kwad/components/core/r/b/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lcom/kwad/components/core/proxy/c;)V
    .locals 0

    return-void
.end method

.method public final d(Lcom/kwad/components/core/proxy/c;)V
    .locals 0

    return-void
.end method

.method public final fQ()V
    .locals 0

    return-void
.end method

.method public final fR()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/r/b/b$1;->Ty:Lcom/kwad/components/core/r/b/b;

    invoke-static {v0}, Lcom/kwad/components/core/r/b/b;->a(Lcom/kwad/components/core/r/b/b;)Lcom/kwad/components/core/r/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/core/r/a/b;->Tk:Lcom/kwad/sdk/components/l;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/r/b/b$1;->Ty:Lcom/kwad/components/core/r/b/b;

    invoke-static {v0}, Lcom/kwad/components/core/r/b/b;->a(Lcom/kwad/components/core/r/b/b;)Lcom/kwad/components/core/r/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/core/r/a/b;->Tk:Lcom/kwad/sdk/components/l;

    invoke-interface {v0}, Lcom/kwad/sdk/components/l;->callbackDismiss()V

    :cond_0
    return-void
.end method

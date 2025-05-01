.class public final Lcom/kwad/components/offline/c/a/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/offline/api/tk/IOfflineTKRenderListener;


# instance fields
.field private final aeh:Lcom/kwad/sdk/components/q;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/components/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/offline/c/a/h;->aeh:Lcom/kwad/sdk/components/q;

    return-void
.end method


# virtual methods
.method public final onFailed(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/h;->aeh:Lcom/kwad/sdk/components/q;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/kwad/sdk/components/q;->onFailed(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final onSuccess()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/h;->aeh:Lcom/kwad/sdk/components/q;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/components/q;->onSuccess()V

    :cond_0
    return-void
.end method

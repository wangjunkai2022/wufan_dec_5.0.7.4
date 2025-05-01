.class final Lcom/kwad/components/ad/f/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/g/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/b;->a(FLandroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic mg:Lcom/kwad/components/ad/f/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/b$1;->mg:Lcom/kwad/components/ad/f/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(D)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/b$1;->mg:Lcom/kwad/components/ad/f/b;

    invoke-static {v0}, Lcom/kwad/components/ad/f/b;->a(Lcom/kwad/components/ad/f/b;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/b$1;->mg:Lcom/kwad/components/ad/f/b;

    invoke-static {v0, p1, p2}, Lcom/kwad/components/ad/f/b;->a(Lcom/kwad/components/ad/f/b;D)V

    .line 3
    new-instance p1, Lcom/kwad/components/ad/f/b$1$1;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/f/b$1$1;-><init>(Lcom/kwad/components/ad/f/b$1;)V

    const/4 p2, 0x0

    const-wide/16 v0, 0x1f4

    invoke-static {p1, p2, v0, v1}, Lcom/kwad/sdk/utils/bo;->a(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    :cond_0
    return-void
.end method

.method public final aV()V
    .locals 0

    return-void
.end method

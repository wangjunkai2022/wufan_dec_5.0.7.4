.class final Lcom/kwad/sdk/commercial/h/a$2;
.super Lcom/kwad/sdk/core/c/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/commercial/h/a;->cM(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic apI:Lcom/kwad/sdk/commercial/h/a;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/commercial/h/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/h/a$2;->apI:Lcom/kwad/sdk/commercial/h/a;

    invoke-direct {p0}, Lcom/kwad/sdk/core/c/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBackToBackground()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/core/c/d;->onBackToBackground()V

    return-void
.end method

.method public final onBackToForeground()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/core/c/d;->onBackToForeground()V

    .line 2
    new-instance v0, Lcom/kwad/sdk/commercial/h/a$2$1;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/commercial/h/a$2$1;-><init>(Lcom/kwad/sdk/commercial/h/a$2;)V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3

    invoke-static {v0, v2, v3, v1}, Lcom/kwad/sdk/utils/g;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

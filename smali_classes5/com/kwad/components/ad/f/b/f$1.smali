.class final Lcom/kwad/components/ad/f/b/f$1;
.super Lcom/kwad/components/core/video/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/b/f;->aj()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic nd:Lcom/kwad/components/ad/f/b/f;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/b/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/b/f$1;->nd:Lcom/kwad/components/ad/f/b/f;

    invoke-direct {p0}, Lcom/kwad/components/core/video/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMediaPlayCompleted()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/f$1;->nd:Lcom/kwad/components/ad/f/b/f;

    invoke-static {v0}, Lcom/kwad/components/ad/f/b/f;->a(Lcom/kwad/components/ad/f/b/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 3
    invoke-static {v0}, Lcom/kwad/components/core/d/a;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

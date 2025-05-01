.class final Lcom/kwad/components/core/proxy/a/a$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/proxy/a/a;->qH()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RN:Lcom/kwad/components/core/proxy/a/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/proxy/a/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/proxy/a/a$1;->RN:Lcom/kwad/components/core/proxy/a/a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/proxy/a/a$1;->RN:Lcom/kwad/components/core/proxy/a/a;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/kwad/components/core/proxy/a/a;->a(Lcom/kwad/components/core/proxy/a/a;J)J

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/proxy/a/a$1;->RN:Lcom/kwad/components/core/proxy/a/a;

    invoke-virtual {v0}, Lcom/kwad/components/core/proxy/a/a;->report()V

    return-void
.end method

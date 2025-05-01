.class final Lcom/kwad/sdk/utils/x$3;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/utils/x;->Mc()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Md()Lcom/kwad/sdk/utils/b/a;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/utils/x;->f(Lcom/kwad/sdk/utils/b/a;)V

    .line 3
    const-class v1, Lcom/kwad/sdk/utils/b/b;

    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/utils/b/b;

    if-eqz v1, :cond_1

    .line 4
    invoke-interface {v1, v0}, Lcom/kwad/sdk/utils/b/b;->a(Lcom/kwad/sdk/utils/b/a;)V

    :cond_1
    return-void
.end method

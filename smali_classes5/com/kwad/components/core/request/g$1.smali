.class final Lcom/kwad/components/core/request/g$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/request/g;->a(Lcom/kwad/components/core/request/g$a;)V
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
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/utils/y;->cn(Landroid/content/Context;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/y;->l(Landroid/content/Context;I)V

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->bf(Landroid/content/Context;)V

    .line 4
    invoke-static {}, Lcom/kwad/components/core/request/g;->qT()V

    .line 5
    invoke-static {}, Lcom/kwad/components/core/request/g;->qR()V

    return-void
.end method

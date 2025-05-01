.class final Lcom/kwad/sdk/utils/f$3;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/utils/f;->c(Landroid/content/Context;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aPs:J

.field final synthetic gq:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/utils/f$3;->gq:Landroid/content/Context;

    iput-wide p2, p0, Lcom/kwad/sdk/utils/f$3;->aPs:J

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/utils/f$3;->gq:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/f;->bZ(Landroid/content/Context;)V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/f;->LG()Landroid/os/Handler;

    move-result-object v0

    iget-wide v1, p0, Lcom/kwad/sdk/utils/f$3;->aPs:J

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

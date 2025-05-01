.class final Lcom/kwad/sdk/utils/x$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/utils/x;->ar(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aHZ:Ljava/lang/String;

.field final synthetic aQm:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/utils/x$1;->aQm:Ljava/lang/String;

    iput-object p2, p0, Lcom/kwad/sdk/utils/x$1;->aHZ:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/utils/x$1;->aQm:Ljava/lang/String;

    const-string v1, "ksadsdk_kv_perf"

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/utils/bg;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    .line 2
    iget-object v2, p0, Lcom/kwad/sdk/utils/x$1;->aHZ:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/utils/x$1;->aQm:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/kwad/sdk/utils/bg;->aw(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 4
    iget-object v2, p0, Lcom/kwad/sdk/utils/x$1;->aQm:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/kwad/sdk/utils/bg;->a(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

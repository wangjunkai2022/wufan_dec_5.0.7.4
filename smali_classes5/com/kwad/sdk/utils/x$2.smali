.class final Lcom/kwad/sdk/utils/x$2;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/utils/x;->as(Ljava/lang/String;Ljava/lang/String;)V
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
    iput-object p1, p0, Lcom/kwad/sdk/utils/x$2;->aQm:Ljava/lang/String;

    iput-object p2, p0, Lcom/kwad/sdk/utils/x$2;->aHZ:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    const-string v0, "ksadsdk_kv_perf"

    .line 1
    invoke-static {v0}, Lcom/kwad/sdk/utils/bg;->gY(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/kwad/sdk/utils/x$2;->aQm:Ljava/lang/String;

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/utils/x$2;->aHZ:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/kwad/sdk/utils/x$2;->aQm:Ljava/lang/String;

    const-string v2, "ksadsdk_kv_perf_failed"

    invoke-static {v2, v0, v1}, Lcom/kwad/sdk/utils/bg;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/utils/x$2;->aQm:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Lcom/kwad/sdk/utils/bg;->a(Ljava/lang/String;Ljava/lang/String;I)V

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/utils/x$2;->aQm:Ljava/lang/String;

    const-string v2, "ksadsdk_kv_perf_success"

    invoke-static {v2, v0, v1}, Lcom/kwad/sdk/utils/bg;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 7
    iget-object v1, p0, Lcom/kwad/sdk/utils/x$2;->aQm:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Lcom/kwad/sdk/utils/bg;->a(Ljava/lang/String;Ljava/lang/String;I)V

    :cond_2
    return-void
.end method

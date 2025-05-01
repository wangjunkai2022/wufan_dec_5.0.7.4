.class Lcom/aggmoread/sdk/z/a/t/j$e;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/t/j;->a(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/aggmoread/sdk/z/a/t/j;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/t/j;J)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/t/j$e;->b:Lcom/aggmoread/sdk/z/a/t/j;

    iput-wide p2, p0, Lcom/aggmoread/sdk/z/a/t/j$e;->a:J

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string p1, "extra_download_id"

    const-wide/16 v0, -0x1

    invoke-virtual {p2, p1, v0, v1}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide p1

    iget-wide v0, p0, Lcom/aggmoread/sdk/z/a/t/j$e;->a:J

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/t/j$e;->b:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/t/j;->f(Lcom/aggmoread/sdk/z/a/t/j;)V

    :cond_0
    return-void
.end method

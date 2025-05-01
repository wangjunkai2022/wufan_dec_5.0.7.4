.class Lcom/umeng/analytics/pro/o$a;
.super Ljava/lang/Object;
.source "BackgroundMonitor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/umeng/analytics/pro/o;


# direct methods
.method constructor <init>(Lcom/umeng/analytics/pro/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/analytics/pro/o$a;->a:Lcom/umeng/analytics/pro/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/o$a;->a:Lcom/umeng/analytics/pro/o;

    invoke-static {v0}, Lcom/umeng/analytics/pro/o;->a(Lcom/umeng/analytics/pro/o;)Z

    move-result v0

    const-string v1, "MobclickRT"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/umeng/analytics/pro/o$a;->a:Lcom/umeng/analytics/pro/o;

    invoke-static {v0}, Lcom/umeng/analytics/pro/o;->b(Lcom/umeng/analytics/pro/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/umeng/analytics/pro/o$a;->a:Lcom/umeng/analytics/pro/o;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/umeng/analytics/pro/o;->a(Lcom/umeng/analytics/pro/o;Z)Z

    const-string v0, "--->>> went background."

    .line 3
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/o$a;->a:Lcom/umeng/analytics/pro/o;

    invoke-static {v0}, Lcom/umeng/analytics/pro/o;->c(Lcom/umeng/analytics/pro/o;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/umeng/analytics/pro/o$a;->a:Lcom/umeng/analytics/pro/o;

    invoke-static {v0}, Lcom/umeng/analytics/pro/o;->c(Lcom/umeng/analytics/pro/o;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/analytics/pro/p;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/p;->n()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "--->>> still foreground."

    .line 6
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

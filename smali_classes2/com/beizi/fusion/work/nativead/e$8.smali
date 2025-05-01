.class Lcom/beizi/fusion/work/nativead/e$8;
.super Ljava/lang/Object;
.source "BeiZiNativeWorker.java"

# interfaces
.implements Lcom/beizi/fusion/g/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/e;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/nativead/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/e;->c(Lcom/beizi/fusion/work/nativead/e;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {v1}, Lcom/beizi/fusion/work/nativead/e;->J(Lcom/beizi/fusion/work/nativead/e;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/e;->K(Lcom/beizi/fusion/work/nativead/e;)Lcom/beizi/fusion/b/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/beizi/fusion/b/b;->S(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->L(Lcom/beizi/fusion/work/nativead/e;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->M(Lcom/beizi/fusion/work/nativead/e;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->N(Lcom/beizi/fusion/work/nativead/e;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->O(Lcom/beizi/fusion/work/nativead/e;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->P(Lcom/beizi/fusion/work/nativead/e;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->Q(Lcom/beizi/fusion/work/nativead/e;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/nativead/e;->g()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {v1}, Lcom/beizi/fusion/work/nativead/e;->o(Lcom/beizi/fusion/work/nativead/e;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;Landroid/view/View;)V

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/e$8;->a:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/e;->R(Lcom/beizi/fusion/work/nativead/e;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

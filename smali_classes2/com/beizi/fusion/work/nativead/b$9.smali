.class Lcom/beizi/fusion/work/nativead/b$9;
.super Ljava/lang/Object;
.source "BaseBeiZiNativeWorker.java"

# interfaces
.implements Lcom/beizi/fusion/widget/dialog/dislike/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/b;->aM()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/nativead/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/b$9;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$9;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->r(Lcom/beizi/fusion/work/nativead/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$9;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->s(Lcom/beizi/fusion/work/nativead/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$9;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->t(Lcom/beizi/fusion/work/nativead/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b$9;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/nativead/b;->g()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/b$9;->a:Lcom/beizi/fusion/work/nativead/b;

    iget-object v2, v2, Lcom/beizi/fusion/work/nativead/b;->u:Landroid/view/View;

    invoke-virtual {v0, v1, v2}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;Landroid/view/View;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$9;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->u(Lcom/beizi/fusion/work/nativead/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

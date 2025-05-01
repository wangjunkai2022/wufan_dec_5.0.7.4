.class Lcom/beizi/ad/lance/a/f$2;
.super Ljava/lang/Object;
.source "CheckViewVisibilityUtil.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/lance/a/f;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/lance/a/f;


# direct methods
.method constructor <init>(Lcom/beizi/ad/lance/a/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/lance/a/f$2;->a:Lcom/beizi/ad/lance/a/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$2;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v0}, Lcom/beizi/ad/lance/a/f;->e(Lcom/beizi/ad/lance/a/f;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$2;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v0}, Lcom/beizi/ad/lance/a/f;->e(Lcom/beizi/ad/lance/a/f;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/ad/lance/a/f$2;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v1}, Lcom/beizi/ad/lance/a/f;->f(Lcom/beizi/ad/lance/a/f;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

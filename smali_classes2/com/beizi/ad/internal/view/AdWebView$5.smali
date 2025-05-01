.class Lcom/beizi/ad/internal/view/AdWebView$5;
.super Ljava/lang/Object;
.source "AdWebView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/view/AdWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/view/AdWebView;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdWebView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$5;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView$5;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdWebView;->g(Lcom/beizi/ad/internal/view/AdWebView;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView$5;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->f()V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView$5;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdWebView;->h(Lcom/beizi/ad/internal/view/AdWebView;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

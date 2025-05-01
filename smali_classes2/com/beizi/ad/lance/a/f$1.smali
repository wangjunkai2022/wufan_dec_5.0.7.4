.class Lcom/beizi/ad/lance/a/f$1;
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
    iput-object p1, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/f;->a(Lcom/beizi/ad/lance/a/f;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v0}, Lcom/beizi/ad/lance/a/f;->a(Lcom/beizi/ad/lance/a/f;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v0}, Lcom/beizi/ad/lance/a/f;->b(Lcom/beizi/ad/lance/a/f;)Lcom/beizi/ad/internal/nativead/d;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/f;->a(Lcom/beizi/ad/lance/a/f;Z)Z

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v0}, Lcom/beizi/ad/lance/a/f;->b(Lcom/beizi/ad/lance/a/f;)Lcom/beizi/ad/internal/nativead/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/nativead/d;->a()V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    const/16 v1, 0x32

    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/f;->a(Lcom/beizi/ad/lance/a/f;I)Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v0}, Lcom/beizi/ad/lance/a/f;->c(Lcom/beizi/ad/lance/a/f;)Lcom/beizi/ad/internal/nativead/NativeAdShownListener;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 7
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v0}, Lcom/beizi/ad/lance/a/f;->c(Lcom/beizi/ad/lance/a/f;)Lcom/beizi/ad/internal/nativead/NativeAdShownListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/nativead/NativeAdShownListener;->onAdShown()V

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v0}, Lcom/beizi/ad/lance/a/f;->d(Lcom/beizi/ad/lance/a/f;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 9
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v0}, Lcom/beizi/ad/lance/a/f;->d(Lcom/beizi/ad/lance/a/f;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 10
    :cond_4
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/f;->a(Lcom/beizi/ad/lance/a/f;Lcom/beizi/ad/internal/nativead/d;)Lcom/beizi/ad/internal/nativead/d;

    .line 11
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/f;->a(Lcom/beizi/ad/lance/a/f;Lcom/beizi/ad/internal/nativead/NativeAdShownListener;)Lcom/beizi/ad/internal/nativead/NativeAdShownListener;

    .line 12
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/f;->a(Lcom/beizi/ad/lance/a/f;Landroid/view/View;)Landroid/view/View;

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/lance/a/f$1;->a:Lcom/beizi/ad/lance/a/f;

    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/f;->a(Lcom/beizi/ad/lance/a/f;Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

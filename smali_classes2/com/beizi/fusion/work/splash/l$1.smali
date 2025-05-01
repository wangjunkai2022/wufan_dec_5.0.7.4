.class Lcom/beizi/fusion/work/splash/l$1;
.super Ljava/lang/Object;
.source "MtgSplashWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/l;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/l;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/l$1;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l$1;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/splash/l;->aa()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l$1;->a:Lcom/beizi/fusion/work/splash/l;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/work/a;->a(I)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l$1;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/l;->a(Lcom/beizi/fusion/work/splash/l;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l$1;->a:Lcom/beizi/fusion/work/splash/l;

    const/16 v1, 0x27a7

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/l;->a(Lcom/beizi/fusion/work/splash/l;I)V

    :goto_0
    return-void
.end method

.class Lcom/beizi/fusion/work/splash/i$5;
.super Ljava/lang/Object;
.source "InmobiSplashWorker.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/i;->aI()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/i;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/i$5;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$5;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->B(Lcom/beizi/fusion/work/splash/i;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$5;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->C(Lcom/beizi/fusion/work/splash/i;)Landroid/os/CountDownTimer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->cancel()V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$5;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->D(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$5;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/splash/i;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/d/e;->c(Ljava/lang/String;)V

    return-void
.end method

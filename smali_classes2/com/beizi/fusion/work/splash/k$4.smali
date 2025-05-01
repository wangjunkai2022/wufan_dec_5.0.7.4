.class Lcom/beizi/fusion/work/splash/k$4;
.super Ljava/lang/Object;
.source "KsSplashWorker.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/k;->aH()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/k;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/k$4;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/k$4;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/k;->w(Lcom/beizi/fusion/work/splash/k;)Landroid/os/CountDownTimer;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/k$4;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/k;->w(Lcom/beizi/fusion/work/splash/k;)Landroid/os/CountDownTimer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->cancel()V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/k$4;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/k;->x(Lcom/beizi/fusion/work/splash/k;)V

    return-void
.end method

.class Lcom/beizi/fusion/work/splash/h$1;
.super Ljava/lang/Object;
.source "HwSplashWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/h;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/h;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/h$1;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$1;->a:Lcom/beizi/fusion/work/splash/h;

    const/16 v1, 0x27a7

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/h;->a(Lcom/beizi/fusion/work/splash/h;I)V

    return-void
.end method

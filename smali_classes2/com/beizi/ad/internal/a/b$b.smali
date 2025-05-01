.class Lcom/beizi/ad/internal/a/b$b;
.super Landroid/os/Handler;
.source "MediationAdViewController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/beizi/ad/internal/a/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/beizi/ad/internal/a/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/a/b$b;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/a/b$b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/internal/a/b;

    if-eqz p1, :cond_1

    .line 2
    iget-boolean v0, p1, Lcom/beizi/ad/internal/a/b;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->mediation_timeout:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p1, v0}, Lcom/beizi/ad/internal/a/b;->a(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :catch_0
    iput-object v1, p1, Lcom/beizi/ad/internal/a/b;->d:Lcom/beizi/ad/internal/b;

    .line 6
    iput-object v1, p1, Lcom/beizi/ad/internal/a/b;->b:Lcom/beizi/ad/b/b;

    .line 7
    iput-object v1, p1, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 8
    iput-object v1, p1, Lcom/beizi/ad/internal/a/b;->d:Lcom/beizi/ad/internal/b;

    .line 9
    iput-object v1, p1, Lcom/beizi/ad/internal/a/b;->b:Lcom/beizi/ad/b/b;

    .line 10
    iput-object v1, p1, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    .line 11
    throw v0

    :cond_1
    :goto_0
    return-void
.end method

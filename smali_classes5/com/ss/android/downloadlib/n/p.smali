.class public Lcom/ss/android/downloadlib/n/p;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/n/p$vv;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field private i:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Lcom/ss/android/downloadlib/n/p$vv<",
            "TP;TR;>;>;"
        }
    .end annotation
.end field

.field private m:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field private o:Lcom/ss/android/downloadlib/n/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ss/android/downloadlib/n/p<",
            "*TP;>;"
        }
    .end annotation
.end field

.field private p:I

.field private u:Lcom/ss/android/downloadlib/n/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ss/android/downloadlib/n/p<",
            "TR;*>;"
        }
    .end annotation
.end field

.field private vv:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(ILcom/ss/android/downloadlib/n/p$vv;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/ss/android/downloadlib/n/p$vv<",
            "TP;TR;>;TP;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/ss/android/downloadlib/n/p;->p:I

    .line 3
    new-instance p1, Ljava/lang/ref/SoftReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/ss/android/downloadlib/n/p;->i:Ljava/lang/ref/SoftReference;

    .line 4
    iput-object p3, p0, Lcom/ss/android/downloadlib/n/p;->vv:Ljava/lang/Object;

    return-void
.end method

.method private m()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/n/p;->m:Ljava/lang/Object;

    return-object v0
.end method

.method public static vv(Lcom/ss/android/downloadlib/n/p$vv;Ljava/lang/Object;)Lcom/ss/android/downloadlib/n/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/ss/android/downloadlib/n/p$vv<",
            "TP;TR;>;TP;)",
            "Lcom/ss/android/downloadlib/n/p<",
            "TP;TR;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/ss/android/downloadlib/n/p;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Lcom/ss/android/downloadlib/n/p;-><init>(ILcom/ss/android/downloadlib/n/p$vv;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/ss/android/downloadlib/n/p;->p:I

    if-nez v0, :cond_0

    invoke-static {}, Lcom/ss/android/downloadlib/n/jh;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/n;->vv()Lcom/ss/android/downloadlib/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/n;->m()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 3
    :cond_0
    iget v0, p0, Lcom/ss/android/downloadlib/n/p;->p:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-static {}, Lcom/ss/android/downloadlib/n/jh;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-static {}, Lcom/ss/android/downloadlib/i;->vv()Lcom/ss/android/downloadlib/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/i;->vv(Ljava/lang/Runnable;)V

    return-void

    .line 5
    :cond_1
    iget v0, p0, Lcom/ss/android/downloadlib/n/p;->p:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    invoke-static {}, Lcom/ss/android/downloadlib/n/jh;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    invoke-static {}, Lcom/ss/android/downloadlib/i;->vv()Lcom/ss/android/downloadlib/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/i;->m(Ljava/lang/Runnable;)V

    return-void

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/ss/android/downloadlib/n/p;->vv:Ljava/lang/Object;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/ss/android/downloadlib/n/p;->o:Lcom/ss/android/downloadlib/n/p;

    if-eqz v0, :cond_3

    .line 8
    invoke-direct {v0}, Lcom/ss/android/downloadlib/n/p;->m()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadlib/n/p;->vv:Ljava/lang/Object;

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/ss/android/downloadlib/n/p;->i:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/downloadlib/n/p$vv;

    if-nez v0, :cond_4

    return-void

    .line 10
    :cond_4
    iget-object v1, p0, Lcom/ss/android/downloadlib/n/p;->vv:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/n/p$vv;->vv(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadlib/n/p;->m:Ljava/lang/Object;

    .line 11
    iget-object v0, p0, Lcom/ss/android/downloadlib/n/p;->u:Lcom/ss/android/downloadlib/n/p;

    if-eqz v0, :cond_5

    .line 12
    invoke-virtual {v0}, Lcom/ss/android/downloadlib/n/p;->run()V

    :cond_5
    return-void
.end method

.method public vv(ILcom/ss/android/downloadlib/n/p$vv;)Lcom/ss/android/downloadlib/n/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<NR:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/ss/android/downloadlib/n/p$vv<",
            "TR;TNR;>;)",
            "Lcom/ss/android/downloadlib/n/p<",
            "TR;TNR;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/ss/android/downloadlib/n/p;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/ss/android/downloadlib/n/p;-><init>(ILcom/ss/android/downloadlib/n/p$vv;Ljava/lang/Object;)V

    .line 3
    iput-object v0, p0, Lcom/ss/android/downloadlib/n/p;->u:Lcom/ss/android/downloadlib/n/p;

    .line 4
    iput-object p0, v0, Lcom/ss/android/downloadlib/n/p;->o:Lcom/ss/android/downloadlib/n/p;

    return-object v0
.end method

.method public vv(Lcom/ss/android/downloadlib/n/p$vv;)Lcom/ss/android/downloadlib/n/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<NR:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/ss/android/downloadlib/n/p$vv<",
            "TR;TNR;>;)",
            "Lcom/ss/android/downloadlib/n/p<",
            "TR;TNR;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/ss/android/downloadlib/n/p;->vv(ILcom/ss/android/downloadlib/n/p$vv;)Lcom/ss/android/downloadlib/n/p;

    move-result-object p1

    return-object p1
.end method

.method public vv()V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/ss/android/downloadlib/n/p;->o:Lcom/ss/android/downloadlib/n/p;

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0}, Lcom/ss/android/downloadlib/n/p;->vv()V

    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/n/p;->run()V

    return-void
.end method

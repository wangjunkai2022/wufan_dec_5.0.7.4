.class public Lcom/ss/android/downloadlib/m/m;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/m/n;I)V
    .locals 2
    .param p1    # Lcom/ss/android/downloadad/api/vv/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/ss/android/downloadlib/m/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/i;->vv()Lcom/ss/android/downloadlib/i;

    move-result-object v0

    new-instance v1, Lcom/ss/android/downloadlib/m/m$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/ss/android/downloadlib/m/m$1;-><init>(Lcom/ss/android/downloadlib/m/m;Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/m/n;)V

    int-to-long p1, p3

    invoke-virtual {v0, v1, p1, p2}, Lcom/ss/android/downloadlib/i;->vv(Ljava/lang/Runnable;J)V

    return-void
.end method

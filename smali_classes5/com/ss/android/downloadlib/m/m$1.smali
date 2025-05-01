.class Lcom/ss/android/downloadlib/m/m$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/m/m;->vv(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/m/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/m/n;

.field final synthetic p:Lcom/ss/android/downloadlib/m/m;

.field final synthetic vv:Lcom/ss/android/downloadad/api/vv/m;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/m/m;Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/m/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/m/m$1;->p:Lcom/ss/android/downloadlib/m/m;

    iput-object p2, p0, Lcom/ss/android/downloadlib/m/m$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    iput-object p3, p0, Lcom/ss/android/downloadlib/m/m$1;->m:Lcom/ss/android/downloadlib/m/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/m$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {v0}, Lcom/ss/android/downloadlib/m/wv;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/m$1;->m:Lcom/ss/android/downloadlib/m/n;

    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/m/n;->vv(Z)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/m$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {v0}, Lcom/ss/android/downloadlib/m/u;->vv(Lcom/ss/android/downloadad/api/vv/m;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/m$1;->m:Lcom/ss/android/downloadlib/m/n;

    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/m/n;->vv(Z)V

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/m$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    new-instance v1, Lcom/ss/android/downloadlib/m/m$1$1;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/m/m$1$1;-><init>(Lcom/ss/android/downloadlib/m/m$1;)V

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/m/u;->vv(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/m/qv;)V

    return-void
.end method

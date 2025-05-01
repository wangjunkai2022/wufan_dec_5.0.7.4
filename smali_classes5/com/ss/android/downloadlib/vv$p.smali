.class Lcom/ss/android/downloadlib/vv$p;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/vv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "p"
.end annotation


# instance fields
.field private final m:Lcom/ss/android/downloadad/api/vv/m;

.field final synthetic vv:Lcom/ss/android/downloadlib/vv;


# direct methods
.method public constructor <init>(Lcom/ss/android/downloadlib/vv;Lcom/ss/android/downloadad/api/vv/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/vv$p;->vv:Lcom/ss/android/downloadlib/vv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/ss/android/downloadlib/vv$p;->m:Lcom/ss/android/downloadad/api/vv/m;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/downloadlib/vv$p;->m:Lcom/ss/android/downloadad/api/vv/m;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/ss/android/downloadad/api/vv/m;->k(Z)V

    .line 2
    iget-object v1, p0, Lcom/ss/android/downloadlib/vv$p;->vv:Lcom/ss/android/downloadlib/vv;

    iget-object v2, p0, Lcom/ss/android/downloadlib/vv$p;->m:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {v1, v2}, Lcom/ss/android/downloadlib/vv;->vv(Lcom/ss/android/downloadlib/vv;Lcom/ss/android/downloadad/api/vv/m;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    :goto_0
    iget-object v1, p0, Lcom/ss/android/downloadlib/vv$p;->m:Lcom/ss/android/downloadad/api/vv/m;

    invoke-virtual {v1, v0}, Lcom/ss/android/downloadad/api/vv/m;->k(Z)V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 4
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 5
    :goto_1
    iget-object v2, p0, Lcom/ss/android/downloadlib/vv$p;->m:Lcom/ss/android/downloadad/api/vv/m;

    invoke-virtual {v2, v0}, Lcom/ss/android/downloadad/api/vv/m;->k(Z)V

    goto :goto_3

    :goto_2
    throw v1

    :goto_3
    goto :goto_2
.end method

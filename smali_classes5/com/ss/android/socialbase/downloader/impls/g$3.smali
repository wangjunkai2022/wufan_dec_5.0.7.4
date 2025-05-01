.class Lcom/ss/android/socialbase/downloader/impls/g$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/g;->vv(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/socialbase/downloader/impls/g;

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/g;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/g$3;->m:Lcom/ss/android/socialbase/downloader/impls/g;

    iput p2, p0, Lcom/ss/android/socialbase/downloader/impls/g$3;->vv:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/g$3;->m:Lcom/ss/android/socialbase/downloader/impls/g;

    iget v1, p0, Lcom/ss/android/socialbase/downloader/impls/g$3;->vv:I

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/g;->i(Lcom/ss/android/socialbase/downloader/impls/g;)I

    move-result v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/impls/g;->vv(Lcom/ss/android/socialbase/downloader/impls/g;IIZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

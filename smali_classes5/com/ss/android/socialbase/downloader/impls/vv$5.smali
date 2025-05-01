.class Lcom/ss/android/socialbase/downloader/impls/vv$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/vv;->p(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Z

.field final synthetic p:Lcom/ss/android/socialbase/downloader/impls/vv;

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/vv;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/vv$5;->p:Lcom/ss/android/socialbase/downloader/impls/vv;

    iput p2, p0, Lcom/ss/android/socialbase/downloader/impls/vv$5;->vv:I

    iput-boolean p3, p0, Lcom/ss/android/socialbase/downloader/impls/vv$5;->m:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/vv$5;->p:Lcom/ss/android/socialbase/downloader/impls/vv;

    iget v1, p0, Lcom/ss/android/socialbase/downloader/impls/vv$5;->vv:I

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/impls/vv;->p(I)Lcom/ss/android/socialbase/downloader/qv/p;

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/vv$5;->p:Lcom/ss/android/socialbase/downloader/impls/vv;

    iget v1, p0, Lcom/ss/android/socialbase/downloader/impls/vv$5;->vv:I

    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/impls/vv$5;->m:Z

    invoke-static {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/impls/vv;->m(Lcom/ss/android/socialbase/downloader/impls/vv;IZ)V

    return-void
.end method

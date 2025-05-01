.class Lcom/ss/android/socialbase/downloader/m/o$11;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/m/o;->u(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/socialbase/downloader/m/o;

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/m/o;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/o$11;->m:Lcom/ss/android/socialbase/downloader/m/o;

    iput p2, p0, Lcom/ss/android/socialbase/downloader/m/o$11;->vv:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/o$11;->m:Lcom/ss/android/socialbase/downloader/m/o;

    iget v1, p0, Lcom/ss/android/socialbase/downloader/m/o$11;->vv:I

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/m/o;->o(I)Z

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/o$11;->m:Lcom/ss/android/socialbase/downloader/m/o;

    iget v1, p0, Lcom/ss/android/socialbase/downloader/m/o$11;->vv:I

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/m/o;->i(I)V

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/o$11;->m:Lcom/ss/android/socialbase/downloader/m/o;

    iget v1, p0, Lcom/ss/android/socialbase/downloader/m/o$11;->vv:I

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/m/o;->r(I)V

    return-void
.end method

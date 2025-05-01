.class Lcom/ss/android/socialbase/downloader/u/qv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/u/o;


# instance fields
.field private final m:Lcom/ss/android/socialbase/downloader/u/o;

.field private final vv:Lcom/ss/android/socialbase/downloader/u/o;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/u/o;Lcom/ss/android/socialbase/downloader/u/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/u/qv;->vv:Lcom/ss/android/socialbase/downloader/u/o;

    .line 3
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/u/qv;->m:Lcom/ss/android/socialbase/downloader/u/o;

    return-void
.end method


# virtual methods
.method public m(Lcom/ss/android/socialbase/downloader/u/vv;)V
    .locals 1
    .param p1    # Lcom/ss/android/socialbase/downloader/u/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/qv;->m:Lcom/ss/android/socialbase/downloader/u/o;

    iput-object v0, p1, Lcom/ss/android/socialbase/downloader/u/vv;->m:Lcom/ss/android/socialbase/downloader/u/o;

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/qv;->vv:Lcom/ss/android/socialbase/downloader/u/o;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/u/o;->m(Lcom/ss/android/socialbase/downloader/u/vv;)V

    return-void
.end method

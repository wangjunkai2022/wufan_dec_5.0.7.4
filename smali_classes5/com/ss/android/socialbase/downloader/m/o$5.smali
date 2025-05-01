.class Lcom/ss/android/socialbase/downloader/m/o$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/socialbase/downloader/m/o;

.field final synthetic vv:Lcom/ss/android/socialbase/downloader/model/m;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/m/o;Lcom/ss/android/socialbase/downloader/model/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/o$5;->m:Lcom/ss/android/socialbase/downloader/m/o;

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/m/o$5;->vv:Lcom/ss/android/socialbase/downloader/model/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/o$5;->m:Lcom/ss/android/socialbase/downloader/m/o;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/m/o;->m(Lcom/ss/android/socialbase/downloader/m/o;)Lcom/ss/android/socialbase/downloader/m/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/m/n;->vv()Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/m/o$5;->m:Lcom/ss/android/socialbase/downloader/m/o;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/m/o$5;->vv:Lcom/ss/android/socialbase/downloader/model/m;

    invoke-static {v1, v2, v0}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;Lcom/ss/android/socialbase/downloader/model/m;Landroid/database/sqlite/SQLiteStatement;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

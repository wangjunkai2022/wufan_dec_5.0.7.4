.class Lcom/ss/android/socialbase/downloader/m/o$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/m/o;->vv(IIIJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:J

.field final synthetic m:I

.field final synthetic o:Lcom/ss/android/socialbase/downloader/m/o;

.field final synthetic p:I

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/m/o;IIIJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/o$7;->o:Lcom/ss/android/socialbase/downloader/m/o;

    iput p2, p0, Lcom/ss/android/socialbase/downloader/m/o$7;->vv:I

    iput p3, p0, Lcom/ss/android/socialbase/downloader/m/o$7;->m:I

    iput p4, p0, Lcom/ss/android/socialbase/downloader/m/o$7;->p:I

    iput-wide p5, p0, Lcom/ss/android/socialbase/downloader/m/o$7;->i:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/o$7;->o:Lcom/ss/android/socialbase/downloader/m/o;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/m/o;->m(Lcom/ss/android/socialbase/downloader/m/o;)Lcom/ss/android/socialbase/downloader/m/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/m/n;->p()Landroid/database/sqlite/SQLiteStatement;

    move-result-object v7

    .line 2
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/m/o$7;->o:Lcom/ss/android/socialbase/downloader/m/o;

    iget v2, p0, Lcom/ss/android/socialbase/downloader/m/o$7;->vv:I

    iget v3, p0, Lcom/ss/android/socialbase/downloader/m/o$7;->m:I

    iget v4, p0, Lcom/ss/android/socialbase/downloader/m/o$7;->p:I

    iget-wide v5, p0, Lcom/ss/android/socialbase/downloader/m/o$7;->i:J

    invoke-static/range {v1 .. v7}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;IIIJLandroid/database/sqlite/SQLiteStatement;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

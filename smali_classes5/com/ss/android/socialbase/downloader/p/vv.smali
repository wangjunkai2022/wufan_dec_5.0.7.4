.class public Lcom/ss/android/socialbase/downloader/p/vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/downloader/p/vv$vv;
    }
.end annotation


# static fields
.field private static m:Lcom/ss/android/socialbase/downloader/p/vv$vv; = null

.field private static vv:I = 0x4


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    sget p1, Lcom/ss/android/socialbase/downloader/p/vv;->vv:I

    const/4 v0, 0x5

    if-gt p1, v0, :cond_1

    .line 2
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    :cond_1
    sget-object p1, Lcom/ss/android/socialbase/downloader/p/vv;->m:Lcom/ss/android/socialbase/downloader/p/vv$vv;

    if-eqz p1, :cond_2

    .line 4
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public static m(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "Downloader-"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "DownloaderLogger"

    return-object p0
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    sget p1, Lcom/ss/android/socialbase/downloader/p/vv;->vv:I

    const/4 v0, 0x3

    if-gt p1, v0, :cond_1

    .line 4
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    :cond_1
    sget-object p1, Lcom/ss/android/socialbase/downloader/p/vv;->m:Lcom/ss/android/socialbase/downloader/p/vv$vv;

    if-eqz p1, :cond_2

    .line 6
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    .line 7
    :cond_0
    sget p1, Lcom/ss/android/socialbase/downloader/p/vv;->vv:I

    const/4 p2, 0x6

    if-gt p1, p2, :cond_1

    .line 8
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    :cond_1
    sget-object p1, Lcom/ss/android/socialbase/downloader/p/vv;->m:Lcom/ss/android/socialbase/downloader/p/vv$vv;

    if-eqz p1, :cond_2

    .line 10
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public static o(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    sget p1, Lcom/ss/android/socialbase/downloader/p/vv;->vv:I

    const/4 v0, 0x6

    if-gt p1, v0, :cond_1

    .line 2
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    :cond_1
    sget-object p1, Lcom/ss/android/socialbase/downloader/p/vv;->m:Lcom/ss/android/socialbase/downloader/p/vv$vv;

    if-eqz p1, :cond_2

    .line 4
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public static p(Ljava/lang/String;)V
    .locals 1

    const-string v0, "DownloaderLogger"

    .line 5
    invoke-static {v0, p0}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    sget p1, Lcom/ss/android/socialbase/downloader/p/vv;->vv:I

    const/4 v0, 0x4

    if-gt p1, v0, :cond_1

    .line 2
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    :cond_1
    sget-object p1, Lcom/ss/android/socialbase/downloader/p/vv;->m:Lcom/ss/android/socialbase/downloader/p/vv$vv;

    if-eqz p1, :cond_2

    .line 4
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public static vv(I)V
    .locals 0

    .line 1
    sput p0, Lcom/ss/android/socialbase/downloader/p/vv;->vv:I

    return-void
.end method

.method public static vv(Ljava/lang/String;)V
    .locals 1

    const-string v0, "DownloaderLogger"

    .line 5
    invoke-static {v0, p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static vv(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    sget-object p1, Lcom/ss/android/socialbase/downloader/p/vv;->m:Lcom/ss/android/socialbase/downloader/p/vv$vv;

    if-eqz p1, :cond_1

    .line 4
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public static vv(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    .line 6
    :cond_0
    sget p1, Lcom/ss/android/socialbase/downloader/p/vv;->vv:I

    const/4 p2, 0x3

    if-gt p1, p2, :cond_1

    .line 7
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    :cond_1
    sget-object p1, Lcom/ss/android/socialbase/downloader/p/vv;->m:Lcom/ss/android/socialbase/downloader/p/vv$vv;

    if-eqz p1, :cond_2

    .line 9
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;)Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public static vv()Z
    .locals 2

    .line 2
    sget v0, Lcom/ss/android/socialbase/downloader/p/vv;->vv:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

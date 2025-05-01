.class Lcom/ss/android/socialbase/appdownloader/i$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/depend/vu;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/i;->vv(Lcom/ss/android/socialbase/appdownloader/p/o;)Lcom/ss/android/socialbase/downloader/depend/vu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/socialbase/appdownloader/i;

.field final synthetic vv:Lcom/ss/android/socialbase/appdownloader/p/o;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/i;Lcom/ss/android/socialbase/appdownloader/p/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/i$5;->m:Lcom/ss/android/socialbase/appdownloader/i;

    iput-object p2, p0, Lcom/ss/android/socialbase/appdownloader/i$5;->vv:Lcom/ss/android/socialbase/appdownloader/p/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/i$5;->vv:Lcom/ss/android/socialbase/appdownloader/p/o;

    invoke-interface {v0}, Lcom/ss/android/socialbase/appdownloader/p/o;->vv()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public vv(ILcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const/4 p3, 0x1

    if-eq p1, p3, :cond_0

    const/4 p3, 0x3

    if-eq p1, p3, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1
    :pswitch_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    return-void

    .line 2
    :pswitch_1
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getPackageName()Ljava/lang/String;

    return-void

    .line 3
    :cond_0
    :pswitch_2
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getDownloadTime()J

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public vv(Z)Z
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/i$5;->vv:Lcom/ss/android/socialbase/appdownloader/p/o;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/appdownloader/p/o;->vv(Z)Z

    move-result p1

    return p1
.end method

.class Lcom/ss/android/socialbase/appdownloader/m$vv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/vv/vv$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/appdownloader/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "vv"
.end annotation


# instance fields
.field private final m:I

.field private p:Lorg/json/JSONObject;

.field private final vv:Lcom/ss/android/socialbase/appdownloader/m$o;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;ILorg/json/JSONObject;Lcom/ss/android/socialbase/appdownloader/m$m;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p4, p0, Lcom/ss/android/socialbase/appdownloader/m$vv;->p:Lorg/json/JSONObject;

    const-string v0, "query_interval"

    const/16 v1, 0x3e8

    .line 3
    invoke-virtual {p4, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p4

    iput p4, p0, Lcom/ss/android/socialbase/appdownloader/m$vv;->m:I

    .line 4
    new-instance v7, Lcom/ss/android/socialbase/appdownloader/m$o;

    int-to-long v5, p4

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p5

    invoke-direct/range {v0 .. v6}, Lcom/ss/android/socialbase/appdownloader/m$o;-><init>(Landroid/content/Context;Landroid/content/Intent;ILcom/ss/android/socialbase/appdownloader/m$m;J)V

    iput-object v7, p0, Lcom/ss/android/socialbase/appdownloader/m$vv;->vv:Lcom/ss/android/socialbase/appdownloader/m$o;

    return-void
.end method


# virtual methods
.method public m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/m$vv;->vv:Lcom/ss/android/socialbase/appdownloader/m$o;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/m$o;->vv(Lcom/ss/android/socialbase/appdownloader/m$o;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x2

    .line 3
    iput v1, v0, Landroid/os/Message;->what:I

    .line 4
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/m$vv;->vv:Lcom/ss/android/socialbase/appdownloader/m$o;

    invoke-static {v1}, Lcom/ss/android/socialbase/appdownloader/m$o;->m(Lcom/ss/android/socialbase/appdownloader/m$o;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 5
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/downloader/vv/vv;->m(Lcom/ss/android/socialbase/downloader/vv/vv$vv;)V

    const/4 v0, 0x0

    .line 6
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/m;->vv(Lcom/ss/android/socialbase/appdownloader/m$vv;)Lcom/ss/android/socialbase/appdownloader/m$vv;

    return-void
.end method

.method public p()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/m$vv;->p:Lorg/json/JSONObject;

    const-string v1, "time_out_second"

    const/16 v2, 0x14

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 2
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    const/4 v2, 0x1

    .line 3
    iput v2, v1, Landroid/os/Message;->what:I

    .line 4
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/m$vv;->vv:Lcom/ss/android/socialbase/appdownloader/m$o;

    invoke-static {v2}, Lcom/ss/android/socialbase/appdownloader/m$o;->m(Lcom/ss/android/socialbase/appdownloader/m$o;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    if-lez v0, :cond_0

    const/16 v1, 0x3c

    if-ge v0, v1, :cond_0

    .line 5
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    const/4 v2, 0x2

    .line 6
    iput v2, v1, Landroid/os/Message;->what:I

    .line 7
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/m$vv;->vv:Lcom/ss/android/socialbase/appdownloader/m$o;

    invoke-static {v2}, Lcom/ss/android/socialbase/appdownloader/m$o;->m(Lcom/ss/android/socialbase/appdownloader/m$o;)Landroid/os/Handler;

    move-result-object v2

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v3, v0

    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.class public Lcom/aggmoread/sdk/z/a/j/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroidx/core/app/NotificationCompat$Builder;

.field private b:Landroid/app/NotificationManager;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Landroid/app/PendingIntent;

.field private g:I

.field private h:I

.field private i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;ILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->b:Landroid/app/NotificationManager;

    iput p2, p0, Lcom/aggmoread/sdk/z/a/j/k;->g:I

    iput-object p5, p0, Lcom/aggmoread/sdk/z/a/j/k;->c:Ljava/lang/String;

    iput-object p6, p0, Lcom/aggmoread/sdk/z/a/j/k;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/aggmoread/sdk/z/a/j/k;->e:Ljava/lang/String;

    iput p7, p0, Lcom/aggmoread/sdk/z/a/j/k;->h:I

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/j/k;->f:Landroid/app/PendingIntent;

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 p3, 0x2

    const/4 p5, 0x0

    const/16 p6, 0x1a

    if-lt p2, p6, :cond_0

    new-instance p2, Landroid/app/NotificationChannel;

    const-string p6, "\u4e0b\u8f7d\u901a\u77e5"

    invoke-direct {p2, p4, p6, p3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const/4 p6, 0x0

    :try_start_0
    invoke-virtual {p2, p6, p6}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    invoke-virtual {p2, p5}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    invoke-virtual {p2, p5}, Landroid/app/NotificationChannel;->enableLights(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object p6, p0, Lcom/aggmoread/sdk/z/a/j/k;->b:Landroid/app/NotificationManager;

    invoke-virtual {p6, p2}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    new-instance p2, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {p2, p1, p4}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p6

    invoke-virtual {p2, p6, p7}, Landroidx/core/app/NotificationCompat$Builder;->setWhen(J)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, p5}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setOnlyAlertOnce(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/k;->e()V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/k;->b()V

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/j/k;->c()V

    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    :cond_0
    return-void
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->f:Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    :cond_0
    return-void
.end method

.method private e()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    :cond_0
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "show#1 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DownloadNotification"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/k;->e()V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/k;->b()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    const/16 v1, 0x64

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setProgress(IIZ)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/k;->b:Landroid/app/NotificationManager;

    iget v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->g:I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/k;->b:Landroid/app/NotificationManager;

    iget v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->g:I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/j/k;->i:Z

    :cond_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/j/o;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "show#2 enter,downloadState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " , id = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DownloadNotification"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/k;->e()V

    sget-object v0, Lcom/aggmoread/sdk/z/a/j/o;->d:Lcom/aggmoread/sdk/z/a/j/o;

    if-ne p1, v0, :cond_0

    const-string p1, "\u5df2\u7ecf\u4e0b\u8f7d,\u70b9\u51fb\u5b89\u88c5!"

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/k;->d:Ljava/lang/String;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/k;->d()V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/aggmoread/sdk/z/a/j/o;->e:Lcom/aggmoread/sdk/z/a/j/o;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1, v1}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    const-string p1, "\u4e0b\u8f7d\u5931\u8d25"

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/k;->d:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    const/16 v0, 0x64

    invoke-virtual {p1, v0, v2, v1}, Landroidx/core/app/NotificationCompat$Builder;->setProgress(IIZ)Landroidx/core/app/NotificationCompat$Builder;

    :goto_0
    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/k;->b()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/k;->b:Landroid/app/NotificationManager;

    iget v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->g:I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    const-string v0, "DownloadNotification"

    const-string v1, "show#3 enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/k;->d:Ljava/lang/String;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/k;->e()V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/k;->b()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/k;->b:Landroid/app/NotificationManager;

    iget v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->g:I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->i:Z

    return v0
.end method

.method public c()V
    .locals 2

    iget v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->h:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    :cond_0
    return-void
.end method

.method public f()V
    .locals 3

    const-string v0, "\u5df2\u7ecf\u5b89\u88c5,\u70b9\u51fb\u542f\u52a8!"

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->d:Ljava/lang/String;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/k;->d()V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/k;->b()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/k;->b:Landroid/app/NotificationManager;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->g:I

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v2}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadNotification{builder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->a:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", notificationManager="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->b:Landroid/app/NotificationManager;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", title=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", desc=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/k;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", channelId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/k;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", pendingIntent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->f:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", icon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/j/k;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

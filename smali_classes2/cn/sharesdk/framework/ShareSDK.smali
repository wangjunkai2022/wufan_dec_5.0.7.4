.class public Lcn/sharesdk/framework/ShareSDK;
.super Ljava/lang/Object;
.source "ShareSDK.java"


# static fields
.field public static final SDK_TAG:Ljava/lang/String; = "SHARESDK"

.field public static final SDK_VERSION_CODE:I

.field public static final SDK_VERSION_NAME:Ljava/lang/String; = "3.10.22"

.field public static final SHARESDK_MOBLINK_RESTORE:Ljava/lang/String; = "sharesdk_moblink_restore"

.field private static a:Lcn/sharesdk/framework/i; = null

.field private static b:Z = true

.field private static c:Ljava/lang/String;

.field private static d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private static f:I

.field private static volatile g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "3.10.22"

    const-string v1, "\\."

    .line 1
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 2
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    mul-int/lit8 v3, v3, 0x64

    .line 3
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_0
    sput v3, Lcn/sharesdk/framework/ShareSDK;->SDK_VERSION_CODE:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(ILjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 5
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 6
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ShareSDK getNetworkDevinfo catch "

    invoke-virtual {v1, v0, v3, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 7
    :goto_0
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0, p0, p1}, Lcn/sharesdk/framework/i;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method static a(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p0, 0x0

    return-object p0
.end method

.method static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p0, 0x0

    return-object p0
.end method

.method static synthetic a(Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 0

    .line 1
    sput-object p0, Lcn/sharesdk/framework/ShareSDK;->d:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic a(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 2
    sput-object p0, Lcn/sharesdk/framework/ShareSDK;->e:Ljava/util/List;

    return-object p0
.end method

.method static a(II)V
    .locals 1

    .line 4
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$18;

    invoke-direct {v0, p0, p1}, Lcn/sharesdk/framework/ShareSDK$18;-><init>(II)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method static a(Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 13
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$23;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$23;-><init>(Lcn/sharesdk/framework/ShareSDKCallback;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 3
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$17;

    invoke-direct {v0, p0, p1}, Lcn/sharesdk/framework/ShareSDK$17;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method static a(Ljava/lang/String;ZILjava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZI",
            "Ljava/lang/String;",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 14
    new-instance v6, Lcn/sharesdk/framework/ShareSDK$24;

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcn/sharesdk/framework/ShareSDK$24;-><init>(Ljava/lang/String;ZILjava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V

    invoke-static {v6}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method static a()Z
    .locals 5

    const/4 v0, 0x0

    .line 9
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 10
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    const-string v4, "ShareSDK isNetworkDevinfoRequested is catch "

    invoke-virtual {v2, v1, v4, v3}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 11
    :goto_0
    sget-object v1, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v1, :cond_0

    .line 12
    invoke-virtual {v1}, Lcn/sharesdk/framework/i;->f()Z

    move-result v0

    :cond_0
    return v0
.end method

.method static synthetic b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    sput-object p0, Lcn/sharesdk/framework/ShareSDK;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V

    return-void
.end method

.method static synthetic c()Lcn/sharesdk/framework/i;
    .locals 1

    .line 1
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    return-object v0
.end method

.method public static closeDebug()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    sput-boolean v0, Lcn/sharesdk/framework/ShareSDK;->b:Z

    return-void
.end method

.method static synthetic d()V
    .locals 0

    .line 1
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->l()V

    return-void
.end method

.method public static deleteCache()V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V

    .line 2
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcn/sharesdk/framework/i;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ShareSDK deleteCache catch "

    invoke-virtual {v1, v0, v3, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public static deleteCacheAsync()V
    .locals 1

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$1;

    invoke-direct {v0}, Lcn/sharesdk/framework/ShareSDK$1;-><init>()V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method static synthetic e()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->e:Ljava/util/List;

    return-object v0
.end method

.method static synthetic f()Ljava/util/HashMap;
    .locals 1

    .line 1
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->d:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic g()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static getAuthActivity()Landroid/app/Activity;
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ShareSDK getAuthActivity catch "

    invoke-virtual {v1, v0, v3, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 3
    :goto_0
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcn/sharesdk/framework/i;->a()Landroid/app/Activity;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getAuthActivityAsync(Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Landroid/app/Activity;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$14;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$14;-><init>(Lcn/sharesdk/framework/ShareSDKCallback;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static getCustomDataFromLoopShare()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public static getDevinfo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ShareSDK getDevinfo catch "

    invoke-virtual {v1, v0, v3, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 3
    :goto_0
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0, p1}, Lcn/sharesdk/framework/i;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getDevinfoAsync(Ljava/lang/String;Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$19;

    invoke-direct {v0, p0, p1, p2}, Lcn/sharesdk/framework/ShareSDK$19;-><init>(Ljava/lang/String;Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static getEnableAuthTag()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public static getFirstQrImage(Landroid/content/Context;Lcn/sharesdk/framework/loopshare/watermark/ReadQrImageListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static getNetworkDevinfoAsync(ILjava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$20;

    invoke-direct {v0, p0, p1, p2}, Lcn/sharesdk/framework/ShareSDK$20;-><init>(ILjava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static getPlatform(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;
    .locals 5

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    const-string v4, "ShareSDK ensureInit getPlatform catch"

    invoke-virtual {v2, v1, v4, v3}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 3
    :goto_0
    sget-object v1, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1, p0}, Lcn/sharesdk/framework/i;->a(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;

    move-result-object p0

    return-object p0

    .line 5
    :cond_0
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "ShareSDK use defaultPlatform"

    invoke-virtual {p0, v1, v0}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 6
    invoke-static {}, Lcn/sharesdk/framework/Platform;->getDefaultPlatform()Lcn/sharesdk/framework/Platform;

    move-result-object p0

    return-object p0
.end method

.method public static getPlatformAsync(Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Lcn/sharesdk/framework/Platform;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$3;

    invoke-direct {v0, p0, p1}, Lcn/sharesdk/framework/ShareSDK$3;-><init>(Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static getPlatformList()[Lcn/sharesdk/framework/Platform;
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ShareSDK getPlatformList catch "

    invoke-virtual {v1, v0, v3, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 3
    :goto_0
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcn/sharesdk/framework/i;->d()[Lcn/sharesdk/framework/Platform;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getPlatformListAsync(Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "[",
            "Lcn/sharesdk/framework/Platform;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$2;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$2;-><init>(Lcn/sharesdk/framework/ShareSDKCallback;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static getQRCodeBitmap(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p0, 0x0

    return-object p0
.end method

.method public static getService(Ljava/lang/Class;)Lcn/sharesdk/framework/Service;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcn/sharesdk/framework/Service;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V

    .line 2
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p0}, Lcn/sharesdk/framework/i;->c(Ljava/lang/Class;)Lcn/sharesdk/framework/Service;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getServiceAsync(Ljava/lang/Class;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcn/sharesdk/framework/Service;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$26;

    invoke-direct {v0, p1, p0}, Lcn/sharesdk/framework/ShareSDK$26;-><init>(Lcn/sharesdk/framework/ShareSDKCallback;Ljava/lang/Class;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method static synthetic h()I
    .locals 2

    .line 1
    sget v0, Lcn/sharesdk/framework/ShareSDK;->f:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcn/sharesdk/framework/ShareSDK;->f:I

    return v0
.end method

.method static synthetic i()I
    .locals 1

    .line 1
    sget v0, Lcn/sharesdk/framework/ShareSDK;->f:I

    return v0
.end method

.method public static isDebug()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcn/sharesdk/framework/ShareSDK;->b:Z

    return v0
.end method

.method public static isFBInstagram()Z
    .locals 5

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ShareSDK isFBInstagram catch: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v0, [Ljava/lang/Object;

    invoke-virtual {v2, v1, v3}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 3
    :goto_0
    sget-object v1, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Lcn/sharesdk/framework/i;->b()Z

    move-result v0

    :cond_0
    return v0
.end method

.method public static isFBInstagramAsync(Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$16;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$16;-><init>(Lcn/sharesdk/framework/ShareSDKCallback;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static isNetworkDevinfoRequestedAsync(Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$21;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$21;-><init>(Lcn/sharesdk/framework/ShareSDKCallback;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static isRemoveCookieOnAuthorize()Z
    .locals 5

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ShareSDK isRemoveCookieOnAuthorize catch: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v0, [Ljava/lang/Object;

    invoke-virtual {v2, v1, v3}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 3
    :goto_0
    sget-object v1, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Lcn/sharesdk/framework/i;->e()Z

    move-result v0

    :cond_0
    return v0
.end method

.method public static isRemoveCookieOnAuthorizeAsync(Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$12;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$12;-><init>(Lcn/sharesdk/framework/ShareSDKCallback;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method private static j()Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/mob/MobSDK;->isForb()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2
    sget-boolean v0, Lcn/sharesdk/framework/ShareSDK;->g:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 3
    sput-boolean v1, Lcn/sharesdk/framework/ShareSDK;->g:Z

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/utils/i;->a()V

    .line 5
    :cond_0
    invoke-static {}, Lcom/mob/MobSDK;->isAuth()I

    move-result v0

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    new-instance v0, Lcom/mob/commons/dialog/PolicyThrowable;

    invoke-direct {v0}, Lcom/mob/commons/dialog/PolicyThrowable;-><init>()V

    throw v0

    :cond_2
    :goto_0
    return v1

    .line 7
    :cond_3
    new-instance v0, Lcom/mob/commons/ForbThrowable;

    invoke-direct {v0}, Lcom/mob/commons/ForbThrowable;-><init>()V

    throw v0
.end method

.method private static declared-synchronized k()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-class v0, Lcn/sharesdk/framework/ShareSDK;

    monitor-enter v0

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->j()Z

    .line 2
    sget-object v1, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Lcn/sharesdk/framework/i;

    invoke-direct {v1}, Lcn/sharesdk/framework/i;-><init>()V

    .line 4
    invoke-virtual {v1}, Lcn/sharesdk/framework/i;->c()V

    .line 5
    sput-object v1, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static l()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcn/sharesdk/framework/ShareSDK$8;

    invoke-direct {v1}, Lcn/sharesdk/framework/ShareSDK$8;-><init>()V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static logApiEvent(Ljava/lang/String;I)V
    .locals 1

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$5;

    invoke-direct {v0, p0, p1}, Lcn/sharesdk/framework/ShareSDK$5;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static logDemoEvent(ILcn/sharesdk/framework/Platform;)V
    .locals 1

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$4;

    invoke-direct {v0, p0, p1}, Lcn/sharesdk/framework/ShareSDK$4;-><init>(ILcn/sharesdk/framework/Platform;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static makeVideoWaterMark(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcn/sharesdk/framework/loopshare/watermark/WaterMarkListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static mobLinkGetMobID(Ljava/util/HashMap;Lcn/sharesdk/framework/loopshare/MoblinkActionListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcn/sharesdk/framework/loopshare/MoblinkActionListener;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static platformIdToName(I)Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ShareSDK platformIdToName catch: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 3
    :goto_0
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Lcn/sharesdk/framework/i;->c(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static platformIdToNameAsync(ILcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$9;

    invoke-direct {v0, p0, p1}, Lcn/sharesdk/framework/ShareSDK$9;-><init>(ILcn/sharesdk/framework/ShareSDKCallback;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static platformNameToId(Ljava/lang/String;)I
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ShareSDK platformNameToId catch "

    invoke-virtual {v1, v0, v3, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 3
    :goto_0
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Lcn/sharesdk/framework/i;->b(Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static platformNameToIdAsync(Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$10;

    invoke-direct {v0, p0, p1}, Lcn/sharesdk/framework/ShareSDK$10;-><init>(Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static prepareLoopShare(Lcn/sharesdk/framework/loopshare/LoopShareResultListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static preparePassWord(Ljava/util/HashMap;Ljava/lang/String;Lcn/sharesdk/framework/loopshare/LoopSharePasswordListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Lcn/sharesdk/framework/loopshare/LoopSharePasswordListener;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static readPassWord(ZLcn/sharesdk/framework/loopshare/LoopSharePasswordListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static registerPlatformAsync(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcn/sharesdk/framework/CustomPlatform;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$27;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$27;-><init>(Ljava/lang/Class;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static registerService(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcn/sharesdk/framework/Service;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$11;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$11;-><init>(Ljava/lang/Class;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static removeCookieOnAuthorize(Z)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V

    .line 2
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p0}, Lcn/sharesdk/framework/i;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ShareSDK removeCookieOnAuthorize catch "

    invoke-virtual {v0, p0, v2, v1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public static removeCookieOnAuthorizeAsync(Z)V
    .locals 1

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$31;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$31;-><init>(Z)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static setActivity(Landroid/app/Activity;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V

    .line 2
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p0}, Lcn/sharesdk/framework/i;->a(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ShareSDK setActivity is catch "

    invoke-virtual {v0, p0, v2, v1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public static setActivityAsync(Landroid/app/Activity;)V
    .locals 1

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$13;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$13;-><init>(Landroid/app/Activity;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static setCloseGppService(Z)V
    .locals 1

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$25;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$25;-><init>(Z)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static setConnTimeout(I)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V

    .line 2
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p0}, Lcn/sharesdk/framework/i;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ShareSDK setConnTimeout catch"

    invoke-virtual {v0, p0, v2, v1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public static setConnTimeoutAsync(I)V
    .locals 1

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$29;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$29;-><init>(I)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static setEnableAuthTag(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static setFBInstagram(Z)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V

    .line 2
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p0}, Lcn/sharesdk/framework/i;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ShareSDK setFBInstagram catch "

    invoke-virtual {v0, p0, v2, v1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public static setFBInstagramAsync(Z)V
    .locals 1

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$15;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$15;-><init>(Z)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static setPlatformDevInfo(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    sput-object p0, Lcn/sharesdk/framework/ShareSDK;->c:Ljava/lang/String;

    .line 2
    sput-object p1, Lcn/sharesdk/framework/ShareSDK;->d:Ljava/util/HashMap;

    .line 3
    invoke-static {}, Lcom/mob/MobSDK;->isForb()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/mob/MobSDK;->isAuth()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V

    .line 5
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0, p0, p1}, Lcn/sharesdk/framework/i;->a(Ljava/lang/String;Ljava/util/HashMap;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 8
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "ShareSDK setPlatformDevInfo catch "

    invoke-virtual {p1, p0, v1, v0}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public static setPlatformDevInfoAsync(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$6;

    invoke-direct {v0, p0, p1}, Lcn/sharesdk/framework/ShareSDK$6;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static setPlatformDevInfos(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    sput-object p0, Lcn/sharesdk/framework/ShareSDK;->e:Ljava/util/List;

    .line 2
    invoke-static {}, Lcom/mob/MobSDK;->isForb()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {}, Lcom/mob/MobSDK;->isAuth()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 3
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V

    .line 4
    sget-object p0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz p0, :cond_1

    .line 5
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->e:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcn/sharesdk/framework/i;->a(Ljava/util/List;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 7
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ShareSDK setPlatformDevInfo catch "

    invoke-virtual {v0, p0, v2, v1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public static setPlatformDevInfosAsync(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$7;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$7;-><init>(Ljava/util/List;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static setReadTimeout(I)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->k()V

    .line 2
    sget-object v0, Lcn/sharesdk/framework/ShareSDK;->a:Lcn/sharesdk/framework/i;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p0}, Lcn/sharesdk/framework/i;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ShareSDK setReadTimeout catch"

    invoke-virtual {v0, p0, v2, v1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public static setReadTimeoutAsync(I)V
    .locals 1

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$30;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$30;-><init>(I)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static unregisterPlatform(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcn/sharesdk/framework/CustomPlatform;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$28;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$28;-><init>(Ljava/lang/Class;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

.method public static unregisterService(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcn/sharesdk/framework/Service;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcn/sharesdk/framework/ShareSDK$22;

    invoke-direct {v0, p0}, Lcn/sharesdk/framework/ShareSDK$22;-><init>(Ljava/lang/Class;)V

    invoke-static {v0}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    return-void
.end method

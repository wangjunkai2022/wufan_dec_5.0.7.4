.class public Lcom/aggmoread/sdk/z/a/j/b;
.super Lcom/aggmoread/sdk/z/a/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/j/b$d;,
        Lcom/aggmoread/sdk/z/a/j/b$e;
    }
.end annotation


# static fields
.field static final n:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Lcom/aggmoread/sdk/z/a/j/c;

.field private d:I

.field private e:Lcom/aggmoread/sdk/z/a/j/b$e;

.field private f:Lcom/aggmoread/sdk/z/a/j/a$a;

.field private g:Lcom/aggmoread/sdk/z/a/j/n;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Lcom/aggmoread/sdk/z/a/j/k;

.field private k:Lcom/aggmoread/sdk/z/a/m/h;

.field private l:Ljava/lang/String;

.field final m:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/16 v1, 0x2710

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/j/b;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/aggmoread/sdk/z/a/j/c;)V
    .locals 2

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/b;-><init>()V

    sget-object v0, Lcom/aggmoread/sdk/z/a/j/c;->a:Lcom/aggmoread/sdk/z/a/j/c;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    const/4 v1, 0x0

    iput v1, p0, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    new-instance v1, Lcom/aggmoread/sdk/z/a/j/b$c;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/z/a/j/b$c;-><init>(Lcom/aggmoread/sdk/z/a/j/b;)V

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b;->m:Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b;->l:Ljava/lang/String;

    if-nez p3, :cond_0

    move-object p3, v0

    :cond_0
    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/j/c;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/j/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b;->h:Ljava/lang/String;

    return-object p1
.end method

.method private a(Ljava/io/File;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/m/c;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/m/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/m/c;->e()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private a(Landroid/content/Context;)Z
    .locals 3

    const-string v0, "ApiDownloadHelper"

    const-string v1, "checkInstallPermission"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/pm/PackageManager;->canRequestPackageInstalls()Z

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkInstallPermission hasInstallPermission = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private a(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/m/d;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/j/b;Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/a/j/b;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/j/b;)I
    .locals 0

    iget p0, p0, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    return p0
.end method

.method public static b(Landroid/content/Context;)Ljava/io/File;
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p0
.end method

.method private b(Ljava/lang/String;)Z
    .locals 4

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/j/b;->f()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->e:Lcom/aggmoread/sdk/z/a/j/b$e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/b$e;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    invoke-direct {v0, p0, p1, v1}, Lcom/aggmoread/sdk/z/a/j/b$e;-><init>(Lcom/aggmoread/sdk/z/a/j/b;Ljava/lang/String;Lcom/aggmoread/sdk/z/a/j/c;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->e:Lcom/aggmoread/sdk/z/a/j/b$e;

    :cond_0
    :try_start_0
    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "android.intent.action.PACKAGE_REPLACED"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "package"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b;->e:Lcom/aggmoread/sdk/z/a/j/b$e;

    invoke-virtual {v0, v1, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    iget v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    int-to-long v0, v0

    const/16 v2, -0x7d9

    const-string v3, "start listen package error"

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/aggmoread/sdk/z/a/j/c;->a(JILjava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/j/b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static c(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/aggmoread/sdk/z/a/j/b;->b(Landroid/content/Context;)Ljava/io/File;

    move-result-object p0

    const-string v1, "amdownload"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/j/k;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/j/b;->j:Lcom/aggmoread/sdk/z/a/j/k;

    return-object p0
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/a/j/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/j/b;->i:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/m/h;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/j/b;->k:Lcom/aggmoread/sdk/z/a/m/h;

    return-object p0
.end method

.method static synthetic g(Lcom/aggmoread/sdk/z/a/j/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/j/b;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-static {v0}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "areNotificationsEnabled = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "ApiDownloadHelper"

    invoke-static {v4, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/aggmoread/sdk/z/a/j/b;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    iput v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    iput-object v3, v1, Lcom/aggmoread/sdk/z/a/j/b;->b:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "downloadApk enter , packageName = "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ",ulr = "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/b;->c(Landroid/content/Context;)Ljava/io/File;

    move-result-object v4

    invoke-static/range {p1 .. p1}, Lcom/aggmoread/sdk/z/a/j/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".apk"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/a/j/f;->a()Lcom/aggmoread/sdk/z/a/j/f;

    move-result-object v0

    invoke-virtual {v0, v13}, Lcom/aggmoread/sdk/z/a/j/f;->a(Ljava/lang/String;)I

    move-result v0

    const/4 v6, 0x1

    if-eq v0, v6, :cond_5

    const/4 v6, 0x2

    if-eq v0, v6, :cond_5

    const/4 v12, 0x3

    if-eq v0, v12, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3, v5}, Lcom/aggmoread/sdk/z/a/j/b;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/j/c;->b()V

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    iget v2, v1, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3}, Lcom/aggmoread/sdk/z/a/j/c;->b(J)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Lcom/aggmoread/sdk/z/a/m/c;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/m/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/m/c;->e()Ljava/lang/String;

    invoke-virtual {v1, v3, v5}, Lcom/aggmoread/sdk/z/a/j/b;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/j/c;->b()V

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    iget v6, v1, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    int-to-long v6, v6

    invoke-virtual {v0, v6, v7}, Lcom/aggmoread/sdk/z/a/j/c;->b(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    iput-object v2, v1, Lcom/aggmoread/sdk/z/a/j/b;->i:Ljava/lang/String;

    new-instance v0, Landroid/content/Intent;

    iget-object v6, v1, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-static {}, Lcom/aggmoread/sdk/z/a/j/e;->a()Ljava/lang/Class;

    move-result-object v7

    invoke-direct {v0, v6, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v6, "apkUrl"

    invoke-virtual {v0, v6, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    const-string v6, "apkPath"

    invoke-virtual {v0, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v5, "packageName"

    invoke-virtual {v0, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v5, "com.ads.sdk.NOTIFICATION_CLICK"

    invoke-virtual {v0, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v5, v1, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    iget v6, v1, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    const/high16 v7, 0x4000000

    invoke-static {v5, v6, v0, v7}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v8

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/a;->e()Lcom/aggmoread/sdk/z/a/g/h;

    move-result-object v0

    iget v0, v0, Lcom/aggmoread/sdk/z/a/g/h;->c:I

    if-nez v0, :cond_3

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    :cond_3
    new-instance v11, Lcom/aggmoread/sdk/z/a/j/k;

    iget-object v6, v1, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    iget v7, v1, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_4

    const-string v5, ""

    move-object v10, v5

    goto :goto_1

    :cond_4
    move-object/from16 v10, p3

    :goto_1
    const-string v16, "\u6b63\u5728\u4e0b\u8f7d..."

    move-object v5, v11

    move-object v9, v13

    move-object v15, v11

    move-object/from16 v11, v16

    const/4 v3, 0x3

    move v12, v0

    invoke-direct/range {v5 .. v12}, Lcom/aggmoread/sdk/z/a/j/k;-><init>(Landroid/content/Context;ILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    iput-object v15, v1, Lcom/aggmoread/sdk/z/a/j/b;->j:Lcom/aggmoread/sdk/z/a/j/k;

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/n$a;

    iget-object v5, v1, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-direct {v0, v5}, Lcom/aggmoread/sdk/z/a/j/n$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Lcom/aggmoread/sdk/z/a/j/n$a;->c(Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/j/n$a;

    move-result-object v0

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/aggmoread/sdk/z/a/j/n$a;->a(Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/j/n$a;

    move-result-object v0

    invoke-virtual {v0, v14}, Lcom/aggmoread/sdk/z/a/j/n$a;->b(Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/j/n$a;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lcom/aggmoread/sdk/z/a/j/n$a;->a(Z)Lcom/aggmoread/sdk/z/a/j/n$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/aggmoread/sdk/z/a/j/n$a;->b(I)Lcom/aggmoread/sdk/z/a/j/n$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/aggmoread/sdk/z/a/j/n$a;->a(I)Lcom/aggmoread/sdk/z/a/j/n$a;

    move-result-object v0

    iget-object v3, v1, Lcom/aggmoread/sdk/z/a/j/b;->j:Lcom/aggmoread/sdk/z/a/j/k;

    invoke-virtual {v0, v3}, Lcom/aggmoread/sdk/z/a/j/n$a;->a(Lcom/aggmoread/sdk/z/a/j/k;)Lcom/aggmoread/sdk/z/a/j/n$a;

    move-result-object v0

    new-instance v3, Lcom/aggmoread/sdk/z/a/j/b$a;

    move-object/from16 v4, p2

    invoke-direct {v3, v1, v13, v2, v4}, Lcom/aggmoread/sdk/z/a/j/b$a;-><init>(Lcom/aggmoread/sdk/z/a/j/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/aggmoread/sdk/z/a/j/n$a;->a(Lcom/aggmoread/sdk/z/a/j/i;)Lcom/aggmoread/sdk/z/a/j/n$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/j/n$a;->a()Lcom/aggmoread/sdk/z/a/j/n;

    move-result-object v0

    iput-object v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->g:Lcom/aggmoread/sdk/z/a/j/n;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/j/n;->l()V

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    const-string v2, "\u5f00\u59cb\u4e0b\u8f7d"

    const/4 v3, 0x0

    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_5
    const/4 v3, 0x0

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/j/c;->a()V

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    const-string v2, "\u5e7f\u544a\u6b63\u5728\u4e0b\u8f7d"

    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method a(Ljava/io/File;Lcom/aggmoread/sdk/z/a/j/b$d;)Z
    .locals 7

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-direct {p0, p2}, Lcom/aggmoread/sdk/z/a/j/b;->a(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    const-wide/16 v0, -0x1

    const/16 v2, -0x7da

    const-string v3, "no install permission"

    invoke-virtual {p2, v0, v1, v2, v3}, Lcom/aggmoread/sdk/z/a/j/c;->a(JILjava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startInstaller apkFile = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isExist = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ApiDownloadHelper"

    invoke-static {v0, p2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pkg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v4, 0x18

    const/4 v5, 0x1

    const-string v6, "application/vnd.android.package-archive"

    if-lt v3, v4, :cond_1

    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".am.download.fp"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p2, v3, p1}, Lcom/aggmoread/sdk/z/a/j/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "localUri = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, p1, v6}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_0

    :cond_1
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v1, p1, v6}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    const/high16 p1, 0x10000000

    invoke-virtual {v1, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-direct {p0, p2, v1}, Lcom/aggmoread/sdk/z/a/j/b;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_2

    :try_start_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "installer startActivity intent = "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/j/b;->e()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    iget p2, p0, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    int-to-long v3, p2

    invoke-virtual {p1, v3, v4}, Lcom/aggmoread/sdk/z/a/j/c;->c(J)V

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/j/b;->d()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return v5

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "start installer error , message = "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    iget v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    int-to-long v0, v0

    const/16 v3, -0x7d7

    const-string v4, "start installer error"

    invoke-virtual {p2, v0, v1, v3, v4}, Lcom/aggmoread/sdk/z/a/j/c;->a(JILjava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    iget p2, p0, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    int-to-long v3, p2

    const/16 p2, -0x7d8

    const-string v1, "installer not found"

    invoke-virtual {p1, v3, v4, p2, v1}, Lcom/aggmoread/sdk/z/a/j/c;->a(JILjava/lang/String;)V

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return v2

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startInstaller exception e  = "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    iget p2, p0, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    int-to-long v0, p2

    const/16 p2, -0x7d6

    const-string v3, "installer intent builder error"

    invoke-virtual {p1, v0, v1, p2, v3}, Lcom/aggmoread/sdk/z/a/j/c;->a(JILjava/lang/String;)V

    return v2
.end method

.method public a(Ljava/lang/String;Ljava/io/File;)Z
    .locals 3

    const-string v0, "ApiDownloadHelper"

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b;->j:Lcom/aggmoread/sdk/z/a/j/k;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/j/k;->a()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/a/m/c;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/m/c;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/b;->j:Lcom/aggmoread/sdk/z/a/j/k;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/m/c;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/aggmoread/sdk/z/a/j/k;->a(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    :cond_0
    :goto_0
    :try_start_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, p2}, Lcom/aggmoread/sdk/z/a/j/b;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downComplete willListenPackageName= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-direct {p0, v1, p1}, Lcom/aggmoread/sdk/z/a/j/b;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/j/b;->b(Ljava/lang/String;)Z
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    sget-object p1, Lcom/aggmoread/sdk/z/a/j/b$d;->b:Lcom/aggmoread/sdk/z/a/j/b$d;

    invoke-virtual {p0, p2, p1}, Lcom/aggmoread/sdk/z/a/j/b;->a(Ljava/io/File;Lcom/aggmoread/sdk/z/a/j/b$d;)Z

    move-result p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "isStartInstallerSuccess = "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return p1

    :cond_2
    :try_start_2
    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/a/j/b;->a(Ljava/lang/String;)V

    const-string p1, "downComplete clickStartApp"

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    const/4 p1, 0x1

    return p1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    const-string p1, "onCompleted enter , package name not found"

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b;->c:Lcom/aggmoread/sdk/z/a/j/c;

    iget p2, p0, Lcom/aggmoread/sdk/z/a/j/b;->d:I

    int-to-long v0, p2

    const/16 p2, -0x7d1

    const-string v2, "file not found error"

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/aggmoread/sdk/z/a/j/c;->a(JILjava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public d()V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->k:Lcom/aggmoread/sdk/z/a/m/h;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    const-string v1, "appInstallInfo"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/m/h;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/m/h;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->k:Lcom/aggmoread/sdk/z/a/m/h;

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->k:Lcom/aggmoread/sdk/z/a/m/h;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/a/m/h;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b;->k:Lcom/aggmoread/sdk/z/a/m/h;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/b;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/aggmoread/sdk/z/a/m/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public e()V
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/b$b;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/a/j/b$b;-><init>(Lcom/aggmoread/sdk/z/a/j/b;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->f:Lcom/aggmoread/sdk/z/a/j/a$a;

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/j/a;->a(ILcom/aggmoread/sdk/z/a/j/a$a;)Z

    return-void
.end method

.method f()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b;->e:Lcom/aggmoread/sdk/z/a/j/b$e;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

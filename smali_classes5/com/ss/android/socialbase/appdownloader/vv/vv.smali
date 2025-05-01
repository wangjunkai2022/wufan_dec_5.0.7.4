.class public abstract Lcom/ss/android/socialbase/appdownloader/vv/vv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/vv/o;


# instance fields
.field protected final m:Lcom/ss/android/socialbase/downloader/n/vv;

.field protected final p:Ljava/lang/String;

.field protected final vv:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/n/vv;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/vv/vv;->vv:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/ss/android/socialbase/appdownloader/vv/vv;->m:Lcom/ss/android/socialbase/downloader/n/vv;

    .line 4
    iput-object p3, p0, Lcom/ss/android/socialbase/appdownloader/vv/vv;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public vv()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/vv/vv;->vv:Landroid/content/Context;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-interface {p0}, Lcom/ss/android/socialbase/appdownloader/vv/o;->m()Landroid/content/Intent;

    move-result-object v0

    .line 3
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/vv/vv;->vv:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    .line 4
    :catchall_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/p/vv;->vv()Z

    :cond_1
    return v1
.end method

.class public Lcom/ss/android/downloadlib/addownload/b;
.super Ljava/lang/Object;


# static fields
.field private static b:Lcom/ss/android/socialbase/appdownloader/p/qv;

.field private static d:Lcom/ss/android/download/api/config/t;

.field private static g:Lcom/ss/android/download/api/config/r;

.field private static i:Lcom/ss/android/download/api/config/p;

.field private static j:Lcom/ss/android/download/api/config/y;

.field private static jh:Lcom/ss/android/download/api/config/i;

.field private static k:Lcom/ss/android/download/api/config/m;

.field private static la:Lcom/ss/android/download/api/config/j;

.field private static m:Landroid/content/Context;

.field private static n:Lcom/ss/android/download/api/config/wv;

.field private static o:Lcom/ss/android/download/api/config/jh;

.field private static p:Lcom/ss/android/download/api/config/n;

.field private static q:Lcom/ss/android/download/api/config/b;

.field private static qv:Lcom/ss/android/download/api/config/k;

.field private static r:Lcom/ss/android/download/api/config/o;

.field private static t:Lcom/ss/android/download/api/config/q;

.field private static u:Lcom/ss/android/download/api/config/qv;

.field private static v:Lcom/ss/android/download/api/config/la;

.field public static final vv:Lorg/json/JSONObject;

.field private static wv:Lcom/ss/android/download/api/model/vv;

.field private static x:Lcom/ss/android/download/api/m/vv;

.field private static y:Lcom/ss/android/download/api/config/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/b;->vv:Lorg/json/JSONObject;

    return-void
.end method

.method public static b()Lcom/ss/android/download/api/config/r;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->g:Lcom/ss/android/download/api/config/r;

    return-object v0
.end method

.method public static d()Lcom/ss/android/download/api/config/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->q:Lcom/ss/android/download/api/config/b;

    return-object v0
.end method

.method public static g()Lcom/ss/android/download/api/config/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->y:Lcom/ss/android/download/api/config/d;

    return-object v0
.end method

.method public static getContext()Landroid/content/Context;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->m:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Context is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static i()Lcom/ss/android/download/api/config/qv;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->u:Lcom/ss/android/download/api/config/qv;

    return-object v0
.end method

.method public static j()Lcom/ss/android/download/api/config/o;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->r:Lcom/ss/android/download/api/config/o;

    return-object v0
.end method

.method public static jh()Lcom/ss/android/download/api/config/m;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->k:Lcom/ss/android/download/api/config/m;

    return-object v0
.end method

.method public static k()Lcom/ss/android/download/api/model/vv;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->wv:Lcom/ss/android/download/api/model/vv;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/download/api/model/vv$vv;

    invoke-direct {v0}, Lcom/ss/android/download/api/model/vv$vv;-><init>()V

    invoke-virtual {v0}, Lcom/ss/android/download/api/model/vv$vv;->vv()Lcom/ss/android/download/api/model/vv;

    move-result-object v0

    sput-object v0, Lcom/ss/android/downloadlib/addownload/b;->wv:Lcom/ss/android/download/api/model/vv;

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->wv:Lcom/ss/android/download/api/model/vv;

    return-object v0
.end method

.method public static la()Lcom/ss/android/download/api/config/y;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->j:Lcom/ss/android/download/api/config/y;

    return-object v0
.end method

.method public static m()Lcom/ss/android/download/api/config/p;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->i:Lcom/ss/android/download/api/config/p;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lcom/ss/android/downloadlib/addownload/b$1;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/b$1;-><init>()V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/b;->i:Lcom/ss/android/download/api/config/p;

    .line 5
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->i:Lcom/ss/android/download/api/config/p;

    return-object v0
.end method

.method public static m(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->m:Landroid/content/Context;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/ss/android/downloadlib/addownload/b;->m:Landroid/content/Context;

    :cond_0
    return-void
.end method

.method public static n()Lcom/ss/android/download/api/config/q;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->t:Lcom/ss/android/download/api/config/q;

    return-object v0
.end method

.method public static o()Lcom/ss/android/download/api/config/wv;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->n:Lcom/ss/android/download/api/config/wv;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/download/api/vv/m;

    invoke-direct {v0}, Lcom/ss/android/download/api/vv/m;-><init>()V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/b;->n:Lcom/ss/android/download/api/config/wv;

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->n:Lcom/ss/android/download/api/config/wv;

    return-object v0
.end method

.method public static p()Lcom/ss/android/download/api/config/jh;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->o:Lcom/ss/android/download/api/config/jh;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/download/api/vv/vv;

    invoke-direct {v0}, Lcom/ss/android/download/api/vv/vv;-><init>()V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/b;->o:Lcom/ss/android/download/api/config/jh;

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->o:Lcom/ss/android/download/api/config/jh;

    return-object v0
.end method

.method public static q()Lcom/ss/android/download/api/config/i;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->jh:Lcom/ss/android/download/api/config/i;

    return-object v0
.end method

.method public static qv()Lcom/ss/android/download/api/config/j;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->la:Lcom/ss/android/download/api/config/j;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/downloadlib/addownload/b$3;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/b$3;-><init>()V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/b;->la:Lcom/ss/android/download/api/config/j;

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->la:Lcom/ss/android/download/api/config/j;

    return-object v0
.end method

.method public static r()Lcom/ss/android/download/api/config/t;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->d:Lcom/ss/android/download/api/config/t;

    return-object v0
.end method

.method public static t()Ljava/lang/String;
    .locals 1

    const-string v0, "1.7.0"

    return-object v0
.end method

.method public static u()Lcom/ss/android/socialbase/appdownloader/p/qv;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->b:Lcom/ss/android/socialbase/appdownloader/p/qv;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/downloadlib/addownload/b$2;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/b$2;-><init>()V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/b;->b:Lcom/ss/android/socialbase/appdownloader/p/qv;

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->b:Lcom/ss/android/socialbase/appdownloader/p/qv;

    return-object v0
.end method

.method public static v()Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_2

    if-ne v0, v2, :cond_0

    .line 3
    invoke-static {}, Landroid/os/Environment;->isExternalStorageLegacy()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    if-le v0, v2, :cond_2

    .line 4
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 5
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "default_save_dir_name"

    const-string v3, "ByteDownload"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static vv()Lcom/ss/android/download/api/config/n;
    .locals 1

    .line 11
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->p:Lcom/ss/android/download/api/config/n;

    return-object v0
.end method

.method public static vv(Landroid/content/Context;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/ss/android/downloadlib/addownload/b;->m:Landroid/content/Context;

    return-void

    .line 3
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Context is null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static vv(Lcom/ss/android/download/api/config/d;)V
    .locals 0

    .line 13
    sput-object p0, Lcom/ss/android/downloadlib/addownload/b;->y:Lcom/ss/android/download/api/config/d;

    return-void
.end method

.method public static vv(Lcom/ss/android/download/api/config/jh;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/config/jh;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 5
    sput-object p0, Lcom/ss/android/downloadlib/addownload/b;->o:Lcom/ss/android/download/api/config/jh;

    return-void
.end method

.method public static vv(Lcom/ss/android/download/api/config/k;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/config/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 8
    sput-object p0, Lcom/ss/android/downloadlib/addownload/b;->qv:Lcom/ss/android/download/api/config/k;

    return-void
.end method

.method public static vv(Lcom/ss/android/download/api/config/m;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/config/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 10
    sput-object p0, Lcom/ss/android/downloadlib/addownload/b;->k:Lcom/ss/android/download/api/config/m;

    return-void
.end method

.method public static vv(Lcom/ss/android/download/api/config/n;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/config/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 4
    sput-object p0, Lcom/ss/android/downloadlib/addownload/b;->p:Lcom/ss/android/download/api/config/n;

    return-void
.end method

.method public static vv(Lcom/ss/android/download/api/config/qv;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/config/qv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 6
    sput-object p0, Lcom/ss/android/downloadlib/addownload/b;->u:Lcom/ss/android/download/api/config/qv;

    return-void
.end method

.method public static vv(Lcom/ss/android/download/api/config/wv;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/config/wv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 7
    sput-object p0, Lcom/ss/android/downloadlib/addownload/b;->n:Lcom/ss/android/download/api/config/wv;

    return-void
.end method

.method public static vv(Lcom/ss/android/download/api/m/vv;)V
    .locals 0

    .line 14
    sput-object p0, Lcom/ss/android/downloadlib/addownload/b;->x:Lcom/ss/android/download/api/m/vv;

    return-void
.end method

.method public static vv(Lcom/ss/android/download/api/model/vv;)V
    .locals 0
    .param p0    # Lcom/ss/android/download/api/model/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 9
    sput-object p0, Lcom/ss/android/downloadlib/addownload/b;->wv:Lcom/ss/android/download/api/model/vv;

    return-void
.end method

.method public static vv(Ljava/lang/String;)V
    .locals 1

    .line 12
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Ljava/lang/String;)V

    return-void
.end method

.method public static wv()Lorg/json/JSONObject;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->qv:Lcom/ss/android/download/api/config/k;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/ss/android/download/api/config/k;->vv()Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->qv:Lcom/ss/android/download/api/config/k;

    invoke-interface {v0}, Lcom/ss/android/download/api/config/k;->vv()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 3
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->vv:Lorg/json/JSONObject;

    return-object v0
.end method

.method public static x()Lcom/ss/android/download/api/m/vv;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->x:Lcom/ss/android/download/api/m/vv;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/downloadlib/addownload/b$4;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/b$4;-><init>()V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/b;->x:Lcom/ss/android/download/api/m/vv;

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->x:Lcom/ss/android/download/api/m/vv;

    return-object v0
.end method

.method public static y()Lcom/ss/android/download/api/config/la;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->v:Lcom/ss/android/download/api/config/la;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/downloadlib/addownload/b$5;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/b$5;-><init>()V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/b;->v:Lcom/ss/android/download/api/config/la;

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->v:Lcom/ss/android/download/api/config/la;

    return-object v0
.end method

.method public static ya()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->p:Lcom/ss/android/download/api/config/n;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->u:Lcom/ss/android/download/api/config/qv;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->qv:Lcom/ss/android/download/api/config/k;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->k:Lcom/ss/android/download/api/config/m;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/ss/android/downloadlib/addownload/b;->y:Lcom/ss/android/download/api/config/d;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

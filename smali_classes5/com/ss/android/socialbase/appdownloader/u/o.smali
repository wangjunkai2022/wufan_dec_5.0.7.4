.class public Lcom/ss/android/socialbase/appdownloader/u/o;
.super Ljava/lang/Object;


# static fields
.field private static i:Ljava/lang/String; = ""

.field public static m:Ljava/lang/String; = ""

.field private static n:Ljava/lang/String;

.field private static o:Ljava/lang/String;

.field public static p:Ljava/lang/String;

.field private static qv:Ljava/lang/Boolean;

.field private static u:Ljava/lang/String;

.field public static vv:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d()Z
    .locals 3

    .line 1
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, "honor"

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private static g()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->vv:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->zn()V

    .line 3
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/o;->m:Ljava/lang/String;

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->vv:Ljava/lang/String;

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ro.build.version."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/o;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "rom"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->i:Ljava/lang/String;

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "com."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/o;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".market"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->m:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->m()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "enable_reflect_system_properties"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/u/o;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 5
    :cond_0
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/u/o;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static i()Z
    .locals 1

    const-string v0, "VIVO"

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->vv(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static j()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->qv:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/i;->n()Ljava/lang/String;

    move-result-object v0

    const-string v1, "harmony"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->qv:Ljava/lang/Boolean;

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->qv:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static jh()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static k()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    .line 2
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->vv(Ljava/lang/String;)Z

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    return-object v0
.end method

.method private static la()V
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->n:Ljava/lang/String;

    if-nez v0, :cond_1

    :try_start_0
    const-string v0, "ro.miui.ui.version.name"

    .line 2
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->n:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 4
    :goto_0
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->n:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->n:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public static m(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v3

    const-string v4, "getprop "

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object p0

    .line 3
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-virtual {p0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    invoke-direct {v4, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    const/16 p0, 0x400

    invoke-direct {v3, v4, p0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :try_start_1
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    .line 5
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    new-array v1, v1, [Ljava/io/Closeable;

    aput-object v3, v1, v0

    .line 6
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    return-object p0

    :catchall_0
    move-object v3, v2

    :catchall_1
    new-array p0, v1, [Ljava/io/Closeable;

    aput-object v3, p0, v0

    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    return-object v2
.end method

.method public static m()Z
    .locals 1

    const-string v0, "MAGICUI"

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->vv(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static n()Z
    .locals 1

    const-string v0, "SAMSUNG"

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->vv(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static o()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->g()V

    .line 2
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->vv:Ljava/lang/String;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->vv(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static p(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-string v0, "android.os.SystemProperties"

    .line 2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "get"

    invoke-virtual {v0, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v4

    const/4 p0, 0x0

    .line 3
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static p()Z
    .locals 1

    const-string v0, "MIUI"

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->vv(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static q()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->la()V

    .line 2
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->n:Ljava/lang/String;

    const-string v1, "V12"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static qv()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    .line 2
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->vv(Ljava/lang/String;)Z

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    return-object v0
.end method

.method public static r()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->la()V

    .line 2
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->n:Ljava/lang/String;

    const-string v1, "V10"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static t()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->la()V

    .line 2
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->n:Ljava/lang/String;

    const-string v1, "V11"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static u()Z
    .locals 1

    const-string v0, "FLYME"

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->vv(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static vv()Z
    .locals 1

    const-string v0, "EMUI"

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->vv(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MAGICUI"

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->vv(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static vv(Ljava/lang/String;)Z
    .locals 3

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->g()V

    .line 3
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    const-string v0, "ro.miui.ui.version.name"

    .line 5
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MIUI"

    .line 6
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    const-string v0, "com.xiaomi.market"

    .line 7
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    .line 8
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->n:Ljava/lang/String;

    goto/16 :goto_1

    :cond_1
    const-string v0, "ro.build.version.emui"

    .line 9
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 10
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->d()Z

    move-result v0

    const-string v1, "MAGICUI"

    if-eqz v0, :cond_2

    move-object v0, v1

    goto :goto_0

    :cond_2
    const-string v0, "EMUI"

    .line 11
    :goto_0
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "com.hihonor.appmarket"

    .line 12
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto/16 :goto_1

    :cond_3
    const-string v0, "com.huawei.appmarket"

    .line 13
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto/16 :goto_1

    .line 14
    :cond_4
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "com.heytap.market"

    if-nez v0, :cond_6

    .line 15
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->vv:Ljava/lang/String;

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    .line 16
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/n;->vv(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_5

    .line 17
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->m:Ljava/lang/String;

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto/16 :goto_1

    .line 18
    :cond_5
    sput-object v1, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto/16 :goto_1

    :cond_6
    const-string v0, "ro.vivo.os.version"

    .line 19
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "VIVO"

    .line 20
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    const-string v0, "com.bbk.appstore"

    .line 21
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto/16 :goto_1

    :cond_7
    const-string v0, "ro.smartisan.version"

    .line 22
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "SMARTISAN"

    .line 23
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    const-string v0, "com.smartisanos.appstore"

    .line 24
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto/16 :goto_1

    :cond_8
    const-string v0, "ro.gn.sv.version"

    .line 25
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "QIONEE"

    .line 26
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    const-string v0, "com.gionee.aora.market"

    .line 27
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto/16 :goto_1

    :cond_9
    const-string v0, "ro.lenovo.lvp.version"

    .line 28
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "LENOVO"

    .line 29
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    const-string v0, "com.lenovo.leos.appstore"

    .line 30
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto/16 :goto_1

    .line 31
    :cond_a
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "SAMSUNG"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 32
    sput-object v2, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    const-string v0, "com.sec.android.app.samsungapps"

    .line 33
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto/16 :goto_1

    .line 34
    :cond_b
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ZTE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 35
    sput-object v2, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    const-string v0, "zte.com.market"

    .line 36
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto :goto_1

    .line 37
    :cond_c
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "NUBIA"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 38
    sput-object v2, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    const-string v0, "cn.nubia.neostore"

    .line 39
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto :goto_1

    .line 40
    :cond_d
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->jh()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "FLYME"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 41
    sput-object v2, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    const-string v0, "com.meizu.mstore"

    .line 42
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    .line 43
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->jh()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    goto :goto_1

    .line 44
    :cond_e
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ONEPLUS"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 45
    sput-object v2, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    const-string v0, "ro.rom.version"

    .line 46
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    .line 47
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/n;->vv(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_f

    .line 48
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->m:Ljava/lang/String;

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto :goto_1

    .line 49
    :cond_f
    sput-object v1, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    goto :goto_1

    .line 50
    :cond_10
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    const-string v0, ""

    .line 51
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->p:Ljava/lang/String;

    .line 52
    sput-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    .line 53
    :goto_1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->o:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static wv()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    .line 2
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->vv(Ljava/lang/String;)Z

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/u/o;->u:Ljava/lang/String;

    return-object v0
.end method

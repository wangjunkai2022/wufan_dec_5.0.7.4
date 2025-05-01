.class public Lcom/umeng/analytics/pro/as;
.super Ljava/lang/Object;
.source "RomUtils.java"


# static fields
.field private static a:Ljava/lang/String; = ""

.field private static b:Ljava/lang/String; = ""

.field private static final c:Ljava/lang/String; = "hw_sc.build.platform.version"

.field private static final d:Ljava/lang/String; = "ro.build.version.emui"

.field private static final e:Ljava/lang/String; = "ro.build.version.magic"

.field private static final f:Ljava/lang/String; = "ro.miui.ui.version.name"

.field private static final g:Ljava/lang/String; = "ro.build.version.opporom"

.field private static final h:Ljava/lang/String; = "ro.vivo.os.name"

.field private static final i:Ljava/lang/String; = "ro.vivo.os.version"

.field private static final j:Ljava/lang/String; = "ro.build.version.oplusrom"

.field private static final k:Ljava/lang/String; = "ro.rom.version"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 5
    sget-object v0, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-static {p0}, Lcom/umeng/analytics/pro/as;->e(Ljava/lang/String;)V

    .line 7
    :cond_0
    sget-object p0, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    return-object p0
.end method

.method private static a()Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.huawei.system.BuildEx"

    .line 1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getOsBrand"

    new-array v3, v0, [Ljava/lang/Class;

    .line 2
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    .line 3
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/lit8 v0, v0, 0x1

    :catchall_0
    return v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/umeng/analytics/pro/as;->e(Ljava/lang/String;)V

    .line 3
    :cond_0
    sget-object p0, Lcom/umeng/analytics/pro/as;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, " "

    .line 2
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    :try_start_0
    const-string v0, "android.os.SystemProperties"

    .line 1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "get"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    .line 2
    const-class v4, Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v5

    .line 3
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static e(Ljava/lang/String;)V
    .locals 4

    const-string v0, "ro.build.version.magic"

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/umeng/analytics/pro/as;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "HUAWEI"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :sswitch_1
    const-string v2, "REDMI"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v1, 0x3

    goto :goto_0

    :sswitch_2
    const-string v2, "HONOR"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v2, "VIVO"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v1, 0x6

    goto :goto_0

    :sswitch_4
    const-string v2, "OPPO"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v1, 0x5

    goto :goto_0

    :sswitch_5
    const-string v2, "ONEPLUS"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v1, 0x7

    goto :goto_0

    :sswitch_6
    const-string v2, "XIAOMI"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v1, 0x2

    goto :goto_0

    :sswitch_7
    const-string v2, "REALME"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    const/4 v1, 0x4

    :cond_0
    :goto_0
    const-string p0, "ro.build.version.emui"

    const-string v2, "EMUI"

    const-string v3, "ColorOS"

    packed-switch v1, :pswitch_data_0

    :try_start_1
    const-string p0, "Android"

    goto/16 :goto_1

    :pswitch_0
    const-string p0, "HydrogenOS"

    .line 2
    sput-object p0, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    const-string p0, "ro.rom.version"

    .line 3
    invoke-static {p0}, Lcom/umeng/analytics/pro/as;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    sput-object v3, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    const-string p0, "ro.build.version.oplusrom"

    .line 6
    invoke-static {p0}, Lcom/umeng/analytics/pro/as;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 7
    :cond_1
    sput-object p0, Lcom/umeng/analytics/pro/as;->b:Ljava/lang/String;

    goto :goto_2

    :pswitch_1
    const-string p0, "Funtouch"

    .line 8
    sput-object p0, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    const-string p0, "ro.vivo.os.version"

    .line 9
    invoke-static {p0}, Lcom/umeng/analytics/pro/as;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/as;->b:Ljava/lang/String;

    goto :goto_2

    .line 10
    :pswitch_2
    sput-object v3, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    const-string p0, "ro.build.version.opporom"

    .line 11
    invoke-static {p0}, Lcom/umeng/analytics/pro/as;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/as;->b:Ljava/lang/String;

    goto :goto_2

    :pswitch_3
    const-string p0, "MIUI"

    .line 12
    sput-object p0, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    const-string p0, "ro.miui.ui.version.name"

    .line 13
    invoke-static {p0}, Lcom/umeng/analytics/pro/as;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/as;->b:Ljava/lang/String;

    goto :goto_2

    .line 14
    :pswitch_4
    invoke-static {v0}, Lcom/umeng/analytics/pro/as;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string p0, "MagicUI"

    .line 15
    sput-object p0, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    .line 16
    invoke-static {v0}, Lcom/umeng/analytics/pro/as;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/as;->b:Ljava/lang/String;

    goto :goto_2

    .line 17
    :cond_2
    sput-object v2, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    .line 18
    invoke-static {p0}, Lcom/umeng/analytics/pro/as;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/as;->b:Ljava/lang/String;

    goto :goto_2

    .line 19
    :pswitch_5
    invoke-static {}, Lcom/umeng/analytics/pro/as;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p0, "hw_sc.build.platform.version"

    .line 20
    invoke-static {p0}, Lcom/umeng/analytics/pro/as;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/as;->b:Ljava/lang/String;

    const-string p0, "HarmonyOS"

    .line 21
    sput-object p0, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    goto :goto_2

    .line 22
    :cond_3
    sput-object v2, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    .line 23
    invoke-static {p0}, Lcom/umeng/analytics/pro/as;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/as;->b:Ljava/lang/String;

    goto :goto_2

    .line 24
    :goto_1
    sput-object p0, Lcom/umeng/analytics/pro/as;->a:Ljava/lang/String;

    .line 25
    sget-object p0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sput-object p0, Lcom/umeng/analytics/pro/as;->b:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7027944a -> :sswitch_7
        -0x65b21745 -> :sswitch_6
        -0x23e7db20 -> :sswitch_5
        0x251fa0 -> :sswitch_4
        0x2834ac -> :sswitch_3
        0x41bb44a -> :sswitch_2
        0x4a3edcd -> :sswitch_1
        0x7fa995e7 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

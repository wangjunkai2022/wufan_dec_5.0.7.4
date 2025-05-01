.class public Lcom/umeng/analytics/pro/at;
.super Ljava/lang/Object;
.source "SpWrapper.java"


# static fields
.field public static final a:Ljava/lang/String; = "cl_count"

.field public static final b:Ljava/lang/String; = "interval_"

.field public static final c:Ljava/lang/String; = "config_ts"

.field public static final d:Ljava/lang/String; = "iucc_s1"

.field public static final e:Ljava/lang/String; = "iucc_s2"

.field public static final f:Ljava/lang/String; = "sdk_type_ver"

.field public static final g:Ljava/lang/String; = "should_fetch"

.field private static final h:Ljava/lang/String; = "ccg_sp_config_file"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    if-eqz p0, :cond_0

    :try_start_0
    const-string v0, "ccg_sp_config_file"

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

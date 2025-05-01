.class public Lcom/ss/android/socialbase/downloader/constants/o;
.super Ljava/lang/Object;


# static fields
.field public static i:J = 0x7d000L

.field public static volatile m:Ljava/lang/String; = ""

.field public static n:J = 0x1e00000L

.field public static o:J = 0x32L

.field public static volatile p:Ljava/lang/String; = ""

.field public static qv:J = 0xa00000L

.field public static u:J = 0x500000L

.field public static volatile vv:Ljava/lang/String; = ""

.field public static final wv:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sput-object v0, Lcom/ss/android/socialbase/downloader/constants/o;->wv:Lorg/json/JSONObject;

    return-void
.end method

.method public static vv(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    sput-object p0, Lcom/ss/android/socialbase/downloader/constants/o;->vv:Ljava/lang/String;

    return-void
.end method

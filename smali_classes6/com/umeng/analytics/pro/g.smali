.class public Lcom/umeng/analytics/pro/g;
.super Ljava/lang/Object;
.source "UMDBConfig.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SdCardPath"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/g$a;,
        Lcom/umeng/analytics/pro/g$b;,
        Lcom/umeng/analytics/pro/g$c;,
        Lcom/umeng/analytics/pro/g$d;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "subprocess/"

.field public static final b:Ljava/lang/String;

.field public static final c:I = 0x2

.field public static final d:Ljava/lang/String; = "id"

.field public static final e:Ljava/lang/String; = "INTEGER"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/umeng/analytics/pro/aw;->b()Lcom/umeng/analytics/pro/aw;

    move-result-object v0

    const-string v1, "ua"

    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aw;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

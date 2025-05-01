.class public final Lcom/xinzhu/overmind/shared/a;
.super Ljava/lang/Object;
.source "BuildConfig.java"


# static fields
.field public static final a:Z = false

.field public static final b:Ljava/lang/String; = "com.xinzhu.overmind.shared"

.field public static final c:Ljava/lang/String; = "release"

.field public static final d:Ljava/lang/String; = "wufun"

.field public static final e:Ljava/lang/String; = "com.join.android.app.mgsim.wufun"

.field public static final f:Ljava/lang/String; = "com.join.android.app.mgsim.wufun"

.field public static final g:Ljava/lang/String; = "com.join.android.app.mgsim.wufun.addon"

.field public static final h:Ljava/lang/String; = "com.join.android.app.mgsim.wufun.addon"

.field public static final i:Z = true

.field public static final j:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/xinzhu/overmind/shared/a;->j:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

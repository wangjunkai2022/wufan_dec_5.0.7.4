.class public final Lcom/join/android/app/common/utils/e;
.super Lcom/join/android/app/common/utils/APKUtils;
.source "APKUtils_.java"


# static fields
.field private static e:Lcom/join/android/app/common/utils/e;


# instance fields
.field private c:Landroid/content/Context;

.field private d:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/android/app/common/utils/APKUtils;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/android/app/common/utils/e;->c:Landroid/content/Context;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/join/android/app/common/utils/APKUtils;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/join/android/app/common/utils/e;->c:Landroid/content/Context;

    .line 5
    iput-object p2, p0, Lcom/join/android/app/common/utils/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public static l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;
    .locals 2

    .line 1
    sget-object v0, Lcom/join/android/app/common/utils/e;->e:Lcom/join/android/app/common/utils/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/join/android/app/common/utils/e;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/join/android/app/common/utils/e;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/join/android/app/common/utils/e;->e:Lcom/join/android/app/common/utils/e;

    .line 4
    invoke-direct {v1}, Lcom/join/android/app/common/utils/e;->m0()V

    .line 5
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    .line 6
    :cond_0
    sget-object p0, Lcom/join/android/app/common/utils/e;->e:Lcom/join/android/app/common/utils/e;

    return-object p0
.end method

.method private m0()V
    .locals 0

    return-void
.end method

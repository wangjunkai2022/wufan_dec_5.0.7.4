.class public Lcom/ss/android/downloadlib/p/n;
.super Lcom/ss/android/socialbase/appdownloader/p/vv;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/p/n$vv;
    }
.end annotation


# static fields
.field private static vv:Ljava/lang/String; = "n"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/p/vv;-><init>()V

    return-void
.end method

.method static synthetic m()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/p/n;->vv:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public vv(Landroid/content/Context;)Lcom/ss/android/socialbase/appdownloader/p/jh;
    .locals 1

    .line 1
    new-instance v0, Lcom/ss/android/downloadlib/p/n$1;

    invoke-direct {v0, p0, p1}, Lcom/ss/android/downloadlib/p/n$1;-><init>(Lcom/ss/android/downloadlib/p/n;Landroid/content/Context;)V

    return-object v0
.end method

.method public vv()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

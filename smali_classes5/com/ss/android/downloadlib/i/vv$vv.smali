.class Lcom/ss/android/downloadlib/i/vv$vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/i/vv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "vv"
.end annotation


# static fields
.field private static vv:Lcom/ss/android/downloadlib/i/vv;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ss/android/downloadlib/i/vv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ss/android/downloadlib/i/vv;-><init>(Lcom/ss/android/downloadlib/i/vv$1;)V

    sput-object v0, Lcom/ss/android/downloadlib/i/vv$vv;->vv:Lcom/ss/android/downloadlib/i/vv;

    return-void
.end method

.method static synthetic vv()Lcom/ss/android/downloadlib/i/vv;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/i/vv$vv;->vv:Lcom/ss/android/downloadlib/i/vv;

    return-object v0
.end method

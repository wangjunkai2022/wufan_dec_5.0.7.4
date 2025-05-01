.class Lcom/ss/android/downloadlib/addownload/compliance/i$m;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/addownload/compliance/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "m"
.end annotation


# static fields
.field private static vv:Lcom/ss/android/downloadlib/addownload/compliance/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ss/android/downloadlib/addownload/compliance/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/i;-><init>(Lcom/ss/android/downloadlib/addownload/compliance/i$1;)V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/compliance/i$m;->vv:Lcom/ss/android/downloadlib/addownload/compliance/i;

    return-void
.end method

.method static synthetic vv()Lcom/ss/android/downloadlib/addownload/compliance/i;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/compliance/i$m;->vv:Lcom/ss/android/downloadlib/addownload/compliance/i;

    return-object v0
.end method

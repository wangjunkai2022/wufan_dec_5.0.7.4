.class Lcom/ss/android/socialbase/downloader/network/p$p;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/downloader/network/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "p"
.end annotation


# static fields
.field private static final vv:Lcom/ss/android/socialbase/downloader/network/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ss/android/socialbase/downloader/network/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ss/android/socialbase/downloader/network/p;-><init>(Lcom/ss/android/socialbase/downloader/network/p$1;)V

    sput-object v0, Lcom/ss/android/socialbase/downloader/network/p$p;->vv:Lcom/ss/android/socialbase/downloader/network/p;

    return-void
.end method

.method static synthetic vv()Lcom/ss/android/socialbase/downloader/network/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/network/p$p;->vv:Lcom/ss/android/socialbase/downloader/network/p;

    return-object v0
.end method

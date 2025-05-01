.class public Lcom/ss/android/socialbase/downloader/exception/vv;
.super Lcom/ss/android/socialbase/downloader/exception/BaseException;


# instance fields
.field private vv:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/exception/vv;->vv:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public vv()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/exception/vv;->vv:Ljava/lang/String;

    return-object v0
.end method

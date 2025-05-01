.class public Lcom/ss/android/socialbase/downloader/exception/wv;
.super Ljava/lang/Throwable;


# instance fields
.field private vv:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/exception/wv;->vv:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public vv()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/exception/wv;->vv:Ljava/lang/String;

    return-object v0
.end method

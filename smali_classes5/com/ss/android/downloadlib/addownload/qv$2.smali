.class Lcom/ss/android/downloadlib/addownload/qv$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/n/k$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/qv;->m(Lcom/ss/android/download/api/config/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/qv;

.field final synthetic vv:Lcom/ss/android/download/api/config/x;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/qv;Lcom/ss/android/download/api/config/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv$2;->m:Lcom/ss/android/downloadlib/addownload/qv;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv$2;->vv:Lcom/ss/android/download/api/config/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv$2;->vv:Lcom/ss/android/download/api/config/x;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/config/x;->vv()V

    :cond_0
    return-void
.end method

.method public vv(Ljava/lang/String;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv$2;->vv:Lcom/ss/android/download/api/config/x;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/config/x;->vv(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

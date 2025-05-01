.class Lcom/ss/android/downloadlib/addownload/compliance/u$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/compliance/u;->vv(Lcom/ss/android/downloadlib/addownload/m/o;Lcom/ss/android/downloadlib/addownload/compliance/qv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/compliance/qv;

.field final synthetic p:Lcom/ss/android/downloadlib/addownload/compliance/u;

.field final synthetic vv:Lcom/ss/android/downloadlib/addownload/m/o;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/compliance/u;Lcom/ss/android/downloadlib/addownload/m/o;Lcom/ss/android/downloadlib/addownload/compliance/qv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/u$1;->p:Lcom/ss/android/downloadlib/addownload/compliance/u;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/compliance/u$1;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iput-object p3, p0, Lcom/ss/android/downloadlib/addownload/compliance/u$1;->m:Lcom/ss/android/downloadlib/addownload/compliance/qv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/u$1;->p:Lcom/ss/android/downloadlib/addownload/compliance/u;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/compliance/u$1;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/compliance/u;->vv(Lcom/ss/android/downloadlib/addownload/compliance/u;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/compliance/u$1;->p:Lcom/ss/android/downloadlib/addownload/compliance/u;

    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/compliance/u$1;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    const/4 v5, 0x1

    const/4 v6, 0x4

    invoke-static {v3, v4, v5, v6}, Lcom/ss/android/downloadlib/addownload/compliance/u;->vv(Lcom/ss/android/downloadlib/addownload/compliance/u;Lcom/ss/android/downloadlib/addownload/m/o;ZI)[B

    move-result-object v3

    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/compliance/u$1;->m:Lcom/ss/android/downloadlib/addownload/compliance/qv;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ss/android/downloadlib/addownload/compliance/u;->vv(Lcom/ss/android/downloadlib/addownload/compliance/u;Lcom/ss/android/downloadlib/addownload/m/o;Ljava/lang/String;[BLcom/ss/android/downloadlib/addownload/compliance/qv;)V

    return-void
.end method

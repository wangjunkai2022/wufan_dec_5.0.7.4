.class Lcom/ss/android/downloadlib/addownload/o$9;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/o$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/o;->n(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/o;

.field final synthetic vv:Z


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/o;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$9;->m:Lcom/ss/android/downloadlib/addownload/o;

    iput-boolean p2, p0, Lcom/ss/android/downloadlib/addownload/o$9;->vv:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o$9;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/o;->u(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/downloadlib/addownload/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/i;->vv()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o$9;->m:Lcom/ss/android/downloadlib/addownload/o;

    iget-boolean v1, p0, Lcom/ss/android/downloadlib/addownload/o$9;->vv:Z

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/addownload/o;->m(Lcom/ss/android/downloadlib/addownload/o;Z)V

    return-void
.end method

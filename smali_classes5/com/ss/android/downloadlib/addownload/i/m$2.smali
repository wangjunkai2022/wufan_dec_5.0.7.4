.class Lcom/ss/android/downloadlib/addownload/i/m$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/vv/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/i/m;->vv(Lcom/ss/android/downloadad/api/vv/m;ILcom/ss/android/downloadlib/addownload/i/qv;Lcom/ss/android/downloadlib/addownload/vv/p;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/downloadlib/addownload/vv/p;

.field final synthetic m:I

.field final synthetic o:Lcom/ss/android/downloadlib/addownload/i/m;

.field final synthetic p:Lcom/ss/android/downloadad/api/vv/m;

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/i/m;IILcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/addownload/vv/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/i/m$2;->o:Lcom/ss/android/downloadlib/addownload/i/m;

    iput p2, p0, Lcom/ss/android/downloadlib/addownload/i/m$2;->vv:I

    iput p3, p0, Lcom/ss/android/downloadlib/addownload/i/m$2;->m:I

    iput-object p4, p0, Lcom/ss/android/downloadlib/addownload/i/m$2;->p:Lcom/ss/android/downloadad/api/vv/m;

    iput-object p5, p0, Lcom/ss/android/downloadlib/addownload/i/m$2;->i:Lcom/ss/android/downloadlib/addownload/vv/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public delete()V
    .locals 7

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/i/m;->vv(Lcom/ss/android/downloadlib/addownload/vv/i;)Lcom/ss/android/downloadlib/addownload/vv/i;

    .line 2
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/i/m$2;->o:Lcom/ss/android/downloadlib/addownload/i/m;

    iget v2, p0, Lcom/ss/android/downloadlib/addownload/i/m$2;->vv:I

    iget v3, p0, Lcom/ss/android/downloadlib/addownload/i/m$2;->m:I

    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/i/m$2;->p:Lcom/ss/android/downloadad/api/vv/m;

    const-string v5, "apk_size_cancel"

    const-string v6, "delete"

    invoke-static/range {v1 .. v6}, Lcom/ss/android/downloadlib/addownload/i/m;->vv(Lcom/ss/android/downloadlib/addownload/i/m;IILcom/ss/android/downloadad/api/vv/m;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/i/m$2;->i:Lcom/ss/android/downloadlib/addownload/vv/p;

    invoke-interface {v0}, Lcom/ss/android/downloadlib/addownload/vv/p;->delete()V

    return-void
.end method

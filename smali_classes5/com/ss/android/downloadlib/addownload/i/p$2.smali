.class Lcom/ss/android/downloadlib/addownload/i/p$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/vv/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/i/p;->vv(Lcom/ss/android/downloadad/api/vv/m;ILcom/ss/android/downloadlib/addownload/i/qv;Lcom/ss/android/downloadlib/addownload/vv/p;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/downloadad/api/vv/m;

.field final synthetic m:I

.field final synthetic o:Lcom/ss/android/downloadlib/addownload/vv/p;

.field final synthetic p:I

.field final synthetic u:Lcom/ss/android/downloadlib/addownload/i/p;

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/i/p;IIILcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/addownload/vv/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/i/p$2;->u:Lcom/ss/android/downloadlib/addownload/i/p;

    iput p2, p0, Lcom/ss/android/downloadlib/addownload/i/p$2;->vv:I

    iput p3, p0, Lcom/ss/android/downloadlib/addownload/i/p$2;->m:I

    iput p4, p0, Lcom/ss/android/downloadlib/addownload/i/p$2;->p:I

    iput-object p5, p0, Lcom/ss/android/downloadlib/addownload/i/p$2;->i:Lcom/ss/android/downloadad/api/vv/m;

    iput-object p6, p0, Lcom/ss/android/downloadlib/addownload/i/p$2;->o:Lcom/ss/android/downloadlib/addownload/vv/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public delete()V
    .locals 8

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/i/p;->vv(Lcom/ss/android/downloadlib/addownload/vv/i;)Lcom/ss/android/downloadlib/addownload/vv/i;

    .line 2
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/i/p$2;->u:Lcom/ss/android/downloadlib/addownload/i/p;

    iget v2, p0, Lcom/ss/android/downloadlib/addownload/i/p$2;->vv:I

    iget v3, p0, Lcom/ss/android/downloadlib/addownload/i/p$2;->m:I

    iget v4, p0, Lcom/ss/android/downloadlib/addownload/i/p$2;->p:I

    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/i/p$2;->i:Lcom/ss/android/downloadad/api/vv/m;

    const-string v6, "download_percent_cancel"

    const-string v7, "delete"

    invoke-static/range {v1 .. v7}, Lcom/ss/android/downloadlib/addownload/i/p;->vv(Lcom/ss/android/downloadlib/addownload/i/p;IIILcom/ss/android/downloadad/api/vv/m;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/i/p$2;->o:Lcom/ss/android/downloadlib/addownload/vv/p;

    invoke-interface {v0}, Lcom/ss/android/downloadlib/addownload/vv/p;->delete()V

    return-void
.end method

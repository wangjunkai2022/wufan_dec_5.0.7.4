.class Lcom/ss/android/downloadlib/addownload/compliance/m$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/download/api/config/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/compliance/m$2;->vv(Ljava/lang/String;)Ljava/lang/Boolean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/compliance/m$2;

.field final synthetic vv:[Z


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/compliance/m$2;[Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$2$1;->m:Lcom/ss/android/downloadlib/addownload/compliance/m$2;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$2$1;->vv:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$2$1;->vv:[Z

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$2$1;->m:Lcom/ss/android/downloadlib/addownload/compliance/m$2;

    iget-object v2, v1, Lcom/ss/android/downloadlib/addownload/compliance/m$2;->p:Lcom/ss/android/downloadlib/addownload/compliance/m;

    iget-wide v3, v1, Lcom/ss/android/downloadlib/addownload/compliance/m$2;->vv:J

    iget-wide v5, v1, Lcom/ss/android/downloadlib/addownload/compliance/m$2;->m:J

    move-object v7, p1

    invoke-static/range {v2 .. v7}, Lcom/ss/android/downloadlib/addownload/compliance/m;->vv(Lcom/ss/android/downloadlib/addownload/compliance/m;JJLjava/lang/String;)Z

    move-result p1

    const/4 v1, 0x0

    aput-boolean p1, v0, v1

    return-void
.end method

.method public vv(Ljava/lang/Throwable;)V
    .locals 2

    .line 2
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$2$1;->m:Lcom/ss/android/downloadlib/addownload/compliance/m$2;

    iget-wide v0, p1, Lcom/ss/android/downloadlib/addownload/compliance/m$2;->m:J

    const/4 p1, 0x2

    invoke-static {p1, v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/n;->vv(IJ)V

    .line 3
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$2$1;->vv:[Z

    const/4 v0, 0x0

    aput-boolean v0, p1, v0

    return-void
.end method

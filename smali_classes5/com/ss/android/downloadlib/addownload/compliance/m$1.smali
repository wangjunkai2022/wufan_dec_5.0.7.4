.class Lcom/ss/android/downloadlib/addownload/compliance/m$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/n/p$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/compliance/m;->vv(Lcom/ss/android/downloadlib/addownload/m/o;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ss/android/downloadlib/n/p$vv<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic m:J

.field final synthetic p:Lcom/ss/android/downloadlib/addownload/compliance/m;

.field final synthetic vv:J


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/compliance/m;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$1;->p:Lcom/ss/android/downloadlib/addownload/compliance/m;

    iput-wide p2, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$1;->vv:J

    iput-wide p4, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$1;->m:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Ljava/lang/Boolean;)Ljava/lang/Object;
    .locals 4

    .line 2
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$1;->p:Lcom/ss/android/downloadlib/addownload/compliance/m;

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$1;->vv:J

    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$1;->m:J

    invoke-static {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/addownload/m/m;->vv(JJ)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/m;->vv(J)V

    .line 4
    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$1;->m:J

    const-string p1, "lp_app_dialog_try_show"

    invoke-static {p1, v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/n;->m(Ljava/lang/String;J)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$1;->p:Lcom/ss/android/downloadlib/addownload/compliance/m;

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/m$1;->m:J

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/m;->m(J)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic vv(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/compliance/m$1;->vv(Ljava/lang/Boolean;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

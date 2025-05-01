.class public Lcom/ss/android/download/api/model/vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/download/api/model/vv$vv;
    }
.end annotation


# instance fields
.field public i:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public vv:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ss/android/download/api/model/vv$vv;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/ss/android/download/api/model/vv;->m:Ljava/lang/String;

    .line 3
    invoke-static {p1}, Lcom/ss/android/download/api/model/vv$vv;->vv(Lcom/ss/android/download/api/model/vv$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/vv;->vv:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/ss/android/download/api/model/vv$vv;->m(Lcom/ss/android/download/api/model/vv$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/vv;->m:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/ss/android/download/api/model/vv$vv;->p(Lcom/ss/android/download/api/model/vv$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/vv;->p:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Lcom/ss/android/download/api/model/vv$vv;->i(Lcom/ss/android/download/api/model/vv$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/vv;->i:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/ss/android/download/api/model/vv$vv;->o(Lcom/ss/android/download/api/model/vv$vv;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/download/api/model/vv;->o:Ljava/lang/String;

    return-void
.end method

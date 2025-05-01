.class public Lcom/ss/android/download/api/model/i;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/download/api/model/i$vv;
    }
.end annotation


# instance fields
.field private m:Ljava/lang/String;

.field private vv:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ss/android/download/api/model/i$vv;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lcom/ss/android/download/api/model/i$vv;->vv(Lcom/ss/android/download/api/model/i$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/i;->vv:Ljava/lang/String;

    .line 3
    invoke-static {p1}, Lcom/ss/android/download/api/model/i$vv;->m(Lcom/ss/android/download/api/model/i$vv;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/download/api/model/i;->m:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public vv()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/model/i;->vv:Ljava/lang/String;

    return-object v0
.end method

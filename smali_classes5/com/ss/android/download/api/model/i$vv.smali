.class public Lcom/ss/android/download/api/model/i$vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/download/api/model/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "vv"
.end annotation


# instance fields
.field private m:Ljava/lang/String;

.field private vv:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic m(Lcom/ss/android/download/api/model/i$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/download/api/model/i$vv;->m:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic vv(Lcom/ss/android/download/api/model/i$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/download/api/model/i$vv;->vv:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public m(Ljava/lang/String;)Lcom/ss/android/download/api/model/i$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/download/api/model/i$vv;->m:Ljava/lang/String;

    return-object p0
.end method

.method public vv(Ljava/lang/String;)Lcom/ss/android/download/api/model/i$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/download/api/model/i$vv;->vv:Ljava/lang/String;

    return-object p0
.end method

.method public vv()Lcom/ss/android/download/api/model/i;
    .locals 1

    .line 3
    new-instance v0, Lcom/ss/android/download/api/model/i;

    invoke-direct {v0, p0}, Lcom/ss/android/download/api/model/i;-><init>(Lcom/ss/android/download/api/model/i$vv;)V

    return-object v0
.end method

.class public Lcom/ss/android/downloadlib/addownload/vv/o$vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/addownload/vv/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "vv"
.end annotation


# instance fields
.field private i:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Lcom/ss/android/downloadlib/addownload/vv/i;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private qv:Lcom/ss/android/downloadlib/addownload/vv/p;

.field private u:Z

.field private vv:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->vv:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public i(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/vv/o$vv;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->o:Ljava/lang/String;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/vv/o$vv;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->p:Ljava/lang/String;

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/vv/o$vv;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->i:Ljava/lang/String;

    return-object p0
.end method

.method public vv(Lcom/ss/android/downloadlib/addownload/vv/i;)Lcom/ss/android/downloadlib/addownload/vv/o$vv;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->n:Lcom/ss/android/downloadlib/addownload/vv/i;

    return-object p0
.end method

.method public vv(Lcom/ss/android/downloadlib/addownload/vv/p;)Lcom/ss/android/downloadlib/addownload/vv/o$vv;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->qv:Lcom/ss/android/downloadlib/addownload/vv/p;

    return-object p0
.end method

.method public vv(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/vv/o$vv;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->m:Ljava/lang/String;

    return-object p0
.end method

.method public vv(Z)Lcom/ss/android/downloadlib/addownload/vv/o$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->u:Z

    return-object p0
.end method

.method public vv()Lcom/ss/android/downloadlib/addownload/vv/o;
    .locals 10

    .line 5
    new-instance v9, Lcom/ss/android/downloadlib/addownload/vv/o;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->vv:Landroid/app/Activity;

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->m:Ljava/lang/String;

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->p:Ljava/lang/String;

    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->i:Ljava/lang/String;

    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->o:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->u:Z

    iget-object v7, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->n:Lcom/ss/android/downloadlib/addownload/vv/i;

    iget-object v8, p0, Lcom/ss/android/downloadlib/addownload/vv/o$vv;->qv:Lcom/ss/android/downloadlib/addownload/vv/p;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/ss/android/downloadlib/addownload/vv/o;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ss/android/downloadlib/addownload/vv/i;Lcom/ss/android/downloadlib/addownload/vv/p;)V

    return-object v9
.end method

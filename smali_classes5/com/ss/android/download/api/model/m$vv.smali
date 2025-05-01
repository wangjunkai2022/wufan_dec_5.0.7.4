.class public final Lcom/ss/android/download/api/model/m$vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/download/api/model/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "vv"
.end annotation


# instance fields
.field private i:Ljava/lang/String;

.field private k:Lcom/ss/android/download/api/model/m$m;

.field public m:I

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Landroid/content/Context;

.field private qv:Z

.field private u:Ljava/lang/String;

.field public vv:Landroid/view/View;

.field private wv:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ss/android/download/api/model/m$vv;->p:Landroid/content/Context;

    return-void
.end method

.method static synthetic i(Lcom/ss/android/download/api/model/m$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/download/api/model/m$vv;->u:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic m(Lcom/ss/android/download/api/model/m$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/download/api/model/m$vv;->i:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic n(Lcom/ss/android/download/api/model/m$vv;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/download/api/model/m$vv;->wv:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method static synthetic o(Lcom/ss/android/download/api/model/m$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/download/api/model/m$vv;->n:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic p(Lcom/ss/android/download/api/model/m$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/download/api/model/m$vv;->o:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic qv(Lcom/ss/android/download/api/model/m$vv;)Lcom/ss/android/download/api/model/m$m;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/download/api/model/m$vv;->k:Lcom/ss/android/download/api/model/m$m;

    return-object p0
.end method

.method static synthetic u(Lcom/ss/android/download/api/model/m$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/download/api/model/m$vv;->qv:Z

    return p0
.end method

.method static synthetic vv(Lcom/ss/android/download/api/model/m$vv;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/download/api/model/m$vv;->p:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public i(Ljava/lang/String;)Lcom/ss/android/download/api/model/m$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/download/api/model/m$vv;->n:Ljava/lang/String;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lcom/ss/android/download/api/model/m$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/download/api/model/m$vv;->o:Ljava/lang/String;

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lcom/ss/android/download/api/model/m$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/download/api/model/m$vv;->u:Ljava/lang/String;

    return-object p0
.end method

.method public vv(I)Lcom/ss/android/download/api/model/m$vv;
    .locals 0

    .line 6
    iput p1, p0, Lcom/ss/android/download/api/model/m$vv;->m:I

    return-object p0
.end method

.method public vv(Landroid/graphics/drawable/Drawable;)Lcom/ss/android/download/api/model/m$vv;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/ss/android/download/api/model/m$vv;->wv:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/model/m$m;)Lcom/ss/android/download/api/model/m$vv;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/ss/android/download/api/model/m$vv;->k:Lcom/ss/android/download/api/model/m$m;

    return-object p0
.end method

.method public vv(Ljava/lang/String;)Lcom/ss/android/download/api/model/m$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/download/api/model/m$vv;->i:Ljava/lang/String;

    return-object p0
.end method

.method public vv(Z)Lcom/ss/android/download/api/model/m$vv;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/download/api/model/m$vv;->qv:Z

    return-object p0
.end method

.method public vv()Lcom/ss/android/download/api/model/m;
    .locals 2

    .line 7
    new-instance v0, Lcom/ss/android/download/api/model/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ss/android/download/api/model/m;-><init>(Lcom/ss/android/download/api/model/m$vv;Lcom/ss/android/download/api/model/m$1;)V

    return-object v0
.end method

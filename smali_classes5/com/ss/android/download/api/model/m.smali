.class public Lcom/ss/android/download/api/model/m;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/download/api/model/m$m;,
        Lcom/ss/android/download/api/model/m$vv;
    }
.end annotation


# instance fields
.field public i:Ljava/lang/String;

.field public k:I

.field public m:Ljava/lang/String;

.field public n:Landroid/graphics/drawable/Drawable;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public qv:Lcom/ss/android/download/api/model/m$m;

.field public u:Z

.field public vv:Landroid/content/Context;

.field public wv:Landroid/view/View;


# direct methods
.method private constructor <init>(Lcom/ss/android/download/api/model/m$vv;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/ss/android/download/api/model/m;->u:Z

    .line 4
    invoke-static {p1}, Lcom/ss/android/download/api/model/m$vv;->vv(Lcom/ss/android/download/api/model/m$vv;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/m;->vv:Landroid/content/Context;

    .line 5
    invoke-static {p1}, Lcom/ss/android/download/api/model/m$vv;->m(Lcom/ss/android/download/api/model/m$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/m;->m:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Lcom/ss/android/download/api/model/m$vv;->p(Lcom/ss/android/download/api/model/m$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/m;->p:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/ss/android/download/api/model/m$vv;->i(Lcom/ss/android/download/api/model/m$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/m;->i:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Lcom/ss/android/download/api/model/m$vv;->o(Lcom/ss/android/download/api/model/m$vv;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/m;->o:Ljava/lang/String;

    .line 9
    invoke-static {p1}, Lcom/ss/android/download/api/model/m$vv;->u(Lcom/ss/android/download/api/model/m$vv;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ss/android/download/api/model/m;->u:Z

    .line 10
    invoke-static {p1}, Lcom/ss/android/download/api/model/m$vv;->n(Lcom/ss/android/download/api/model/m$vv;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/m;->n:Landroid/graphics/drawable/Drawable;

    .line 11
    invoke-static {p1}, Lcom/ss/android/download/api/model/m$vv;->qv(Lcom/ss/android/download/api/model/m$vv;)Lcom/ss/android/download/api/model/m$m;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/download/api/model/m;->qv:Lcom/ss/android/download/api/model/m$m;

    .line 12
    iget-object v0, p1, Lcom/ss/android/download/api/model/m$vv;->vv:Landroid/view/View;

    iput-object v0, p0, Lcom/ss/android/download/api/model/m;->wv:Landroid/view/View;

    .line 13
    iget p1, p1, Lcom/ss/android/download/api/model/m$vv;->m:I

    iput p1, p0, Lcom/ss/android/download/api/model/m;->k:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/ss/android/download/api/model/m$vv;Lcom/ss/android/download/api/model/m$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ss/android/download/api/model/m;-><init>(Lcom/ss/android/download/api/model/m$vv;)V

    return-void
.end method

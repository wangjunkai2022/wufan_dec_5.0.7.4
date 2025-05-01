.class final Lcom/ss/android/socialbase/appdownloader/p$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/p/wv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/p;->vv(Landroid/content/Context;IZ)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic m:I

.field final synthetic p:Z

.field final synthetic vv:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/p$1;->vv:Landroid/content/Context;

    iput p2, p0, Lcom/ss/android/socialbase/appdownloader/p$1;->m:I

    iput-boolean p3, p0, Lcom/ss/android/socialbase/appdownloader/p$1;->p:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/p$1;->vv:Landroid/content/Context;

    iget v1, p0, Lcom/ss/android/socialbase/appdownloader/p$1;->m:I

    iget-boolean v2, p0, Lcom/ss/android/socialbase/appdownloader/p$1;->p:Z

    invoke-static {v0, v1, v2}, Lcom/ss/android/socialbase/appdownloader/p;->p(Landroid/content/Context;IZ)I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/p;->m(I)I

    return-void
.end method

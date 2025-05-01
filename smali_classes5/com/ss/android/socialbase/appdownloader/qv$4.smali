.class Lcom/ss/android/socialbase/appdownloader/qv$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/qv;->vv(Landroid/content/Context;IZ)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/socialbase/appdownloader/qv;

.field final synthetic m:I

.field final synthetic p:Z

.field final synthetic vv:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/qv;Landroid/content/Context;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/qv$4;->i:Lcom/ss/android/socialbase/appdownloader/qv;

    iput-object p2, p0, Lcom/ss/android/socialbase/appdownloader/qv$4;->vv:Landroid/content/Context;

    iput p3, p0, Lcom/ss/android/socialbase/appdownloader/qv$4;->m:I

    iput-boolean p4, p0, Lcom/ss/android/socialbase/appdownloader/qv$4;->p:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/qv$4;->i:Lcom/ss/android/socialbase/appdownloader/qv;

    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/qv$4;->vv:Landroid/content/Context;

    iget v2, p0, Lcom/ss/android/socialbase/appdownloader/qv$4;->m:I

    iget-boolean v3, p0, Lcom/ss/android/socialbase/appdownloader/qv$4;->p:Z

    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/socialbase/appdownloader/qv;->vv(Landroid/content/Context;IZ)I

    return-void
.end method

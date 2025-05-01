.class Lcom/ss/android/socialbase/appdownloader/qv$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/qv;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/lang/Integer;

.field final synthetic p:Lcom/ss/android/socialbase/appdownloader/qv;

.field final synthetic vv:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/qv;Landroid/content/Context;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/qv$3;->p:Lcom/ss/android/socialbase/appdownloader/qv;

    iput-object p2, p0, Lcom/ss/android/socialbase/appdownloader/qv$3;->vv:Landroid/content/Context;

    iput-object p3, p0, Lcom/ss/android/socialbase/appdownloader/qv$3;->m:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/qv$3;->p:Lcom/ss/android/socialbase/appdownloader/qv;

    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/qv$3;->vv:Landroid/content/Context;

    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/qv$3;->m:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/ss/android/socialbase/appdownloader/qv;->vv(Lcom/ss/android/socialbase/appdownloader/qv;Landroid/content/Context;IZ)I

    return-void
.end method

.class final Lcom/ss/android/downloadlib/qv$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/qv;->vv(Landroid/content/Context;)Lcom/ss/android/downloadlib/qv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic vv:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/qv$1;->vv:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    new-instance v0, Lcom/ss/android/downloadlib/qv;

    iget-object v1, p0, Lcom/ss/android/downloadlib/qv$1;->vv:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ss/android/downloadlib/qv;-><init>(Landroid/content/Context;Lcom/ss/android/downloadlib/qv$1;)V

    invoke-static {v0}, Lcom/ss/android/downloadlib/qv;->vv(Lcom/ss/android/downloadlib/qv;)Lcom/ss/android/downloadlib/qv;

    return-void
.end method

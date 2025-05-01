.class Lcom/ss/android/downloadlib/qv$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/qv;->vv(Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Z

.field final synthetic p:Lcom/ss/android/downloadlib/qv;

.field final synthetic vv:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/qv;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/qv$3;->p:Lcom/ss/android/downloadlib/qv;

    iput-object p2, p0, Lcom/ss/android/downloadlib/qv$3;->vv:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/ss/android/downloadlib/qv$3;->m:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/qv$3;->p:Lcom/ss/android/downloadlib/qv;

    invoke-static {v0}, Lcom/ss/android/downloadlib/qv;->m(Lcom/ss/android/downloadlib/qv;)Lcom/ss/android/downloadlib/n;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/qv$3;->vv:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/ss/android/downloadlib/qv$3;->m:Z

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/n;->vv(Ljava/lang/String;Z)V

    return-void
.end method

.class final Lcom/ss/android/downloadlib/n/qv$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/n/qv;->vv(Landroid/content/Context;Landroid/net/Uri;Lcom/ss/android/downloadlib/addownload/m/o;)Lcom/ss/android/downloadlib/addownload/m/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic m:Landroid/content/Intent;

.field final synthetic vv:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/n/qv$2;->vv:Landroid/content/Context;

    iput-object p2, p0, Lcom/ss/android/downloadlib/n/qv$2;->m:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/n/qv$2;->vv:Landroid/content/Context;

    iget-object v1, p0, Lcom/ss/android/downloadlib/n/qv$2;->m:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

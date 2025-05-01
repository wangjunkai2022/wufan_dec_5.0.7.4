.class final Lcom/ss/android/download/api/vv/vv$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/download/api/vv/vv;->vv(Lcom/ss/android/download/api/model/m;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/download/api/model/m;


# direct methods
.method constructor <init>(Lcom/ss/android/download/api/model/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/download/api/vv/vv$2;->vv:Lcom/ss/android/download/api/model/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/ss/android/download/api/vv/vv$2;->vv:Lcom/ss/android/download/api/model/m;

    iget-object p2, p2, Lcom/ss/android/download/api/model/m;->qv:Lcom/ss/android/download/api/model/m$m;

    if-eqz p2, :cond_0

    .line 2
    invoke-interface {p2, p1}, Lcom/ss/android/download/api/model/m$m;->vv(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method

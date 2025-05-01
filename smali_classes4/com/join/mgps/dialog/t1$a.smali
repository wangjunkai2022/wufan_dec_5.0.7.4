.class Lcom/join/mgps/dialog/t1$a;
.super Ljava/lang/Object;
.source "NoticeDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/dialog/t1;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dialog/t1;


# direct methods
.method constructor <init>(Lcom/join/mgps/dialog/t1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/t1$a;->b:Lcom/join/mgps/dialog/t1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/t1$a;->b:Lcom/join/mgps/dialog/t1;

    invoke-static {p1}, Lcom/join/mgps/dialog/t1;->a(Lcom/join/mgps/dialog/t1;)Lcom/join/mgps/dialog/t1$e;

    move-result-object p1

    invoke-interface {p1}, Lcom/join/mgps/dialog/t1$e;->a()V

    return-void
.end method
